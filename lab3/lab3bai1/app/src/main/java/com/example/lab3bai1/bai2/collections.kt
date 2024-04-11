package com.example.lab3bai1.bai2

fun main(){
    val list = listOf(1, 5, 3, 4)
    println(list.sum())
    println("------------- ")

    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })

    println("------------- ")
    val list3 = listOf("a", "bbb", "cc")
    for (s in list3.listIterator()) {
        print("$s ")
    }

    println("\n------------- ")
    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
    println (scientific.get("guppy"))
    println(scientific.get("zebra fish"))
//    println("scientific.get("swordtail"") // => NULL
    println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
    println(scientific.getOrElse("swordtail") {"sorry, I don't know"})
}