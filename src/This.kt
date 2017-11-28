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

        fun Int.case3() {
            println(this) // an Int. case3's receiver.
            // if we called "10.case3()", then 10 is **this**.
            println(this@case3) // same as above

            println(this@Inner.num) // DeeperHell#num
            println(this@This.num) // This#num
        }
    }
}