package data_structures

fun main(){

    println("Enter number of names: ")
    val maxSize = readLine()!!.toInt()
    var listOfName:Array<String> = Array(maxSize){""}

    for(i in 0 until maxSize){
        println("Enter name:")
        listOfName[i] = readLine().toString()
    }

    for(i in 0 until maxSize){
        println("Name $i: ${listOfName[i]}")
    }

    val message = "Hello my ASD friend, how are you?"
    val listOfTokens:List<String> = message.trim().split(" ")

    for(token in listOfTokens) {
        if (!token.contains("ASD")) {
            println("Token: $token")
        }
    }

}