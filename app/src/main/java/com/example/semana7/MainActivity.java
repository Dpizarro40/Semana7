package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nombreFoto;
    EditText editNombre;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreFoto = findViewById(R.id.txtNombre);
        boton = findViewById(R.id.btnAceptar);

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent sIntent = new Intent(MainActivity.this, AResultado.class);
                String nombreFotoParametro = nombreFoto.getText().toString();

                sIntent.putExtra("nombreFoto", nombreFotoParametro);
                startActivity(sIntent);
            }
        });
    }
}