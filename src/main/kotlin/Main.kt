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
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import app.photofox.vipsffm.Vips
import ui.AppFooter
import ui.AppTitleBar
import ui.ContentView
import ui.icons.AppIcon
import ui.icons.IconBackground
import ui.theme.AppTypography
import ui.theme.appColorScheme
import ui.theme.defaultRoundedCornerShape
import javax.swing.JOptionPane
import kotlin.system.exitProcess

const val APP_TITLE = "Thumbnail Fixer"

const val WINDOW_WIDTH = 500
const val WINDOW_HEIGHT = (WINDOW_WIDTH / 4) * 3

private val isWindows =
    System.getProperty("os.name").startsWith("Win")

fun main() {

    try {

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
                size = DpSize(
                    width = WINDOW_WIDTH.dp,
                    height = WINDOW_HEIGHT.dp + if (isWindows) 28.dp else 0.dp
                )
            )

            Window(
                onCloseRequest = ::exitApplication,
                icon = rememberVectorPainter(AppIcon),
                title = APP_TITLE,
                /*
                 * Due to a bug undecorated Windows won't always
                 * show up on all Windows devices. Really nasty.
                 */
                undecorated = !isWindows,
                transparent = !isWindows,
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
                            .then(
                                if (isWindows)
                                    Modifier
                                else
                                    Modifier.clip(defaultRoundedCornerShape)
                            )
                    ) {

                        Image(
                            imageVector = IconBackground,
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .fillMaxSize()
                        )

                        Column {

                            /*
                             * We don't want to show a doubled title bar,
                             * so we show a footer on Windows.
                             */
                            if (!isWindows) {

                                AppTitleBar(
                                    windowState = windowState,
                                    exitApplication = ::exitApplication
                                )
                            }

                            Box(
                                modifier = Modifier.weight(1F)
                            ) {

                                ContentView(
                                    vipsLoaded = vipsLoaded
                                )
                            }

                            if (isWindows)
                                AppFooter()
                        }
                    }
                }
            }
        }

    } catch (ex: Throwable) {

        JOptionPane.showMessageDialog(
            null,
            ex.stackTraceToString().take(600) + "...",
            "$APP_TITLE crashed",
            JOptionPane.ERROR_MESSAGE
        )

        /* Force close the app. */
        exitProcess(1)
    }
}

