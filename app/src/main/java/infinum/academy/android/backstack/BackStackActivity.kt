package infinum.academy.android.backstack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import infinum.academy.android.databinding.ActivityBackStackBinding

class BackStackActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBackStackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBackStackBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}