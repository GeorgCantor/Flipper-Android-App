plugins {
    id("flipper.multiplatform")
    id("flipper.multiplatform-dependencies")
    id("flipper.anvil-multiplatform")
}

android.namespace = "com.flipperdevices.bridge.connection.feature.rpc.impl"

commonDependencies {
    implementation(projects.components.bridge.connection.feature.rpc.api)

    implementation(projects.components.core.di)
    implementation(projects.components.core.ktx)
    implementation(projects.components.core.log)

    implementation(projects.components.bridge.connection.pbutils)

    implementation(projects.components.analytics.shake2report.api)

    implementation(projects.components.bridge.connection.feature.common.api)
    implementation(projects.components.bridge.connection.feature.lagsdetector.api)
    implementation(projects.components.bridge.connection.feature.restartrpc.api)
    implementation(projects.components.bridge.connection.transport.common.api)

    implementation(libs.kotlin.coroutines)
    implementation(libs.fastutil)
}

jvmSharedTestDependencies {
    implementation(libs.junit)
    implementation(libs.kotlin.coroutines.test)
}
