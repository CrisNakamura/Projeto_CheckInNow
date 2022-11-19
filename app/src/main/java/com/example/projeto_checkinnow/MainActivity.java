package com.example.projeto_checkinnow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaCriarConta(View view){
        Intent telaCriarConta = new Intent(this,Tela_CreateAccount.class);
        startActivity(telaCriarConta);
    }

    public void telaInicial(View view) {

        EditText username = (EditText) findViewById(R.id.edtxt_user);
        EditText password = (EditText) findViewById(R.id.editTextTextPassword);

        if (username.getText().toString().equals("user") && password.getText().toString().equals("12345")) {
            Intent telaInicial = new Intent(this, Tela_Inicial.class);
            startActivity(telaInicial);
        } else {
            AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
            dialogo.setTitle("Erro!");
            dialogo.setMessage("Efetuar Login!");
            dialogo.setNeutralButton("OK", null);
            dialogo.show();
        }
    }
}
