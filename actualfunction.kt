fun main(){
    myfunction()
    age(20)
    var result = eductionDetails("Bachelor")
    println(result)
}
fun myfunction(){
    print("Enter your name: ")
    var name = readLine()
    println("Hello $name, Welcome to Kotlin World!!!!" )
}
fun age(age: Int){
    println("Your age is: $age")
}

fun eductionDetails(eduction: String): String{
    println("Your eduction level is: ")
    return eduction
}