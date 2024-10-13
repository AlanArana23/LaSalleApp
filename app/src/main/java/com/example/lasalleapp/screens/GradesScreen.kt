package com.example.lasalleapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.lasalleapp.R
import com.example.lasalleapp.models.Materia
import com.example.lasalleapp.utils.Screens

@Composable
fun GradesScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
    ) {
        StudentInfo()
        Spacer(modifier = Modifier.height(32.dp))
        GradesList(navController = navController)
    }
}

@Composable
fun StudentInfo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
            .padding(20.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.perfil),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(
                    text = "Alan Arana",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                )
                Text(
                    text = "Ingeniería de Software",
                    color = Color.White,
                    fontSize = 16.sp
                )
                Text(
                    text = "Quinto Semestre",
                    color = Color.White,
                    fontSize = 16.sp
                )
                Text(
                    text = "aac77560@lasallebajio.edu.mx",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Composable
fun GradesList(navController: NavController) {
    val materias = listOf(
        Materia(nombre = "Programación Jetpack Compose", promedio = 8.5),
        Materia(nombre = "Modelado de Imágenes", promedio = 9.3),
        Materia(nombre = "Redes de Área Local", promedio = 8.7),
        Materia(nombre = "Religion", promedio = 9.4),
        Materia(nombre = "Administracion de Base de Datos", promedio = 9.9),
        Materia(nombre = "Procesos Tecnologicos", promedio = 9.0),
        Materia(nombre = "Python", promedio = 9.3),
        Materia(nombre = "Promedio Acumulado", promedio = 9.1),
    )

    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Calificaciones",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            items(materias) { materia ->
                GradeItem(materia = materia, navController = navController)
            }
        }
    }
}

@Composable
fun GradeItem(materia: Materia, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                navController.navigate(Screens.SubjectDetail.route + "/${materia.nombre}")
            }
            .padding(8.dp)
    ) {
        Text(
            text = materia.nombre,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Promedio: ${materia.promedio}",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f)
        )
    }
}
