package lecture3.model

import androidx.annotation.DrawableRes

data class Superhero(
    val name: String,
    @DrawableRes val imageResourceId: Int
)
