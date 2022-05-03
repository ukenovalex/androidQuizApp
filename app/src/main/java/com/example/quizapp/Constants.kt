package com.example.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.argentina,
            optionOne = "Argentina",
            optionTwo = "America",
            optionThree = "Australia",
            optionFour = "Kazakhstan",
            correctAnswer = 1
        )

        questionList.add(que1)
        return questionList
    }
}