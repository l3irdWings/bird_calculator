package com.example.birdcalculate;

/**
 * Created by Thanakorn Amnuaywiboolpol on 5/11/16 AD.
 */
public class Calculator {
    public double plus(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double minus(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double divide(double firstOperand, double secondOperand) {
        if (secondOperand == 0) {
            throw new DivideByZeroException();
        }
        return firstOperand / secondOperand;
    }

    public double multiple(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
}
