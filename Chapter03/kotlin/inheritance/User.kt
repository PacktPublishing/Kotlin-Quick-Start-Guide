package quickstartguide.kotlin.chapter3.kotlin.inheritance

open class User(var firstName: String,
                var lastName: String,
                var birthYear: String)

class AdminUser(firstName: String,
                lastName: String,
                birthYear: String,
                var role: String) : User(firstName, lastName, birthYear)

open class User {

    constructor(firstName: String,
                lastName: String,
                birthYear: String)

}

class AdminUser : User {

    constructor(firstName: String,
                lastName: String,
                birthYear: String,
                role: String) : super(firstName, lastName, birthYear)
}