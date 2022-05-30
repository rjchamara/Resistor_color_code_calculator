package com.fot_uoc.resistorcolorcodecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

public class FiveBand extends AppCompatActivity {
    TextView band1of5,band2of5,band3of5,band4of5,band5of5;
    Button btn1of5,btn2of5,btn3of5,btn4of5,btn5of5,band5cal;
    double band1val,band2val,band3val,band4val,band5val,result;
    String value,unite,finalval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_band);
        //assign variable
        TextView band1of5 = (TextView) findViewById(R.id.band1of5);
        btn1of5 = findViewById(R.id.btn1of5);
        TextView band2of5 = (TextView) findViewById(R.id.band2of5);
        btn2of5 = findViewById(R.id.btn2of5);
        TextView band3of5 = (TextView) findViewById(R.id.band3of5);
        btn3of5 = findViewById(R.id.btn3of5);
        TextView band4of5 = (TextView) findViewById(R.id.band4of5);
        btn4of5 = findViewById(R.id.btn4of5);
        TextView band5of5 = (TextView) findViewById(R.id.band5of5);
        btn5of5 = findViewById(R.id.btn5of5);
        band5cal = findViewById(R.id.band5cal);
        TextView band5res = (TextView) findViewById(R.id.band5res);

        btn1of5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu1 = new PopupMenu(getApplicationContext(),btn1of5);
                //inflate the popup menu
                popupMenu1.getMenuInflater().inflate(R.menu.popupmenu1,popupMenu1.getMenu());
                popupMenu1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            case R.id.black:
                                band1of5.setBackgroundColor(0xFF000000);
                                band1val =0;
                                return true;
                            case R.id.brown:
                                band1of5.setBackgroundColor(0xFFA0522D);
                                band1val =1;
                                return true;
                            case R.id.red:
                                band1of5.setBackgroundColor(0xFFFF0000);
                                band1val =2;
                                return true;
                            case R.id.orange:
                                band1of5.setBackgroundColor(0xFFFF4500);
                                band1val =3;
                                return true;
                            case R.id.yellow:
                                band1of5.setBackgroundColor(0xFFFFFF00);
                                band1val =4;
                                return true;
                            case R.id.green:
                                band1of5.setBackgroundColor(0xFF228B22);
                                band1val =5;
                                return true;
                            case R.id.blue:
                                band1of5.setBackgroundColor(0xFF0000FF);
                                band1val =6;
                                return true;
                            case R.id.violet:
                                band1of5.setBackgroundColor(0xFF9400D3);
                                band1val =7;
                                return true;
                            case R.id.grey:
                                band1of5.setBackgroundColor(0xFF808080);
                                band1val =8;
                                return true;
                            case R.id.white:
                                band1of5.setBackgroundColor(0xFFFFFFFF);
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
        btn2of5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu1 = new PopupMenu(getApplicationContext(),btn2of5);
                //inflate the popup menu
                popupMenu1.getMenuInflater().inflate(R.menu.popupmenu2,popupMenu1.getMenu());
                popupMenu1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            //set colors
                            case R.id.black:
                                band2of5.setBackgroundColor(0xFF000000);
                                band2val =0;
                                return true;
                            case R.id.brown:
                                band2of5.setBackgroundColor(0xFFA0522D);
                                band2val =1;
                                return true;
                            case R.id.red:
                                band2of5.setBackgroundColor(0xFFFF0000);
                                band2val =2;
                                return true;
                            case R.id.orange:
                                band2of5.setBackgroundColor(0xFFFF4500);
                                band2val =3;
                                return true;
                            case R.id.yellow:
                                band2of5.setBackgroundColor(0xFFFFFF00);
                                band2val =4;
                                return true;
                            case R.id.green:
                                band2of5.setBackgroundColor(0xFF228B22);
                                band2val =5;
                                return true;
                            case R.id.blue:
                                band2of5.setBackgroundColor(0xFF0000FF);
                                band2val =6;
                                return true;
                            case R.id.violet:
                                band2of5.setBackgroundColor(0xFF9400D3);
                                band2val =7;
                                return true;
                            case R.id.grey:
                                band2of5.setBackgroundColor(0xFF808080);
                                band2val =8;
                                return true;
                            case R.id.white:
                                band2of5.setBackgroundColor(0xFFFFFFFF);
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
        btn3of5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu1 = new PopupMenu(getApplicationContext(),btn3of5);
                //inflate the popup menu
                popupMenu1.getMenuInflater().inflate(R.menu.popupmenu1,popupMenu1.getMenu());
                popupMenu1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            //set colors
                            case R.id.black:
                                band3of5.setBackgroundColor(0xFF000000);
                                band3val =0;
                                return true;
                            case R.id.brown:
                                band3of5.setBackgroundColor(0xFFA0522D);
                                band3val =1;
                                return true;
                            case R.id.red:
                                band3of5.setBackgroundColor(0xFFFF0000);
                                band3val =2;
                                return true;
                            case R.id.orange:
                                band3of5.setBackgroundColor(0xFFFF4500);
                                band3val =3;
                                return true;
                            case R.id.yellow:
                                band3of5.setBackgroundColor(0xFFFFFF00);
                                band3val =4;
                                return true;
                            case R.id.green:
                                band3of5.setBackgroundColor(0xFF228B22);
                                band3val =5;
                                return true;
                            case R.id.blue:
                                band3of5.setBackgroundColor(0xFF0000FF);
                                band3val =6;
                                return true;
                            case R.id.violet:
                                band3of5.setBackgroundColor(0xFF9400D3);
                                band3val =7;
                                return true;
                            case R.id.grey:
                                band3of5.setBackgroundColor(0xFF808080);
                                band3val =8;
                                return true;
                            case R.id.white:
                                band3of5.setBackgroundColor(0xFFFFFFFF);
                                band3val =9;
                                return true;

                        }
                        return false;
                    }
                });

                //show the popup menu
                popupMenu1.show();

            }
        });
        btn4of5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu2 = new PopupMenu(getApplicationContext(),btn4of5);
                //inflate the popup menu
                popupMenu2.getMenuInflater().inflate(R.menu.popupmenu2,popupMenu2.getMenu());
                popupMenu2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            //set colors
                            case R.id.black:
                                band4of5.setBackgroundColor(0xFF000000);
                                band4val=1;
                                unite="Ω";
                                return true;
                            case R.id.brown:
                                band4of5.setBackgroundColor(0xFFA0522D);
                                band4val=0.01;
                                unite="kΩ";
                                return true;
                            case R.id.red:
                                band4of5.setBackgroundColor(0xFFFF0000);
                                band4val=0.100;
                                unite="kΩ";
                                return true;
                            case R.id.orange:
                                band4of5.setBackgroundColor(0xFFFF4500);
                                band4val=1;
                                unite="kΩ";
                                return true;
                            case R.id.yellow:
                                band4of5.setBackgroundColor(0xFFFFFF00);
                                band4val=0.01;
                                unite="MΩ";
                                return true;
                            case R.id.green:
                                band4of5.setBackgroundColor(0xFF228B22);
                                band4val=0.1;
                                unite="MΩ";
                                return true;
                            case R.id.blue:
                                band4of5.setBackgroundColor(0xFF0000FF);
                                band4val=1;
                                unite="MΩ";
                                return true;
                            case R.id.violet:
                                band4of5.setBackgroundColor(0xFF9400D3);
                                band4val=0.01;
                                unite="GΩ";
                                return true;
                            case R.id.grey:
                                band4of5.setBackgroundColor(0xFF808080);
                                band4val=0.1;
                                unite="GΩ";
                                return true;
                            case R.id.white:
                                band4of5.setBackgroundColor(0xFFFFFFFF);
                                band4val=1;
                                unite="GΩ";
                                return true;
                            case R.id.gold:
                                band4of5.setBackgroundColor(0xFFFFD700);
                                band4val=0.1;
                                unite="Ω";
                                return true;
                            case R.id.silver:
                                band4of5.setBackgroundColor(0xFFC0C0C0);
                                band4val=0.01;
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
        btn5of5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize the popup menu
                PopupMenu popupMenu3 = new PopupMenu(getApplicationContext(),btn5of5);
                //inflate the popup menu
                popupMenu3.getMenuInflater().inflate(R.menu.popupmenu3,popupMenu3.getMenu());
                popupMenu3.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors

                            case R.id.brown:
                                band5of5.setBackgroundColor(0xFFA0522D);
                                band5val=1;
                                return true;
                            case R.id.red:
                                band5of5.setBackgroundColor(0xFFFF0000);
                                band5val=2;
                                return true;
                            case R.id.orange:
                                band5of5.setBackgroundColor(0xFFFF4500);
                                band5val=3;
                                return true;
                            case R.id.yellow:
                                band5of5.setBackgroundColor(0xFFFFFF00);
                                band5val=4;
                                return true;
                            case R.id.green:
                                band5of5.setBackgroundColor(0xFF228B22);
                                band5val=0.5;
                                return true;
                            case R.id.blue:
                                band5of5.setBackgroundColor(0xFF0000FF);
                                band5val=0.25;
                                return true;
                            case R.id.violet:
                                band5of5.setBackgroundColor(0xFF9400D3);
                                band5val=0.1;
                                return true;
                            case R.id.grey:
                                band5of5.setBackgroundColor(0xFF808080);
                                band5val=0.05;
                                return true;
                            case R.id.gold:
                                band5of5.setBackgroundColor(0xFFFFD700);
                                band5val=5;
                                return true;
                            case R.id.silver:
                                band5of5.setBackgroundColor(0xFFC0C0C0);
                                band5val=10;
                                return true;


                        }
                        return false;
                    }
                });

                //show the popup menu
                popupMenu3.show();

            }
        });
        band5cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=(((band1val*100)+(band2val*10))+band3val)*band4val;
                finalval=String.format("%.2f",result);
                value = finalval+unite+" ± "+band5val+"%";

                band5res.setText(value);

            }
        });

    }
}