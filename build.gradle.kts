import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")
    id("me.qoomon.git-versioning") version "6.4.3"
    id("dev.hydraulic.conveyor") version "1.12"
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

    jvmToolchain(24)
}

dependencies {

    /* Compose */
    implementation(compose.desktop.currentOs)
    implementation(compose.material3)
    implementation(compose.components.resources)

    /* Coroutines */
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")

    /* Metadata read & write */
    implementation("com.ashampoo:kim:0.26.2")

    /* IO */
    implementation("org.jetbrains.kotlinx:kotlinx-io-core:0.8.0")

    /* VIPS */
    implementation("app.photofox.vips-ffm:vips-ffm-core:1.9.1")

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

// region Work around temporary Compose bugs.
configurations.all {
    attributes {
        // https://github.com/JetBrains/compose-jb/issues/1404#issuecomment-1146894731
        attribute(Attribute.of("ui", String::class.java), "awt")
    }
}
// endregion
