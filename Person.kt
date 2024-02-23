//Object Oriented Programming

class Person {
    var name: String = ""
    var age:Int = 0
    var education: String = ""

    fun displayDetails(){
        print("This is the details of the user:\n")
        println("Name: $name\nAge: $age\nEducation: $education")

    }
}

fun main(){
    var p =  Person()
    p.name = "Surendra"
    p.age = 20
    p.education = "Bachelor"
    p.displayDetails()

}
