package com.example.superheroapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.superheroapp.data.Hero

@Composable
fun HeroItem(hero: Hero, modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp).height(72.dp),
        elevation = 2.dp, shape = RoundedCornerShape(16.dp)) {
        Row(modifier = Modifier.background(Color.Red).padding(),
            verticalAlignment = Alignment.Top
        ) {
            HeroInformation(
                modifier = Modifier.weight(1f),
                heroName = hero.nameRes, 
                heroDescription = hero.descriptionRes
            )
            HeroIcon(heroImage = hero.imageRes)
        }
    }
}

@Composable
fun HeroInformation(@StringRes heroName: Int, heroDescription: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = stringResource(id = heroName), style = MaterialTheme.typography.h3)
        Text(text = stringResource(id = heroDescription), style = MaterialTheme.typography.body1)
    }
}

@Composable
fun HeroIcon(@DrawableRes heroImage: Int, modifier: Modifier = Modifier) {
    Image(modifier = modifier
//        .padding(end = 16.dp)
//        .size(64.dp)
        .clip(RoundedCornerShape(8.dp)),
        painter = painterResource(id = heroImage),
        contentDescription = null
    )
}
