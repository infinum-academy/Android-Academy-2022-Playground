package infinum.academy.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import infinum.academy.android.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegistrationBinding
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initRegisterButton() = with(binding) {
        registrationButton.setOnClickListener {

        }
    }
}