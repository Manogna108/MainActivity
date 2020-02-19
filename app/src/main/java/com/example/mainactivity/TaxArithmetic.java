package com.example.mainactivity;

public class TaxArithmetic extends Arithmetic{
    public TaxArithmetic (int a, int b){
        super(a,b);
    }
    public TaxArithmetic(){
        super();
    }
    public double calculateTax(double p, double r){
        return p * (r/100.0);
    }
    public double calculateTax(double r){
        double p = add();
        return p * (r/100.0);
    }
}
