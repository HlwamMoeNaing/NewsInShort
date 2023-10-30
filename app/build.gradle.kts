plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
//    id("com.google.dagger.hilt.android")
    id("dagger.hilt.android.plugin")
}

apply(plugin = "kotlin-kapt")
apply(plugin = "dagger.hilt.android.plugin")

android {
    namespace = "com.example.newsinshort"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newsinshort"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifeCycleRuntimeKtx)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.compose))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation(Dependencies.jUnitTest)
    androidTestImplementation(Dependencies.jUnitAndroid)
    androidTestImplementation(Dependencies.expresso)
    androidTestImplementation(platform(Dependencies.compose))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation(Dependencies.navigationCompose)
    implementation(Dependencies.lifeCycleViewModelKtx)

    implementation(project(Modules.utilties))

//    implementation(Dependencies.hiltAndroid)
//    kapt(Dependencies.hiltCompiler)
//    kapt(Dependencies.hiltAndroidCompiler)

    //Dagger - Hilt
    implementation(Dependencies.hiltAndroid)
    annotationProcessor(Dependencies.hiltAnnotation)
    kapt(Dependencies.hiltCompiler)
    kapt(Dependencies.hiltXcompiler)
    implementation(Dependencies.hiltNavigationCompose)

    implementation(Dependencies.composeNavigation)

    // Material Icons
    implementation(Dependencies.material3Icon)
    // material3
    implementation(Dependencies.normalMaterial3)

    //Coroutines
    implementation(Dependencies.coroutineCore)
    implementation(Dependencies.coroutineAndroid)
    implementation(Dependencies.coroutinePlayService)

    // To use Kotlin coroutines with lifecycle-aware components
    implementation(Dependencies.lifeCycleVm)
    implementation(Dependencies.coroLifeCycleRuntime)

    //Retrofit
    implementation(Dependencies.retrofit)

    //GSON converter
    implementation(Dependencies.gsonConverter)

    // Coil
    implementation(Dependencies.coinIo)

    // OkHttp
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLoging)

    // Preferences Datastore
    implementation(Dependencies.prefDataStore)

    // ConstraintLayout
    implementation(Dependencies.constraintLayout)

    //LiveData
    implementation(Dependencies.lifeCycleLiveData)
    implementation(Dependencies.permission)

    //coil image
    implementation(Dependencies.coilImage)

    //Room
    implementation(Dependencies.jsonSerializable)
    implementation (Dependencies.roomKtx)
    kapt(Dependencies.roomCompiler)
    implementation (Dependencies.roomRuntimeLiveData)

    implementation(Dependencies.splashScreen)


    implementation (Dependencies.windowSizeClass)
    implementation (Dependencies.moshi)
    implementation (Dependencies.moshiConverter)
}
kapt{
    correctErrorTypes = true
}