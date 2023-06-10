import java.util.Scanner
fun main(){
    val scanner = Scanner(System.`in`)
    println("Please enter a number: ")
    val num1 = scanner.nextInt()
    println("The first number is: $num1")
    println("Please enter a second number: ")
    val num2 = scanner.nextInt()
    println("The second number is: $num2")
    val sum = num1 + num2
    println("The sum of the two numbers is: $sum")
}