fun main() {

    println("Enter your name: ")
    val name = readLine().toString()

    println("Enter your age: ")
    val age = readLine()!!.toInt()

    println("====== User Info ======")
    println("Name: $name")
    println("Age: $age")

    println("====== Swap Values ======")
    println("Enter x: ")
    var x = readLine()!!.toDouble()
    println("Enter y: ")
    var y = readLine()!!.toDouble()

    x+=y
    y=x-y
    x-=y

    println("x: $x, y: $y")
}