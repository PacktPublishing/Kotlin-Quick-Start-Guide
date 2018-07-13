package quickstartguide.kotlin.chapter5

fun filterEvensThenSquare(numbers: Collection<Int>) {
    val result: List<String> = numbers.filter { n -> n % 2 == 0 }
            .map { n -> n * n }
            .sorted()
            .takeWhile { n -> n < 1000 }
            .map { n -> n.toString() }
}

// FILTERING

fun drop() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val dropped = numbers.drop(2)
}

fun filter() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val smallerThan3 = numbers.filter { n -> n < 3 }
}

fun filterNot() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val largerThan3 = numbers.filterNot { n -> n < 3 }
}

fun take() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val first2 = numbers.take(2)
}

// AGGREGATE

fun any() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val hasEvens = numbers.any { n -> n % 2 == 0 }
}

fun all() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val allEven = numbers.all { n -> n % 2 == 0 }
}

fun count() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenCount = numbers.count { n -> n % 2 == 0 }
}

fun forEach() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach { n -> println(n) }
}

fun max() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val max = numbers.max()
}

fun min() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val min = numbers.min()
}

fun sum() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.sum()
}


// TRANSFORMING

fun map() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val strings = numbers.map { n -> n.toString() }
}

fun flatMap() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val multiplesOf10 = numbers.flatMap { n -> listOf(n, n * 10) }
}

fun groupBy() {
    val strings = listOf("abc", "ade", "bce", "bef")
    val groupped = strings.groupBy { s -> s[0] }
}

fun associateBy() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val groupped = numbers.associateBy { n -> n.toString() }
}

// ITEMS

fun contains() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val contains10 = numbers.contains(10)
}

fun first() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val firstEven = numbers.first { n -> n % 2 == 0 }
}

fun firstOrNull() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val firstLargerThan10 = numbers.firstOrNull { n -> n > 10 }
}

fun last() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val lastEven = numbers.last { n -> n % 2 == 0 }
}

fun lastOrNull() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val lastLargerThan10 = numbers.lastOrNull { n -> n > 10 }
}

fun single() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val number5 = numbers.single { n -> n > 4 }
}

fun singleOrNull() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val smallerThan1 = numbers.singleOrNull { n -> n < 1 }
}

// SORTING

fun reversed() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val reversed = numbers.reversed()
}

fun sorted() {
    val numbers = listOf(2, 1, 5, 3, 4)
    val sorted = numbers.sorted()
}

fun sortedDescending() {
    val numbers = listOf(2, 1, 5, 3, 4)
    val sortedDesc = numbers.sortedDescending()
}
