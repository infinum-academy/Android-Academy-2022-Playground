package infinum.academy.android.viewmodel.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import infinum.academy.android.R
import infinum.academy.android.databinding.FragmentVerificationRequestBinding

class VerificationRequestFragment : Fragment() {

    private var _binding: FragmentVerificationRequestBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentVerificationRequestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        binding.buttonVerify.setOnClickListener {
            findNavController().navigate(R.id.toUploadDocumentFragment)
        }

        binding.buttonLater.setOnClickListener {
            findNavController().navigate(R.id.toOnboardingCompletedFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}