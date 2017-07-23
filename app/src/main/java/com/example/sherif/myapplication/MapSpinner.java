package com.example.sherif.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by sherif on 20/07/17.
 */

public class MapSpinner extends AppCompatActivity {
    Spinner spinner;
    String[] location = {" ","Egypt", "Malaysia", "Germany"};
    @Override
    protected void onCreate (Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.map_spinner);



        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,location);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {



                Toast.makeText(getApplicationContext(),"You have Selected "+ location[i],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
