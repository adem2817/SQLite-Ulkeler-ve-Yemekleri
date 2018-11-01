package com.example.lab08.yeniproje.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.lab08.yeniproje.R;
import com.example.lab08.yeniproje.model.Ulke;

import java.util.List;

public class UlkeAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private List<Ulke> ulkeler;

    public UlkeAdapter(Activity activity, List<Ulke> ulkeler) {
        this.layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.ulkeler = ulkeler;
    }

    @Override
    public int getCount() {
        return ulkeler.size();
    }

    @Override
    public Object getItem(int position) {
        return ulkeler.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView = layoutInflater.inflate(R.layout.row_item_ulke,null);

        Ulke ulkeNesnesi = ulkeler.get(position);


        TextView textUlkeAdi = satirView.findViewById(R.id.text_ulke);


        textUlkeAdi.setText(ulkeNesnesi.getUlke_Adi());



        return satirView;
    }
}
