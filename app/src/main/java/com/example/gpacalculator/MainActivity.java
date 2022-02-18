package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import android.widget.RelativeLayout;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    double co1,co2,co3,co4,co5, average;
    Button compute;
    EditText course1;
    EditText course2;
    EditText course3;
    EditText course4;
    EditText course5;
    EditText avg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compute= (Button)findViewById(R.id.compute);
        course1=(EditText) findViewById(R.id.c1);
        course2=(EditText) findViewById(R.id.c2);
        course3=(EditText) findViewById(R.id.c3);
        course4=(EditText) findViewById(R.id.c4);
        course5=(EditText) findViewById(R.id.c5);
        avg=(EditText) findViewById(R.id.avg);
        compute.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                co1 = Double.parseDouble(course1.getText().toString());
                co2 = Double.parseDouble(course2.getText().toString());
                co3 = Double.parseDouble(course3.getText().toString());
                co4 = Double.parseDouble(course4.getText().toString());
                co5 = Double.parseDouble(course5.getText().toString());
                average = ((co1 + co2 + co3 + co4 + co5) / 5);
                avg.setText((co1 + co2 + co3 + co4 + co5) / 5 + "");

                if (average < 60) {
                    view.setBackgroundColor(R.color.red);
                } else if (average >= 60 && average < 80) {
                    view.setBackgroundColor(R.color.yellow);
                } else if (average >= 80 && average <= 100) {
                    view.setBackgroundColor(R.color.green);
                }
            }




        });

    }
}