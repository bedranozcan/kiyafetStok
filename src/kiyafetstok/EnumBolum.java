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
public enum EnumBolum {
    SozelSira("Sozel Girdi ile Başlamak için"),
    SayisalSira("Sayisal Girdi ile Başlamak için");
    
    private String bolum;

    private EnumBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return bolum;
    }
    
    
}
