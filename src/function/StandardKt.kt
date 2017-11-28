package function

/**
 * @Author cjeon
 * @Since 28/11/2017
 */
fun main(args : Array<String>) {
    let()
    apply()
}

// it -> single parameter 면 it 으로 받을 수 있음
// https://kotlinlang.org/docs/reference/lambdas.html#it-implicit-name-of-a-single-parameter

// let은 parameter 가 있음. this 를 넘기기 때문.
// this는 없음. block 자체가 this 인데 this 의 scope를 만족시키는 게 없기 때문.

fun let() {
    val result = "😎".let {
        println(it)
        println(this) // no this
    }
    println(result)
}

// apply는 it 이 없음. parameter 가 없기 때문.
// this는 있음. T 의 scope 에서 block 을 실행시키기 때문 - extension function

fun apply() {
    val result = "💎".apply {
        println(it) // no it
        println(this)
    }
    println(result)
}

class ServiceApi {
    fun apiNameOne() {}
    fun apiNameTwo(str : String) {}
    fun apiNameThree() {}
}

fun applyingApply(serviceApiInstance: ServiceApi) {
    serviceApiInstance.apiNameOne()
    serviceApiInstance.apiNameTwo("🌹")
    serviceApiInstance.apiNameThree()

    serviceApiInstance.apply {
        apiNameOne()
        apiNameTwo("🌹")
        apiNameThree()
    }
}