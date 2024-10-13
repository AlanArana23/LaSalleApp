package com.example.lasalleapp.components

import android.util.Log
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.lasalleapp.R
import com.example.lasalleapp.utils.Cash
import com.example.lasalleapp.utils.Logout
import com.example.lasalleapp.utils.Screens
import com.example.lasalleapp.utils.Task
import com.example.lasalleapp.utils.communities
import com.example.lasalleapp.utils.newsList

@Composable
fun ScreenTemplate(
    innerPadding: PaddingValues,
    header :@Composable ()->Unit,
    body: @Composable () -> Unit
){
    val news = listOf(
        "https://www.lasallebajio.edu.mx/noticias/images/4719_3.jpg",
        "https://www.lasallebajio.edu.mx/noticias/images/4718_1.jpg",
        "https://www.lasallebajio.edu.mx/noticias/images/4718_3.jpg"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(
                rememberScrollState()
            )
    ){
        //Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp))
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
        ){
            header()

        }

        //Body
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ){
            body()
        }
    }
}

