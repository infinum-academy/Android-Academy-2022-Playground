package infinum.academy.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.viewModels
import infinum.academy.android.databinding.ActivityRegistrationBinding
import infinum.academy.android.networking.ApiModule

class RegistrationActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegistrationBinding
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ApiModule.initRetrofit()

        initRegisterButton()
    }

    private fun initRegisterButton() = with(binding) {
        registrationButton.setOnClickListener {
            viewModel.onRegisterButtonClicked(
                username = emailEditText.text.toString(),
                password = passwordEditText.text.toString()
            )
        }
    }
}