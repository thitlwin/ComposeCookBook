import com.guru.composecookbook.build.dependencies.addComposeOfficialDependencies
import com.guru.composecookbook.build.dependencies.addCoreAndroidUiDependencies

plugins {
    /**
     * See [common-compose-module-configs-script-plugin.gradle.kts] file
     */
    id("common-compose-module-configs-script-plugin")
}

dependencies {
    implementation(project(":theme"))
    implementation(project(":components:verticalgrid"))
    implementation("androidx.test.ext:junit-ktx:1.2.1")

    addComposeOfficialDependencies()
    addCoreAndroidUiDependencies()
}
