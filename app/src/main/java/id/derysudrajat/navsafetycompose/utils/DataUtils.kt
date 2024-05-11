package id.derysudrajat.navsafetycompose.utils

import id.derysudrajat.navsafetycompose.ui.screen.withdata.AndroidLibrary


object DataUtils {
    val listWithDataNavigation = listOf(
        "Navigation Bring String Data",
        "To Android Lib Screen bring Custom Data"
    )

    val listMainNavigation = listOf(
        "JustMoveScreen",
        "WithDataScreen"
    )

    val randomStringData = listOf(
        "Hello, World! (English)",
        "Hola Mundo (Spanish)",
        "Bonjour le monde (French)",
        "Hallo Welt (German)",
        "Ciao mondo (Italian)",
        "Olá Mundo (Portuguese)",
        "Привет мир (Russian)",
        "こんにちは世界 (Konnichiwa sekai) (Japanese)",
        "안녕하세요 세계 (Anyeonghaseyo segye) (Korean)",
        "你好世界 (Nǐ hǎo shìjiè) (Chinese)",
        "नमस्ते दुनिया (Namaste dunia) (Hindi)",
        "مرحبا بالعالم (Marhaba bil-alam) (Arabic)",
        "Merhaba Dünya (Turkish)",
        "Xin chào thế giới (Vietnamese)",
        "Halo Dunia (Indonesian)",
        "สวัสดีโลก (Sawatdi lok) (Thai)",
        "Cześć świecie (Polish)",
        "Hallo Wereld (Dutch)",
        "שלום עולם (Shalom olam) (Hebrew)",
        "Hej världen (Swedish)"
    )
    
    val listOfAndroidLib = listOf(
        AndroidLibrary("ViewModel", "1.2.0-alpha07", listOf("androidx.lifecycle:lifecycle-viewmodel")),
        AndroidLibrary("LiveData", "2.4.0", listOf("androidx.lifecycle:lifecycle-livedata")),
        AndroidLibrary(
            "Navigation",
            "2.4.0",
            listOf("androidx.navigation:navigation-runtime")
        ),
        AndroidLibrary("Room", "2.4.2", listOf("androidx.room:room-runtime", "androidx.room:room-ktx")),
        AndroidLibrary("WorkManager", "2.7.1", listOf("androidx.work:work-runtime-ktx")),
        AndroidLibrary("Paging", "3.1.0", listOf("androidx.paging:paging-runtime-ktx")),
        AndroidLibrary("Security", "1.1.0-rc01", listOf("androidx.security:security-crypto")),
        AndroidLibrary("DataStore", "1.0.0", listOf("androidx.datastore:datastore-preferences")),
        AndroidLibrary("CameraX", "1.1.0", listOf("androidx.camera:camera-core", "androidx.camera:camera-camera2 (optional)")),
        AndroidLibrary("Biometric", "1.2.0", listOf("androidx.biometric:biometric")),
        AndroidLibrary("Legacy Support", "1.4.0", listOf("androidx.legacy:legacy-support-v4")),
        AndroidLibrary("AppCompat", "1.4.2", listOf("androidx.appcompat:appcompat")),
        AndroidLibrary("Wear OS", "1.5.0-alpha02", listOf("androidx.wear:wear")),
        AndroidLibrary("Test", "1.4.0", listOf("androidx.test:testing-junit")),
        AndroidLibrary("Test JUnit4", "1.4.0", listOf("androidx.test.ext:junit")),
        AndroidLibrary("Test Espresso", "	1.4.0", listOf("androidx.test.espresso:espresso-core")),
        AndroidLibrary("Navigation Testing", "2.4.0", listOf("androidx.navigation:navigation-testing-ktx")),
        AndroidLibrary("Lifecycle Kapt", "2.4.0", listOf("androidx.lifecycle:lifecycle-compiler")),
        AndroidLibrary("Room Kapt", "2.4.2", listOf("androidx.room:room-compiler")),
    )


}