package com.example.lasalleapp.models

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.lasalleapp.utils.Screens

data class BottomNavigationItem(
    val title : String,
    val icon : ImageVector,
    val route : String
)