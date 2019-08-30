package function

fun add(x:Int, y:Int):Int{
    return x+y
}

fun add(x:Int, y:Int, z:Int):Int{
    return x+y+z
}

fun add(x:Int, y:Int, z:Int, w:Int):Int{
    return x+y+z+w
}

fun main(){

    println(add(3,4))
    println(add(3,4, 5))
    println(add(3,4, 5, 6))

}