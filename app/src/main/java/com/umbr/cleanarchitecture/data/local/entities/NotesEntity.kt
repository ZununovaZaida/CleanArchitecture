package com.umbr.cleanarchitecture.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.umbr.cleanarchitecture.domain.models.NotesModel

@Entity
data class NotesEntity(
    val title: String,
    val description: String,
    val color: String,
    val data: String,
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

fun NotesEntity.toDomain() = NotesModel(
    title = title,
    description = description,
    color = color,
    data = data
)

fun NotesModel.toData() = NotesEntity(
    title = title,
    description = description,
    color = color,
    data = data
)