package classes

/**
 * @Author cjeon
 * @Since 28/11/2017
 */
fun main(args : Array<String>){
    val sampleClass = SampleClass("A", "B", "C")
    val (c, b, a) = sampleClass // note reversed order
    println(a) // "A"
    println(b) // "B"
    println(c) // "C"

    val sampleClass2 = SampleClass2("A", "B", "C")
    val (_, _, d) = sampleClass2 // only "component3()" is called
}

class SampleClass(private val A: String,
                  private val B: String,
                  private val C: String) {
    // defining componentN lets kotlin aware that it has ordered components.
    operator fun component1(): String = C
    operator fun component2(): String = B
    operator fun component3(): String = A
}

class SampleClass2(private val A: String,
                  private val B: String,
                  private val C: String) {
    // defining componentN lets kotlin aware that it has ordered components.
    operator fun component1(): String {
        println("component1")
        return C
    }
    operator fun component2(): String {
        println("component2")
        return B
    }
    operator fun component3(): String {
        println("component2")
        return A
    }
}