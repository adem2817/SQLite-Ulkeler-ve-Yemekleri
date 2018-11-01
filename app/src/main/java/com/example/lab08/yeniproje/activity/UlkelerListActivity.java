package com.example.lab08.yeniproje.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.example.lab08.yeniproje.R;

public class UlkelerListActivity extends AppCompatActivity {


    public ListView listUlkeler;
    public Button geriButon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulkeler_list);

        listUlkeler = findViewById(R.id.listview_ulkeler);
        geriButon = findViewById(R.id.btn_geri);
    }
}
