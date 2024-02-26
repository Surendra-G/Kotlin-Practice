class Student11(val name: String, val gpa: Double, val semester: String, val estimatedGraduationYear: Int) {
    init {
        println("$name has ${estimatedGraduationYear -2020} years left in college.")
    }
}

fun main() {
    var student = Student("Surendra", 3.95, "Fall", 2022)
}