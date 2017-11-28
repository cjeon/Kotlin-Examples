package function

/**
 * @Author cjeon
 * @Since 23/11/2017
 */
@Suppress("NOTHING_TO_INLINE")



inline fun inlineParty() {
    val list = listOf("🎉", "❄️", "🎂", "🎸")
    for (string in list) {
        print(string * 10)
    }
}

fun justParty() {
    val list = listOf("🎉", "❄️", "🎂", "🎸")
    for (string in list) {
        print(string * 10)
    }
}

fun main(args: Array<String>) {
    println("Inline party")
    inlineParty()
    println("Just party")
    justParty()
}


operator fun String.times(num: Int) {
    val builder = StringBuilder()
    for (i in 1..num) {
        builder.append(this)
    }
    this + builder.toString()
}