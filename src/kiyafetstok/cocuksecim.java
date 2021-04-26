/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import java.util.Scanner;
import kiyafetstok.DAO.cocukdao;

/**
 *
 * @author Bedran Özcan
 */
public class cocuksecim {
    Scanner input = new Scanner(System.in);
    cocuk c = new cocuk();
    cocukdao cdao = new cocukdao();
    int secim;

    public void csecim() {
        while (secim != 5) {
            System.out.println("1)Kıyafet Ekle  2)Kıyafet Sil  3)Kıyafet Guncelle  4)Kıyafet Listele  5)Çıkış");
            secim = input.nextInt();
            switch (secim) {
                case 1: {
                    System.out.println("Kıyafetin rengini giriniz");
                    String renk = input.next();
                    c.setRenk(renk);
                    System.out.println("Kıyafetin bedenini giriniz");
                    String beden = input.next();
                    c.setBeden(beden);
                    System.out.println("Kıyafetin markasını giriniz");
                    String marka = input.next();
                    c.setMarka(marka);
                    System.out.println("Kıyafetin turunu giriniz");
                    String tur = input.next();
                    c.setTur(tur);
                    System.out.println("Kıyafetin stoksayisini giriniz");
                    int stoksayisi = input.nextInt();
                    c.setStoksayisi(stoksayisi);
                    System.out.println("Kıyafetin fiyatını giriniz");
                    float fiyat = input.nextFloat();
                    c.setFiyat(fiyat);
                    System.out.println("Kıyafetin turunun idsini giriniz");
                    int tur_id = input.nextInt();
                    c.setTur_id(tur_id);
                    cdao.insert(c);
                    break;
                }
                case 2: {
                    cdao.kiyafet_listele();
                    System.out.println("Silinicek olan kıyafetin idsini giriniz");
                    int cocuk_id = input.nextInt();
                    c.setCocuk_id(cocuk_id);
                    cdao.delete(c);
                    cdao.kiyafet_listele();
                    break;
                }
                case 3: {
                    cocuk c_update = new cocuk();
                    cocuk c_database = new cocuk();
                    cdao.kiyafet_listele();
                    System.out.println("Kiyafet GUNCELLE\n");
                    System.out.print("Güncellenecek kiyafetin  idisini giriniz\n");
                    int cocuk_id = input.nextInt();
                    c_database = cdao.find(cocuk_id);
                    System.out.println("Yeni Renk giriniz: ");
                    c_update.setRenk(input.next());
                    System.out.println("Yeni Beden giriniz: ");
                    c_update.setBeden(input.next());
                    System.out.println("Yeni Marka giriniz: ");
                    c_update.setMarka(input.next());
                    System.out.println("Yeni Tur giriniz: ");
                    c_update.setTur(input.next());
                    System.out.println("Yeni Stok Sayısı giriniz: ");
                    c_update.setStoksayisi(input.nextInt());
                    System.out.println("Yeni Fiyatı giriniz: ");
                    c_update.setFiyat(input.nextInt());
                    System.out.println("Yeni Tur_ID giriniz: ");
                    c_update.setTur_id(input.nextInt());
                    cdao.update(c_update, c_database, cocuk_id);
                    break;
                }
                case 4: {
                    cdao.kiyafet_listele();

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
