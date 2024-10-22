package com.umbr.cleanarchitecture.di.modules

import com.umbr.cleanarchitecture.data.repositories.NotesRepositoryImpl
import com.umbr.cleanarchitecture.domain.NotesRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun bindsNotesRepository(notesRepositoryImpl: NotesRepositoryImpl): NotesRepository {
        return notesRepositoryImpl
    }
}