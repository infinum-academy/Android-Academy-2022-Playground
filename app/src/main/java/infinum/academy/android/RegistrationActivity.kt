package infinum.academy.android

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.bottomsheet.BottomSheetDialog
import infinum.academy.android.databinding.ActivityRegistrationBinding
import infinum.academy.android.databinding.DialogRegistrationStateBinding
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

    fun displayRegistrationMessage(isSuccessful: Boolean) {
        val dialog = BottomSheetDialog(this, R.style.AppBottomSheetDialogTheme)
        val bottomSheetBinding = DialogRegistrationStateBinding.inflate(layoutInflater)

        if (isSuccessful) {
            bottomSheetBinding.registrationStatePicture.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.ic_outline_check_circle_24
                )
            )
        } else {
            bottomSheetBinding.registrationStatePicture.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.ic_outline_do_not_disturb_alt_24
                )
            )
        }

        dialog.setContentView(bottomSheetBinding.root)
        dialog.show()

    }
}