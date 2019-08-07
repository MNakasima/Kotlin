fun main(){

    println("Enter a number")
    val number = readLine()!!.toInt()

    if(number%2 == 0){
        print("Even")
    }else{
        print("Odd")
    }

}