package com.example.sherif.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by sherif on 19/07/17.
 */

public class TextSpinner extends AppCompatActivity {
    Spinner spinner;

    String[] names = {"Sherif", "Bebo","Salem", "Ahmad", "Boshra"};


    @Override
    protected void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.text_spinner);
        spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,names);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                TextView textView =(TextView)findViewById(R.id.textView3);
                textView.setText(names[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }

}
