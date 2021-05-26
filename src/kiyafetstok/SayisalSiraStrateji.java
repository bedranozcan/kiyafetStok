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
public class SayisalSiraStrateji implements kayitSirasiStrateji{
    @Override
    public EnumSira getBirinci() {
        return EnumSira.stoksayisi;
    }

    @Override
    public EnumSira getİkinci() {
     return EnumSira.fiyat;
    }

    @Override
    public EnumSira getUcuncu() {
       return EnumSira.tur_id;
    }

    @Override
    public EnumSira getDorduncu() {
        return EnumSira.renk;
    }

    @Override
    public EnumSira getBesinci() {
        return EnumSira.marka;
    }

    @Override
    public EnumSira getAltinci() {
        return EnumSira.beden;
    }

    @Override
    public EnumSira getYedinci() {
        return EnumSira.tur;
    }

}
