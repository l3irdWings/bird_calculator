package com.example.birdcalculate;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void OnePlusOneEqualTwo() {
        assertEquals(2.0, calculator.plus(1, 1));
    }

    @Test
    public void Minus() {
        assertEquals(0.0, calculator.minus(1, 1));
        assertEquals(1.0, calculator.minus(2, 1));
        assertEquals(-1.0, calculator.minus(2, 3));
    }

    @Test(expected = DivideByZeroException.class)
    public void Divide() {
        assertEquals(1.0, calculator.divide(1, 1));
        calculator.divide(2, 0);
    }

    @Test
    public void OneMultipleOneEqualOne() {
        assertEquals(1.0, calculator.multiple(1, 1));
    }

}
