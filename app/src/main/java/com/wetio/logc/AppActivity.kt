package com.wetio.logc

import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

open class AppActivity : AppCompatActivity() {
    fun fullScreen() {
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    }
}