package com.example.projeto_checkinnow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class Tela_Inicial extends AppCompatActivity {

    String listaHotel[]={"Ibis Budget São Paulo Barra Funda","Ibis Budget São Paulo Congonhas",
    "Ibis Budget São Paulo Ibirapuera","Ibis Budget São Paulo Jardins", "Ibis Budget São Paulo Morumbi"};

    int imagemHotel[]={R.drawable.hotel_ibspbf,R.drawable.hotel_ibspc,
            R.drawable.hotel_ibspi,R.drawable.hotel_ibspj,R.drawable.hotel_ibspm};

    String descHotel[]={"Preço para 1 diária, 1 adulto: R$600","Preço para 1 diária, 1 adulto: R$800","Preço para 1 diária, 2 adultos: R$1200",
            "Preço para 1 diária, 2 adultos: R$1100","Preço para 1 diária, 2 adultos: R$1147"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),listaHotel,descHotel,imagemHotel);
        listView.setAdapter(customBaseAdapter);

    }
}