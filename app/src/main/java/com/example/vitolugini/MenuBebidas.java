package com.example.vitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuBebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bebidas);
    }

    public void Regresarmenu(View view){
        Intent regresarmenu=new Intent(this, MenuPB.class);
        startActivity(regresarmenu);
    }
    public void CocaCola(View view){
        Intent cocacola=new Intent(this, CocaColaCompra.class);
        startActivity(cocacola);
    }
    public void Cerveza(View view){
        Intent cerveza=new Intent(this, CervezaCompra.class);
        startActivity(cerveza);
    }
    public void Jugo(View view){
        Intent jugo=new Intent(this, JugoCompra.class);
        startActivity(jugo);
    }
}