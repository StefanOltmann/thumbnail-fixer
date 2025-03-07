/*
 * https://www.freepik.com/free-vector/geometric-background_3730424.htm
 */

package ui.icons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Suppress("MagicNumber")
val IconBackground: ImageVector
    get() {
        if (_IconBackground != null) {
            return _IconBackground!!
        }
        _IconBackground = ImageVector.Builder(
            name = "IconBackground",
            defaultWidth = 500.dp,
            defaultHeight = 500.dp,
            viewportWidth = 500f,
            viewportHeight = 500f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2D2D2D),
                        0.28f to Color(0xFF272727),
                        0.63f to Color(0xFF181818),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(-250.38f, 250f),
                    end = Offset(500f, 250f)
                )
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(500f)
                verticalLineToRelative(500f)
                horizontalLineToRelative(-500f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(450.51f, 50.77f),
                    end = Offset(421.18f, 138.09f)
                )
            ) {
                moveTo(500f, 103.78f)
                lineTo(375.53f, 28.8f)
                lineTo(466.3f, 186.44f)
                lineTo(500f, 148.62f)
                lineTo(500f, 103.78f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2D2D2D),
                        0.28f to Color(0xFF272727),
                        0.63f to Color(0xFF181818),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(340.08f, 450.07f),
                    end = Offset(336.75f, 659.67f)
                )
            ) {
                moveTo(383.6f, 500f)
                lineTo(358.64f, 466.39f)
                lineTo(294.97f, 500f)
                lineTo(383.6f, 500f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2D2D2D),
                        0.28f to Color(0xFF272727),
                        0.63f to Color(0xFF181818),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(118.73f, 582.79f),
                    end = Offset(293.44f, 286.62f)
                )
            ) {
                moveTo(202.39f, 500f)
                lineTo(221.94f, 407.04f)
                lineTo(132.74f, 500f)
                lineTo(202.39f, 500f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(528f, 250.73f),
                    end = Offset(347.28f, 391.44f)
                )
            ) {
                moveTo(500f, 376.8f)
                lineTo(466.3f, 186.44f)
                lineTo(310.86f, 329.7f)
                lineTo(500f, 384.86f)
                lineTo(500f, 376.8f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(70.82f, 37.99f),
                    end = Offset(99.82f, 249.99f)
                )
            ) {
                moveTo(18.79f, 219.3f)
                lineTo(21.17f, 220.07f)
                lineTo(179.61f, 271.58f)
                lineTo(104.81f, 28.27f)
                lineTo(102.1f, 29.05f)
                lineTo(18.79f, 219.3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(308.08f, 339.31f),
                    end = Offset(179.61f, 339.31f)
                )
            ) {
                moveTo(308.08f, 330.21f)
                lineTo(179.61f, 271.58f)
                lineTo(221.94f, 407.04f)
                lineTo(308.08f, 330.21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(419.47f, 352.6f),
                    end = Offset(157.38f, 642.15f)
                )
            ) {
                moveTo(294.97f, 500f)
                lineTo(358.64f, 466.39f)
                lineTo(361.81f, 377.82f)
                lineTo(243.88f, 500f)
                lineTo(294.97f, 500f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(361.81f, 438.91f),
                    end = Offset(202.39f, 438.91f)
                )
            ) {
                moveTo(243.88f, 500f)
                lineTo(361.81f, 377.82f)
                lineTo(221.94f, 407.04f)
                lineTo(202.39f, 500f)
                lineTo(243.88f, 500f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(359.39f, 342.5f),
                    end = Offset(221.33f, 407.53f)
                )
            ) {
                moveTo(310.29f, 330.23f)
                lineTo(309.57f, 330.9f)
                lineTo(308.08f, 330.21f)
                lineTo(221.94f, 407.04f)
                lineTo(361.81f, 377.82f)
                lineTo(310.29f, 330.23f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(466.1f, 603.34f),
                    end = Offset(318.87f, 351.3f)
                )
            ) {
                moveTo(404.77f, 500f)
                lineTo(361.81f, 377.82f)
                lineTo(358.64f, 466.39f)
                lineTo(383.6f, 500f)
                lineTo(404.77f, 500f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(490.78f, 357.97f),
                    end = Offset(323.69f, 356.97f)
                )
            ) {
                moveTo(500f, 384.86f)
                lineTo(310.86f, 329.7f)
                lineTo(310.29f, 330.23f)
                lineTo(361.81f, 377.82f)
                lineTo(500f, 385.22f)
                lineTo(500f, 384.86f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(387.42f, 345.17f),
                    end = Offset(477.44f, 480.19f)
                )
            ) {
                moveTo(500f, 385.22f)
                lineTo(361.81f, 377.82f)
                lineTo(404.77f, 500f)
                lineTo(448.7f, 500f)
                lineTo(500f, 388.57f)
                lineTo(500f, 385.22f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2D2D2D),
                        0.28f to Color(0xFF272727),
                        0.63f to Color(0xFF181818),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(36.22f, 480.75f),
                    end = Offset(144.9f, 305.4f)
                )
            ) {
                moveTo(0f, 490.81f)
                lineTo(0f, 500f)
                lineTo(83.34f, 500f)
                lineTo(96.17f, 288.74f)
                lineTo(0f, 490.81f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3E3E3E),
                        0.23f to Color(0xFF383838),
                        0.52f to Color(0xFF292929),
                        0.85f to Color(0xFF0F0F0F),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(58.01f, 257.91f),
                    end = Offset(-18.99f, 574.93f)
                )
            ) {
                moveTo(0f, 308.83f)
                lineTo(0f, 490.81f)
                lineTo(96.17f, 288.74f)
                lineTo(0f, 308.83f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(77.64f, 105.47f),
                    end = Offset(-38.8f, 724.28f)
                )
            ) {
                moveTo(0f, 308.83f)
                lineTo(96.17f, 288.74f)
                lineTo(18.79f, 219.3f)
                lineTo(0f, 236.38f)
                lineTo(0f, 308.83f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(37.37f, 546.55f),
                    end = Offset(256.94f, 188.09f)
                )
            ) {
                moveTo(132.74f, 500f)
                lineTo(221.94f, 407.04f)
                lineTo(96.17f, 288.74f)
                lineTo(83.34f, 500f)
                lineTo(132.74f, 500f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2D2D2D),
                        0.28f to Color(0xFF272727),
                        0.63f to Color(0xFF181818),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(104.81f, 229.56f),
                    end = Offset(79.12f, 302.35f)
                )
            ) {
                moveTo(179.61f, 271.58f)
                lineTo(18.79f, 219.3f)
                lineTo(96.17f, 288.74f)
                lineTo(179.61f, 271.58f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3E3E3E),
                        0.23f to Color(0xFF383838),
                        0.52f to Color(0xFF292929),
                        0.85f to Color(0xFF0F0F0F),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(115.64f, 250.77f),
                    end = Offset(241.67f, 417.3f)
                )
            ) {
                moveTo(221.94f, 407.04f)
                lineTo(179.61f, 271.58f)
                lineTo(96.17f, 288.74f)
                lineTo(221.94f, 407.04f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(113.44f, 358.05f),
                    end = Offset(592.03f, 148.3f)
                )
            ) {
                moveTo(309.19f, 329.22f)
                lineTo(309.7f, 329.36f)
                lineTo(319.59f, 213.33f)
                lineTo(179.61f, 271.58f)
                lineTo(308.08f, 330.21f)
                lineTo(309.19f, 329.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(309.67f, 329.66f)
                lineTo(309.19f, 329.22f)
                lineTo(308.08f, 330.21f)
                lineTo(309.57f, 330.9f)
                lineTo(309.67f, 329.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(309.7f, 329.36f)
                lineTo(309.19f, 329.22f)
                lineTo(309.67f, 329.66f)
                lineTo(309.7f, 329.36f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3E3E3E),
                        0.23f to Color(0xFF383838),
                        0.52f to Color(0xFF292929),
                        0.85f to Color(0xFF0F0F0F),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(261.03f, 256.72f),
                    end = Offset(19.97f, -44.35f)
                )
            ) {
                moveTo(319.59f, 213.33f)
                lineTo(104.81f, 28.27f)
                lineTo(179.61f, 271.58f)
                lineTo(319.59f, 213.33f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(376.76f, 147.43f),
                    end = Offset(203.68f, 119.42f)
                )
            ) {
                moveTo(275.26f, 83.1f)
                lineTo(104.81f, 28.27f)
                lineTo(319.59f, 213.33f)
                lineTo(275.26f, 83.1f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3E3E3E),
                        0.23f to Color(0xFF383838),
                        0.52f to Color(0xFF292929),
                        0.85f to Color(0xFF0F0F0F),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(424.11f, 165.97f),
                    end = Offset(231.07f, 376.02f)
                )
            ) {
                moveTo(310.86f, 329.7f)
                lineTo(466.3f, 186.44f)
                lineTo(319.59f, 213.33f)
                lineTo(309.7f, 329.36f)
                lineTo(310.86f, 329.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(309.57f, 330.9f)
                lineTo(310.29f, 330.23f)
                lineTo(309.67f, 329.66f)
                lineTo(309.57f, 330.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(310.29f, 330.23f)
                lineTo(310.86f, 329.7f)
                lineTo(309.7f, 329.36f)
                lineTo(309.67f, 329.66f)
                lineTo(310.29f, 330.23f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3E3E3E),
                        0.23f to Color(0xFF383838),
                        0.52f to Color(0xFF292929),
                        0.85f to Color(0xFF0F0F0F),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(327.13f, 17.88f),
                    end = Offset(316.13f, 259.88f)
                )
            ) {
                moveTo(275.26f, 83.1f)
                lineTo(319.59f, 213.33f)
                lineTo(375.53f, 28.8f)
                lineTo(275.26f, 83.1f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(305.07f, 157.27f),
                    end = Offset(424.12f, 106.24f)
                )
            ) {
                moveTo(375.53f, 28.8f)
                lineTo(319.59f, 213.33f)
                lineTo(466.3f, 186.44f)
                lineTo(375.53f, 28.8f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(122.03f, -11.96f),
                    end = Offset(246.75f, 60.07f)
                )
            ) {
                moveTo(236.24f, 3.81f)
                lineTo(104.81f, 28.27f)
                lineTo(275.26f, 83.1f)
                lineTo(236.24f, 3.81f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3E3E3E),
                        0.23f to Color(0xFF383838),
                        0.52f to Color(0xFF292929),
                        0.85f to Color(0xFF0F0F0F),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(141.8f, 67.52f),
                    end = Offset(190.82f, -23.51f)
                )
            ) {
                moveTo(118.02f, 0f)
                lineTo(104.81f, 28.27f)
                lineTo(236.24f, 3.81f)
                lineTo(233.6f, 0f)
                lineTo(118.02f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF5394FA),
                        0.01f to Color(0xFF508DF0),
                        0.1f to Color(0xFF3D69B8),
                        0.19f to Color(0xFF2C4A88),
                        0.27f to Color(0xFF1F3061),
                        0.36f to Color(0xFF141D42),
                        0.44f to Color(0xFF0D0E2D),
                        0.52f to Color(0xFF09061F),
                        0.59f to Color(0xFF07031B),
                        0.64f to Color(0xFF0C041E),
                        0.7f to Color(0xFF190926),
                        0.76f to Color(0xFF2F1033),
                        0.82f to Color(0xFF4E1A46),
                        0.89f to Color(0xFF76275E),
                        0.95f to Color(0xFFA6367B),
                        1f to Color(0xFFD04495)
                    ),
                    start = Offset(398.16f, 54.17f),
                    end = Offset(121.82f, -35.72f)
                )
            ) {
                moveTo(233.6f, 0f)
                lineTo(236.24f, 3.81f)
                lineTo(238.75f, 0f)
                lineTo(233.6f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(332.69f, 26.19f),
                    end = Offset(259.16f, 42.69f)
                )
            ) {
                moveTo(375.53f, 28.8f)
                lineTo(236.24f, 3.81f)
                lineTo(275.26f, 83.1f)
                lineTo(375.53f, 28.8f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF5394FA),
                        0.01f to Color(0xFF508DF0),
                        0.1f to Color(0xFF3D69B8),
                        0.19f to Color(0xFF2C4A88),
                        0.27f to Color(0xFF1F3061),
                        0.36f to Color(0xFF141D42),
                        0.44f to Color(0xFF0D0E2D),
                        0.52f to Color(0xFF09061F),
                        0.59f to Color(0xFF07031B),
                        0.64f to Color(0xFF0C041E),
                        0.7f to Color(0xFF190926),
                        0.76f to Color(0xFF2F1033),
                        0.82f to Color(0xFF4E1A46),
                        0.89f to Color(0xFF76275E),
                        0.95f to Color(0xFFA6367B),
                        1f to Color(0xFFD04495)
                    ),
                    start = Offset(398.45f, 53.38f),
                    end = Offset(122.06f, -36.53f)
                )
            ) {
                moveTo(238.75f, 0f)
                lineTo(236.24f, 3.81f)
                lineTo(244.23f, 0f)
                lineTo(238.75f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(341.68f, -60.18f),
                    end = Offset(310.66f, 9.85f)
                )
            ) {
                moveTo(244.23f, 0f)
                lineTo(236.24f, 3.81f)
                lineTo(375.53f, 28.8f)
                lineTo(392.12f, 0f)
                lineTo(244.23f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(71.04f, 55.39f),
                    end = Offset(-117.1f, -68.65f)
                )
            ) {
                moveTo(104.81f, 28.27f)
                lineTo(0f, 3.37f)
                lineTo(0f, 57.93f)
                lineTo(102.52f, 28.09f)
                lineTo(102.1f, 29.05f)
                lineTo(104.81f, 28.27f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3E3E3E),
                        0.23f to Color(0xFF383838),
                        0.52f to Color(0xFF292929),
                        0.85f to Color(0xFF0F0F0F),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(53.96f, -21.35f),
                    end = Offset(69.97f, 51.67f)
                )
            ) {
                moveTo(0f, 0f)
                lineTo(0f, 3.37f)
                lineTo(104.81f, 28.27f)
                lineTo(118.02f, 0f)
                lineTo(0f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(353.05f, 25.96f),
                    end = Offset(531.62f, 57.47f)
                )
            ) {
                moveTo(436.49f, 0f)
                lineTo(375.53f, 28.8f)
                lineTo(500f, 103.78f)
                lineTo(500f, 0f)
                lineTo(436.49f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(413.53f, -25.97f),
                    end = Offset(397.03f, 62.54f)
                )
            ) {
                moveTo(392.12f, 0f)
                lineTo(375.53f, 28.8f)
                lineTo(436.49f, 0f)
                lineTo(392.12f, 0f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(536.24f, 196.71f),
                    end = Offset(483.57f, 279.38f)
                )
            ) {
                moveTo(465.3f, 186.44f)
                lineTo(499f, 376.8f)
                lineTo(499f, 148.62f)
                lineTo(465.3f, 186.44f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3E3E3E),
                        0.23f to Color(0xFF383838),
                        0.52f to Color(0xFF292929),
                        0.85f to Color(0xFF0F0F0F),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(10.64f, 212.97f),
                    end = Offset(-24.37f, 370.98f)
                )
            ) {
                moveTo(0f, 217.87f)
                lineTo(0f, 236.38f)
                lineTo(18.79f, 219.3f)
                lineTo(0f, 217.87f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF2D2D2D),
                        0.28f to Color(0xFF272727),
                        0.63f to Color(0xFF181818),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(-115.15f, 109.21f),
                    end = Offset(242f, -9.84f)
                )
            ) {
                moveTo(0f, 83.79f)
                lineTo(104.15f, 28.1f)
                lineTo(103.09f, 27.82f)
                lineTo(0f, 57.87f)
                lineTo(0f, 83.79f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF3E3E3E),
                        0.23f to Color(0xFF383838),
                        0.52f to Color(0xFF292929),
                        0.85f to Color(0xFF0F0F0F),
                        1f to Color(0xFF000000)
                    ),
                    start = Offset(78.76f, 60.16f),
                    end = Offset(-119.27f, 320.2f)
                )
            ) {
                moveTo(99.18f, 29.89f)
                lineTo(0f, 83.19f)
                lineTo(0f, 217.87f)
                lineTo(18.79f, 219.3f)
                lineTo(102.1f, 29.05f)
                lineTo(99.18f, 29.89f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF505050),
                        1f to Color(0xFF2A2A2A)
                    ),
                    start = Offset(488.99f, 702.3f),
                    end = Offset(462.37f, 233.24f)
                )
            ) {
                moveTo(500f, 388.57f)
                lineTo(448.7f, 500f)
                lineTo(500f, 500f)
                lineTo(500f, 388.57f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00000000),
                        0.29f to Color(0x00000000),
                        1f to Color(0xFF000000)
                    ),
                    center = Offset(115.44f, 146.51f),
                    radius = 631.36f
                )
            ) {
                moveTo(0.38f, 0f)
                horizontalLineToRelative(499.25f)
                verticalLineToRelative(500f)
                horizontalLineToRelative(-499.25f)
                close()
            }
        }.build()

        return _IconBackground!!
    }

@Suppress("ObjectPropertyName")
private var _IconBackground: ImageVector? = null
