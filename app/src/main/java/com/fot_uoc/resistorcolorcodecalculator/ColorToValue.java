package com.fot_uoc.resistorcolorcodecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class ColorToValue extends AppCompatActivity {
    //initialize variable
    TextView band1,band2,band3,band4;
    Button band1btn,band2btn,band3btn,band4btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_to_value);

        //assign variable
        TextView band1 = (TextView) findViewById(R.id.band1);
        band1btn = findViewById(R.id.band1btn);
        TextView band2 = (TextView) findViewById(R.id.band2);
        band2btn = findViewById(R.id.band2btn);
        TextView band3 = (TextView) findViewById(R.id.band3);
        band3btn = findViewById(R.id.band3btn);
        TextView band4 = (TextView) findViewById(R.id.band4);
        band4btn = findViewById(R.id.band4btn);

        band1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //initialize the popup menu
                PopupMenu popupMenu1 = new PopupMenu(getApplicationContext(),band1btn);
                //inflate the popup menu
                popupMenu1.getMenuInflater().inflate(R.menu.popupmenu1,popupMenu1.getMenu());
                popupMenu1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            case R.id.black:
                                band1.setBackgroundColor(0xFF000000);
                                return true;
                            case R.id.brown:
                                band1.setBackgroundColor(0xFFA0522D);
                                return true;
                            case R.id.red:
                                band1.setBackgroundColor(0xFFFF0000);
                                return true;
                            case R.id.orange:
                                band1.setBackgroundColor(0xFFFF4500);
                                return true;
                            case R.id.yellow:
                                band1.setBackgroundColor(0xFFFFFF00);
                                return true;
                            case R.id.green:
                                band1.setBackgroundColor(0xFF228B22);
                                return true;
                            case R.id.blue:
                                band1.setBackgroundColor(0xFF0000FF);
                                return true;
                            case R.id.violet:
                                band1.setBackgroundColor(0xFF9400D3);
                                return true;
                            case R.id.grey:
                                band1.setBackgroundColor(0xFF808080);
                                return true;
                            case R.id.white:
                                band1.setBackgroundColor(0xFFFFFFFF);
                                return true;

                        }
                        return false;
                    }
                });

                //show the popup menu
                popupMenu1.show();
            }
        });
        band2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu1 = new PopupMenu(getApplicationContext(),band2btn);
                //inflate the popup menu
                popupMenu1.getMenuInflater().inflate(R.menu.popupmenu2,popupMenu1.getMenu());
                popupMenu1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            //set colors
                            case R.id.black:
                                band2.setBackgroundColor(0xFF000000);
                                return true;
                            case R.id.brown:
                                band2.setBackgroundColor(0xFFA0522D);
                                return true;
                            case R.id.red:
                                band2.setBackgroundColor(0xFFFF0000);
                                return true;
                            case R.id.orange:
                                band2.setBackgroundColor(0xFFFF4500);
                                return true;
                            case R.id.yellow:
                                band2.setBackgroundColor(0xFFFFFF00);
                                return true;
                            case R.id.green:
                                band2.setBackgroundColor(0xFF228B22);
                                return true;
                            case R.id.blue:
                                band2.setBackgroundColor(0xFF0000FF);
                                return true;
                            case R.id.violet:
                                band2.setBackgroundColor(0xFF9400D3);
                                return true;
                            case R.id.grey:
                                band2.setBackgroundColor(0xFF808080);
                                return true;
                            case R.id.white:
                                band2.setBackgroundColor(0xFFFFFFFF);
                                return true;

                        }
                        return false;
                    }
                });

                //show the popup menu
                popupMenu1.show();

            }
        });
        band3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu2 = new PopupMenu(getApplicationContext(),band3btn);
                //inflate the popup menu
                popupMenu2.getMenuInflater().inflate(R.menu.popupmenu2,popupMenu2.getMenu());
                popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            //set colors
                            case R.id.black:
                                band3.setBackgroundColor(0xFF000000);
                                return true;
                            case R.id.brown:
                                band3.setBackgroundColor(0xFFA0522D);
                                return true;
                            case R.id.red:
                                band3.setBackgroundColor(0xFFFF0000);
                                return true;
                            case R.id.orange:
                                band3.setBackgroundColor(0xFFFF4500);
                                return true;
                            case R.id.yellow:
                                band3.setBackgroundColor(0xFFFFFF00);
                                return true;
                            case R.id.green:
                                band3.setBackgroundColor(0xFF228B22);
                                return true;
                            case R.id.blue:
                                band3.setBackgroundColor(0xFF0000FF);
                                return true;
                            case R.id.violet:
                                band3.setBackgroundColor(0xFF9400D3);
                                return true;
                            case R.id.grey:
                                band3.setBackgroundColor(0xFF808080);
                                return true;
                            case R.id.white:
                                band3.setBackgroundColor(0xFFFFFFFF);
                                return true;
                            case R.id.gold:
                                band3.setBackgroundColor(0xFFFFD700);
                                return true;
                            case R.id.silver:
                                band3.setBackgroundColor(0xFFC0C0C0);
                                return true;


                        }
                        return false;
                    }
                });

                //show the popup menu
                popupMenu2.show();

            }
        });
        band4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu3 = new PopupMenu(getApplicationContext(),band4btn);
                //inflate the popup menu
                popupMenu3.getMenuInflater().inflate(R.menu.popupmenu3,popupMenu3.getMenu());
                popupMenu3.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors

                            case R.id.brown:
                                band4.setBackgroundColor(0xFFA0522D);
                                return true;
                            case R.id.red:
                                band4.setBackgroundColor(0xFFFF0000);
                                return true;
                            case R.id.orange:
                                band4.setBackgroundColor(0xFFFF4500);
                                return true;
                            case R.id.yellow:
                                band4.setBackgroundColor(0xFFFFFF00);
                                return true;
                            case R.id.green:
                                band4.setBackgroundColor(0xFF228B22);
                                return true;
                            case R.id.blue:
                                band4.setBackgroundColor(0xFF0000FF);
                                return true;
                            case R.id.violet:
                                band4.setBackgroundColor(0xFF9400D3);
                                return true;
                            case R.id.grey:
                                band4.setBackgroundColor(0xFF808080);
                                return true;
                            case R.id.gold:
                                band4.setBackgroundColor(0xFFFFD700);
                                return true;
                            case R.id.silver:
                                band4.setBackgroundColor(0xFFC0C0C0);
                                return true;


                        }
                        return false;
                    }
                });

                //show the popup menu
                popupMenu3.show();

            }
        });




    }
}