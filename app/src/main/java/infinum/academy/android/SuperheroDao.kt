package infinum.academy.android

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

//TODO: Define DAO
interface SuperheroDao {

    fun getAllSuperheroes() : LiveData<List<SuperheroEntity>>

    fun getSuperhero(superheroId: String) : LiveData<SuperheroEntity>

    fun insertAllSuperheroes(superheroes: List<SuperheroEntity>)
}