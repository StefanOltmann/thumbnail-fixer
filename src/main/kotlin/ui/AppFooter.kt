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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.dp
import de.stefan_oltmann.mines.ui.icons.IconKofi
import ui.theme.DefaultSpacer
import ui.theme.FillSpacer
import ui.theme.HalfSpacer
import ui.theme.defaultSpacing

@Composable
fun AppFooter() {

    val uriHandler = LocalUriHandler.current

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height(32.dp)
            .background(Color.Black)
            .fillMaxWidth()
            .padding(
                horizontal = defaultSpacing
            )
            .clickable {
                uriHandler.openUri("https://ko-fi.com/StefanOltmann")
            }
    ) {

        Text(
            text = "Made by Stefan Oltmann",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.offset(y = -2.dp)
        )

        FillSpacer()

        Image(
            imageVector = IconKofi,
            contentDescription = null,
            modifier = Modifier
                .size(16.dp)
                .offset(y = -2.dp)
        )

        DefaultSpacer()

        Text(
            text = "Support me on Ko-Fi",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.offset(y = -2.dp)
        )
    }
}
