/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import java.util.Scanner;
import kiyafetstok.DAO.erkekdao;

/**
 *
 * @author Bedran Özcan
 */
public class erkeksecim {

    Scanner input = new Scanner(System.in);
    erkek e = new erkek();
    erkekdao edao = new erkekdao();
    int secim;

    public void esecim() {
        while (secim != 5) {
            System.out.println("1)Kıyafet Ekle  2)Kıyafet Sil  3)Kıyafet Guncelle  4)Kıyafet Listele  5)Çıkış");
            secim = input.nextInt();
            switch (secim) {
                case 1: {
                    System.out.println("Kıyafetin rengini giriniz");
                    String renk = input.next();
                    e.setRenk(renk);
                    System.out.println("Kıyafetin bedenini giriniz");
                    String beden = input.next();
                    e.setBeden(beden);
                    System.out.println("Kıyafetin markasını giriniz");
                    String marka = input.next();
                    e.setMarka(marka);
                    System.out.println("Kıyafetin turunu giriniz");
                    String tur = input.next();
                    e.setTur(tur);
                    System.out.println("Kıyafetin stoksayisini giriniz");
                    int stoksayisi = input.nextInt();
                    e.setStoksayisi(stoksayisi);
                    System.out.println("Kıyafetin fiyatını giriniz");
                    float fiyat = input.nextFloat();
                    e.setFiyat(fiyat);
                    System.out.println("Kıyafetin turunun idsini giriniz");
                    int tur_id = input.nextInt();
                    e.setTur_id(tur_id);
                    edao.insert(e);
                    break;
                }
                case 2: {
                    edao.kiyafet_listele();
                    System.out.println("Silinicek olan kıyafetin idsini giriniz");
                    int erkek_id = input.nextInt();
                    e.setErkek_id(erkek_id);
                    edao.delete(String.valueOf(e.getErkek_id()));
                    edao.kiyafet_listele();
                    break;
                }
                case 3: {
                    erkek e_update = new erkek();
                    erkek e_database = new erkek();
                    edao.kiyafet_listele();
                    System.out.println("Kiyafet GUNCELLE\n");
                    System.out.print("Güncellenecek kiyafetin  idisini giriniz\n");
                    int erkek_id = input.nextInt();
                    e_database = edao.find(erkek_id);
                    System.out.println("Yeni Renk giriniz: ");
                    e_update.setRenk(input.next());
                    System.out.println("Yeni Beden giriniz: ");
                    e_update.setBeden(input.next());
                    System.out.println("Yeni Marka giriniz: ");
                    e_update.setMarka(input.next());
                    System.out.println("Yeni Tur giriniz: ");
                    e_update.setTur(input.next());
                    System.out.println("Yeni Stok Sayısı giriniz: ");
                    e_update.setStoksayisi(input.nextInt());
                    System.out.println("Yeni Fiyatı giriniz: ");
                    e_update.setFiyat(input.nextInt());
                    System.out.println("Yeni Tur_ID giriniz: ");
                    e_update.setTur_id(input.nextInt());
                    edao.update(e_update, e_database, erkek_id);
                    break;
                }
                case 4: {
                    edao.kiyafet_listele();

                }
                case 5: {
                    break;
                }
                default: {
                    break;
                }
            }
        }

    }
}
