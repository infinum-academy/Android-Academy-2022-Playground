package infinum.academy.android.viewmodel.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import infinum.academy.android.R
import infinum.academy.android.databinding.FragmentGameBinding
import kotlin.random.Random
import kotlin.random.nextInt

class GameFragment : Fragment() {

    private var _binding: FragmentGameBinding? = null

    private val binding get() = _binding!!

    private val args by navArgs<GameFragmentArgs>()

    private val questions = listOf(
        Question(
            question = "Which academy course is the best?",
            answers = listOf(
                Answer(answer = "Android", isCorrect = true),
                Answer(answer = "iOS", isCorrect = false)
            )
        ),
        Question(
            question = "In which lifecycle method is it safe to do operations on the view?",
            answers = listOf(
                Answer(answer = "onViewCreated", isCorrect = true),
                Answer(answer = "onCreateView", isCorrect = false)
            )
        ),
        Question(
            question = "What is the latest Android OS version?",
            answers = listOf(
                Answer(answer = "Android 15", isCorrect = false),
                Answer(answer = "Android 13", isCorrect = true)
            )
        ),
        Question(
            question = "What is better for displaying large lists?",
            answers = listOf(
                Answer(answer = "ListView", isCorrect = false),
                Answer(answer = "RecyclerView", isCorrect = true)
            )
        ),
        Question(
            question = "What is the next lecture about?",
            answers = listOf(
                Answer(answer = "Databases", isCorrect = false),
                Answer(answer = "Networking", isCorrect = true)
            )
        ),
        Question(
            question = "What do we use for passing type safe data between destination",
            answers = listOf(
                Answer(answer = "SafeArgs", isCorrect = true),
                Answer(answer = "LiveData", isCorrect = false)
            )
        )
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val question = questions[Random(Random.nextInt()).nextInt(0..5)]

        binding.question.text = question.question
        binding.firstAnswer.text = question.answers[0].answer
        binding.secondAnswer.text = question.answers[1].answer

        binding.firstChoice.setOnClickListener {
            validateResult(question, 0)
        }

        binding.secondChoice.setOnClickListener {
            validateResult(question, 1)
        }
    }

    private fun validateResult(question: Question, pickedAnswer: Int) {
        binding.gameResultOverlay.isVisible = true
        binding.resultMessage.text = when {
            args.isImpossibleDifficulty -> getString(R.string.you_lost)
            question.answers[pickedAnswer].isCorrect -> getString(R.string.you_won)
            else -> getString(R.string.you_lost)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}