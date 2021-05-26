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
public class SozelSiraStrateji implements kayitSirasiStrateji{

    @Override
    public EnumSira getBirinci() {
        return EnumSira.renk;
    }

    @Override
    public EnumSira getİkinci() {
     return EnumSira.marka;
    }

    @Override
    public EnumSira getUcuncu() {
       return EnumSira.beden;
    }

    @Override
    public EnumSira getDorduncu() {
        return EnumSira.tur;
    }

    @Override
    public EnumSira getBesinci() {
        return EnumSira.stoksayisi;
    }

    @Override
    public EnumSira getAltinci() {
        return EnumSira.fiyat;
    }

    @Override
    public EnumSira getYedinci() {
        return EnumSira.tur_id;
    }

   
    
}
