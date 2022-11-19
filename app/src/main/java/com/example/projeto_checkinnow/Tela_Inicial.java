package com.example.projeto_checkinnow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.projeto_checkinnow.adapter.RecentsAdapter;
import com.example.projeto_checkinnow.adapter.TopPlacesAdapter;
import com.example.projeto_checkinnow.model.RecentsData;
import com.example.projeto_checkinnow.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class Tela_Inicial extends AppCompatActivity {

    RecyclerView recentRecycler,topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Ibis Budget São Paulo - Barra Funda","Preço para 1 diária, 1 adulto:","R$600",R.drawable.hotel_ibspbf));
        recentsDataList.add(new RecentsData("Ibis Budget São Paulo - Congonhas","Preço para 1 diária, 1 adulto:","R$500",R.drawable.hotel_ibspc));
        recentsDataList.add(new RecentsData("Ibis Budget São Paulo - Ibirapuera","Preço para 1 diária, 1 adulto:","R$550",R.drawable.hotel_ibspi));
        recentsDataList.add(new RecentsData("Ibis Budget São Paulo - Jardins","Preço para 1 diária, 1 adulto:","R$650",R.drawable.hotel_ibspj));
        recentsDataList.add(new RecentsData("Ibis Budget São Paulo - Morumbi","Preço para 1 diária, 1 adulto:","R$700",R.drawable.hotel_ibspm));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Ibis Budget São Paulo - Morumbi","Preço para 1 diária, 1 adulto:","R$700",R.drawable.hotel_ibspm));
        topPlacesDataList.add(new TopPlacesData("Ibis Budget São Paulo - Barra Funda","Preço para 1 diária, 1 adulto:","R$600",R.drawable.hotel_ibspbf));
        topPlacesDataList.add(new TopPlacesData("Ibis Budget São Paulo - Ibirapuera","Preço para 1 diária, 1 adulto:","R$550",R.drawable.hotel_ibspi));
        topPlacesDataList.add(new TopPlacesData("Ibis Budget São Paulo - Congonhas","Preço para 1 diária, 1 adulto:","R$500",R.drawable.hotel_ibspc));
        topPlacesDataList.add(new TopPlacesData("Ibis Budget São Paulo - Jardins","Preço para 1 diária, 1 adulto:","R$650",R.drawable.hotel_ibspj));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList){
        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);

        recentsAdapter = new RecentsAdapter(this,recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){
        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        topPlacesRecycler.setLayoutManager(layoutManager);

        topPlacesAdapter = new TopPlacesAdapter(this,topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);
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