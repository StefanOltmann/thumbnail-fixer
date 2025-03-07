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

@Suppress("MagicNumber")
val IconCheckboxChecked: ImageVector
    get() {
        if (_IconCheckboxChecked != null) {
            return _IconCheckboxChecked!!
        }
        _IconCheckboxChecked = ImageVector.Builder(
            name = "IconCheckboxChecked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF222222))) {
                moveToRelative(424f, 648f)
                lineToRelative(282f, -282f)
                lineToRelative(-56f, -56f)
                lineToRelative(-226f, 226f)
                lineToRelative(-114f, -114f)
                lineToRelative(-56f, 56f)
                lineToRelative(170f, 170f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                lineTo(200f, 840f)
                close()
            }
        }.build()

        return _IconCheckboxChecked!!
    }

@Suppress("ObjectPropertyName")
private var _IconCheckboxChecked: ImageVector? = null
