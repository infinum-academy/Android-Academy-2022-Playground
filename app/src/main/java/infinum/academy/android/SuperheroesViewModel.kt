package infinum.academy.android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import infinum.academy.android.models.Superhero

class SuperheroesViewModel : ViewModel() {

    private val superheroes = mutableListOf(
        Superhero("Hrvatko", R.drawable.hrvatko),
        Superhero("Captain Marvel", R.drawable.captain_marvel),
        Superhero("Wonder Woman", R.drawable.wonder_woman),
        Superhero("Cat woman", R.drawable.cat_woman),
        Superhero("Flash", R.drawable.flash),
        Superhero("Hulk", R.drawable.hulk),
        Superhero("Ironman", R.drawable.iron_man),
        Superhero("Spiderman", R.drawable.spiderman),
        Superhero("Superman", R.drawable.superman),
        Superhero("TMNT", R.drawable.tmnt)
    )

    private val superherosLiveData: MutableLiveData<List<Superhero>> by lazy {
        MutableLiveData<List<Superhero>>()
    }

    fun getSuperheroesLiveData(): LiveData<List<Superhero>> {
        return superherosLiveData
    }

    fun initSuperheroes() {
        superherosLiveData.value = superheroes
    }

    fun addSuperhero(superhero: Superhero) {
        superheroes.add(superhero)
        superherosLiveData.value = superheroes
    }
}