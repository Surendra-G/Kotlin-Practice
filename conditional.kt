fun main(){
    var num1: Int = 45;

    if (num1%9==0 && num1%5==0){
        println("$num1 is divisible by both 9 and 5")
    }else if (num1%9==0){
        println("$num1 is only divisible by 9")
    }else if(num1%5==0){
        println("$num1 is only divisible by 5")
    } else{
        println("$num1 is not divisible by both 9 and 5")
    }

    //if else in another way in kotlin
    val reason  = if (num1%9==0) "$num1 is divisible by only 9" else "$num1 is not divisible by 9"
    println(reason)


    //taking user input
    println("Enter your name: ")
    var name = readLine()
    println(name)

    println("Enter a number to represents the weekdays: ")
    var number = readLine().toInt()


}