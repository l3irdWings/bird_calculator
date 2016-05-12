package com.example.birdcalculate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity
        extends AppCompatActivity
        implements CalculatorListener {

    private TextView mResultText;
    private EditText mFirstOperandEditText, mSecondOperandEditText;
    private MainController mMainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResultText = (TextView) findViewById(R.id.operation_result_text_view);
        mFirstOperandEditText = (EditText) findViewById(R.id.operand_one_edit_text);
        mSecondOperandEditText = (EditText) findViewById(R.id.operand_two_edit_text);

        mMainController = new MainController();
        mMainController.setListener(this);

    }
    public void onPlus(View view) {
        String firstOperand = mFirstOperandEditText.getText().toString();
        String secondOperand = mSecondOperandEditText.getText().toString();
        if (!firstOperand.equals("") && !secondOperand.equals("")) {
            mMainController.plus(Double.parseDouble(firstOperand), Double.parseDouble(secondOperand));
        }
    }

    public void onMinus(View view) {
        String firstOperand = mFirstOperandEditText.getText().toString();
        String secondOperand = mSecondOperandEditText.getText().toString();
        if (!firstOperand.equals("") && !secondOperand.equals("")) {
            mMainController.minus(Double.parseDouble(firstOperand), Double.parseDouble(secondOperand));
        }
    }

    public void onDivide(View view) {
        String firstOperand = mFirstOperandEditText.getText().toString();
        String secondOperand = mSecondOperandEditText.getText().toString();
        if (!firstOperand.equals("") && !secondOperand.equals("")) {
            mMainController.divide(Double.parseDouble(firstOperand), Double.parseDouble(secondOperand));
        }
    }

    public void onMultiple(View view) {
        String firstOperand = mFirstOperandEditText.getText().toString();
        String secondOperand = mSecondOperandEditText.getText().toString();
        if (!firstOperand.equals("") && !secondOperand.equals("")) {
            mMainController.multiple(Double.parseDouble(firstOperand), Double.parseDouble(secondOperand));
        }
    }

    @Override
    public void onSuccess(String result) {
        mResultText.setText(String.valueOf(result));
    }
}
