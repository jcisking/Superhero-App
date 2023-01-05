package com.example.superheroapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val imageRes: Int
)
