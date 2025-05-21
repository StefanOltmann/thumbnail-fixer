package ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AppIcon: ImageVector
    get() {
        if (_AppIcon != null) {
            return _AppIcon!!
        }
        _AppIcon = ImageVector.Builder(
            name = "AppIcon",
            defaultWidth = 128.dp,
            defaultHeight = 128.dp,
            viewportWidth = 128f,
            viewportHeight = 128f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(114f, 34.15f)
                lineTo(114f, 93.85f)
                curveTo(114f, 97.8f, 110.8f, 101f, 106.85f, 101f)
                lineTo(21.15f, 101f)
                curveTo(17.2f, 101f, 14f, 97.8f, 14f, 93.85f)
                lineTo(14f, 34.15f)
                curveTo(14f, 30.2f, 17.2f, 27f, 21.15f, 27f)
                lineTo(106.85f, 27f)
                curveTo(110.8f, 27f, 114f, 30.2f, 114f, 34.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF42B7EB))) {
                moveTo(18f, 89f)
                lineTo(18f, 37f)
                curveTo(18f, 33.48f, 20.4f, 31f, 24f, 31f)
                lineTo(104f, 31f)
                curveTo(107.6f, 31f, 110f, 33.48f, 110f, 37f)
                lineTo(110f, 73f)
                lineTo(92.62f, 55f)
                curveTo(92.62f, 55f, 88.53f, 51f, 86.49f, 51f)
                curveTo(84.44f, 51f, 80.36f, 55f, 80.36f, 55f)
                lineTo(59.91f, 75f)
                lineTo(51.73f, 67f)
                curveTo(51.73f, 67f, 47.64f, 63f, 45.6f, 63f)
                curveTo(43.56f, 63f, 39.47f, 67f, 39.47f, 67f)
                lineTo(18f, 89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF409568))) {
                moveTo(110f, 73f)
                lineTo(110f, 91f)
                curveTo(110f, 94.52f, 107.6f, 97f, 104f, 97f)
                lineTo(24f, 97f)
                curveTo(20.4f, 97f, 18f, 94.52f, 18f, 91f)
                lineTo(18f, 89f)
                lineTo(39.47f, 67f)
                curveTo(39.47f, 67f, 43.56f, 63f, 45.6f, 63f)
                curveTo(47.64f, 63f, 51.73f, 67f, 51.73f, 67f)
                lineTo(59.91f, 75f)
                lineTo(80.36f, 55f)
                curveTo(80.36f, 55f, 84.44f, 51f, 86.49f, 51f)
                curveTo(88.53f, 51f, 92.62f, 55f, 92.62f, 55f)
                lineTo(110f, 73f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFCB3D))) {
                moveTo(36f, 47f)
                moveToRelative(-10f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(84f, 31f)
                lineTo(90f, 31f)
                lineTo(84f, 45f)
                lineTo(78f, 49f)
                lineTo(74f, 57f)
                lineTo(66f, 63f)
                lineTo(62f, 75f)
                lineTo(58f, 79f)
                lineTo(50f, 97f)
                lineTo(48f, 97f)
                lineTo(54f, 77f)
                lineTo(58f, 74f)
                lineTo(62f, 60f)
                lineTo(68f, 55f)
                lineTo(72f, 47f)
                lineTo(80f, 41f)
                lineTo(84f, 31f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(100f, 86f)
                moveToRelative(-24f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
            }
            path(fill = SolidColor(Color(0xFF2778AF))) {
                moveTo(111.06f, 102.66f)
                curveTo(107.89f, 104.77f, 104.09f, 106f, 100f, 106f)
                curveTo(88.96f, 106f, 80f, 97.04f, 80f, 86f)
                curveTo(80f, 74.96f, 88.96f, 66f, 100f, 66f)
                curveTo(111.04f, 66f, 120f, 74.96f, 120f, 86f)
                curveTo(120f, 90.06f, 118.79f, 93.84f, 116.71f, 96.99f)
                lineTo(107.61f, 87.9f)
                curveTo(109.38f, 83.87f, 108.61f, 79f, 105.31f, 75.7f)
                curveTo(102.29f, 72.68f, 97.95f, 71.78f, 94.14f, 73.01f)
                lineTo(100.36f, 79.24f)
                curveTo(101.34f, 80.21f, 102.05f, 81.79f, 101.07f, 82.77f)
                lineTo(96.83f, 87.01f)
                curveTo(95.85f, 87.99f, 94.27f, 87.28f, 93.29f, 86.31f)
                lineTo(86.93f, 79.94f)
                curveTo(85.7f, 83.75f, 86.74f, 88.24f, 89.76f, 91.26f)
                curveTo(93.05f, 94.55f, 97.93f, 95.32f, 101.95f, 93.55f)
                lineTo(111.06f, 102.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCACBC7))) {
                moveTo(111.06f, 102.66f)
                lineTo(101.95f, 93.55f)
                curveTo(97.93f, 95.32f, 93.05f, 94.55f, 89.76f, 91.26f)
                curveTo(86.74f, 88.24f, 85.7f, 83.75f, 86.93f, 79.94f)
                lineTo(93.29f, 86.31f)
                curveTo(94.27f, 87.28f, 95.85f, 87.99f, 96.83f, 87.01f)
                lineTo(101.07f, 82.77f)
                curveTo(102.05f, 81.79f, 101.34f, 80.21f, 100.36f, 79.24f)
                lineTo(94.14f, 73.01f)
                curveTo(97.95f, 71.78f, 102.29f, 72.68f, 105.31f, 75.7f)
                curveTo(108.61f, 79f, 109.38f, 83.87f, 107.61f, 87.9f)
                lineTo(116.71f, 96.99f)
                curveTo(116.33f, 97.56f, 115.93f, 98.1f, 115.51f, 98.62f)
                lineTo(107.43f, 90.55f)
                curveTo(106.65f, 89.77f, 105.39f, 89.77f, 104.61f, 90.55f)
                curveTo(103.83f, 91.33f, 103.83f, 92.6f, 104.61f, 93.38f)
                lineTo(112.69f, 101.46f)
                curveTo(112.17f, 101.89f, 111.62f, 102.29f, 111.06f, 102.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB3B4B5))) {
                moveTo(115.51f, 98.62f)
                curveTo(114.67f, 99.66f, 113.72f, 100.61f, 112.69f, 101.46f)
                lineTo(104.61f, 93.38f)
                curveTo(103.83f, 92.6f, 103.83f, 91.33f, 104.61f, 90.55f)
                curveTo(105.39f, 89.77f, 106.65f, 89.77f, 107.43f, 90.55f)
                lineTo(115.51f, 98.62f)
                close()
            }
        }.build()

        return _AppIcon!!
    }

@Suppress("ObjectPropertyName")
private var _AppIcon: ImageVector? = null
