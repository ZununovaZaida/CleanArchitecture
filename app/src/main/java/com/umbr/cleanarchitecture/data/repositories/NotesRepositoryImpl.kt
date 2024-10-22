package com.umbr.cleanarchitecture.data.repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.umbr.cleanarchitecture.data.local.daos.NotesDao
import com.umbr.cleanarchitecture.data.local.entities.toData
import com.umbr.cleanarchitecture.data.local.entities.toDomain
import com.umbr.cleanarchitecture.domain.NotesRepository
import com.umbr.cleanarchitecture.domain.models.NotesModel
import javax.inject.Inject

class NotesRepositoryImpl @Inject constructor(private val notesDao: NotesDao) : NotesRepository{

    override fun addNotes(notes: NotesModel) {
        Log.e("noteList", "addNotes: $notes", )
        notesDao.insertNote(notes.toData())
    }

    override fun deleteNotes(notes: NotesModel) {
        notesDao.deleteNote(notes.toData())
    }

    override fun editNotes(notes: NotesModel) {
        notesDao.updateNote(notes.toData())
    }

    override fun getNotesList(): List<NotesModel> {
        return notesDao.getNotesList().map { notesEntity ->
                Log.e("noteList", "addNotes: $notesEntity", )
                notesEntity.toDomain()

        }
    }
}