package infinum.academy.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import infinum.academy.android.databinding.ActivityAcademyInfoBinding

class AcademyInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAcademyInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAcademyInfoBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}