package com.example.projeto_checkinnow.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto_checkinnow.DetailActivity;
import com.example.projeto_checkinnow.R;
import com.example.projeto_checkinnow.model.TopPlacesData;

import java.util.List;

public class TopPlacesAdapter extends RecyclerView.Adapter<TopPlacesAdapter.TopPlacesViewHolder> {
    Context context;
    List<TopPlacesData>topPlacesDataList;

    public TopPlacesAdapter(Context context, List<TopPlacesData> topPlacesDataList) {
        this.context = context;
        this.topPlacesDataList = topPlacesDataList;
    }

    @NonNull
    @Override
    public TopPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_places_row_item,parent,false);
        return new TopPlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPlacesViewHolder holder, int position) {
        holder.hotelName.setText(topPlacesDataList.get(position).getHotelName());
        holder.hotelDesc.setText(topPlacesDataList.get(position).getHotelDesc());
        holder.hotelPrice.setText(topPlacesDataList.get(position).getHotelPrice());
        holder.hotelImage.setImageResource(topPlacesDataList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailActivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return topPlacesDataList.size();
    }

    public static final class TopPlacesViewHolder extends RecyclerView.ViewHolder{

        ImageView hotelImage;
        TextView hotelName,hotelDesc,hotelPrice;

        public TopPlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            hotelImage = itemView.findViewById(R.id.hotelImage);
            hotelName = itemView.findViewById(R.id.hotelName);
            hotelDesc = itemView.findViewById(R.id.hotelDesc);
            hotelPrice = itemView.findViewById(R.id.hotelPrice);

        }
    }

}
