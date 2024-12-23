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

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import app.photofox.vipsffm.Vips
import ui.AppTitleBar
import ui.ContentView
import ui.icons.IconBackground
import ui.theme.AppTypography
import ui.theme.appColorScheme
import ui.theme.defaultRoundedCornerShape

const val APP_TITLE = "Thumbnail Fixer"

const val WINDOW_WIDTH = 500
const val WINDOW_HEIGHT = (WINDOW_WIDTH / 4) * 3

private val isWindows =
    System.getProperty("os.name").startsWith("Win")

fun main() {

    /*
     * For Windows we bundle vips, but for macOS it must be installed using Homebrew.
     */
    if (!isWindows) {
        System.setProperty("vipsffm.libpath.vips.override", "/opt/homebrew/lib/libvips.dylib")
        System.setProperty("vipsffm.libpath.glib.override", "/opt/homebrew/lib/libglib-2.0.dylib")
        System.setProperty("vipsffm.libpath.gobject.override", "/opt/homebrew/lib/libgobject-2.0.dylib")
    }

    val vipsLoaded: Boolean = try {

        Vips.init()

        true

    } catch (ignore: Throwable) {
        false
    }

    application {

        val windowState = rememberWindowState(
            size = DpSize(WINDOW_WIDTH.dp, WINDOW_HEIGHT.dp)
        )

        Window(
            onCloseRequest = ::exitApplication,
            title = APP_TITLE,
            undecorated = true,
            transparent = true,
            resizable = false,
            state = windowState
        ) {

            MaterialTheme(
                colorScheme = appColorScheme,
                typography = AppTypography()
            ) {

                Box(
                    modifier = Modifier
                        .background(Color.Transparent)
                        .clip(defaultRoundedCornerShape)
                ) {

                    Image(
                        imageVector = IconBackground,
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxSize()
                    )

                    Column {

                        AppTitleBar(
                            windowState,
                            ::exitApplication
                        )

                        ContentView(
                            vipsLoaded = vipsLoaded
                        )
                    }
                }
            }
        }
    }
}

