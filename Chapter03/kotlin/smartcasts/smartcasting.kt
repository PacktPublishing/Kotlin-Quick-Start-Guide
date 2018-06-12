package quickstartguide.kotlin.chapter3.kotlin.smartcasts

open class BaseUser(val name: String)

open class User(name: String,
                val birthYear: Int) : BaseUser(name) {

    fun login() {

    }
}

open class AdminUser(name: String,
                     birthYear: Int) : User(name, birthYear) {

    fun accessLogs() {

    }
}

fun smartCasting(baseUser: BaseUser) {
    if (baseUser is User) {
        baseUser.login()
    } else if (baseUser is AdminUser) {
        baseUser.accessLogs()
    }
}
