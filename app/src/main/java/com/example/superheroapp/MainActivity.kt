package com.example.superheroapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheroapp.data.Hero
import com.example.superheroapp.data.HeroesRepository
import com.example.superheroapp.ui.theme.SuperHeroAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperHeroAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HeroApp()

                }
            }
        }
    }
}

@Composable
fun HeroApp() {
    Scaffold(topBar = {HeroTopAppBar()}) {
        LazyColumn() {
            this.items(HeroesRepository.heroes) {
                HeroItem(hero = it)

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SuperHeroAppTheme {

    }
}