object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.corektx}" }
    val lifeCycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.corektx}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val appCompact by lazy { "androidx.appcompat:appcompat:${Versions.appCompact}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val compose by lazy { "androidx.compose:compose-bom:${Versions.compose}" }
    val expresso by lazy { "androidx.test.espresso:espresso-core:${Versions.expresso}" }
    val jUnitAndroid by lazy { "androidx.test.ext:junit:${Versions.jUnitAndroid}" }
    val jUnitTest by lazy { "junit:junit:${Versions.jUnitTest}" }
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.navigationCompose}" }
    val lifeCycleViewModelKtx by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycleViewKtx}" }

//    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
//    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltCompiler}" }
//    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }
//
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hiltAndroid}" }
    val hiltAnnotation by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltAnnotation}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hiltAndroid}" }
    val hiltXcompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }
    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigation}" }
    val composeNavigation by lazy { "androidx.navigation:navigation-compose:${Versions.composeNavigation}" }
    val material3Icon by lazy { "androidx.compose.material:material-icons-extended:${Versions.material3Icon}" }
    val coroutineCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutiner}" }
    val coroutineAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutiner}" }
    val coroutinePlayService by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutiner}" }
    val lifeCycleVm by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.coroutineVMKtx}" }
    val coroLifeCycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.coroutineVMKtx}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val gsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.retrofit}" }
    val coinIo by lazy { "io.coil-kt:coil-compose:${Versions.coil}" }
    val okHttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okHttp}" }
    val okHttpLoging by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}" }
    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshi}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}" }

    val prefDataStore by lazy { "androidx.datastore:datastore-preferences:${Versions.prefDatastore}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout-compose:${Versions.constraintLayout}" }
    val lifeCycleLiveData by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveData}" }
    val permission by lazy { "com.google.accompanist:accompanist-permissions:${Versions.permission}" }
    val coilImage by lazy { "io.coil-kt:coil-compose:${Versions.coilImage}" }
    val jsonSerializable by lazy { "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.jsonSerializable}" }
    val roomKtx by lazy { "androidx.room:room-ktx:${Versions.room}" }
    val roomCompiler by lazy { "androidx.room:room-compiler:${Versions.room}" }
    val roomRuntimeLiveData by lazy { "androidx.compose.runtime:runtime-livedata:${Versions.roomRuntimeLiveData}" }
    val splashScreen by lazy { "androidx.core:core-splashscreen:${Versions.splashScreen}" }
    val windowSizeClass by lazy { "androidx.compose.material3:material3-window-size-class:${Versions.windowSizeClass}" }
    val normalMaterial3 by lazy { "androidx.compose.material3:material3:${Versions.normalMaterial3}" }
}
object Modules{
    const val utilties = ":utilties"
}