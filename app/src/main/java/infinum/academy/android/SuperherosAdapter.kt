package infinum.academy.android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import infinum.academy.android.databinding.ViewSuperheroItemBinding
import infinum.academy.android.models.Superhero

class SuperherosAdapter(
    private var items: List<Superhero>,
    private val onItemClickCallback: (Superhero) -> Unit
) : RecyclerView.Adapter<SuperherosAdapter.SuperheroViewHolder>() {

    /**
     * Called when RecyclerView needs a new ViewHolder to represent an item.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        // Create a view from
        val binding = ViewSuperheroItemBinding.inflate(LayoutInflater.from(parent.context))
        // Create a ViewHolder with that view
        return SuperheroViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    /**
     * Called by the RecyclerView to display the data at the specified position.
     */
    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setItems(superheros: List<Superhero>) {
        items = superheros
        notifyDataSetChanged()
    }

    fun addItem(superhero: Superhero) {
        items = items + superhero
        notifyItemInserted(items.size)
    }

    /**
     * Custom-made ViewHolder, used to match the data to the concrete view.
     */
    inner class SuperheroViewHolder(private val binding: ViewSuperheroItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Superhero) {
            // Load the image
            binding.superheroImage.setImageResource(item.imageResourceId)

            // Load the name
            binding.superheroName.text = item.name

            binding.root.setOnClickListener {
                onItemClickCallback(item)
            }
        }
    }
}
