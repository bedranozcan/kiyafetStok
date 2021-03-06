/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import java.sql.Connection;

/**
 *
 * @author Bedran Özcan
 */
public class kiyafet {

    String renk, beden, marka, tur;
    int stoksayisi, kiyafet_id, tur_id;
    float fiyat;
    private Connection connection;
    private Connector connector;

    public kiyafet() {
    }

    public kiyafet(String renk, String beden, String marka, String tur, int stoksayisi, int kiyafet_id, int tur_id, float fiyat) {
        this.renk = renk;
        this.beden = beden;
        this.marka = marka;
        this.tur = tur;
        this.stoksayisi = stoksayisi;
        this.kiyafet_id = kiyafet_id;
        this.tur_id = tur_id;
        this.fiyat = fiyat;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getBeden() {
        return beden;
    }

    public void setBeden(String beden) {
        this.beden = beden;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getStoksayisi() {
        return stoksayisi;
    }

    public void setStoksayisi(int stoksayisi) {
        this.stoksayisi = stoksayisi;
    }

    public int getKiyafet_id() {
        return kiyafet_id;
    }

    public void setKiyafet_id(int kiyafet_id) {
        this.kiyafet_id = kiyafet_id;
    }

    public int getTur_id() {
        return tur_id;
    }

    public void setTur_id(int tur_id) {
        this.tur_id = tur_id;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "kiyafet{"+"kiyafet_id="+kiyafet_id+",renk=" + renk + ", beden=" + beden + ", marka=" + marka + ", tur=" + tur + ", stoksayisi=" + stoksayisi +  ", fiyat=" + fiyat + ", tur_id=" + tur_id +'}';
    }
    

    public Connection getConnection() {
        if (this.connection == null) {
            this.connection = this.getConnector().connect();
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Connector getConnector() {
        if (this.connector == null) {
            this.connector = new Connector();
        }
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }
}
