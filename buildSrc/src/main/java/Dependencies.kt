object Dependencies {

    const val kotlinCore = "androidx.core:core-ktx:1.9.0"
    const val appCompat = "androidx.appcompat:appcompat:1.6.1"
    const val material = "com.google.android.material:material:1.8.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1"

    object Plugins {

        const val androidGradlePlugin = "com.android.tools.build:gradle:7.4.1"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10"
        const val androidDaggerHiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:2.44"
    }

    object Coroutines {

        const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
        const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
    }

    object Retrofin2 {

        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val converterGson = "com.squareup.retrofit2:converter-gson:2.9.0"
    }

    object Room {

        const val roomRuntime = "androidx.room:room-runtime:2.5.0"
        const val roomCompilerKapt = "androidx.room:room-compiler:2.5.0"
        const val roomKtx = "androidx.room:room-ktx:2.5.0"
    }

    object DaggerHilt {

        const val daggerHiltPlugin = "com.google.dagger.hilt.android"
        const val hiltAndroid = "com.google.dagger:hilt-android:2.44"
        const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:2.44"
    }

    object Tests {

        const val jInit = "junit:junit:4.13.2"
        const val jUtitExt = "androidx.test.ext:junit:1.1.5"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.5.1"
    }
}