fun main(){
    var cars = arrayOf("BMW","Volvo","Mercedes","Lamborgini")
    var i = 0
    for (values in cars){
        println("Values in index $i: $values")
        i++
    }

    //variable name + .size helps to provides the length of the array
    println("The length of the array is: "+ cars.size)  //(+) = String Concatination

    //accesing the element of the array
    println(cars[2])  // output will be mercedes

    //checking the element exits or not tin the give array
    if("Mercedes" in cars){
        println("Mercedes present.")
    }else{
        print("Mercedes absent.")
    }
}