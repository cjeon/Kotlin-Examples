package function

/**
 * @Author cjeon
 * @Since 28/11/2017
 */
fun main(args : Array<String>) {
    let()
    apply()
}

fun let() {
    val result = "😎".let {
        println(it)
        // println(this) // no this
    }
    println(result)
}

fun apply() {
    val result = "💎".apply {
//        println(it) // no it
        println(this)
    }
    println(result)
}