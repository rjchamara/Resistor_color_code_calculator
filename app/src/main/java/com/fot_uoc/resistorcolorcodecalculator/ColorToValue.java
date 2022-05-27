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
    TextView band1;
    Button band1btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_to_value);

        //assign variable
        TextView band1 = (TextView) findViewById(R.id.band1);
        band1btn = findViewById(R.id.band1btn);

        band1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //initialize the popup menu
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),band1btn);
                //inflate the popup menu
                popupMenu.getMenuInflater().inflate(R.menu.popupmenu1,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            //set colors
                            case R.id.none:
                                band1.setBackgroundColor(Color.TRANSPARENT);
                                return true;
                            case R.id.black:
                                band1.setBackgroundColor(Color.BLACK);
                                return true;


                        }
                        return false;
                    }
                });
                //show the popup menu
                popupMenu.show();
            }
        });




    }
}