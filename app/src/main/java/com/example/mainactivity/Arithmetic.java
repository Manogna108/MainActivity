package com.example.mainactivity;
public class Arithmetic<mOperand1> {
    private int mOperand1;
    private int mOperand2;

    public Arithmetic() {
        mOperand1 = 2;
        mOperand2 = 3;
    }

    public Arithmetic(int operand1, int operand2) {
        mOperand1 = operand1;
        mOperand2 = operand2;
    }

    public String toString() {
        return " Arithmetic Instance: mOperand1 = " + mOperand1 + "; mOperand2 ";
    }

    public int add() {
        return mOperand1 + mOperand2;
    }

    public int subtract() {
        return mOperand1 - mOperand2;
    }

    public int multiply() {
        return mOperand1 * mOperand2;
    }

    public double divide() {
        return (double) mOperand1 / mOperand2;
    }

    public static int add(int a, int b){
        return a +b;
    }


}

