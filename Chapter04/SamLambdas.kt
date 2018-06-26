package quickstart.kotlin.chapter4

import java.util.function.IntPredicate
import java.util.function.Predicate

fun createPredicate(): IntPredicate {
    //compiler error
    return  { n: Int -> n % 2 == 0 }
}

fun createPredicate2(): IntPredicate {
    return  IntPredicate { n -> n % 2 == 0 }
}