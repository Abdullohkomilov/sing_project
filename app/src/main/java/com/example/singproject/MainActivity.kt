package com.example.singproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
    Box(modifier = Modifier .fillMaxSize()) {
        Button(
            onClick = {},
            modifier = Modifier
                .height(80.dp)
                .width(250.dp)
                .align(Alignment.Center)
                .padding(top = 20.dp)


        ) {Text(text="Sing in", color = Color.Green)}
    }
}
