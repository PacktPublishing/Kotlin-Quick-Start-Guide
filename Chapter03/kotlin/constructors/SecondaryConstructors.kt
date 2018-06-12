package quickstartguide.kotlin.chapter3.kotlin.constructors

class User {

    constructor(firstName: String,
                lastName: String,
                birthYear: Int) {
    }
}

class User(firstName: String,
           lastName: String) {

    constructor(firstName: String,
                lastName: String,
                birthYear: Int) : this(firstName, lastName) {
    }
}

class User {

    constructor(firstName: String,
                lastName: String) {

    }

    constructor(firstName: String,
                lastName: String,
                birthYear: Int) {
    }
}