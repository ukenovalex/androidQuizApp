package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.argentina,
            optionOne = "America",
            optionTwo = "Argentina",
            optionThree = "Australia",
            optionFour = "Kazakhstan",
            correctAnswer = 2
        )

        val que2 = Question(
            id = 2,
            question = "What country does this flag belong to?",
            image = R.drawable.australia,
            optionOne = "Argentina",
            optionTwo = "America",
            optionThree = "Australia",
            optionFour = "Kazakhstan",
            correctAnswer = 3
        )

        questionList.add(que1)
        questionList.add(que2)
        return questionList
    }
}