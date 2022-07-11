package infinum.academy.android

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import infinum.academy.android.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    lateinit var binding: Activity2Binding

    companion object {
        private const val EXTRA_USERNAME = "EXTRA_USERNAME"

        fun prepareIntent(activity: Activity, username: String): Intent {
            val intent = Intent(activity, Activity2::class.java)
            intent.putExtra(EXTRA_USERNAME, username)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.title.text = intent.extras?.getString(EXTRA_USERNAME)
    }
}