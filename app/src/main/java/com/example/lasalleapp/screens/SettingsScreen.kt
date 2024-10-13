package com.example.lasalleapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.lasalleapp.components.ScreenTemplate

@Composable
fun SettingsScreen(innerPadding : PaddingValues){
    ScreenTemplate(innerPadding = innerPadding, header = {
        Text(text = "Hola")
    },body = {
        Text(text = "Hola")
    })
}