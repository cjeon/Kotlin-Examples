/**
 * @Author cjeon
 * @Since 28/11/2017
 */
fun main(args : Array<String>) {
    // collections are by default immutable.
    val listInstance = listOf(1, 2, 3)
    val mutableListInstance = mutableListOf(1,2,3)

    // sets, maps can be instantiate in a single line. 🎉
    val hasmMapInstance = hashMapOf("key1" to 1, "key2" to 2)
    val sortedSetInstance = sortedSetOf(1, 2, 3)

    // *lots* of functional operations are available.
    val oneToTen = (1..10).toList()
    oneToTen.filter { it % 2 == 0 } // = [2, 4, 6, 8, 10]
            .map { it / 2 } // divide by 2 = [1, 2, 3, 4, 5]
            .take(4) // take first 4 = [1, 2, 3, 4]
            .reduce { sum, i -> sum + i  } // sum all
            .let { print(it) } // print 10
}