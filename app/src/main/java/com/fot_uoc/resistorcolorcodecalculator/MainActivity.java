package com.fot_uoc.resistorcolorcodecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button colortovalue,threebandbtn,fivebandbtn,sixbandbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));

        colortovalue = findViewById(R.id.colortovalue);
        threebandbtn = findViewById(R.id.threebandbtn);
        fivebandbtn = findViewById(R.id.fivebandbtn);
        sixbandbtn = findViewById(R.id.sixbandbtn);


        colortovalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ColorToValue = new Intent(MainActivity.this,ColorToValue.class);
                startActivity(ColorToValue);
            }
        });
        threebandbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ThreeBand = new Intent(MainActivity.this,ThreeBand.class);
                startActivity(ThreeBand);
            }
        });
        fivebandbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FiveBand = new Intent(MainActivity.this,FiveBand.class);
                startActivity(FiveBand);
            }
        });
        sixbandbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SixBand = new Intent(MainActivity.this,SixBand.class);
                startActivity(SixBand);
            }
        });
    }
}