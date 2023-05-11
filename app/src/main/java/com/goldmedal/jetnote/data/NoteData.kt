package com.goldmedal.jetnote.data

import android.os.Build
import androidx.annotation.RequiresApi
import com.goldmedal.jetnote.model.Note

class NoteData {
    @RequiresApi(Build.VERSION_CODES.O)
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A Good Day", description = "We went on a vacation to a hill station."),
            Note(title = "A Good Day", description = "We went on a vacation to a hill station."),
            Note(title = "A Good Day", description = "We went on a vacation to a hill station."),
            Note(title = "A Good Day", description = "We went on a vacation to a hill station."),
            Note(title = "A Good Day", description = "We went on a vacation to a hill station."),
            Note(title = "A Good Day", description = "We went on a vacation to a hill station.")
        )
    }
}