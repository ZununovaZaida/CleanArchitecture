package com.umbr.cleanarchitecture.domain.use_cases

import com.umbr.cleanarchitecture.domain.NotesRepository
import com.umbr.cleanarchitecture.domain.models.NotesModel
import javax.inject.Inject

class AddNotesUseCase @Inject constructor(private val notesRepository: NotesRepository) {

    operator fun invoke(notesModel: NotesModel) {
        notesRepository.addNotes(notesModel)
    }
}