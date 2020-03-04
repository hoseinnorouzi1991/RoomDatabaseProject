package com.example.hosein.roomdatabaseproject.RoomLayer.Doa

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.hosein.roomdatabaseproject.RoomLayer.DB.UserDao
import com.example.hosein.roomdatabaseproject.RoomLayer.Entities.UserEntity

@Database(entities = arrayOf(UserEntity::class),version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun users():UserDao

    companion object{
        private var instance:AppDatabase? = null

        fun getInstance(context:Context):AppDatabase{
            if(instance == null)
            {
                instance = Room.databaseBuilder(context,AppDatabase::class.java,"room_basic")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }

            return instance!!
        }
    }
}