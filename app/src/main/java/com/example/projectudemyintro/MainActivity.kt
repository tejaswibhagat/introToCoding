package com.example.projectudemyintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectudemyintro.ui.theme.ProjectUdemyIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectUdemyIntroTheme {
                // A surface container using the 'background' color from the theme
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp(){
    Surface(
        modifier = Modifier.fillMaxSize()
        ,
        color = Color(0xFF5446E7A)
    ){

    }
}

@Preview
@Composable
fun Circle(){
    Card(modifier = Modifier
        .padding(3.dp)
        .size(45.dp),
        shape = CircleShape,

    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = "TAP", modifier = Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProjectUdemyIntroTheme {

     MyApp()

    }
}