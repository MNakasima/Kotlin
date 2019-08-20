package data_structures

import java.util.*
import kotlin.collections.HashMap

fun main() {

    var listOfUsers = hashMapOf<String, LinkedList<String>>() // or mutableMapOf(don't care about implementation) or HashMap(Java version)
    //mutableMapOf<T>() is an inlined function invocation that returns MutableList<T>. As of today the mutableMapOf does return an instance of HashMap.
    //HashMap<T>() or hashMapOf<T>() is a constructor invocation and cannot be inlined.

    while (true) {
        print("Enter your name or type 'quit': ")
        val name = readLine()!!.toString()
        if (name == "quit") {
            break
        }

        print("Where you live: ")
        val livePlace = readLine()!!.toString()

        var listOfUserPets = LinkedList<String>()

        do {
            print("Enter a Pet name or type 'next': ")
            val petName = readLine()!!.toString()
            if (petName != "next") {
                listOfUserPets.add(petName)
            }
        } while (petName != "next")

        listOfUsers["$name:$livePlace"] = listOfUserPets

    }

    println("=== User Info ===")
    for (key in listOfUsers.keys) {
        println("Name and Place: $key")
        var listOfPet = listOfUsers[key]!!
        for (petName in listOfPet) {
            println("Pet: $petName")
        }
    }
}

/*
====Advantages of HashMap====
--When you add items to a HashMap, you are not guaranteed to retrieve the items in the same order you put them in. There are subclasses of HashMap like LinkedHashMap
that will maintain the order, but in general order is not guaranteed with a Map.
--The purpose of a map is to store items based on a key that can be used to retrieve the item at a later point.
--Collection functionality some great utility functions are available for lists via the Collections class.
--HashMap is non synchronized.HashMap cannot be shared between multiple threads without proper synchronization.Synchronized means only one thread can modify a hash table at one point of time.
--HashMap is a fail-fast iterator.

====Disadvantages of HashMap====
--You can't lock the whole map to find the size of the map. Iterators are weakly consistent.
--HashMap does not guarantee that the order of the map will remain constant over time.

====Advantages of HashTable====
--HashTable may have not have any null key or value.
--Hashtable is an implementation of a key-value pair data structure in java. You can store and retrieve a ‘value’ using a ‘key’ and it is an identifier stored. It is obvious that the ‘key’ should be unique.

====Disadvantages of HashTable====
--Hashtable is synchronized, which means Hashtable is thread-safe and can be shared between multiple threads
--Synchronization Hashtable is much slower than HashMap
 */