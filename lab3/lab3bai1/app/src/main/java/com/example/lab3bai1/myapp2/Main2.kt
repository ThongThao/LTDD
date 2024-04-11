package com.example.lab3bai1.myapp2

import com.example.lab3bai1.myapp2.Aquarium2
//5. Learn about subclasses and inheritance

fun buildAquarium2() {
//    val aquarium6 = Aquarium2(length = 25, width = 25, height = 40)
//    aquarium6.printSize()

    val myAquarium = Aquarium2(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = Aquarium2.TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main(){
    buildAquarium2()
}

