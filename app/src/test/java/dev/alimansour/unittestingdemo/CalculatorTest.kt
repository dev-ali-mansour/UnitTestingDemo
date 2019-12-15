package dev.alimansour.unittestingdemo

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest {
    private lateinit var mCalculator: Calculator

    @Before
    fun setUp() {
        mCalculator = Calculator()
    }

    @Test
    fun sum() {
        assertEquals(6.0, mCalculator.sum(1.0, 5.0),0.0)
    }

    @Test
    fun subtract() {
        assertEquals(6.0, mCalculator.subtract(10.0, 4.0),0.0)
    }

    @Test
    fun divide() {
        assertEquals(2.0, mCalculator.divide(10.0, 5.0),0.0)
    }

    @Test
    fun multiply() {
        assertEquals(20.0,mCalculator.multiply(2.0,10.0),0.0)
    }
}