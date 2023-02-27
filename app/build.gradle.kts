plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id(Dependencies.DaggerHilt.daggerHiltPlugin)
}

android {
    namespace = Config.namespace
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Dependencies.kotlinCore)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    implementation(Dependencies.constraintLayout)

    implementation(Dependencies.lifecycleViewModel)

    implementation(Dependencies.Coroutines.kotlinCoroutinesCore)
    implementation(Dependencies.Coroutines.kotlinCoroutinesAndroid)

    implementation(Dependencies.Retrofin2.retrofit)
    implementation(Dependencies.Retrofin2.converterGson)

    implementation(Dependencies.Room.roomRuntime)
    implementation(Dependencies.Room.roomKtx)
    kapt(Dependencies.Room.roomCompilerKapt)

    implementation(Dependencies.DaggerHilt.hiltAndroid)
    kapt(Dependencies.DaggerHilt.hiltAndroidCompiler)

    testImplementation(Dependencies.Tests.jInit)
    androidTestImplementation(Dependencies.Tests.jUtitExt)
    androidTestImplementation(Dependencies.Tests.espressoCore)
}

kapt {
    correctErrorTypes = true
}
