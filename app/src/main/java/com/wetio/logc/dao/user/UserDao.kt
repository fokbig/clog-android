package com.wetio.logc.dao.user

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM user limit 1")
    fun get(): User

    @Insert
    fun insert(user: User)

    @Delete
    fun delete(user: User)
}