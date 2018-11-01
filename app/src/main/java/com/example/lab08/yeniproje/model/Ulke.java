package com.example.lab08.yeniproje.model;

import java.io.Serializable;

public class Ulke implements Serializable {
    private int ulke_id;
    private String ulke_Adi;

    public Ulke( String ulke_Adi) {

        this.ulke_Adi = ulke_Adi;
    }

    public Ulke(){

    }

    public int getUlke_id() {
        return ulke_id;
    }

    public void setUlke_id(int ulke_id) {
        this.ulke_id = ulke_id;
    }

    public String getUlke_Adi() {
        return ulke_Adi;
    }

    public void setUlke_Adi(String ulke_Adi) {
        this.ulke_Adi = ulke_Adi;
    }
}
