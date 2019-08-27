package Function

fun sumNumbersVoid(x:Double=3.5, y:Double=4.5){ //no return
    val sum = x+y
    println("Sum is $sum")
}

fun sumNumbers(x:Double, y:Double):Double{ // with return
    return x+y
}

fun displayInfoKotlin(vararg names:String){ //Kotlin way to pass array as parameters
    for(name in names){
        println(name)
    }
}

fun displayInfo(names: Array<String>){ //Java way to pass array as parameters
    for(name in names){
        println(name)
    }
}


fun main(){

    sumNumbersVoid()

    val sum = sumNumbers(2.5,5.5)
    println("Sum is $sum")

    displayInfoKotlin(names = *arrayOf("Maruko","Psycore"))

    displayInfo(names = arrayOf("Psycore","Maruko"))

}