fun main() {

    println("Enter your name: ")
    val name = readLine().toString()

    println("Enter your age: ")
    val age = readLine()!!.toInt()

    println("====== User Info ======")
    println("Name: $name")
    println("Age: $age")

    println("Enter x: ")
    var x = readLine()!!.toInt()
    println("Enter y: ")
    var y = readLine()!!.toInt()

    var temp = x
    x = y
    y = temp

    println("x:$x y:$y")

}