package nullsafety

/**
 * https://kotlinlang.org/docs/reference/null-safety.html
 *
 * @Author cjeon
 * @Since 21/11/2017
 */

fun safeCall(nullable: Int?) {
    // won't compile
    nullable.toLong()

    // will compile
    nullable?.toLong()

    //  - - - - - -

    // if nullable = null
    nullable?.toLong() // = null

    // else
    nullable?.toLong() // = corresponding value
}

fun assertCall(nullable: Int?) {
    // won't compile
    nullable.toLong()

    // will compile
    nullable!!.toLong()

    //  - - - - - -

    // if nullable = null
    nullable!!.toLong() // = NPE!

    // else
    nullable!!.toLong() // = corresponding value
}

fun elvisOperator(nullable: Int?) {
    val defaultValue = 0

    // if nullable = null
    val value = nullable ?: defaultValue // = defaultValue

    // if nullable = null
    val value2 = nullable ?: defaultValue // = nullable
}