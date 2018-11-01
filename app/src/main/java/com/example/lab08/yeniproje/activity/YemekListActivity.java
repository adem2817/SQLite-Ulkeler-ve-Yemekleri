package com.example.lab08.yeniproje.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.example.lab08.yeniproje.R;

public class YemekListActivity extends AppCompatActivity {


    public ListView listYemekler;
    public Button geriButon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_list);

        listYemekler = findViewById(R.id.listview_yemekler);
        geriButon = findViewById(R.id.btn_geri2);
    }
}
