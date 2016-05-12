package com.example.birdcalculate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorMinusTest {

    private double firstOperand;
    private double secondOperand;
    private double expectedResult;

    @Test
    public void minus() {
        Calculator calculator = new Calculator();
        assertEquals(this.expectedResult,
                calculator.minus(this.firstOperand, this.secondOperand));
    }

    public CalculatorMinusTest(double firstOperand, double secondOperand, double expectedResult) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 0.0},
                {2, 1, 1.0},
                {2, 3, -1.0},
        });
    }

}
