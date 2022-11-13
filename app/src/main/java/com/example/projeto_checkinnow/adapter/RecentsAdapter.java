package com.example.projeto_checkinnow.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto_checkinnow.R;
import com.example.projeto_checkinnow.model.RecentsData;

import java.util.List;

public class RecentsAdapter extends RecyclerView.Adapter<RecentsAdapter.RecentsViewHolder> {
Context context;
List<RecentsData>recentDataList;

    public RecentsAdapter(Context context, List<RecentsData> recentDataList) {
        this.context = context;
        this.recentDataList = recentDataList;
    }

    @NonNull
    @Override
    public RecentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recents_row_item,parent,false);
        return new RecentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentsViewHolder holder, int position) {
        holder.hotelName.setText(recentDataList.get(position).getHotelName());
        holder.hotelDesc.setText(recentDataList.get(position).getHotelDesc());
        holder.hotelPrice.setText(recentDataList.get(position).getHotelPrice());
        holder.hotelImage.setImageResource(recentDataList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return recentDataList.size();
    }

    public static final class RecentsViewHolder extends RecyclerView.ViewHolder{

        ImageView hotelImage;
        TextView hotelName,hotelDesc,hotelPrice;

        public RecentsViewHolder(@NonNull View itemView) {
            super(itemView);
            hotelImage = itemView.findViewById(R.id.hotelImage);
            hotelName = itemView.findViewById(R.id.hotelName);
            hotelDesc = itemView.findViewById(R.id.hotelDesc);
            hotelPrice = itemView.findViewById(R.id.hotelPrice);

        }
    }

}
