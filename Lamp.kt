class Lamp {

    //(Private data member) private access modifier is used
    private var isON = false

    //data function
    fun turnON(){
        isON = true
        println("The light is turn ON.")
    }

    //another data function
    fun turnOFF(){
        isON = false
        println("The light is turn OFF.")
    }

}

fun main(){
    var ob1 = Lamp()

    var userInput = "yes"
    while (userInput != "no"){
        print("Initially the light is off, Do you want to turn ON? : ")
        var inputText = readLine()
        var input = inputText?.toLowerCase()
        if (input == "yes"){
            ob1.turnON()
        }else if (input == "no"){
            ob1.turnOFF()
        }

        print("DO you want to continue? : ")
        userInput = readLine().toString().toLowerCase()

    }

    println("Program Ended!!")



}