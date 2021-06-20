package com.example.widgetwithlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String redColor = "#ff595e";
    private final String blueColor = "#1982c4";
    private final String greenColor = "#8ac926";
    private final String yellowColor = "#ffca3a";

    Button bRed, bBlue, bGreen, bYellow;
    RadioButton rRed, rBlue, rGreen, rYellow;
    TextView outputColor;
    RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bRed = findViewById(R.id.redButton);
        bBlue = findViewById(R.id.blueButton);
        bGreen = findViewById(R.id.greenButton);
        bYellow = findViewById(R.id.yellowButton);

        rRed = findViewById(R.id.redRadio);
        rBlue = findViewById(R.id.blueRadio);
        rGreen = findViewById(R.id.greenRadio);
        rYellow = findViewById(R.id.yellowRadio);

        outputColor = findViewById(R.id.colorBox);
        group = findViewById(R.id.radioGroup);

        bRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputColor.setBackgroundColor(Color.parseColor(redColor));
                rRed.setChecked(true);
            }
        });

        bBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputColor.setBackgroundColor(Color.parseColor(blueColor));
                rBlue.setChecked(true);
            }
        });

        bGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputColor.setBackgroundColor(Color.parseColor(greenColor));
                rGreen.setChecked(true);
            }
        });

        bYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputColor.setBackgroundColor(Color.parseColor(yellowColor));
                rYellow.setChecked(true);
            }
        });
        rRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputColor.setBackgroundColor(Color.parseColor(redColor));
                rRed.setChecked(true);
            }
        });

        rBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputColor.setBackgroundColor(Color.parseColor(blueColor));
                rBlue.setChecked(true);
            }
        });

        rGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputColor.setBackgroundColor(Color.parseColor(greenColor));
                rGreen.setChecked(true);
            }
        });

        rYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputColor.setBackgroundColor(Color.parseColor(yellowColor));
                rYellow.setChecked(true);
            }
        });






    }
}
