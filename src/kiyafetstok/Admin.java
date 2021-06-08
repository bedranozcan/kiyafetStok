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
public class Admin {

    private EnumBolum bolum;
    private kayitSirasiStrateji kayitsirasi;

    public Admin(EnumBolum bolum) {
        this.bolum = bolum;

        switch (bolum) {
            case SozelSira:
                kayitsirasi = new SozelSiraStrateji();
                break;
            case SayisalSira:
                kayitsirasi = new SayisalSiraStrateji();
                break;

            default:
                break;
        }

    }

    public String getOncelikSiralamasi() {
        System.out.println(bolum + " için strateji:");
        String siralama = "Önce " + kayitsirasi.getBirinci() + " Ekle"
                + " Sonra " + kayitsirasi.getİkinci() + " Ekle"
                + "," + kayitsirasi.getUcuncu() + " Ekle"
                + "," + kayitsirasi.getDorduncu() + " Ekle"
                + "," + kayitsirasi.getBesinci() + " Ekle"
                + "," + kayitsirasi.getAltinci() + " Ekle"
                + " Son olarak " + kayitsirasi.getYedinci() + " Ekle";
        return siralama;
    }

}
