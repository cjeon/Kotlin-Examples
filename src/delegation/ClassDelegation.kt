package delegation

/**
 * @Author cjeon
 * @Since 29/11/2017
 */

/* An Interface */
interface Interface1 {
    fun printName()
}

/* An implementation of Interface1 */
class Implementation : Interface1 {
    val name = "Implementation"
    override fun printName() {
        println(name)
    }
}

/* Interface 구현체의 Injection 느낌! */
class DerivedClass(val instance : Interface1) : Interface1 by instance {
    fun hi() {
        /* major difference 1 : instance 를 주입하고 나면 끝. 바로 상속받은 것처럼 부를 수 있습니다. */
        /*                      그래서 DO 보다는 inheritance 와 비슷하다고 말씀드렸습니다. */
        printName()
        /* major difference 2 : Type 이 따라갑니다. DO 에서는 이렇게 안되죠. */
        println(this is Interface1)
    }
}

fun main(arg : Array<String>){
    DerivedClass(Implementation()).hi()

    println("- - - - - - - - - - - - - -")

    DerivedClass2(Implementation(), Implementation2()).hi()
    /* Byte code 까보면 웃깁니다 */
}

/* 다중 Delegation 도 🆗 */
interface Interface2 {
    fun shoutName()
}

class Implementation2 : Interface2 {
    val name = "Implementation2💥"
    override fun shoutName() {
        println(name)
    }
}

class DerivedClass2(val instance : Interface1,
                    val instane2 : Interface2) : Interface1 by instance,
                                                 Interface2 by instane2 {
    fun hi() {
        printName()
        shoutName()
        println(this is Interface1)
        println(this is Interface2)
    }
}

