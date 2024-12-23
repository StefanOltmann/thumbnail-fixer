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
val IconLeft: ImageVector
    get() {
        if (_IconLeft != null) {
            return _IconLeft!!
        }
        _IconLeft = ImageVector.Builder(
            name = "IconLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF222222))) {
                moveTo(560f, 720f)
                lineTo(320f, 480f)
                lineToRelative(240f, -240f)
                lineToRelative(56f, 56f)
                lineToRelative(-184f, 184f)
                lineToRelative(184f, 184f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()

        return _IconLeft!!
    }

@Suppress("ObjectPropertyName")
private var _IconLeft: ImageVector? = null
