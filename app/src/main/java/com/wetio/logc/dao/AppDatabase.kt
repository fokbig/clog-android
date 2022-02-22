package com.wetio.logc.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wetio.logc.dao.user.User
import com.wetio.logc.dao.user.UserDao

@Database(
    entities = [
        User::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}