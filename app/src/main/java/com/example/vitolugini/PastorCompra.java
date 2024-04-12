package com.example.vitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PastorCompra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastor_compra);
    }

    public void RegresarMenu(View view) {
        Intent anterior = new Intent(this, MenuPizzas.class);
        startActivity(anterior);
    }
}