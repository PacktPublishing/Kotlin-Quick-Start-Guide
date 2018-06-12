package quickstartguide.kotlin.chapter3.kotlin.sealedclasses

sealed class SuperHero

class Hulk: SuperHero() {
    fun smashOpponent() {

    }
}

class SuperMan : SuperHero() {
    fun flyToKrypton() {

    }
}

class SpiderMan : SuperHero() {
    fun useSpiderSense() {

    }
}

fun actOnHero(hero: SuperHero) {
    when (hero) {
        is Hulk -> {
            hero.smashOpponent()
        }
        is SuperMan -> {
            hero.flyToKrypton()
        }
        is SpiderMan -> {
            hero.useSpiderSense()
        }
    }
}

