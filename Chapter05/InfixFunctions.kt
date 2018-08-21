package quickstart.kotlin.chapter6.infix

class Employee {
    infix fun payout(salary: Int) {
        print("Employee was paid: $salary")
    }
}

fun payEmployee() {
    val employee = Employee()
    employee payout 3500
}