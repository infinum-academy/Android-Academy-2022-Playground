package infinum.academy.android.db

import androidx.annotation.DrawableRes

//TODO: Define entity
data class SuperheroEntity(
    //TODO: Add ColumnInfo and PrimaryKey
    val id: String,
    val name: String,
    @DrawableRes val imageResourceId: Int
)
