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
    Card(modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp), elevation = 2.dp, shape = RoundedCornerShape(16.dp)) {
        Row(
            modifier = Modifier
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            HeroInformation(
                modifier = Modifier.weight(1f), 
                heroName = hero.nameRes, 
                heroDescription = hero.descriptionRes
            )
            Spacer(modifier = Modifier.width(16.dp))
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
        .size(64.dp)
        .padding(0.dp)
        .clip(RoundedCornerShape(8.dp))
        .fillMaxHeight(),
        painter = painterResource(id = heroImage), contentDescription = null)
}
