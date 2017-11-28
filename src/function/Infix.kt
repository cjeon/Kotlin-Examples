@file:Suppress("unused", "UNUSED_PARAMETER")

package function

/**
 * @Author cjeon
 * @Since 23/11/2017
 */
fun main(args: Array<String>) {
    "Don't".need { "parenthesis! 👍" }
    "Don't" evenNeed { "the dot 😎" }
}

fun String.need(block: () -> String) = Unit

infix fun String.evenNeed(block: () -> String) = Unit

fun doYouWannaBuildASnowman() {
    infix fun String.go(ignore: String) = Unit
    "Go away anna".let { it go "❄️ let it go ❄️" }
}