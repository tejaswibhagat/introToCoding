package com.example.projectudemyintro

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    Surface(modifier = Modifier
        .fillMaxSize(),
        color = Color(0xFF5446E7A) ){
        //Text(text = "Hello")
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "$ 100", style = TextStyle(
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold
            )
            )
            Spacer(modifier = Modifier.height(30.dp))

            CreateCircle()
        }
    }
}

@Preview
@Composable
fun CreateCircle(){
    var moneyCounter by remember{
        mutableStateOf(0)
    }
    Card(modifier = Modifier
        .padding(3.dp)
        .size(105.dp)
        .clickable {
            moneyCounter += 1
            Log.d("Counter", "CreateCircle: $moneyCounter")
        },
        shape = CircleShape,
        elevation = 4.dp
    ) {
        Box(contentAlignment = Alignment.Center){
            Text(text = "Tap $moneyCounter")
        }
    }
}


@Preview(  showBackground = true)
@Composable
fun DefaultPreview() {
    ProjectUdemyIntroTheme() {
        MyApp()

    }
}

