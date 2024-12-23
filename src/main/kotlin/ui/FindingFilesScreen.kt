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

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import io.github.stefanoltmann.thumbnail_fixer.generated.resources.Res
import io.github.stefanoltmann.thumbnail_fixer.generated.resources.findingFiles
import org.jetbrains.compose.resources.stringResource
import ui.theme.DoubleSpacer

@Composable
fun FindingFilesScreen(
    allFilesCounter: MutableState<Int>
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(Res.string.findingFiles),
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge
        )

        DoubleSpacer()

        Text(
            text = "${allFilesCounter.value}",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge
        )
    }
}
