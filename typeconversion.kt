fun main(){   //starting point of the program just like in c-programming
    var num: Int = 10
    var num1: Long = 10.toLong()  //converting the integer value int to the long
    println(num1)

    //operators
    var sum1 = 10
    var sum2 = 20
    println(sum1+sum2)

    //increment and decrement in kotlin
    var a = 10
    ++a  //positve increatime
    println(a)
    --a  //negative increament
    println(a)

    // logical operator
    if ( a%2 == 0 && a%5 == 0) {
        println("$a divisible by both 2 and 5")
    }else{
        println("$a not divisible by both 2 and 5")
    }

    //string
    var greeting: String = "Good Morning!!"
    println(greeting)

    var Footballer:String
    Footballer = "Cristiano Ronaldo"
    println("The most inspiring fooballer in the world is: $Footballer")

    //Accessing the string
    println(Footballer[0])  //give the character present in 0th index
    println(Footballer[1])  //give the character present in 1st index

    //length og the array of string
    var lenght = Footballer.length
    println("The length of the Footballer is: $lenght")

    //changing into the lowercase and uppercase
    var lower = Footballer.toLowerCase()
    println("Lower case: $lower")
    var upper = Footballer.toUpperCase()
    println("Uppercase: $upper")

    var foot = "Cristiano"
    println(Footballer.compareTo(foot))

    var ball = "Ronaldo"
    println(foot.equals(ball))

    val str1 = "apple"
    val str2 = "banana"

    println(str1.compareTo(str2))

}
