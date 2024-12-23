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

package ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

val lightGray = Color(0xFFF2F2F2)

val backgroundColor = Color(0xFF222222)
val hoverColor = Color.Yellow

val appColorScheme = darkColorScheme(
    background = backgroundColor,
    onBackground = lightGray,
    primary = lightGray,
    secondary = hoverColor
)
