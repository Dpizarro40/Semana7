package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AResultado extends AppCompatActivity {
    TextView textViewNombrefoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aresultado);

        textViewNombrefoto = findViewById(R.id.textViewNombre);
        Intent sIntent = getIntent();

        String nombre = sIntent.getExtras().getString("nombreFoto");
        textViewNombrefoto.setText(nombre);
    }
}