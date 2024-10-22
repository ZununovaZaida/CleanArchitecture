package com.umbr.cleanarchitecture.domain

import androidx.lifecycle.LiveData
import com.umbr.cleanarchitecture.domain.models.NotesModel

interface NotesRepository {

    fun addNotes(notes: NotesModel)
    fun deleteNotes(notes: NotesModel)
    fun editNotes(notes: NotesModel)
    fun getNotesList() : List<NotesModel>
}