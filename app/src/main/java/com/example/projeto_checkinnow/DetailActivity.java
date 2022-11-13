package com.example.projeto_checkinnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        back = (ImageView) findViewById(R.id.img_return);
    }

    public void telaInicial(View view){
        Intent telaInicial = new Intent(this,Tela_Inicial.class);
        startActivity(telaInicial);
    }

}