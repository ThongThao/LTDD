package com.example.lab3bai1.myapp1
import com.example.lab3bai1.myapp1.Aquarium

// 3. Add class constructors

fun buildAquarium1() {
//    val aquarium1 = Aquarium1()
//    aquarium1.printSize()
//    // default height and length
//    val aquarium2 = Aquarium1(width = 25)
//    aquarium2.printSize()
//    // default width
//    val aquarium3 = Aquarium1(height = 35, length = 110)
//    aquarium3.printSize()
//    // everything custom
//    val aquarium4 = Aquarium1(width = 25, height = 35, length = 110)
//    aquarium4.printSize()

//    val aquarium6 = Aquarium1(numberOfFish = 29)
//    aquarium6.printSize()
//    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}

fun main() {
    buildAquarium1()
}