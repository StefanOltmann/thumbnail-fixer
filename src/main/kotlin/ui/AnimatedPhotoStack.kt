package ui

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import ui.theme.lightGray
import kotlin.math.max

private const val SCALE_START_VALUE = 3f
private const val SCALE_END_VALUE = 1.3f
private const val MIN_ANGLE = 5
private const val MAX_ANGLE = 20
private const val ANIMATION_DURATION_MS = 1000

@Composable
fun AnimatedPhotoStack(
    images: SnapshotStateList<ImageBitmap>,
    animatedImages: MutableSet<ImageBitmap>
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .clipToBounds()
    ) {

        images.forEachIndexed { index, image ->

            val imageLongSide = max(image.width, image.height)

            val scaleStart: Float = 500f / imageLongSide * SCALE_START_VALUE
            val scaleEnd: Float = 500f / imageLongSide * SCALE_END_VALUE

            val rotation = remember(image) {

                if (index % 2 == 0)
                    (MIN_ANGLE..MAX_ANGLE).random().toFloat()
                else
                    (-MAX_ANGLE..MIN_ANGLE).random().toFloat()
            }

            val scale = remember(image) {

                if (animatedImages.contains(image))
                    Animatable(scaleEnd)
                else
                    Animatable(scaleStart)
            }

            LaunchedEffect(image) {
                if (!animatedImages.contains(image)) {
                    animatedImages.add(image)
                    scale.animateTo(
                        targetValue = scaleEnd,
                        animationSpec = tween(ANIMATION_DURATION_MS)
                    )
                }
            }

            Image(
                bitmap = image,
                contentDescription = null,
                modifier = Modifier
                    .rotate(rotation)
                    .graphicsLayer(
                        scaleX = scale.value,
                        scaleY = scale.value
                    )
                    .zIndex(index.toFloat())
                    .border(2.dp, lightGray)
            )
        }
    }
}
