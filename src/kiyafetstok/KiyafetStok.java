package kiyafetstok;

import java.util.Scanner;


public class KiyafetStok {

    public static void main(String[] args) {
        
        System.out.println("--------------------");
        siralamaYazdir(EnumBolum.SozelSira);
        System.out.println("--------------------");
        siralamaYazdir(EnumBolum.SayisalSira);
        Connector db = new Connector();
        db.connect();
        Scanner input = new Scanner(System.in);
        erkeksecim esecim = new erkeksecim();
        kadinsecim ksecim = new kadinsecim();
        cocuksecim csecim = new cocuksecim();
        int secim;
        System.out.println("1-Erkek Kiyafet\n2-Kadin Kıyafet\n3-Cocuk Kiyafet");
        System.out.println("Hangi kıyafete işlem yapmak istiyorsunuz?");
        secim = input.nextInt();
        if (secim == 1) {
            esecim.esecim();
        }
        if (secim == 2) {
            ksecim.ksecim();
        }
        if (secim == 3) {
            csecim.csecim();
        }
    }
     private static void siralamaYazdir(EnumBolum bolum) {
        Admin admin = new Admin(bolum);
        String oncelikSiralamasi = admin.getOncelikSiralamasi();
        System.out.println(oncelikSiralamasi);
    }

}
