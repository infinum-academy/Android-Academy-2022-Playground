package infinum.academy.android.viewmodel.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import infinum.academy.android.databinding.FragmentOnboardingCompletedBinding

class OnboardingCompletedFragment : Fragment() {

    private var _binding: FragmentOnboardingCompletedBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentOnboardingCompletedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}