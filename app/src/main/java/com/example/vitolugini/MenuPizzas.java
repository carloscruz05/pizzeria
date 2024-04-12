package com.example.vitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuPizzas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pizzas);
    }

    public void Pepperini(View view) {
        Intent pepperoni = new Intent(this, PepperoniCompra.class);
        startActivity(pepperoni);
    }

    public void Hawaiana(View view) {
        Intent hawaiana = new Intent(this, HawaianaCompra.class);
        startActivity(hawaiana);
    }

    public void Pastor(View view) {
        Intent pastor = new Intent(this, PastorCompra.class);
        startActivity(pastor);
    }

    public void RegresarMenu(View view) {
        Intent anterior = new Intent(this, MenuPB.class);
        startActivity(anterior);
    }
}