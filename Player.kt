//Encapsulation in kotlin
class Player {

    var name: String = ""
    var playingStyle: String  = ""

    fun displayResult(){
        println("Name of the player is: $name\nHe plays from the $playingStyle")
    }
}

fun main(){
    var p = Player()
    p.name = "Cristiano Ronaldo"
    p.playingStyle = "Forward"
    p.displayResult()
}