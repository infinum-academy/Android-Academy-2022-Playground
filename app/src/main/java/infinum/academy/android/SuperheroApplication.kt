package infinum.academy.android

import android.app.Application
import java.util.concurrent.Executors

class SuperheroApplication : Application() {

    // TODO: Create database by lazy

    private val superheroes = listOf(
        SuperheroEntity("1","Hrvatko", R.drawable.hrvatko),
        SuperheroEntity("2","Captain Marvel", R.drawable.captain_marvel),
        SuperheroEntity("3","Wonder Woman", R.drawable.wonder_woman),
        SuperheroEntity("4","Cat woman", R.drawable.cat_woman),
        SuperheroEntity("5","Flash", R.drawable.flash),
        SuperheroEntity("6","Hulk", R.drawable.hulk),
        SuperheroEntity("7","Ironman", R.drawable.iron_man),
        SuperheroEntity("8","Spiderman", R.drawable.spiderman),
        SuperheroEntity("9","Superman", R.drawable.superman),
        SuperheroEntity("10","TMNT", R.drawable.tmnt)
    )

    override fun onCreate() {
        super.onCreate()
        Executors.newSingleThreadExecutor().execute{
            //TODO: Save superheroes to DB
        }
    }
}