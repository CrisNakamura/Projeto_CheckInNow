package com.example.projeto_checkinnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaInicial(View view){
     Intent telaInicial = new Intent(this,Tela_Inicial.class);
     startActivity(telaInicial);
    }

    public void telaCriarConta(View view){
        Intent telaCriarConta = new Intent(this,Tela_CreateAccount.class);
        startActivity(telaCriarConta);
    }
}