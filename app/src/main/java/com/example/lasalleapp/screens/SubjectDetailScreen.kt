package com.example.lasalleapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.components.ScreenTemplate

@Composable
fun SubjectDetailScreen(subjectName: String, innerPadding: PaddingValues) {
    // Supongamos que estas son las calificaciones de los tres parciales
    val partialGrades = mapOf(
        "Matemáticas" to listOf(8.0, 8.5, 9.0),
        "Programación" to listOf(9.0, 9.2, 8.8),
        "Redes" to listOf(9.3, 9.5, 9.1)
    )

    val grades = partialGrades[subjectName] ?: listOf()

    ScreenTemplate(innerPadding = innerPadding, header = {
        Text(text = "Calificaciones de $subjectName")
    }, body = {
        Column(modifier = Modifier.padding(16.dp)) {
            grades.forEachIndexed { index, grade ->
                Text(text = "Parcial ${index + 1}: $grade")
            }
        }
    })
}