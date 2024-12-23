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

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.theme.defaultRoundedCornerShape
import ui.theme.defaultSpacing
import ui.theme.lightGray

@Composable
fun ProgressBar(
    allFilesCounter: Int,
    counter: Int,
    modifier: Modifier = Modifier
) {

    /* No need for a progress bar if we don't have any photos. */
    if (allFilesCounter == 0)
        return

    val progress = counter / allFilesCounter.toFloat()

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(defaultSpacing)
            .border(1.dp, lightGray, defaultRoundedCornerShape)
    ) {

        if (counter <= 1)
            return

        Box(
            modifier = Modifier
                .background(lightGray, defaultRoundedCornerShape)
                .height(defaultSpacing)
                .fillMaxWidth(progress)
        )
    }
}
