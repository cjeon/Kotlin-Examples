package classes

/**
 * @Author cjeon
 * @Since 21/11/2017
 */
class ExampleClass {
    val exampleFiled: Int

    // a constructor
    constructor(exampleField: Int) {
        this.exampleFiled = exampleField
    }

    // -   -   -   -   -   -  -   -
    // aFun() and aFun2() is identical.
    // return type Unit can be removed.
    fun aFun() { // == public void aFun()
        // do something
    }

    fun aFun2() : Unit { // == public void aFun2()
        // do something
    }

    // -   -   -   -   -   -  -   -
    // see https://kotlinlang.org/docs/reference/visibility-modifiers.html
    fun publicFun() {}
    protected fun protectedFun() {}
    internal fun internalFun() {}
    private fun privateFun() {}
    // -   -   -   -   -   -  -   -
}

// -   -   -   -   -   -  -   -
// below two classes are identical
class ExampleClass2 {
    private val exampleField: Int

    constructor(exampleField: Int) {
        this.exampleField = exampleField
    }
}

class ExampleClass3(exampleField: Int)

// -   -   -   -   -   -  -   -
// below two classes are identical. var too.
class ExampleClass4 {
    val exampleField: Int

    constructor(exampleField: Int) {
        this.exampleField = exampleField
    }
}

class ExampleClass5(val exampleField: Int)