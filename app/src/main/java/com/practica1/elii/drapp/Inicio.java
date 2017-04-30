package com.practica1.elii.drapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Inicio extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        Button boton = (Button) findViewById(R.id.boton1);
        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String usuario = ((EditText) findViewById(R.id.txtcorreo)).getText().toString();
                String contraseña = ((EditText) findViewById(R.id.txtcontraseña)).getText().toString();
                //if (usuario.equals("elizabeth@hotmail.com") && contraseña.equals("admin")){
                    Intent nuevoform = new Intent(Inicio.this, menu2.class);
                    startActivity(nuevoform);
                //}
               // else{
                 //   Toast.makeText(getApplicationContext(), "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
               // }
            }
        });


    }

    public void Registar (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, registrar.class);
        startActivity(explicit_intent);
    }

    public void Contraseña (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, recuperar_contrasena.class);
        startActivity(explicit_intent);
    }

}
