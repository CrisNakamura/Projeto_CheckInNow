package com.example.projeto_checkinnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela_Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_chat);
    }

    public void telaInicial(View view){
        Intent telaInicial = new Intent(this,Tela_Inicial.class);
        startActivity(telaInicial);
    }

    public void telaChat(View view){
        Intent telaChat = new Intent(this,Tela_Chat.class);
        startActivity(telaChat);
    }

    public void telaReserva(View view){
        Intent telaReserva = new Intent(this,Tela_Reserva.class);
        startActivity(telaReserva);
    }
}