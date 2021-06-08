/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import kiyafetstok.DAO.erkekdao;

/**
 *
 * @author Bedran Özcan
 */
public class erkek extends kiyafet  implements IFacadeKiyafet{
  private  int erkek_id;

    public int getErkek_id() {
        return erkek_id;
    }

    public void setErkek_id(int erkek_id) {
        this.erkek_id = erkek_id;
    }
    @Override
    public void listele() {
      erkekdao edao= new erkekdao();
      edao.kiyafet_listele();
    }
     @Override
    public String toString() {
        return "kiyafet{"+"erkek_id="+erkek_id+",renk=" + renk + ", beden=" + beden + ", marka=" + marka + ", tur=" + tur + ", stoksayisi=" + stoksayisi +  ", fiyat=" + fiyat + ", tur_id=" + tur_id +'}';
    }

}
