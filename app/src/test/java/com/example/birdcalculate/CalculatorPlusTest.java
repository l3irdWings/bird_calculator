package com.example.birdcalculate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorPlusTest {

    private double firstOperand;
    private double secondOperand;
    private double expectedOperand;

    @Test
    public void plus() {
        Calculator calculator = new Calculator();
        assertEquals(this.expectedOperand,
                calculator.plus(this.firstOperand, this.secondOperand));
    }

    public CalculatorPlusTest(double firstOperand, double secondOperand, double expectedOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.expectedOperand = expectedOperand;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, 1, 2.0},
                {2, 2, 4.0},
                {-1, -1, -2.0}
        });
    }
}
