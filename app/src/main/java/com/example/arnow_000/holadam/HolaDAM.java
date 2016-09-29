package com.example.arnow_000.holadam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HolaDAM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_hola_dam);
        TextView nuevoTexto = new TextView(this);
        nuevoTexto.setText("Hola DAM desde XML");
        setContentView(nuevoTexto);
    }
}
