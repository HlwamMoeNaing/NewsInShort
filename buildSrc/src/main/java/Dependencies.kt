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
}
object Modules{
    const val utilties = ":utilties"
}