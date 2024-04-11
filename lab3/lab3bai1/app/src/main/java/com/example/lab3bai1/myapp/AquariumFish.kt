package com.example.lab3bai1.myapp

abstract class AquariumFish {
    abstract val color: String

//    class Shark: AquariumFish() {
//        override val color = "grey"
//    }
//
//    class Plecostomus: AquariumFish() {
//        override val color = "gold"
//    }

    class Shark: AquariumFish(), FishAction {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

    class Plecostomus: AquariumFish(), FishAction {
        override val color = "gold"
        override fun eat() {
            println("eat algae")
        }
    }

    interface FishAction  {
        fun eat()
    }

}