package function

val sum= {x:Int, y:Int -> x+y}

fun main (){

    val addNumbers = sum(3,5)
    println(addNumbers)

    println("List of numbers")
    val listOfNumbers = listOf(10,885,66,33,123)

    listOfNumbers.forEach{number -> print("$number ")}
}