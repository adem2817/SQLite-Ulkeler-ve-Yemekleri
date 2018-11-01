 package com.example.lab08.yeniproje.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lab08.yeniproje.R;
import com.example.lab08.yeniproje.Veritabani;
import com.example.lab08.yeniproje.adapter.UlkeAdapter;
import com.example.lab08.yeniproje.adapter.YemekAdapter;
import com.example.lab08.yeniproje.model.Ulke;
import com.example.lab08.yeniproje.model.Yemek;

import java.util.List;

 public class MainActivity extends AppCompatActivity {


     public ListView liste;
     public Button ulkeButon;
     public TextView text;
     Veritabani vt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liste = findViewById(R.id.liste);
        ulkeButon = findViewById(R.id.ulke_buton);
        text = findViewById(R.id.text);

        vt = new Veritabani(getApplicationContext());
        Ulke tr = new Ulke("Turkiye");
        Ulke ar = new Ulke("Arabistan");
        Ulke me = new Ulke("Meksika");
        Ulke it = new Ulke("italya");

        vt.ulkeEkle(tr);
        vt.ulkeEkle(ar);
        vt.ulkeEkle(me);
        vt.ulkeEkle(it);

        Yemek yemek1 = new Yemek("Kuru Fasulye","Sulu Yemek","soğan,salça,fasulye",vt.ulkeGetir("Turkiye"));
        Yemek yemek2 = new Yemek("Kuru Fasulye","Sulu Yemek","soğan,salça,fasulye",vt.ulkeGetir("Turkiye"));
        Yemek yemek3 = new Yemek("Kuru Fasulye","Sulu Yemek","soğan,salça,fasulye",vt.ulkeGetir("Turkiye"));
        Yemek yemek4 = new Yemek("Kuru Fasulye","Sulu Yemek","soğan,salça,fasulye",vt.ulkeGetir("Turkiye"));
        Yemek yemek5 = new Yemek("Kuru Fasulye","Sulu Yemek","soğan,salça,fasulye",vt.ulkeGetir("Turkiye"));

        vt.yemekEkle(yemek1);
        vt.yemekEkle(yemek2);
        vt.yemekEkle(yemek3);
        vt.yemekEkle(yemek4);
        vt.yemekEkle(yemek5);


        List<Yemek> yemekler = vt.tumYemekleriGetir();
        List<Ulke> ulkeler = vt.tumUlkeleriGetir();
        YemekAdapter yemekAdapter = new YemekAdapter(MainActivity.this,yemekler);
        UlkeAdapter ulkeAdapter = new UlkeAdapter(MainActivity.this,ulkeler);
        //liste.setAdapter(yemekAdapter);
        liste.setAdapter(ulkeAdapter);

    }
}
