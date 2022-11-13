package com.example.projeto_checkinnow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.example.projeto_checkinnow.adapter.RecentsAdapter;
import com.example.projeto_checkinnow.model.RecentsData;

import java.util.ArrayList;
import java.util.List;

public class Tela_Inicial extends AppCompatActivity {

    RecyclerView recentRecycler;
    RecentsAdapter recentsAdapter;

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
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList){
        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);

        recentsAdapter = new RecentsAdapter(this,recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }

}