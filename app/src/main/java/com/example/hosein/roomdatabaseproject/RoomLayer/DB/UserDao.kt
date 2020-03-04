package com.example.hosein.roomdatabaseproject.RoomLayer.DB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.hosein.roomdatabaseproject.RoomLayer.Entities.UserEntity

@Dao
interface UserDao {

    @Query("select * from users")
    fun getAll(): List<UserEntity>

    @Insert
    fun insert(user:UserEntity)
}