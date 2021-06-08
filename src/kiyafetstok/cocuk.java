/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import kiyafetstok.DAO.cocukdao;

/**
 *
 * @author Bedran Özcan
 */
public class cocuk extends kiyafet implements IFacadeKiyafet{
  private  int cocuk_id;

    public int getCocuk_id() {
        return cocuk_id;
    }

    public void setCocuk_id(int cocuk_id) {
        this.cocuk_id = cocuk_id;
    }
     @Override
    public void listele() {
        cocukdao cdao = new cocukdao();
        cdao.kiyafet_listele();
    }
     @Override
    public String toString() {
        return "kiyafet{" + "cocuk_id="+cocuk_id + ",renk=" + renk + ", beden=" + beden + ", marka=" + marka + ", tur=" + tur + ", stoksayisi=" + stoksayisi + ", fiyat=" + fiyat + ", tur_id=" + tur_id + '}';
    }
}
