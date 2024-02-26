class Student(val name: String, val gpa: Double, val semester: String, val estimatedGraduationYear: Int) {

    init {
        println("$name has ${estimatedGraduationYear -2020} years left in college.")
    }

    //member function
    fun calculateLetterGrade(): String {
        return when {
            gpa >= 3.0 -> "A"
            gpa >= 2.7 -> "B"
            gpa >= 1.7 -> "C"
            gpa >= 1.0 -> "D"
            else -> "E"
        }
    }
}

//When the instance is created and the function is called, the when expression will be executed and return the letter grade
fun main() {
    var student = Student("Lucia", 3.95, "Fall", 2022)
//Prints: Lucia has 2 years left in college.
    println("${student.name}'s letter grade is ${student.calculateLetterGrade()}.")
    //Prints: Lucia's letter grade is A.
}
