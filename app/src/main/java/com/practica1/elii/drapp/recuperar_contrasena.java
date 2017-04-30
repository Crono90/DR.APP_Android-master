package com.practica1.elii.drapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class recuperar_contrasena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_contrasena);
    }

    public void Aceptar(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Confirmar")
                .setMessage("¿Sus Datos son correctos?")
                .setNegativeButton("Cancelar", null)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Aceptar();


                    }
                }).create().show();

    }

    public void Aceptar() {
        Intent explicit_intent;
        explicit_intent = new Intent(this, Inicio.class);
        startActivity(explicit_intent);


    }
}

