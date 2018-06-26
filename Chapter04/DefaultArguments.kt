package quickstart.kotlin.chapter4

fun indexOf(ch: Int, fromIndex: Int = 0) {
    //omitted
}

fun callingDefault() {
    indexOf(65)
    indexOf(65, 1)
}

class User {

    constructor(name: String) : this(name, null)

    constructor(name:String,
                phoneNumber: String?) : this(name, phoneNumber, false)

    constructor(name:String,
                phoneNumber: String?,
                isLoggedIn: Boolean) {
        //omitted
    }
}

class User2(name: String,
            phoneNumber: String? = null,
            isLoggedIn: Boolean = false)


@JvmOverloads
fun createUser(name: String, phoneNumber: String = "", loggedIn: Boolean = false) : User {
    return User(name, phoneNumber, loggedIn)
}