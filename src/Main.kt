package com.example.kotlincalculator

class Calculator {

    fun execute(operation: String, n1: Double, n2: Double) : Double? {
        return when(operation) {
            "1" -> add(n1, n2)
            "2" -> subtract(n1, n2)
            "3" -> multiply(n1, n2)
            "4" -> divide(n1, n2)
            else -> 0.0
        }
    }

    private fun add(n1: Double, n2: Double): Double {
        return n1 + n2
    }

    private fun subtract(n1: Double, n2: Double): Double {
        return n1 - n2
    }

    private fun multiply(n1: Double, n2: Double): Double {
        return n1 * n2
    }

    private fun divide(n1: Double, n2: Double): Double? {
        if(n2 == 0.0) return null
        return n1 / n2
    }
}

class InputChecker {
    fun isOperation(input: String?) : Boolean {
        return if(input == null) false
        else if(input.matches(Regex("[1-4]"))) true
        else false
    }

    fun isNumber(input: String?) : Boolean {
        if(input == null) return false

        if(input.toDoubleOrNull() ==  null) return false
        return true
    }

    fun isQuitCommand(input: String?) : Boolean {
        if(input == null) return false
        if(input.equals("q", ignoreCase = true)) return true
        return false
    }
}

object ConsoleColors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
}

const val INVALID_INPUT = "${ConsoleColors.RED}Invalid input${ConsoleColors.RESET}"



fun main() {
    val calculator = Calculator()
    val inputChecker = InputChecker()
    var input: String?
    var operation: String? = null
    var firstNumber: Double? = null
    var secondNumber: Double? = null
    var result: Double?
    var isValid = false

    while(true) {
        while(!isValid) {
            println(
                "Select the operation:\n" +
                        "\n1) Add" +
                        "\n2) Subtract" +
                        "\n3) Multiply" +
                        "\n4) Divide" +
                        "\nq) Quit"
            )
            input = readln()
            if(inputChecker.isQuitCommand(input)) {
                return
            }
            if (inputChecker.isOperation(input)) {
                operation = input
                isValid = true
            } else {
                println(INVALID_INPUT)
            }
        }

        isValid = false
        while (!isValid) {
            println("Type the first number or type 'q' to exit:")
            input = readln()
            if(inputChecker.isQuitCommand(input)) {
                return
            }
            if (inputChecker.isNumber(input)) {
                firstNumber = input.toDouble()
                isValid = true
            } else {
                println(INVALID_INPUT)
            }
        }

        isValid = false
        while (!isValid) {
            println("Type the second number or type 'q' to exit:")
            input = readln()
            if(inputChecker.isQuitCommand(input)) {
                return
            }
            if (inputChecker.isNumber(input)) {
                secondNumber = input.toDouble()
                isValid = true
            } else {
                println(INVALID_INPUT)
            }
        }
        isValid = false
        result = calculator.execute(operation!!, firstNumber!!, secondNumber!!)
        if(result == null) {
            println("${ConsoleColors.RED}Invalid operation: division by zero.${ConsoleColors.RESET}")
        } else {
            println("${ConsoleColors.GREEN}Result: $result${ConsoleColors.RESET}")
        }
    }


}