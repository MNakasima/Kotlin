package oop.com.objects

class Persons (var name:String, var age:Int):Comparable<Persons>{

    override fun compareTo(other: Persons): Int {
        return this.age - other.age

    }

}