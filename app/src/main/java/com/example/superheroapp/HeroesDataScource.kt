package com.example.superheroapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.TextUnit

@Composable
fun HeroItem() {
    Card() {
        Row() {
            HeroInformation()
            HeroIcon()
            
        }
        
    }

}

@Composable
fun HeroIcon() {
    Image(painter =, contentDescription =)
}

@Composable
fun HeroInformation() {
    Column {
        Text(text =)
        Text(text =)

    }
}