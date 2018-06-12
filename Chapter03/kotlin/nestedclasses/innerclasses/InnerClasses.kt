package quickstartguide.kotlin.chapter3.kotlin.nestedclasses.innerclasses

class User(val name: String) {

    class Address(val street: String,
                  val streetNumber: String,
                  val zip: String,
                  val city: String) {

        init {
            println("The name of the User is: $name") //compiler error, can't access name property
        }
    }
}

class User(val name: String) {

    inner class Address(val street: String,
                        val streetNumber: String,
                        val zip: String,
                        val city: String) {

        init {
            //we can access the name property from the outer class
            println("The name of the User is: $name")
        }
    }
}