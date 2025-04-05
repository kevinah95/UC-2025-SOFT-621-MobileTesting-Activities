package io.github.kevinah95.soft631.l01

class Calculator {
    fun Add(a: Int, b: Int): Int {
        return a + b
    }

    fun Mult(a:kotlin.Int,b:kotlin.Int): Int{
        return a*b
    }

    fun Div(a: Int, b: Int): Int  {
        var result: Int = 0
        try {
            result = a / b
        }
        catch (e: ArithmeticException) {
            println("No se puede dividir por Zero")
        }
        return result
    }

    fun Substraction(a: Int, b: kotlin.Int): Int {
        return a - b
    }

    fun power(base: Int, exponent: Int) : Int {
        return Math.pow(base.toDouble(), exponent.toDouble()).toInt()
    }
}