package infinum.academy.android.viewmodel.onboarding

data class Question(
    val question: String,
    val answers: List<Answer>
)

data class Answer(
    val answer: String,
    val isCorrect: Boolean
)