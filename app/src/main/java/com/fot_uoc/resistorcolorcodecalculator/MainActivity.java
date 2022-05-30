package com.fot_uoc.resistorcolorcodecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button colortovalue,threebandbtn,fivebandbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colortovalue = findViewById(R.id.colortovalue);
        threebandbtn = findViewById(R.id.threebandbtn);
        fivebandbtn = findViewById(R.id.fivebandbtn);

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




    }
}