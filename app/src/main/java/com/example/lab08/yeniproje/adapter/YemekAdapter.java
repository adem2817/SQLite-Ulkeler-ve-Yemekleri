package com.example.lab08.yeniproje.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lab08.yeniproje.R;
import com.example.lab08.yeniproje.model.Yemek;

import java.util.List;

public class YemekAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private List<Yemek> yemekler;


    public YemekAdapter(Activity activity, List<Yemek> yemekler) { //layout inflater ı activity den alırız
        this.layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.yemekler = yemekler;
    }

    @Override
    public int getCount() {
        return yemekler.size();
    }

    @Override
    public Object getItem(int position) {
        return yemekler.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View satirView;

        satirView = layoutInflater.inflate(R.layout.row_item_yemek,null);

        Yemek yemekNesnesi = yemekler.get(position);


        TextView textYemekAdi = satirView.findViewById(R.id.text_yemek);
        TextView textKategori = satirView.findViewById(R.id.text_kategori);

        textKategori.setText(yemekNesnesi.getKategori());
        textYemekAdi.setText(yemekNesnesi.getYemek_Adi());


        return satirView;
    }


}
