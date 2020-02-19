package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Arithmetic testArithmetic = new Arithmetic();
        TaxArithmetic testTax = new TaxArithmetic();
        System.out.println(testArithmetic);
        System.out.println(testTax.calculateTax(10.75, 8.5));
    }
}
