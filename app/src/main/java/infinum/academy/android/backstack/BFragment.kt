package infinum.academy.android.backstack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import infinum.academy.android.R

class BFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        printBackStack()

        view.findViewById<Button>(R.id.button).setOnClickListener {
            activity?.supportFragmentManager?.commit {
                setReorderingAllowed(true)
                replace<CFragment>(R.id.container)
                addToBackStack("Fragment C")
            }
        }

        view.findViewById<Button>(R.id.button).setOnLongClickListener {
            activity?.supportFragmentManager?.commit {
                setReorderingAllowed(true)
                replace<CFragment>(R.id.container)
            }
            true
        }
    }
}