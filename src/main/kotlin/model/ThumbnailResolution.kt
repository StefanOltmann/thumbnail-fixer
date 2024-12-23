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

package model

@SuppressWarnings("MagicNumber")
enum class ThumbnailResolution(
    val longSidePx: Int
) {

    MIN(160),
    LOW(256),
    MEDIUM(320),
    GOOD(480),
    MAX(512);

    val displayString: String =
        "$longSidePx x ${longSidePx / 4 * 3}"

    fun lower() =
        if (ordinal > 0) entries[ordinal - 1] else null

    fun higher() =
        if (ordinal < entries.size - 1) entries[ordinal + 1] else null

}
