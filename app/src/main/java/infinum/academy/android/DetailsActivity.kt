package infinum.academy.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import infinum.academy.android.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}