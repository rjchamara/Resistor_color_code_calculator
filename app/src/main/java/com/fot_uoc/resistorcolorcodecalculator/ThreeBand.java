package com.fot_uoc.resistorcolorcodecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

public class ThreeBand extends AppCompatActivity {
    //initialize variable
    TextView band1of3,band2of3,band3of3;
    Button btn1of3,btn2of3,btn3of3,band3cal;
    double band1val,band2val,band3val,result;
    String value,unite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_band);

        //assign variable
        TextView band1of3 = (TextView) findViewById(R.id.band1of3);
        btn1of3 = findViewById(R.id.btn1of3);
        TextView band2of3 = (TextView) findViewById(R.id.band2of3);
        btn2of3 = findViewById(R.id.btn2of3);
        TextView band3of3 = (TextView) findViewById(R.id.band3of3);
        btn3of3 = findViewById(R.id.btn3of3);

        band3cal = findViewById(R.id.band3cal);
        TextView band3res = (TextView) findViewById(R.id.band3res);

        btn1of3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu1 = new PopupMenu(getApplicationContext(),btn1of3);
                //inflate the popup menu
                popupMenu1.getMenuInflater().inflate(R.menu.popupmenu1,popupMenu1.getMenu());
                popupMenu1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            case R.id.black:
                                band1of3.setBackgroundColor(0xFF000000);
                                band1val =0;
                                return true;
                            case R.id.brown:
                                band1of3.setBackgroundColor(0xFFA0522D);
                                band1val =1;
                                return true;
                            case R.id.red:
                                band1of3.setBackgroundColor(0xFFFF0000);
                                band1val =2;
                                return true;
                            case R.id.orange:
                                band1of3.setBackgroundColor(0xFFFF4500);
                                band1val =3;
                                return true;
                            case R.id.yellow:
                                band1of3.setBackgroundColor(0xFFFFFF00);
                                band1val =4;
                                return true;
                            case R.id.green:
                                band1of3.setBackgroundColor(0xFF228B22);
                                band1val =5;
                                return true;
                            case R.id.blue:
                                band1of3.setBackgroundColor(0xFF0000FF);
                                band1val =6;
                                return true;
                            case R.id.violet:
                                band1of3.setBackgroundColor(0xFF9400D3);
                                band1val =7;
                                return true;
                            case R.id.grey:
                                band1of3.setBackgroundColor(0xFF808080);
                                band1val =8;
                                return true;
                            case R.id.white:
                                band1of3.setBackgroundColor(0xFFFFFFFF);
                                band1val =9;
                                return true;

                        }
                        return false;
                    }
                });

                //show the popup menu
                popupMenu1.show();
            }
        });
        btn2of3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu1 = new PopupMenu(getApplicationContext(),btn2of3);
                //inflate the popup menu
                popupMenu1.getMenuInflater().inflate(R.menu.popupmenu2,popupMenu1.getMenu());
                popupMenu1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            //set colors
                            case R.id.black:
                                band2of3.setBackgroundColor(0xFF000000);
                                band2val =0;
                                return true;
                            case R.id.brown:
                                band2of3.setBackgroundColor(0xFFA0522D);
                                band2val =1;
                                return true;
                            case R.id.red:
                                band2of3.setBackgroundColor(0xFFFF0000);
                                band2val =2;
                                return true;
                            case R.id.orange:
                                band2of3.setBackgroundColor(0xFFFF4500);
                                band2val =3;
                                return true;
                            case R.id.yellow:
                                band2of3.setBackgroundColor(0xFFFFFF00);
                                band2val =4;
                                return true;
                            case R.id.green:
                                band2of3.setBackgroundColor(0xFF228B22);
                                band2val =5;
                                return true;
                            case R.id.blue:
                                band2of3.setBackgroundColor(0xFF0000FF);
                                band2val =6;
                                return true;
                            case R.id.violet:
                                band2of3.setBackgroundColor(0xFF9400D3);
                                band2val =7;
                                return true;
                            case R.id.grey:
                                band2of3.setBackgroundColor(0xFF808080);
                                band2val =8;
                                return true;
                            case R.id.white:
                                band2of3.setBackgroundColor(0xFFFFFFFF);
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
        btn3of3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu2 = new PopupMenu(getApplicationContext(),btn3of3);
                //inflate the popup menu
                popupMenu2.getMenuInflater().inflate(R.menu.popupmenu2,popupMenu2.getMenu());
                popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            //set colors
                            case R.id.black:
                                band3of3.setBackgroundColor(0xFF000000);
                                band3val=1;
                                unite="Ω";
                                return true;
                            case R.id.brown:
                                band3of3.setBackgroundColor(0xFFA0522D);
                                band3val=10;
                                unite="Ω";
                                return true;
                            case R.id.red:
                                band3of3.setBackgroundColor(0xFFFF0000);
                                band3val=0.1;
                                unite="kΩ";
                                return true;
                            case R.id.orange:
                                band3of3.setBackgroundColor(0xFFFF4500);
                                band3val=1;
                                unite="kΩ";
                                return true;
                            case R.id.yellow:
                                band3of3.setBackgroundColor(0xFFFFFF00);
                                band3val=10;
                                unite="kΩ";
                                return true;
                            case R.id.green:
                                band3of3.setBackgroundColor(0xFF228B22);
                                band3val=0.1;
                                unite="MΩ";
                                return true;
                            case R.id.blue:
                                band3of3.setBackgroundColor(0xFF0000FF);
                                band3val=1;
                                unite="MΩ";
                                return true;
                            case R.id.violet:
                                band3of3.setBackgroundColor(0xFF9400D3);
                                band3val=10;
                                unite="MΩ";
                                return true;
                            case R.id.grey:
                                band3of3.setBackgroundColor(0xFF808080);
                                band3val=0.1;
                                unite="GΩ";
                                return true;
                            case R.id.white:
                                band3of3.setBackgroundColor(0xFFFFFFFF);
                                band3val=1;
                                unite="GΩ";
                                return true;
                            case R.id.gold:
                                band3of3.setBackgroundColor(0xFFFFD700);
                                band3val=0.1;
                                unite="Ω";
                                return true;
                            case R.id.silver:
                                band3of3.setBackgroundColor(0xFFC0C0C0);
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
        band3cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result= ((band1val*10)+band2val)*band3val;
                value = result+unite+" ± "+"20%";
                band3res.setText(value);

            }
        });

    }
}