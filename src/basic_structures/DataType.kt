package basic_structures

fun main () {

    //val - It is impossible to update the variable value (Read Only)
    //var - It is possible to update the variable value (R/W)

    val name = "Maruko" //Kotlin recognizes data type
    val age:Int = 23 //If you not assign a value to the variable, you should declare the data type
    var job:String? //Means that this value can be null and will receive data later (? after variable declaration)
    job = "Software Developer"

    println("====== User Info ======")
    println("Name: $name")
    println("Age: $age")
    println ("Departament: ${job!!}") //!! means non-null value, and if it is a null value, it will throw the NPE

    when(job){
        "Software Developer" -> println("TI Area")
        else -> println("Other area")
    }

}
