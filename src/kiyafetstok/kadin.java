/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import kiyafetstok.DAO.kadindao;

/**
 *
 * @author Bedran Özcan
 */
public class kadin extends kiyafet implements IFacadeKiyafet {

    private int kadin_id;

    public int getKadin_id() {
        return kadin_id;
    }

    public void setKadin_id(int kadin_id) {
        this.kadin_id = kadin_id;
    }

    @Override
    public void listele() {
        kadindao kdao = new kadindao();
        kdao.kiyafet_listele();
    }

    @Override
    public String toString() {
        return "kiyafet{" + "kadin_id=" + kadin_id + ",renk=" + renk + ", beden=" + beden + ", marka=" + marka + ", tur=" + tur + ", stoksayisi=" + stoksayisi + ", fiyat=" + fiyat + ", tur_id=" + tur_id + '}';
    }

}
