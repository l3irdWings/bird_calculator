package com.example.birdcalculate;

/**
 * Created by Thanakorn Amnuaywiboolpol on 5/11/16 AD.
 */
public class MainController {

    private Calculator mCalculator = new Calculator();
    CalculatorListener listener;

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void plus(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(mCalculator.plus(firstOperand, secondOperand)));
    }
    public void minus(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(mCalculator.minus(firstOperand, secondOperand)));
    }
    public void divide(double firstOperand, double secondOperand) {
        try {
            listener.onSuccess(String.valueOf(mCalculator.divide(firstOperand, secondOperand)));
        } catch (DivideByZeroException e) {
            listener.onSuccess("Divide second operand is not equal 0.");
        }
    }
    public void multiple(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(mCalculator.multiple(firstOperand, secondOperand)));
    }
}
