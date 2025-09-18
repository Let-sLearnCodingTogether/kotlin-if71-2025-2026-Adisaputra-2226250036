fun main() {
    val quizPoint = 50
    val finalexampoint = 70

    val passQuiz = quizPoint > 80
    val passFinalexam = finalexampoint > 70

    val pass = passQuiz && passFinalexam

    println("You : $pass")
}