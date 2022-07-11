package infinum.academy.android

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import infinum.academy.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setupOnClickListeners()
    }

    fun setupOnClickListeners(){
        binding.explicitButton.setOnClickListener {
            val intent = Activity2.prepareIntent(this, binding.usernameEditText.text.toString())
            startActivity(intent)
        }

        binding.implicitButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://infinum.com/")
            startActivity(intent)
        }
    }
}