package com.wetio.logc

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import androidx.room.RoomDatabase
import com.wetio.logc.dao.AppDatabase

open class AppActivity : AppCompatActivity() {

    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.initAppDatabase()
    }

    private fun initAppDatabase() {
        db = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            this.resources.getString(R.string.database_name)
        ).build()
    }

    // 沉浸式屏幕
    fun fullScreen() {
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    }

    fun getDB(): AppDatabase {
        return this.db
    }
}