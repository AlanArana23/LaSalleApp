package com.example.lasalleapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lasalleapp.R

@Composable
fun PaymentScreen() {
    val payments = listOf(
        "Agosto" to true,
        "Septiembre" to true,
        "Octubre" to true,
        "Noviembre" to false,
        "Diciembre" to false
    )

    var showPayments by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Image(
            painter = painterResource(id = R.drawable.perfil),
            contentDescription = "Logo",
            modifier = Modifier
                .size(100.dp)
                .padding(bottom = 16.dp),
            contentScale = ContentScale.Fit
        )

        Text(
            text = "Alan Arana",
            style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Correo: aac77560@lasallebajio.edu.mx",
            style = MaterialTheme.typography.bodyLarge.copy(color = Color.Gray),
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Semestre: 5to Semestre",
            style = MaterialTheme.typography.bodyLarge.copy(color = Color.Gray),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Button(
            onClick = { showPayments = !showPayments },
            modifier = Modifier.padding(vertical = 16.dp)
        ) {
            Text(text = if (showPayments) "Ocultar Pagos" else "Ver Pagos")
        }

        if (showPayments) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                items(payments) { (month, isPaid) ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = month,
                            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 18.sp)
                        )
                        Icon(
                            imageVector = if (isPaid) Icons.Default.Check else Icons.Default.Warning,
                            contentDescription = if (isPaid) "Pagado" else "Pendiente",
                            tint = if (isPaid) Color.Green else Color.Red
                        )
                    }
                }

                item {
                    Spacer(modifier = Modifier.height(16.dp))
                }

                item {
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp)
                    ) {
                        Text(text = "Realizar Pago Ahora")
                    }
                }
            }
        }
    }
}
