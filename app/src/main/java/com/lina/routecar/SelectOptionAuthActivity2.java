package com.lina.routecar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class SelectOptionAuthActivity2 extends AppCompatActivity {

    Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_auth2);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Selecciona Opción");
        //para ayadir el boton de ir hacia atras
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}