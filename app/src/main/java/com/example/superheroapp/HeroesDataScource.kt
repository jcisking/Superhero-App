package com.example.superheroapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.superheroapp.data.Hero

@Composable
fun HeroItem(hero: Hero, modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(20.dp)) {
        Row(
            modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
        ) {
            HeroInformation(modifier = Modifier.weight(1f), heroName = hero.nameRes, heroDescription = hero.descriptionRes)
            HeroIcon(heroImage = hero.imageRes)
        }
    }
}

@Composable
fun HeroInformation(@StringRes heroName: Int, heroDescription: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = stringResource(id = heroName))
        Text(text = stringResource(id = heroDescription))
    }
}

@Composable
fun HeroIcon(@DrawableRes heroImage: Int, modifier: Modifier = Modifier) {
    Image(modifier = modifier
        .size(40.dp)
        .padding(0.dp), painter = painterResource(id = heroImage), contentDescription = null)
}
