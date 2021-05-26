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
public enum EnumSira {
    renk("Renk"),
    marka("Marka"),
    beden("Beden"),
    tur("Tur"),
    erkek_id("Erkek_id"),
    stoksayisi("Stoksayisi"),
    fiyat("Fiyat"),
    tur_id("Tur_id");
    private String sira;

    private EnumSira(String sira) {
        this.sira = sira;
    }

    @Override
    public String toString() {
        return sira;
    }
    
    
}
