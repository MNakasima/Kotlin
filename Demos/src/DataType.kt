fun main () {

    //val - It is impossible to update the variable value (Read Only)
    //var - It is possible to update the variable value (R/W)

    val str = "Hello World\n" //Kotlin recognizes data type
    var str1:String //If you not assign a value to the variable, you should declare the data type
    str1 = "Hello World"

    println(str + str1)

    val name = "Maruko"
    val age = 23

    println("====== User Info ======")
    println("Name: $name")
    println("Age: $age")

    var departament:String? //Means that this value can be null and will receive data later (? after variable declaration)
    departament = "Software Developer"
    println ("Departament: ${departament!!}") //!! means non-null value, and if it is a null value, it will throw the NPE

    var b: String? = "abc"
    b = null // ok
    println("${b}") //Don't throw NPE

    var a: String? = "abc"
    a = null
    print("${a!!}") //Throw NPE

}
