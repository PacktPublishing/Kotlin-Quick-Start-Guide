class User(val firstName: String,
           val lastName: String,
           val address: String)

fun printUserDetails(user: User) {
    fun tryPrint(str: String) {
        if (str.length > 5) {
            println(str)
        } else {
            println("I print strings with more than 5 characters")
        }
    }

    tryPrint(user.firstName)
    tryPrint(user.lastName)
    tryPrint(user.address)
}