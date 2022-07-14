package infinum.academy.android.viewmodel.onboarding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExampleViewModel : ViewModel() {

    private val example: MutableLiveData<String> by lazy { MutableLiveData("Example") }

    fun getExample(): LiveData<String> {
        return example
    }
}