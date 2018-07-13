package quickstartguide.kotlin.chapter5

val superHeros = listOf("Batman", "Superman", "Hulk")
val empty = emptyList<String>()
val moreSuperHeros = arrayListOf("Captain America", "Spider-Man")

val superHeros2 = mutableListOf("Thor", "Daredevil", "Iron Man")

fun addSuperHero() {
    superHeros2.add("Wolverine")
}
