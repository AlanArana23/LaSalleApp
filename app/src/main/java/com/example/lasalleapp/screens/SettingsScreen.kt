package com.example.lasalleapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SettingsScreen(innerPadding : PaddingValues){
    Box(modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize()){
        Text("Configuracion")
    }
}