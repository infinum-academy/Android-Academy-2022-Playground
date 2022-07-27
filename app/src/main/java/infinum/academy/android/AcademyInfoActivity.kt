package infinum.academy.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import infinum.academy.android.databinding.ActivityAcademyInfoBinding

class AcademyInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAcademyInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAcademyInfoBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

//    fun setLecturerImages(countryCode: Int) = with(binding) {
//        when(countryCode) {
//            Country.CROATIA.countryCode -> {
//                lecturerOneImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.turic_renato))
//                lecturerTwoImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.floreani_filip))
//            }
//            Country.SLOVENIA.countryCode -> {
//                lecturerOneImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.frelih_mark))
//                lecturerTwoImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.valic_david))
//            }
//            Country.MACEDONIA.countryCode -> {
//                lecturerOneImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.stojanovski_filip))
//                lecturerTwoImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.toshev_ivan))
//            }
//            Country.MONTENEGRO.countryCode -> {
//                lecturerOneImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.rakonjac_mladen))
//                lecturerTwoImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.mugosa_balsa))
//            }
//        }
//    }
}