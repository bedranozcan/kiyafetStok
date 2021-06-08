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
public class ListMakerFacade {
    private IFacadeKiyafet kadin;
    private IFacadeKiyafet erkek;
    private IFacadeKiyafet cocuk;
  
    
    public ListMakerFacade(){
        this.kadin = new kadin();
        this.erkek= new erkek();
       this.cocuk =new cocuk();
    }
    public void tamListeleme(){
        kadin.listele();
        erkek.listele();
        cocuk.listele();
    }
    
    
}
