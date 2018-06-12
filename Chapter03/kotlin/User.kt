package quickstartguide.kotlin.chapter3.kotlin

class User(var firstName: String,
           var lastName: String,
           var birthYear: String)

class GetOnly {
    private var _name: String = ""

    var name: String = _name
        get() {
            println("name property is being accessed")
            return _name
        }
}

class SetOnly {
    private var _name: String = ""

    var name: String = _name
        set(value) {
            println("name property is being set with value: $value")
            _name = value
        }
}

class GetAndSet {

    var name: String = ""
        get() {
            println("name property is being accessed")
            return field
        }
        set(value) {
            println("name property is being set with value: $value")
            field = value
        }
}

class GetAndSetWithoutInit {

    private var _name: String = ""

    var name: String //doesn't have to be initialized
        get() {
            println("name property is being accessed")
            return _name
        }
        set(value) {
            println("name property is being set with value: $value")
            _name = value
        }
}

class PrivateSet {
    var name: String = ""
        private set
}

class Lateinit {
    private lateinit var name: String
    private lateinit var birthYear: Int // compiler error
    private lateinit var lastName: String? // compiler error

    fun checkIfLateinitSet() {
        val initialized = this::name.isInitialized
    }
}

class User(firstName: String,
           lastName: String,
           birthYear: Int) {

    var firstName: String
    var lastName: String
    var birthYear: Int

    init {
        println("Calling constructor of User class")
        this.firstName = firstName
        this.lastName = lastName
        this.birthYear = birthYear
    }
}

class User(firstName: String,
           lastName: String,
           birthYear: Int) {

    var firstName: String = firstName
    var lastName: String = lastName
    var birthYear: Int = birthYear
}

class PrivateProperty(private val num: Int)


class MultipleInits {
    private var counter = 1

    init {
        //called first
        println("I'm called $counter time(s)")
    }

    init {
        //called second
        println("I'm called $counter time(s)")
    }
}

val user = User("Bruce", "Wayne", 1950)