package com.example.quizapp.model

data class Question(val text: String, val answers: MutableList<String>, val correctAnswer: String ) {


}

var numberOfCorrectAnswer = 0

val questions: MutableList<Question> = mutableListOf(
    Question(
        text = "What does the keyword \"val\" mean?",
        answers = mutableListOf("read-only", "mutable", "singleton", "doesn't exist"),
        correctAnswer = "read-only"
    ),
    Question(
        text = "What the next term creates: 10 to \"apple\"",
        answers = mutableListOf("ERROR", "Int,String", "pair<Int,String>", "10 .. \"apple\""),
        correctAnswer = "pair<Int,String>"
    ),
    Question(
        text = "How long will the interval go from: 1 until 10",
        answers = mutableListOf("1", "9", "10", "8"),
        correctAnswer = "9"
    ),
    Question(
        text = "Is it possible to modify an object stored in val?",
        answers = mutableListOf("maybe", "no", "yes", "kotlin has no objects"),
        correctAnswer = "yes"
    ),
    Question(
        text = "Which type does length variable below have: val length = string?.length?",
        answers = mutableListOf("Double?", "String?", "Unit?", "Int?"),
        correctAnswer = "Int?"
    ),
    Question(
        text = "What will be printed for{ch in \"abc\") { print(ch+1) }",
        answers = mutableListOf("bcd", "bc", "ERROR", "b"),
        correctAnswer = "bcd"
    ),
    Question(
        text = "What does the keyword \"object\" mean?",
        answers = mutableListOf("enum", "simple class", "singleton", "abstract class"),
        correctAnswer = "singleton"
    ),
    Question(
        text = "What is the term \"init\" in a constructor?",
        answers = mutableListOf("static members are set up here", "constructor body, initialization", "the constructor is private", "does not belong to the constructor"),
        correctAnswer = "constructor body, initialization"
    ),
    Question(
        text = "What is the difference between listOf() and mutableListOf() functions?",
        answers = mutableListOf("kotlin has only mutableListOf() function", "kotlin has only listOf() function", "listOf() create an immutable list and other create a mutable", "there is no difference"),
        correctAnswer = "listOf() create an immutable list and other create a mutable"
    ),
    Question(
        text = "What does the associateBy() function do?",
        answers = mutableListOf("group by a field but duplicates are removed", "group by a field", "merge two lists by a criterion", "doesn't exist"),
        correctAnswer = "group by a field but duplicates are removed"
    )
    )
