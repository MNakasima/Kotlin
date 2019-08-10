package basic_structures

fun main (){

    //We cannot forget the classic!

    loop@ for(i in 1..10 step 2) { //downTo to decrement, .. to increment
        println("Hello World $i")

        for(j in 1..5){
            if(j==1){
                break@loop
            }
        }

    }

}