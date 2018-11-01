package com.example.lab08.yeniproje.model;

import java.io.Serializable;

public class Yemek implements Serializable {
    private int yemek_id;
    private String yemek_Adi;
    private String kategori;
    private String malzeme;
    private int ulke_id;

    public Yemek(){

    }

    public Yemek(String yemek_Adi, String kategori, String malzeme, int ulke_id) {
        this.yemek_Adi = yemek_Adi;
        this.kategori = kategori;
        this.malzeme = malzeme;
        this.ulke_id = ulke_id;
    }

    public String getYemek_Adi() {
        return yemek_Adi;
    }

    public void setYemek_Adi(String yemek_Adi) {
        this.yemek_Adi = yemek_Adi;
    }

    public int getYemek_id() {
        return yemek_id;
    }

    public void setYemek_id(int yemek_id) {
        this.yemek_id = yemek_id;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }

    public int getUlke_id() {
        return ulke_id;
    }

    public void setUlke_id(int ulke_id) {
        this.ulke_id = ulke_id;
    }
}
