package quickstart.kotlin.chapter4

fun add(a:Int, b: Int) = a + b

class MemberRefs() {
    var numFunc: (Int, Int) -> Int = { a, b -> multiplier(a, b) }

    fun multiplier(a: Int, b: Int): Int {
        return a * b
    }
}

class MemberRefs2() {
    var numFunc: (Int, Int) -> Int = this::multiplier

    fun multiplier(a: Int, b: Int): Int {
        return a * b
    }
}

class MemberRefs3() {
    var numFunc: (Int, Int) -> Int = ::multiplier

    fun multiplier(a: Int, b: Int): Int {
        return a * b
    }
}

class MemberRefs4() {
    //compiler error
    var numFunc: (Int, Int) -> Int = this::printNums

    fun printNums(a: Int, b: Int) {
        println("$a and $b")
    }
}

class MemberRefs5() {
    val str = "Kotlin"
    val getChar: (Int) -> Char = str::get
}

class Person(val name: String)

val personConstructor = ::Person

val person: Person = personConstructor("John")

fun createPerson(name: String): Person {
    return personConstructor(name)
}