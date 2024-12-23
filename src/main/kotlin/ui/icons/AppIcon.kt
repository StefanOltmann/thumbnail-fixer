/*
 * Material Design Icon under Apache 2 License
 * taken from https://fonts.google.com/icons
 */

package ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@SuppressWarnings("MagicNumber")
val AppIcon: ImageVector
    get() {
        if (_AppIcon != null) {
            return _AppIcon!!
        }
        _AppIcon = ImageVector.Builder(
            name = "AppIcon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF222222))) {
                moveToRelative(620f, 676f)
                lineToRelative(56f, -56f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineTo(540f, 455f)
                quadToRelative(4f, -11f, 6f, -22f)
                reflectiveQuadToRelative(2f, -25f)
                quadToRelative(0f, -57f, -40.5f, -97.5f)
                reflectiveQuadTo(410f, 270f)
                quadToRelative(-17f, 0f, -34f, 4.5f)
                reflectiveQuadTo(343f, 287f)
                lineToRelative(94f, 94f)
                lineToRelative(-56f, 56f)
                lineToRelative(-94f, -94f)
                quadToRelative(-8f, 16f, -12.5f, 33f)
                reflectiveQuadToRelative(-4.5f, 34f)
                quadToRelative(0f, 57f, 40.5f, 97.5f)
                reflectiveQuadTo(408f, 548f)
                quadToRelative(13f, 0f, 24.5f, -2f)
                reflectiveQuadToRelative(22.5f, -6f)
                lineToRelative(137f, 136f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(480f, 800f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveTo(480f, 480f)
                close()
            }
        }.build()

        return _AppIcon!!
    }

@Suppress("ObjectPropertyName")
private var _AppIcon: ImageVector? = null
