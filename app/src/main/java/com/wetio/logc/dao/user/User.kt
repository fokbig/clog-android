package com.wetio.logc.dao.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class User (
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "username") val username: String?,
    @ColumnInfo(name = "nickname") val nickname: String?,
    @ColumnInfo(name = "token") val token: String?,
    @ColumnInfo(name = "head_img") val headImg: String?
)