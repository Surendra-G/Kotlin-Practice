class Teacher {
    var name: String = ""
    var age: Int = 0

    constructor(a:String,b:Int){  //constructor in  kotlin
    this.name = a
        this.age = b
        println("Name: $name \nAge: $b")
    }

    fun teacherfun(){
        println("This is the function of the Teacher class")
    }
}
fun main(){
    var t = Teacher("Surendra", 20)  //instanse of the class or object of the class
    t.teacherfun()   //calling the function through the object name

}