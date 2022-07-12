package lecture3.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import infinum.academy.android.R
import infinum.academy.android.databinding.ActivitySuperherosBinding
import lecture3.model.Superhero

class SuperherosActivity : AppCompatActivity() {

    // TODO: Create build intent singleton method

    private val superheros = listOf(
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

    private lateinit var binding: ActivitySuperherosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySuperherosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initSuperherosRecycler()

        initLoadItemsButton()
        initAddSuperheroButton()
    }

    private fun initSuperherosRecycler() {
        // TODO #2: Add adapter

        // TODO #2: Add layout manager

        // TODO #2: Add item decorator
    }

    private fun initLoadItemsButton() {
        binding.loadItemsButton.setOnClickListener {
            // TODO #2: Configure load items button action
        }
    }

    private fun initAddSuperheroButton() {
        // TODO #1: Add vector icon to button

        binding.addSuperheroButton.setOnClickListener {
            // TODO #3: Configure add superhero button
        }
    }
}
