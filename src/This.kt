/**
 * @Author cjeon
 * @Since 23/11/2017
 */
class This {
    val num = 1

    fun case1() {
        println(this.num) // This#num
    }

    inner class Inner {
        val num = 2

        fun case2() {
            println(this.num) // DeeperHell#num
            println(this@Inner.num) // DeeperHell#num
            println(this@This.num) // This#num
        }

        fun bridge(num : Int) {
            num.case3()
        }

        fun Int.case3() {
            println(this) // an Int. case3's receiver.
            // if we called "10.case3()", then 10 is **this**.
            println(this@case3) // same as above

            println(this@Inner.num) // DeeperHell#num
            println(this@This.num) // This#num
        }
    }
}

fun main(args : Array<String>) {
    // case 1
    This().case1()
    // case 2
    This().Inner().case2()
    // case 3
    This().Inner().bridge(5)
}