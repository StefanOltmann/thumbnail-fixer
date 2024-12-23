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
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun ClickableIcon(
    imageVector: ImageVector,
    onClick: () -> Unit,
    enabled: Boolean = true,
    boxModifier: Modifier = Modifier
) {

    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()

    Box(
        contentAlignment = Alignment.Center,
        modifier = if (enabled)
            boxModifier
                .hoverable(interactionSource)
                .clickable(onClick = onClick)
        else
            boxModifier
    ) {

        Icon(
            imageVector = imageVector,
            contentDescription = null,
            tint = if (enabled && isHovered)
                MaterialTheme.colorScheme.secondary
            else if (enabled)
                MaterialTheme.colorScheme.onBackground
            else
                MaterialTheme.colorScheme.onBackground.copy(alpha = 0.3f)
        )
    }
}
