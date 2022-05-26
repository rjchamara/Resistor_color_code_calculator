package com.fot_uoc.resistorcolorcodecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class ColorToValue extends AppCompatActivity {
    String[] colors = {"Black","Brown"};
    AutoCompleteTextView band01;
    ArrayAdapter<String> adaptercolors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_to_value);

        band01= findViewById(R.id.band1);
        adaptercolors= new ArrayAdapter<String>(this,R.layout.bands,colors);
        band01.setAdapter(adaptercolors);
        band01.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "color: "+item, Toast.LENGTH_SHORT).show();

            }
        });

    }
}