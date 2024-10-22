package com.umbr.cleanarchitecture.domain.use_cases

import com.umbr.cleanarchitecture.domain.NotesRepository
import javax.inject.Inject

class GetNotesListUseCase@Inject constructor(private val repository: NotesRepository) {

    operator fun invoke() = repository.getNotesList()
}