package com.example.lab3bai1.myapp
abstract class AquariumFish2 {
    //    abstract val color: String
    interface FishAction {
        fun eat()
    }

    interface FishColor {
        val color: String
    }

//    class Plecostomus: FishAction, FishColor {
//        override val color = "gold"
//        override fun eat() {
//            println("eat algae")
//        }
//    }

//    class Plecostomus:  FishAction, FishColor by GoldColor {
//        override fun eat() {
//            println("eat algae")
//        }
//    }

    // Plecostomus
    class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
        FishColor by fishColor {
        override fun eat() {
            println("eat algae")
        }
    }

    class Shark: FishAction, FishColor {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

    object GoldColor : FishColor {
        override val color = "gold"
    }

    class PrintingFishAction(val food: String) : FishAction {
        override fun eat() {
            println(food)
        }
    }
    // Plecostomus2
    class Plecostomus2 (fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("eat algae"),
        FishColor by fishColor
}