package infinum.academy.android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import infinum.academy.android.databinding.ActivityMainBinding
import infinum.academy.android.databinding.DialogAddSuperheroBinding
import infinum.academy.android.models.Superhero

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var superherosAdapter: SuperherosAdapter? = null

    private val viewModel: SuperheroesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initSuperherosRecycler()

        viewModel.getSuperheroesLiveData().observe(this) { superheroes ->
            updateItems(superheroes)
        }

        initAddSuperheroButton()

        binding.loadItemsButton.setOnClickListener {
            viewModel.initSuperheroes()
        }
    }

    private fun initSuperherosRecycler() {
        superherosAdapter = SuperherosAdapter(emptyList()) { item ->
            Toast.makeText(this, item.name, Toast.LENGTH_SHORT).show()
        }

        binding.superherosRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.superherosRecyclerView.adapter = superherosAdapter
    }

    private fun updateItems(superheros: List<Superhero>) {
        superherosAdapter?.setItems(superheros)
        binding.emptyStateLabel.isVisible = false
        binding.superherosRecyclerView.isVisible = true
    }

    private fun initAddSuperheroButton() {
        binding.addSuperheroButton.setOnClickListener {
            showAddSuperheroBottomSheet()
        }
    }

    private fun showAddSuperheroBottomSheet() {
        val dialog = BottomSheetDialog(this)

        val bottomSheetBinding = DialogAddSuperheroBinding.inflate(layoutInflater)
        dialog.setContentView(bottomSheetBinding.root)

        bottomSheetBinding.confirmButton.setOnClickListener {
            addSuperheroToList(bottomSheetBinding.nameInput.text.toString())
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun addSuperheroToList(name: String) {
        viewModel.addSuperhero(Superhero(name, R.drawable.ic_placeholder))
    }
}