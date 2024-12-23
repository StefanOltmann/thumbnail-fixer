/*
 * 🔧 Thumbnail Fixer 🔧
 * Copyright (C) 2024 Stefan Oltmann
 * https://github.com/StefanOltmann/thumbnail-fixer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.toComposeImageBitmap
import com.ashampoo.kim.Kim
import kotlinx.coroutines.launch
import model.CompressionQuality
import model.ProcessResult
import model.ThumbnailResolution
import org.jetbrains.skia.Image
import ui.icons.IconCancel
import ui.theme.doublePadding
import util.cleanPath
import util.findAllFilesRecursive
import util.rebuildThumbnail
import java.io.File

private const val PHOTO_STACK_SIZE = 5
private const val PHOTO_UPDATE_INTERVAL_MS = 1000

@Composable
fun ContentView(
    vipsLoaded: Boolean
) {

    val findingFilesState = remember { mutableStateOf(false) }
    val processingFilesState = remember { mutableStateOf(false) }

    val thumbnailResolutionSettingState = remember { mutableStateOf(ThumbnailResolution.GOOD) }
    val compressionQualitySettingState = remember { mutableStateOf(CompressionQuality.MAX) }
    val skipExistingStettingState = remember { mutableStateOf(true) }
    val preserveModificationDateStettingState = remember { mutableStateOf(true) }

    val allFilesCounter = remember { mutableStateOf(0) }
    val counter = remember { mutableStateOf(0) }

    val resultsMap = remember { mutableStateMapOf<String, ProcessResult>() }

    val images = remember { mutableStateListOf<ImageBitmap>() }
    val animatedImages = remember { mutableSetOf<ImageBitmap>() }

    val failures = remember { StringBuilder() }

    val lastProcessingTime = remember { mutableStateOf(0L) }

    val cancelled = remember { mutableStateOf(false) }

    val scope = rememberCoroutineScope()

    val onFilesImport: (List<String>) -> Unit = { filePaths ->

        val longSidePx = thumbnailResolutionSettingState.value.longSidePx
        val quality = compressionQualitySettingState.value.percent
        val skipExisting = skipExistingStettingState.value
        val preserveModificationDate = preserveModificationDateStettingState.value

        scope.launch {

            cancelled.value = false

            val startTime = System.currentTimeMillis()

            try {

                var lastImageShownTime: Long = 0

                val allFiles = mutableListOf<File>()

                findingFilesState.value = true

                findAllFilesRecursive(
                    files = filePaths.map { File(cleanPath(it)) }
                ).collect { file ->

                    /* Ignore XMP sidecars and don't count them. */
                    if (file.name.endsWith(".xmp", ignoreCase = true))
                        return@collect

                    allFiles.add(file)

                    allFilesCounter.value = allFiles.size
                }

                findingFilesState.value = false

                processingFilesState.value = true

                for (file in allFiles) {

                    val result = if (!cancelled.value)
                        rebuildThumbnail(
                            file = file,
                            longSidePx = longSidePx,
                            quality = quality,
                            skipExisting = skipExisting,
                            preserveModificationDate = preserveModificationDate,
                            failures = failures
                        )
                    else
                        ProcessResult.CANCELLED

                    resultsMap[file.absolutePath] = result

                    counter.value += 1

                    val currentMillis = System.currentTimeMillis()

                    /*
                     * Show a current image, but only all two seconds.
                     */
                    if (currentMillis - lastImageShownTime > PHOTO_UPDATE_INTERVAL_MS && result.containsImage()) {

                        if (images.size > PHOTO_STACK_SIZE) {

                            val removedImage = images.removeAt(0)
                            animatedImages.remove(removedImage)
                        }

                        val originalBytes = file.readBytes()

                        val metadata = Kim.readMetadata(originalBytes)

                        val exifBytes = metadata!!.getExifThumbnailBytes()!!

                        val image = Image.makeFromEncoded(exifBytes).toComposeImageBitmap()

                        images.add(image)

                        lastImageShownTime = currentMillis
                    }
                }

            } finally {

                /* Reset states */
                findingFilesState.value = false
                processingFilesState.value = false

                /* Clear photo stacks */
                images.clear()
                animatedImages.clear()

                /* Update the timing. */
                lastProcessingTime.value = System.currentTimeMillis() - startTime

                /* Reset cancel state. */
                cancelled.value = false
            }
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        if (findingFilesState.value) {

            FindingFilesScreen(allFilesCounter)

        } else if (processingFilesState.value) {

            /* Entertain with a nice photo stack animation while we are working. */

            AnimatedPhotoStack(
                images = images,
                animatedImages = animatedImages
            )

            ProgressBar(
                allFilesCounter = allFilesCounter.value,
                counter = counter.value,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .doublePadding()
            )

            ClickableIcon(
                imageVector = IconCancel,
                onClick = {
                    cancelled.value = true
                },
                boxModifier = Modifier
                    .align(Alignment.TopEnd)
                    .doublePadding()
            )

        } else {

            if (vipsLoaded) {

                if (resultsMap.isNotEmpty()) {

                    ResultsScreen(
                        resultsMap,
                        counter,
                        allFilesCounter,
                        failures,
                        lastProcessingTime.value
                    )

                } else {

                    StartScreen(
                        onFilesImport,
                        thumbnailResolutionSettingState,
                        compressionQualitySettingState,
                        skipExistingStettingState,
                        preserveModificationDateStettingState
                    )
                }

            } else {

                VipsMissingScreen()
            }
        }
    }
}
