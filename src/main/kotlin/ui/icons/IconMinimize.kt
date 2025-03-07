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
val IconMinimize: ImageVector
    get() {
        if (_IconMinimize != null) {
            return _IconMinimize!!
        }
        _IconMinimize = ImageVector.Builder(
            name = "IconMinimize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF222222))) {
                moveTo(240f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                lineTo(240f, 840f)
                close()
            }
        }.build()

        return _IconMinimize!!
    }

@Suppress("ObjectPropertyName")
private var _IconMinimize: ImageVector? = null
