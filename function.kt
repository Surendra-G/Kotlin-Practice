// Creating a sum function to return the sum of the two numbers
fun main(){
    fun sum(a:Int,b:Int): Int {
        return a+b
    }
    var result = sum(2,3)
    println(result)

    //var os used for the varible whose value can be changed
    //val is used for the conatant

    var name = "Surendra"
    val bithday = 2003
    println("His name is: "+name + "& his birthday is: "+bithday)

    val pi = 3.144444
    println("The VAlue of PI is: "+pi)

    var firstname = "Surendra"
    var lastname = "Giri"
    println(firstname+" "+lastname)

    //Datatypes in kotlin is decided by the it value just like in python
    var fullname = "Surendra Giri"  //String type
    var age = 20  //Integer type
    var height = 5.8  //double or float  type
    var work = false  //boolean type
    var grade = "A"   //char type

    //we can also write in this way
    var fullname1: String = "Surendra Giri"  //String type
    var age1: Int = 20  //Integer type
    var height1: Double = 5.8  //double or float  type
    var work1: Boolean = false  //boolean type
    var grade1: String = "A"   //char type


    //e or E indicate as a power in kotlin
    var mynum: Float = 35E2F
    var myNUm: Double = 12E5
    println(mynum)
    println(myNUm)
 }
