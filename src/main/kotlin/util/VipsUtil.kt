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

package util

import app.photofox.vipsffm.VImage
import app.photofox.vipsffm.VSource
import app.photofox.vipsffm.Vips
import app.photofox.vipsffm.VipsOption
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream

private val stripMetadata = VipsOption.Enum("strip", 1)

private const val DEFAULT_TARGET_FORMAT = ".jpg"

@Suppress("TooGenericExceptionCaught", "kotlin:S6310")
suspend fun createThumbnailBytes(
    originalBytes: ByteArray,
    longSidePx: Int,
    quality: Int
): ByteArray {

    val deferred = CompletableDeferred<ByteArray>()

    withContext(Dispatchers.IO) {

        try {

            Vips.run { arena ->

                val source = VSource.newFromBytes(arena, originalBytes)

                /*
                 * Use thumbnailSource() because it has a
                 * slightly better quality than thumbnailImage()
                 */
                val thumbnail = VImage.thumbnailSource(
                    arena,
                    source,
                    longSidePx,
                    VipsOption.Int("height", longSidePx)
                )

                val outputStream = ByteArrayOutputStream()

                thumbnail.writeToStream(
                    outputStream,
                    DEFAULT_TARGET_FORMAT,
                    stripMetadata,
                    VipsOption.Enum("Q", quality)
                )

                val thumbnailBytes = outputStream.toByteArray()

                deferred.complete(thumbnailBytes)
            }

        } catch (ex: Exception) {
            deferred.completeExceptionally(ex)
        }
    }

    return deferred.await()
}
