// a function that takes two arguments
// The first argument is an integer
// The second argument is a function that takes an integer and returns an integer
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty( start: Int ) = start + 1

fun main() {
    //the lambda takes an Int named dirty, and returns dirty / 2. ()
    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter(dirtyLevel))

    println(updateDirty(30, waterFilter))

    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel2 = 19
    dirtyLevel2 = updateDirty(dirtyLevel2) { dirtyLevel2 -> dirtyLevel2 + 23}
    println(dirtyLevel2)
}