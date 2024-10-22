package com.umbr.cleanarchitecture.domain.use_cases

import com.umbr.cleanarchitecture.domain.NotesRepository
import com.umbr.cleanarchitecture.domain.models.NotesModel
import javax.inject.Inject

class EditNotesUseCase@Inject constructor(private val repository: NotesRepository) {

    operator fun invoke(notes: NotesModel) {
        repository.editNotes(notes)
    }
}