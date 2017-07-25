package com.example.sherif.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by sherif on 20/07/17.
 */

public class MapSpinner extends AppCompatActivity implements OnMapReadyCallback {
    Spinner spinner;
    private GoogleMap map;

    String[] location = {"Makkah ", "Egypt", "Malaysia", "Germany"};

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.map_spinner);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, location);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), "You have Selected " + location[i], Toast.LENGTH_SHORT).show();

                LatLng def = new LatLng(21.4231965,39.8237068);
                LatLng a = new LatLng(30.0594698,31.188252);
                LatLng b = new LatLng(2.7364121,101.7015316);
                LatLng c = new LatLng(52.5072094,13.1452763);

                switch (i){
                     case 0 :
                         changeMarker(location[0], def);
                         break;
                     case 1:
                         changeMarker(location[1], a);
                         break;
                    case 2:
                        changeMarker(location[2], b);
                        break;
                    case 3:
                        changeMarker(location[3], c);
                        break;
                    default:onMapReady(map);



                 }






                }





            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }


        });

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng def = new LatLng(21.4231965,39.8237068);
        map.addMarker(new MarkerOptions().position(def).title("Makkah"));
        map.moveCamera(CameraUpdateFactory.newLatLng(def));


        }
        public void changeMarker (String location, LatLng latLng){
            GoogleMap Googlemap = map;
            map.clear();
            MarkerOptions a = new MarkerOptions().position(latLng).title("Travel to " + location);
            Marker myMarker = Googlemap.addMarker(a);
            myMarker.setPosition(latLng);
            Googlemap.moveCamera(CameraUpdateFactory.newLatLng(latLng));


        }


        }

