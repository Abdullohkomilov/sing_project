package com.example.singproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun Sing_in(){
    Box(modifier = Modifier .fillMaxSize().background(Color.Blue)) {
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(30.dp)
                    .height(70.dp)
                    .width(270.dp)
            ) { Text(text = "Sing in", color = Color.Green, fontSize = 25.sp) }
        }
    }
}
