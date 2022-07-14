package infinum.academy.android.viewmodel.verification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import infinum.academy.android.R
import infinum.academy.android.databinding.FragmentVerificatoinCompletedBinding

class VerificationCompletedFragment : Fragment() {

    private var _binding: FragmentVerificatoinCompletedBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentVerificatoinCompletedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.toOnboardingCompletedFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}