/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

/**
 *
 * @author Bedran Özcan
 */
public class kiyafet {
    String renk,beden,marka,tur;
    int stoksayisi;
    float fiyat;

    public kiyafet() {
    }

    public kiyafet(String renk, String beden, String marka, String tur, int stoksayisi, float fiyat) {
        this.renk = renk;
        this.beden = beden;
        this.marka = marka;
        this.tur = tur;
        this.stoksayisi = stoksayisi;
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

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }
    
}
