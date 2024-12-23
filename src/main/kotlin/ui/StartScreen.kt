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
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.CompressionQuality
import model.ThumbnailResolution
import ui.theme.DoubleSpacer

@Composable
fun StartScreen(
    onFilesImport: (List<String>) -> Unit,
    thumbnailResolutionSettingState: MutableState<ThumbnailResolution>,
    compressionQualitySettingState: MutableState<CompressionQuality>,
    skipExistingStettingState: MutableState<Boolean>,
    preserveModificationDateStettingState: MutableState<Boolean>
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(32.dp)
    ) {

        DropTarget(onFilesImport)

        DoubleSpacer()

        SettingsPanel(
            thumbnailResolutionSettingState = thumbnailResolutionSettingState,
            compressionQualitySettingState = compressionQualitySettingState,
            skipExistingStettingState = skipExistingStettingState,
            preserveModificationDateStettingState = preserveModificationDateStettingState
        )
    }
}
