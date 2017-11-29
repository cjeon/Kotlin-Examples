package delegation

/**
 * @Author cjeon
 * @Since 28/11/2017
 */

/* Lazy : 처음 호출될 때만 Setter가 실행된다. */
fun main(args : Array<String>) {
    before()
    after()
}

fun before() {
    println("before")

    var num = 1
    val two = 2
    val lazy : Int by lazy { num + two }

    num++
    println(lazy)
}

fun after() {
    println("after")
    var num = 1
    val two = 2
    val lazy : Int by lazy { num + two }

    println(lazy)
    num++
    println(lazy)
}

/* See function definition for more info */