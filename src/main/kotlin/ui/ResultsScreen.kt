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

import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.thumbnail_fixer.generated.resources.*
import model.ProcessResult
import org.jetbrains.compose.resources.stringResource
import ui.icons.IconBack
import ui.theme.*

@Composable
fun ResultsScreen(
    resultsMap: SnapshotStateMap<String, ProcessResult>,
    counter: MutableState<Int>,
    allFilesCounter: MutableState<Int>,
    failures: StringBuilder,
    lastProcessingTime: Long
) {

    val successCount = derivedStateOf {
        resultsMap.count { it.value.isSuccess() }
    }

    val skippedCount = derivedStateOf {
        resultsMap.count { it.value == ProcessResult.ALREADY_UP_TO_DATE || it.value == ProcessResult.CANCELLED }
    }

    val unsupportedCount = derivedStateOf {
        resultsMap.count { it.value == ProcessResult.UNSUPPORTED_FORMAT }
    }

    val failedCount = derivedStateOf {
        resultsMap.count { it.value == ProcessResult.FAILED }
    }

    val scrollState = rememberScrollState()

    Box {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(32.dp)
                .verticalScroll(scrollState)
        ) {

            Spacer(
                modifier = Modifier.height(24.dp)
            )

            Text(
                text = stringResource(Res.string.processedFiles)
                    .replace("{count}", counter.value.toString()),
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "⏱ " + formatMillis(lastProcessingTime),
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleMedium
            )

            DoubleSpacer()

            Text(
                text = "${successCount.value} " + stringResource(Res.string.successful),
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "${skippedCount.value} " + stringResource(Res.string.skipped),
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "${unsupportedCount.value} " + stringResource(Res.string.notSupported),
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "${failedCount.value} " + stringResource(Res.string.failed),
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.titleLarge
            )

            DoubleSpacer()

            Row {

                BackButton(
                    onClick = {

                        allFilesCounter.value = 0
                        counter.value = 0

                        resultsMap.clear()
                        failures.clear()
                    }
                )

                DefaultSpacer()

                OpenExifViewerButton()
            }

            if (failures.isNotEmpty()) {

                Spacer(
                    modifier = Modifier.height(32.dp)
                )

                Box(
                    modifier = Modifier
                        .padding(
                            vertical = doubleSpacing
                        )
                        .background(lightGray, defaultRoundedCornerShape)
                        .fillMaxWidth()
                        .height(2.dp)
                )

                Text(
                    text = failures.toString(),
                    color = MaterialTheme.colorScheme.onBackground,
                    style = MaterialTheme.typography.titleSmall
                )
            }
        }

        VerticalScrollbar(
            adapter = rememberScrollbarAdapter(scrollState),
            modifier = Modifier.fillMaxHeight().align(Alignment.CenterEnd),
            style = defaultScrollbarStyle().copy(
                unhoverColor = lightGray.copy(alpha = 0.4f),
                hoverColor = lightGray
            )
        )
    }
}

@Composable
private fun BackButton(
    onClick: () -> Unit
) {

    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(
                1.dp,
                if (isHovered)
                    hoverColor
                else
                    MaterialTheme.colorScheme.onBackground,
                defaultRoundedCornerShape
            )
            .padding(
                horizontal = defaultSpacing,
                vertical = halfSpacing
            )
            .hoverable(interactionSource)
            .clickable(onClick = onClick)
    ) {

        Icon(
            imageVector = IconBack,
            contentDescription = null,
            tint = if (isHovered)
                hoverColor
            else
                MaterialTheme.colorScheme.onBackground
        )

        DefaultSpacer()

        Text(
            text = stringResource(Res.string.back),
            color = if (isHovered)
                hoverColor
            else
                MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Composable
private fun OpenExifViewerButton() {

    val uriHandler = LocalUriHandler.current

    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(
                1.dp,
                if (isHovered)
                    hoverColor
                else
                    MaterialTheme.colorScheme.onBackground,
                defaultRoundedCornerShape
            )
            .padding(
                horizontal = defaultSpacing,
                vertical = halfSpacing
            )
            .hoverable(interactionSource)
            .clickable {

                uriHandler.openUri("https://stefan-oltmann.de/exif-viewer/")
            }
    ) {

        Text(
            text = stringResource(Res.string.openExifViewer),
            color = if (isHovered)
                hoverColor
            else
                MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge
        )
    }
}

private fun formatMillis(millis: Long): String {

    val seconds = millis / 1000

    if (seconds > 60) {

        val minutes = seconds / 60

        val secondsLeft = seconds % 60

        return "${minutes}m ${secondsLeft}s"
    }

    return "${seconds}s"
}
