/**
 * https://icons8.com/icon/106562/github
 */

package ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@SuppressWarnings("MagicNumber")
val IconGithub: ImageVector
    get() {
        if (_IconGithub != null) {
            return _IconGithub!!
        }
        _IconGithub = ImageVector.Builder(
            name = "IconGithub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.9f, 2.1f)
                curveToRelative(-4.6f, 0.5f, -8.3f, 4.2f, -8.8f, 8.7f)
                curveToRelative(-0.5f, 4.7f, 2.2f, 8.9f, 6.3f, 10.5f)
                curveTo(8.7f, 21.4f, 9f, 21.2f, 9f, 20.8f)
                verticalLineToRelative(-1.6f)
                curveToRelative(0f, 0f, -0.4f, 0.1f, -0.9f, 0.1f)
                curveToRelative(-1.4f, 0f, -2f, -1.2f, -2.1f, -1.9f)
                curveToRelative(-0.1f, -0.4f, -0.3f, -0.7f, -0.6f, -1f)
                curveTo(5.1f, 16.3f, 5f, 16.3f, 5f, 16.2f)
                curveTo(5f, 16f, 5.3f, 16f, 5.4f, 16f)
                curveToRelative(0.6f, 0f, 1.1f, 0.7f, 1.3f, 1f)
                curveToRelative(0.5f, 0.8f, 1.1f, 1f, 1.4f, 1f)
                curveToRelative(0.4f, 0f, 0.7f, -0.1f, 0.9f, -0.2f)
                curveToRelative(0.1f, -0.7f, 0.4f, -1.4f, 1f, -1.8f)
                curveToRelative(-2.3f, -0.5f, -4f, -1.8f, -4f, -4f)
                curveToRelative(0f, -1.1f, 0.5f, -2.2f, 1.2f, -3f)
                curveTo(7.1f, 8.8f, 7f, 8.3f, 7f, 7.6f)
                curveTo(7f, 7.2f, 7f, 6.6f, 7.3f, 6f)
                curveToRelative(0f, 0f, 1.4f, 0f, 2.8f, 1.3f)
                curveTo(10.6f, 7.1f, 11.3f, 7f, 12f, 7f)
                reflectiveCurveToRelative(1.4f, 0.1f, 2f, 0.3f)
                curveTo(15.3f, 6f, 16.8f, 6f, 16.8f, 6f)
                curveTo(17f, 6.6f, 17f, 7.2f, 17f, 7.6f)
                curveToRelative(0f, 0.8f, -0.1f, 1.2f, -0.2f, 1.4f)
                curveToRelative(0.7f, 0.8f, 1.2f, 1.8f, 1.2f, 3f)
                curveToRelative(0f, 2.2f, -1.7f, 3.5f, -4f, 4f)
                curveToRelative(0.6f, 0.5f, 1f, 1.4f, 1f, 2.3f)
                verticalLineToRelative(2.6f)
                curveToRelative(0f, 0.3f, 0.3f, 0.6f, 0.7f, 0.5f)
                curveToRelative(3.7f, -1.5f, 6.3f, -5.1f, 6.3f, -9.3f)
                curveTo(22f, 6.1f, 16.9f, 1.4f, 10.9f, 2.1f)
                close()
            }
        }.build()

        return _IconGithub!!
    }

@Suppress("ObjectPropertyName")
private var _IconGithub: ImageVector? = null
