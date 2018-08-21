package quickstartguide.kotlin.chapter5

fun indexList() {
    val superHeros = mutableListOf("Superman", "Batman")
    val superman = superHeros[0]

    superHeros[2] = "Thor"
}

fun indexingMap() {
    val map = mutableMapOf(1 to "one", 2 to "two")
    val two = map[2]

    map[3] = "three"
}