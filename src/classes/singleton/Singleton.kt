package classes.singleton

/**
 * @Author cjeon
 * @Since 21/11/2017
 */
object Singleton {
    private var state = 5
    @JvmStatic private var staticState = 5

    fun method1(input: Int): Int {
        return input + state
    }

    @JvmStatic
    fun method2(input: Int): Boolean {
        return staticState % 2 == 1
    }
}