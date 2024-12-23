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

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import io.github.stefanoltmann.thumbnail_fixer.generated.resources.Res
import io.github.stefanoltmann.thumbnail_fixer.generated.resources.pleaseInstallLibVips
import org.jetbrains.compose.resources.stringResource
import ui.theme.DoubleSpacer

private const val VIPS_INSTALL_URL = "https://www.libvips.org/install.html"

@Composable
fun VipsMissingScreen() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(32.dp)
    ) {

        Text(
            text = stringResource(Res.string.pleaseInstallLibVips),
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge
        )

        DoubleSpacer()

        val uriHandler = LocalUriHandler.current

        Text(
            text = VIPS_INSTALL_URL,
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.clickable {
                uriHandler.openUri(VIPS_INSTALL_URL)
            }
        )
    }
}
