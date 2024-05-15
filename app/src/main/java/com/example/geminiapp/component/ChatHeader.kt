package com.example.geminiapp.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChatHeader(
){
    Text(text = "Gemini ChatBoat",color= Color.Black, textAlign = TextAlign.Center,fontSize = 20.sp,
        modifier = Modifier.background(Color.Cyan).fillMaxWidth().padding(10.dp)
    )
}