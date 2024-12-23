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
val IconRight: ImageVector
    get() {
        if (_IconRight != null) {
            return _IconRight!!
        }
        _IconRight = ImageVector.Builder(
            name = "IconRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF222222))) {
                moveTo(504f, 480f)
                lineTo(320f, 296f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                lineToRelative(-56f, -56f)
                lineToRelative(184f, -184f)
                close()
            }
        }.build()

        return _IconRight!!
    }

@Suppress("ObjectPropertyName")
private var _IconRight: ImageVector? = null
