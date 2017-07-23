package com.example.sherif.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showPopup(final View view) {

        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater menuInflater = popup.getMenuInflater();
        menuInflater.inflate(R.menu.popup_menu, popup.getMenu());
        popup.show();
            }

public void textSpinner (MenuItem item){
        Toast.makeText(getApplicationContext(),"go to Text Spinner",Toast.LENGTH_SHORT).show();
    Intent intent1 = new Intent(this, TextSpinner.class);
   MainActivity.this.startActivity(intent1);

    }

    public void mapSpinner(MenuItem item) {
        Toast.makeText(getApplicationContext(),"Go to Map Spinner",Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(this, MapSpinner.class);
        MainActivity.this.startActivity(intent1);



    }
}
