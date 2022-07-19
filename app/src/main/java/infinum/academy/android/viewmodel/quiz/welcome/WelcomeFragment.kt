package infinum.academy.android.viewmodel.quiz.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import infinum.academy.android.R
import infinum.academy.android.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        binding.nicknameInput.editText?.addTextChangedListener {
            val nickname = it.toString()
            updateWelcomeMessage(nickname)
            checkGameStartValidity(nickname)
        }

        binding.startGameButton.setOnClickListener {
            findNavController().navigate(
                WelcomeFragmentDirections.toGameFragment(binding.impossibleDifficulty.isChecked)
            )
        }
    }

    private fun checkGameStartValidity(nickname: String) {
        binding.startGameButton.isEnabled = nickname.count() >= 3
    }

    private fun updateWelcomeMessage(nickname: String) {
        binding.welcomeMessage.text = if (nickname.isEmpty()) {
            getString(R.string.welcome_message)
        } else {
            getString(R.string.welcome_message_format, nickname)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}