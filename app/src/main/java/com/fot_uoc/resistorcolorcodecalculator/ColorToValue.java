package com.fot_uoc.resistorcolorcodecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
    Button band1btn,band2btn,band3btn,band4btn,cal;
    double band1val,band2val,band3val,band4val,result;
    String value,unite,finalval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_to_value);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));

        //assign variable
        TextView band1 = (TextView) findViewById(R.id.band1);
        band1btn = findViewById(R.id.band1btn);
        TextView band2 = (TextView) findViewById(R.id.band2);
        band2btn = findViewById(R.id.band2btn);
        TextView band3 = (TextView) findViewById(R.id.band3);
        band3btn = findViewById(R.id.band3btn);
        TextView band4 = (TextView) findViewById(R.id.band4);
        band4btn = findViewById(R.id.band4btn);
        cal = findViewById(R.id.cal);
        TextView resistance = (TextView) findViewById(R.id.resistance);

        band1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //initialize the popup menu
                PopupMenu popupMenu5 = new PopupMenu(getApplicationContext(),band1btn);
                //inflate the popup menu
                popupMenu5.getMenuInflater().inflate(R.menu.popupmenu5,popupMenu5.getMenu());
                popupMenu5.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors

                            case R.id.brown:
                                band1.setBackgroundColor(0xFFA0522D);
                                band1val =1;
                                return true;
                            case R.id.red:
                                band1.setBackgroundColor(0xFFFF0000);
                                band1val =2;
                                return true;
                            case R.id.orange:
                                band1.setBackgroundColor(0xFFFF4500);
                                band1val =3;
                                return true;
                            case R.id.yellow:
                                band1.setBackgroundColor(0xFFFFFF00);
                                band1val =4;
                                return true;
                            case R.id.green:
                                band1.setBackgroundColor(0xFF228B22);
                                band1val =5;
                                return true;
                            case R.id.blue:
                                band1.setBackgroundColor(0xFF0000FF);
                                band1val =6;
                                return true;
                            case R.id.violet:
                                band1.setBackgroundColor(0xFF9400D3);
                                band1val =7;
                                return true;
                            case R.id.grey:
                                band1.setBackgroundColor(0xFF808080);
                                band1val =8;
                                return true;
                            case R.id.white:
                                band1.setBackgroundColor(0xFFFFFFFF);
                                band1val =9;
                                return true;

                        }
                        return false;
                    }
                });

                //show the popup menu
                popupMenu5.show();
            }
        });
        band2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu1 = new PopupMenu(getApplicationContext(),band2btn);
                //inflate the popup menu
                popupMenu1.getMenuInflater().inflate(R.menu.popupmenu1,popupMenu1.getMenu());
                popupMenu1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            //set colors
                            case R.id.black:
                                band2.setBackgroundColor(0xFF000000);
                                band2val =0;
                                return true;
                            case R.id.brown:
                                band2.setBackgroundColor(0xFFA0522D);
                                band2val =1;
                                return true;
                            case R.id.red:
                                band2.setBackgroundColor(0xFFFF0000);
                                band2val =2;
                                return true;
                            case R.id.orange:
                                band2.setBackgroundColor(0xFFFF4500);
                                band2val =3;
                                return true;
                            case R.id.yellow:
                                band2.setBackgroundColor(0xFFFFFF00);
                                band2val =4;
                                return true;
                            case R.id.green:
                                band2.setBackgroundColor(0xFF228B22);
                                band2val =5;
                                return true;
                            case R.id.blue:
                                band2.setBackgroundColor(0xFF0000FF);
                                band2val =6;
                                return true;
                            case R.id.violet:
                                band2.setBackgroundColor(0xFF9400D3);
                                band2val =7;
                                return true;
                            case R.id.grey:
                                band2.setBackgroundColor(0xFF808080);
                                band2val =8;
                                return true;
                            case R.id.white:
                                band2.setBackgroundColor(0xFFFFFFFF);
                                band2val =9;
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
                                band3val=1;
                                unite="Ω";
                                return true;
                            case R.id.brown:
                                band3.setBackgroundColor(0xFFA0522D);
                                band3val=10;
                                unite="Ω";
                                return true;
                            case R.id.red:
                                band3.setBackgroundColor(0xFFFF0000);
                                band3val=0.1;
                                unite="kΩ";
                                return true;
                            case R.id.orange:
                                band3.setBackgroundColor(0xFFFF4500);
                                band3val=1;
                                unite="kΩ";
                                return true;
                            case R.id.yellow:
                                band3.setBackgroundColor(0xFFFFFF00);
                                band3val=10;
                                unite="kΩ";
                                return true;
                            case R.id.green:
                                band3.setBackgroundColor(0xFF228B22);
                                band3val=0.1;
                                unite="MΩ";
                                return true;
                            case R.id.blue:
                                band3.setBackgroundColor(0xFF0000FF);
                                band3val=1;
                                unite="MΩ";
                                return true;
                            case R.id.violet:
                                band3.setBackgroundColor(0xFF9400D3);
                                band3val=10;
                                unite="MΩ";
                                return true;
                            case R.id.grey:
                                band3.setBackgroundColor(0xFF808080);
                                band3val=0.1;
                                unite="GΩ";
                                return true;
                            case R.id.white:
                                band3.setBackgroundColor(0xFFFFFFFF);
                                band3val=1;
                                unite="GΩ";
                                return true;
                            case R.id.gold:
                                band3.setBackgroundColor(0xFFFFD700);
                                band3val=0.1;
                                unite="Ω";
                                return true;
                            case R.id.silver:
                                band3.setBackgroundColor(0xFFC0C0C0);
                                band3val=0.01;
                                unite="Ω";
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
                                band4val=1;
                                return true;
                            case R.id.red:
                                band4.setBackgroundColor(0xFFFF0000);
                                band4val=2;
                                return true;
                            case R.id.orange:
                                band4.setBackgroundColor(0xFFFF4500);
                                band4val=3;
                                return true;
                            case R.id.yellow:
                                band4.setBackgroundColor(0xFFFFFF00);
                                band4val=4;
                                return true;
                            case R.id.green:
                                band4.setBackgroundColor(0xFF228B22);
                                band4val=0.5;
                                return true;
                            case R.id.blue:
                                band4.setBackgroundColor(0xFF0000FF);
                                band4val=0.25;
                                return true;
                            case R.id.violet:
                                band4.setBackgroundColor(0xFF9400D3);
                                band4val=0.1;
                                return true;
                            case R.id.grey:
                                band4.setBackgroundColor(0xFF808080);
                                band4val=0.05;
                                return true;
                            case R.id.gold:
                                band4.setBackgroundColor(0xFFFFD700);
                                band4val=5;
                                return true;
                            case R.id.silver:
                                band4.setBackgroundColor(0xFFC0C0C0);
                                band4val=10;
                                return true;


                        }
                        return false;
                    }
                });

                //show the popup menu
                popupMenu3.show();

            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result= ((band1val*10)+band2val)*band3val;
                finalval=String.format("%.2f",result);
                value = finalval+unite+" ± "+band4val+"%";
                resistance.setText(value);

            }
        });






    }
}