package com.umbr.cleanarchitecture.presentation.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModelProvider
import com.umbr.cleanarchitecture.domain.models.NotesModel
import com.umbr.cleanarchitecture.presentation.ui.theme.CleanArchitectureTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CleanArchitectureTheme {

            }
        }

        mainViewModel.addNotes(NotesModel( "2", "2", "2", "2"))

        mainViewModel.notesList.observe(this) {
            Log.e("noteList", "onCreate: $it")
        }
    }
}