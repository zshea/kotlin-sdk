plugins {
    id("mcp.multiplatform")
    id("mcp.publishing")
    id("mcp.dokka")
    alias(libs.plugins.kotlinx.binary.compatibility.validator)
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(project(":kotlin-sdk-core"))
                api(libs.ktor.server.core)
                api(libs.ktor.server.sse)
                implementation(libs.ktor.server.websockets)
                implementation(libs.kotlin.logging)
                implementation(libs.ktor.server.content.negotiation)
                implementation(libs.ktor.serialization.kotlinx.json)
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
                implementation(libs.kotlinx.coroutines.test)
            }
        }

        jvmTest {
            dependencies {
                runtimeOnly(libs.slf4j.simple)
            }
        }
    }
}
