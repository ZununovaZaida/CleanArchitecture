package com.umbr.cleanarchitecture.data.local.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.RoomDatabase
import androidx.room.Update
import com.umbr.cleanarchitecture.data.local.entities.NotesEntity

@Dao
interface NotesDao {
    @Query("SELECT * FROM NotesEntity")
    fun getNotesList(): List<NotesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(noteModels: NotesEntity)

    @Delete
    fun deleteNote(noteModels: NotesEntity)

    @Update
    fun updateNote(noteModels: NotesEntity)
}