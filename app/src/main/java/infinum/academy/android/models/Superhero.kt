package infinum.academy.android.models

import androidx.annotation.DrawableRes

data class Superhero(
    val name: String,
    @DrawableRes val imageResourceId: Int
)
