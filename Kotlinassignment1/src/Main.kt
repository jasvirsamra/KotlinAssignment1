//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val max = 15
    val sum = sumUpToMax(max)
    val number = 5
    val result1 = factorial(number)
    val result2 = lambda(number)
    val result3 = recursive(number)

    println("A. The sum of integers from 1 to " + max + " = " + sum)
    println("B. The factorial of " + number + " using iterative method = " + result1)
    println("C. The factorial of " + number + " using lambda expression = " + result2)
    println("D. The factorial of " + number + " using recursive = " + result3)

} // main

// A. Create a function that adds (sums) integers starting at 1 up to a specified maximum
fun sumUpToMax(max: Int): Int {
    var sum = 0
    // Loop through numbers from 1 to the specified max
    for (i in 1..max) {
        sum += i // add sum to i
        println("the sum after adding " + i + " is " + sum )
    }
    return sum
} // sumUpToMax()

// B. Create an iterative function that finds the factorial of a specified integer.
fun factorial(number: Int): Int {
    var result = 1
    // Loop through numbers to specified number
    for (i in 1..number) {
        result *= i // multiply result by i
        println("Factorial: After multiplying by " + i + " the result is " + result)
    }
    return result
} // factorial()

// C. Rewrite the function in B. using a lambda expression.
fun lambda(number: Int): Int {
    var result = 1
    // Multiply result by each number in the range to the specified number
    (1..number).forEach {
        result *= it
        println("Lambda: After multiplying by " + it + " the result is " + result)
    }
    return result
} // lambda()

// D. Convert the function in B. to a recursive function.
fun recursive(number: Int): Int {
    // If number is 1 or less return 1
    if (number <= 1) {
        return 1
    }
    // Multiply the number by the factorial of the previous number
    val result = number * recursive(number - 1)
    println("Recursive: After multiplying by " + number +  " the result is " + result)

    return result
} // recursive()