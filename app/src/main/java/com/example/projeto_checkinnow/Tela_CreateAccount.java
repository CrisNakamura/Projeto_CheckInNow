package com.example.projeto_checkinnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela_CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_create_account);
    }
    public void telaInicial(View view){
        Intent telaInicial = new Intent(this,Tela_Inicial.class);
        startActivity(telaInicial);
    }

    public void telaLogin(View view){
        Intent telaLogin = new Intent(this,MainActivity.class);
        startActivity(telaLogin);
    }
}