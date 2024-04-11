package com.example.lab3bai1.bai2


const val rocks = 3

val value1 = complexFunctionCall() // OK
fun complexFunctionCall(): Int {
    // Complex logic to calculate the value
    return 42
}
//const val CONSTANT1 = complexFunctionCall() // NOT ok

object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}