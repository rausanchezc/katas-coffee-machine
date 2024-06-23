plugins {
    kotlin("jvm") version "1.9.0"
}

group = "com.rausanchezc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.26.0")
}


tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}