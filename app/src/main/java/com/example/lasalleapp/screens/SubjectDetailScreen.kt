package com.example.lasalleapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.models.Materia
import com.example.lasalleapp.models.Parcial

@Composable
fun SubjectDetailScreen(materiaId: Int) {
    // Simulamos la obtención de los datos de los parciales según el id de la materia
    val materia = getMateriaPorId(materiaId)
    val parciales: List<Parcial> = listOf(
        Parcial(nombre = "Primer Parcial", calificacion = 8.0),
        Parcial(nombre = "Segundo Parcial", calificacion = 9.0),
        Parcial(nombre = "Tercer Parcial", calificacion = 9.5)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center, // Centrar verticalmente los parciales
        horizontalAlignment = Alignment.CenterHorizontally // Centrar horizontalmente los textos
    ) {
        Text(text = "Detalles de ${materia.nombre}", style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(16.dp))

        // Mostrar calificaciones de los parciales centradas
        parciales.forEach { parcial ->
            Text(
                text = "${parcial.nombre}: ${parcial.calificacion}",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
    }
}

fun getMateriaPorId(id: Int): Materia {
    return when (id) {
        1 -> Materia("Programación Jetpack Compose", 8.5)
        2 -> Materia("Modelado de Imágenes", 9.3)
        3 -> Materia("Redes de Área Local", 8.7)
        else -> Materia("Procesos Tecnológicos", 0.0)
    }
}
