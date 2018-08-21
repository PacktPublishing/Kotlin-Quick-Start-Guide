package quickstart.kotlin.chapter6

interface NumberValidator {
    fun isValueValid(value: Int): Boolean
}

class Validator<T> private constructor(private val validatedObject: T) {

    internal val validators = mutableListOf<NumberValidator>()
    private lateinit var valueFactory: (T) -> Int

    infix fun forProperty(factory: (T) -> Int): RuleBuilder<T> {
        valueFactory = factory
        return RuleBuilder(this)
    }

    fun isValid(): Boolean {
        return validators.all { v -> v.isValueValid(valueFactory(validatedObject)) }
    }

    companion object {
        infix fun <T> validates(obj: T): Validator<T> {
            return Validator(obj)
        }
    }
}

class RuleBuilder<T> internal constructor(internal val validator: Validator<T>) {

    fun greaterThan(target: Int): RuleBuilder<T> {
        validator.validators.add(object : NumberValidator {
            override fun isValueValid(value: Int): Boolean {
                return value > target
            }
        })
        return this
    }

    fun lesserThan(target: Int): RuleBuilder<T> {
        validator.validators.add(object : NumberValidator {
            override fun isValueValid(value: Int): Boolean {
                return value < target
            }
        })
        return this
    }

    fun finishRules(): Validator<T> {
        return validator
    }
}

infix fun <T> RuleBuilder<T>.withRules(init: RuleBuilder<T>.() -> Unit): Validator<T> {
    init(this)
    return this.validator
}

class Employee(val age: Int, val name: String)

fun main(args: Array<String>) {
    val employee = Employee(35, "John Wayne")

    val validator = Validator validates employee forProperty { e -> e.age } withRules {
        lesserThan(60)
        greaterThan(18)
    }

    val isValid = validator.isValid()
}