package com.umbr.cleanarchitecture.presentation.activity

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.umbr.cleanarchitecture.domain.NotesRepository
import com.umbr.cleanarchitecture.domain.models.NotesModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val notesRepository: NotesRepository
): ViewModel() {

    private var _notesList: LiveData<List<NotesModel>> = MutableLiveData()
    val notesList: LiveData<List<NotesModel>> = _notesList

    init {
        getNotesList()
    }

    fun addNotes(notesModel: NotesModel) {
        Log.e("noteList", "onCreate: add")
        notesRepository.addNotes(notesModel)
    }

    private fun getNotesList() {
        Log.e("noteList", "onCreate: ${notesRepository.getNotesList()}")

    }
}