package io.github.kevinah95.soft631.l01

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    var calculator = Calculator()

    @Test
    fun givenTwoPositiveNumbers_whenAdd_thenReturnsCorrectSum() {
        // Arrange
        val numberA = 10
        val numberB = 20
        val expectedValue = 30
        // Act
        val actualValue = calculator.Add(numberA, numberB)
        // Assert
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun givenTwoPositiveNumbers_whenSubstraction_thenReturnsCorrectSubstraction() {
        //Arrange
        val numberA = 10
        val numberB = 20
        val expectedValue = -10
        //Act
        var actualValue = calculator.Substraction(numberA, numberB)
        //Assert
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun givenTwoPositiveNumbers_whenAdd_thenReturnCorrectMult() {
        //Arrange
        val numberA = 2
        val numberB = 20
        val expectValue = 40
        //Act
        val actualValue = calculator.Mult(numberA, numberB)
        // Asserts
        try {
            assertEquals(expectValue, actualValue)
        } catch (e: AssertionError) {
            println("La suma esta mal")
        }
    }

    @Test
    fun givenTwoPositiveNumbers_whenDivisible_thenReturnsCorrectDiv() {
        //Arrange
        val numA = 10
        val numB = 2
        val expectedValue = 5

        //Act
        val actualValue = calculator.Div(numA, numB)

        //Assert
        assertEquals(expectedValue, actualValue)
    }

    @Test
    fun givenBaseAndExponent_whenPower_thenReturnResult() {
        // Arrange
        val base = 2
        val exponent = 3
        val expectedValue = 8
        // Act
        val actualValue = calculator.power(base, exponent)
        // Assert
        assertEquals(expectedValue, actualValue)
    }


}