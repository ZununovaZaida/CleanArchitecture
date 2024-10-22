package com.umbr.cleanarchitecture.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.umbr.cleanarchitecture.data.local.daos.NotesDao
import com.umbr.cleanarchitecture.data.local.entities.NotesEntity

@Database(entities = [NotesEntity::class], version = 3)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteDao(): NotesDao
}