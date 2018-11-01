package com.example.lab08.yeniproje;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.lab08.yeniproje.model.Ulke;
import com.example.lab08.yeniproje.model.Yemek;

import java.util.ArrayList;
import java.util.List;

public class Veritabani extends SQLiteOpenHelper {
    public static final String VERITABANI_ADI = "veritabani";
    public static final String BIRINCI_TABLO = "yemekler";
    public static final String IKINCI_TABLO = "ulkeler";



    public Veritabani(Context context) {
        super(context, VERITABANI_ADI, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sqlCumlesi1 = "CREATE TABLE " + BIRINCI_TABLO + "(yemek_id INTEGER PRIMARY KEY AUTOINCREMENT ,yemek_adi TEXT,ulke_id INTEGER,kategori TEXT,malzemeler TEXT" + ")";
        db.execSQL(sqlCumlesi1);
        String sqlCumlesi2 = "CREATE TABLE " + IKINCI_TABLO + "(ulke_id INTEGER PRIMARY KEY AUTOINCREMENT,ulke_adi TEXT" + ")";
        db.execSQL(sqlCumlesi2);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void yemekEkle(Yemek yemek){

        SQLiteDatabase vt = this.getWritableDatabase();

        ContentValues veriler = new ContentValues();

        veriler.put("yemek_Adi",yemek.getYemek_Adi());
        veriler.put("ulke_id",yemek.getUlke_id());
        veriler.put("malzemeler",yemek.getMalzeme());
        vt.insert(BIRINCI_TABLO,null,veriler);
        vt.close();

    }

    public void ulkeEkle(Ulke ulke){

        SQLiteDatabase vt = this.getWritableDatabase();

        ContentValues veriler = new ContentValues();

        veriler.put("ulke_adi",ulke.getUlke_Adi());

        vt.insert(IKINCI_TABLO,null,veriler);
        vt.close();

    }

    public int ulkeGetir(String ulkeAdi){

       SQLiteDatabase vt = this.getWritableDatabase();

       String sqlCumlesi = "SELECT * FROM "+IKINCI_TABLO + " WHERE ulke_adi = '" + ulkeAdi+ "'";
        Cursor cursor = vt.rawQuery(sqlCumlesi,null);

        int a = 0;
        while (cursor.moveToNext()){
            a = cursor.getInt(0);
        }
        return a; // eşleşen ilk ülkeyi getirir


    }

    public List<Yemek> tumYemekleriGetir(){

        List<Yemek> yemekListesi = new ArrayList<>();

        SQLiteDatabase vt = this.getWritableDatabase() ;

        Cursor cursor = vt.query(BIRINCI_TABLO,new String[]{"yemek_id","yemek_adi","ulke_id","kategori","malzemeler"},null,null,null,null,null);
        while (cursor.moveToNext()){
            Yemek yemekNesnesi = new Yemek();
            yemekNesnesi.setYemek_Adi(cursor.getString(1));
            yemekNesnesi.setUlke_id(cursor.getInt(2));
            yemekNesnesi.setKategori(cursor.getString(3));
            yemekNesnesi.setMalzeme(cursor.getString(4));

            yemekListesi.add(yemekNesnesi);
        }

        return yemekListesi;
    }

    public List<Ulke> tumUlkeleriGetir(){

        List<Ulke> ulkeListesi = new ArrayList<>();

        SQLiteDatabase vt = this.getWritableDatabase() ;

        Cursor cursor = vt.query(IKINCI_TABLO,new String[]{"ulke_id","ulke_adi"},null,null,null,null,null);
        while (cursor.moveToNext()){
            Ulke ulkeNesnesi = new Ulke();
            ulkeNesnesi.setUlke_Adi(cursor.getString(1));


            ulkeListesi.add(ulkeNesnesi);
        }

        return ulkeListesi;
    }
}
