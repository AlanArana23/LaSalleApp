package com.example.lasalleapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
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
import com.example.lasalleapp.R

@Composable
fun SettingsScreen(innerPadding: PaddingValues, onChangePasswordClick: () -> Unit, onChangeThemeClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Header: Información del alumno
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
                .padding(20.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.perfil),
                    contentDescription = "Student Image",
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
                        text = "23/05/2003",
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

        // Opciones de configuración
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Cambiar Contraseña
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.LightGray)
                    .clickable { onChangePasswordClick() }
                    .padding(16.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Change Password",
                        modifier = Modifier.size(30.dp)
                    )
                    Text(
                        text = "Cambiar Contraseña",
                        modifier = Modifier.padding(start = 16.dp),
                        fontSize = 18.sp
                    )
                }
            }

            // Cambiar Tema de la Aplicación
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.LightGray)
                    .clickable { onChangeThemeClick() }
                    .padding(16.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Change Theme",
                        modifier = Modifier.size(30.dp)
                    )
                    Text(
                        text = "Cambiar Tema de la Aplicación",
                        modifier = Modifier.padding(start = 16.dp),
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}