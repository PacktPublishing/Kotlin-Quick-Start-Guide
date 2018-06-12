package quickstartguide.kotlin.chapter3.kotlin.nestedclasses

class User(val name: String) {

    class Address(val street: String,
                  val streetNumber: String,
                  val zip: String,
                  val city: String)
}


val address = User.Address("Aparo Park", "1", "ABC", "Gotham City")

class User(val name: String) {

    private class Address(val street: String,
                          val streetNumber: String,
                          val zip: String,
                          val city: String)


    private val address = Address("Aparo Park", "1", "ABC", "Gotham City")
}