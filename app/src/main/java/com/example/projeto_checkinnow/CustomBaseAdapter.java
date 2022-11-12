package com.example.projeto_checkinnow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String listaHotel[];
    String descHotel[];
    int imagemHotel[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String [] listaHotel, String [] descHotel, int [] images){
    this.context=ctx;
    this.listaHotel=listaHotel;
    this.descHotel=descHotel;
    this.imagemHotel=images;
    inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {

        return listaHotel.length;

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view,null);
        TextView textView=(TextView) convertView.findViewById(R.id.textView);
        TextView descView=(TextView) convertView.findViewById(R.id.text_desc);
        ImageView hotelImage = (ImageView) convertView.findViewById(R.id.imageHotel);
        textView.setText(listaHotel[i]);
        descView.setText(descHotel[i]);
        hotelImage.setImageResource(imagemHotel[i]);
        return convertView;
    }
}
