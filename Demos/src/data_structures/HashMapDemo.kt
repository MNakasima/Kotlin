package data_structures

fun main(){

    var listOfUsers = HashMap<Int, String>()
    listOfUsers[12] = "Maruko"
    listOfUsers[55] = "Darkpsy"
    listOfUsers[4] = "Psycore"

    for(key in listOfUsers.keys){
        println("ID $key: ${listOfUsers[key]}")
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