package com.example.vitolugini;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import android.widget.TextView;

public class MenuPB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pb);


        String usuario = getIntent().getStringExtra("usuario");

        TextView textViewUsuario = findViewById(R.id.textViewUsuario);
        textViewUsuario.setText("¡Bienvenido, " + usuario + "!");
    }


    public void Pizzas(View view){
        Intent pizzas=new Intent(this, MenuPizzas.class);
        startActivity(pizzas);
    }
    public void Bebidas(View view){
        Intent bebidas=new Intent(this, MenuBebidas.class);
        startActivity(bebidas);
    }

    public void Anterior(View view){
        Intent anterior=new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

}