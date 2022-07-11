package infinum.academy.android.backstack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import infinum.academy.android.R
import infinum.academy.android.databinding.FragmentABinding

class AFragment : Fragment() {

    private var _binding: FragmentABinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        printBackStack()

        binding.button.setOnClickListener {
            activity?.supportFragmentManager?.commit {
                setReorderingAllowed(true)
                replace<BFragment>(R.id.container)
                addToBackStack("Fragment B")
            }
        }

        binding.button.setOnLongClickListener {
            activity?.supportFragmentManager?.commit {
                setReorderingAllowed(true)
                replace<BFragment>(R.id.container)
            }
            true
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}