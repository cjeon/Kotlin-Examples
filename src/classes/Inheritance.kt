package classes

/**
 * @Author cjeon
 * @Since 21/11/2017
 */
class ClosedClass // == public final class ClosedClass
open class OpenClass // == public class OpenClass

// cannot inherit - class is closed.
class Child1 : ClosedClass

// can inherit - class is open
class Child2 : OpenClass
// but has constructor problem - should do one of below explicitly.
// 1. Use parent's constructor
// 2. Use child's own constructor

class Child2_1 : OpenClass()

class Child2_2 : OpenClass {
    constructor()
}