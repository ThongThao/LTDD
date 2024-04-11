package com.example.lab3bai1.bai2


open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun main(){
    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
}