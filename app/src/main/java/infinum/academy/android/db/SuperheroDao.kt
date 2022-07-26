package infinum.academy.android.db

import androidx.lifecycle.LiveData

//TODO: Define DAO
interface SuperheroDao {

    fun getAllSuperheroes() : LiveData<List<SuperheroEntity>>

    fun getSuperhero(superheroId: String) : LiveData<SuperheroEntity>

    fun insertAllSuperheroes(superheroes: List<SuperheroEntity>)
}