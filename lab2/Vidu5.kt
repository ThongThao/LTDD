fun main() {
    //define a list of aquarium decorations
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.filter { it[0] == 'p' } //to print only the decorations that start with the letter ‘p'
    println("eager: $eager") //print

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

    //    assign the sequence to a variable called lazyMap
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}") //print the first element of lazyMap using first()
    println("-----")
    println("all: ${lazyMap.toList()}") //print lazyMap converted to a List

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    // the inner println() is only called for the elements that are accessed
    //print only the decorations that start with the letter ‘p'
    println("-----")
    println("filtered: ${lazyMap2.toList()}")


    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    // the flatten() to transform all the lists into one list
    println("Flat: ${mylist.flatten()}")
}