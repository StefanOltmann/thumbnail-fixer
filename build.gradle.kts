import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.compose)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.git.versioning)
    alias(libs.plugins.conveyor)
}

group = "io.github.stefanoltmann"
version = "1.0.0"

gitVersioning.apply {

    refs {
        tag("v(?<version>.*)") {
            version = "\${ref.version}"
        }
    }
}

repositories {
    mavenCentral()
    google()
    maven { url = uri("https://jitpack.io") }
}

kotlin {

    jvmToolchain(25)
}

dependencies {

    /* Compose */
    implementation(compose.desktop.currentOs)
    implementation(compose.material3)
    implementation(compose.components.resources)

    /* Platform Tools */
    implementation(libs.platformtools.core)
    implementation(libs.platformtools.darkmodedetector)

    /* Coroutines */
    implementation(libs.kotlinx.coroutines.core)

    /* Metadata read & write */
    implementation(libs.kim)

    /* IO */
    implementation(libs.kotlinx.io.core)

    /* VIPS */
    implementation(libs.vips.ffm.core)

    /* Conveyor */
    linuxAmd64(compose.desktop.linux_x64)
    macAmd64(compose.desktop.macos_x64)
    macAarch64(compose.desktop.macos_arm64)
    windowsAmd64(compose.desktop.windows_x64)
}

compose.desktop {

    application {

        mainClass = "MainKt"

        nativeDistributions {

            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)

            packageName = "Thumbnail Fixer"

            packageVersion = version.toString()
        }
    }
}

// region Copy Windows DLLs to distribution
tasks.register<Copy>("copyWindowsDlls") {

    description = "Copy Windows DLLs to the distribution directory"
    group = "build"

    from("${rootProject.projectDir}/resources/windows")
    into("${layout.buildDirectory.get()}/compose/binaries/main/app/Thumbnail Fixer/app")

    // Only execute this task when running on Windows
    onlyIf {
        org.gradle.internal.os.OperatingSystem.current().isWindows
    }
}

gradle.projectsEvaluated {
    tasks.named("createDistributable") {
        finalizedBy("copyWindowsDlls")
    }
    tasks.named("runDistributable") {
        dependsOn("copyWindowsDlls")
    }
}
// endregion
