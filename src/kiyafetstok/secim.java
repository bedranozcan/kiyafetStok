/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import java.util.Scanner;
import static javafx.application.Platform.exit;
import kiyafetstok.DAO.kiyafetdao;

/**
 *
 * @author Bedran Özcan
 */
public class secim {

    Scanner input = new Scanner(System.in);
    kiyafet k = new kiyafet();
    kiyafetdao kdao = new kiyafetdao();
    int secim;

    public void secim() {
        while (secim != 5) {
            System.out.println("1)Kıyafet Ekle  2)Kıyafet Sil  3)Kıyafet Guncelle  4)Kıyafet Listele  5)Çıkış");
            secim = input.nextInt();
            switch (secim) {
                case 1: {
                    System.out.println("Kıyafetin rengini giriniz");
                    String renk = input.next();
                    k.setRenk(renk);
                    System.out.println("Kıyafetin bedenini giriniz");
                    String beden = input.next();
                    k.setBeden(beden);
                    System.out.println("Kıyafetin markasını giriniz");
                    String marka = input.next();
                    k.setMarka(marka);
                    System.out.println("Kıyafetin turunu giriniz");
                    String tur = input.next();
                    k.setTur(tur);
                    System.out.println("Kıyafetin stoksayisini giriniz");
                    int stoksayisi = input.nextInt();
                    k.setStoksayisi(stoksayisi);
                    System.out.println("Kıyafetin fiyatını giriniz");
                    float fiyat = input.nextFloat();
                    k.setFiyat(fiyat);
                    System.out.println("Kıyafetin turunun idsini giriniz");
                    int tur_id = input.nextInt();
                    k.setTur_id(tur_id);
                    kdao.insert(k);
                    break;
                }
                case 2: {
                    kdao.kiyafet_listele();
                    System.out.println("Silinicek olan kıyafetin idsini giriniz");
                    int kiyafet_id = input.nextInt();
                    k.setKiyafet_id(kiyafet_id);
                    kdao.delete(k);
                    kdao.kiyafet_listele();
                    break;
                }
                case 3: {
                    kiyafet k_update = new kiyafet();
                    kiyafet k_database = new kiyafet();
                    kdao.kiyafet_listele();
                    System.out.println("Kiyafet GUNCELLE\n");
                    System.out.print("Güncellenecek kiyafetin  idisini giriniz\n");
                    int kiyafet_id = input.nextInt();
                    k_database = kdao.find(kiyafet_id);
                    System.out.println("Yeni Renk giriniz: ");
                    k_update.setRenk(input.next());
                    System.out.println("Yeni Beden giriniz: ");
                    k_update.setBeden(input.next());
                    System.out.println("Yeni Marka giriniz: ");
                    k_update.setMarka(input.next());
                    System.out.println("Yeni Tur giriniz: ");
                    k_update.setTur(input.next());
                    System.out.println("Yeni Stok Sayısı giriniz: ");
                    k_update.setStoksayisi(input.nextInt());
                    System.out.println("Yeni Fiyatı giriniz: ");
                    k_update.setFiyat(input.nextInt());
                    System.out.println("Yeni Tur_ID giriniz: ");
                    k_update.setTur_id(input.nextInt());
                    kdao.update(k_update, k_database, kiyafet_id);
                    break;
                }
                case 4: {
                    kdao.kiyafet_listele();

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
