/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kiyafetstok.Connector;
import kiyafetstok.cocuk;
import kiyafetstok.erkek;


/**
 *
 * @author Bedran Özcan
 */
public class cocukdao {
     private Connector connector;
    private Connection connection;

  
    public void kiyafet_listele() {

        cocukdao cd = new cocukdao();
        for (cocuk c : cd.findAll()) {
            System.out.println(c.toString());
        }
    }

    public List<cocuk> findAll() {
        List<cocuk> cList = new ArrayList();

        try {
            String sql = "select * from cocuk";
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                cocuk c = new cocuk();
                c.setCocuk_id(rs.getInt("cocuk_id"));
                c.setRenk(rs.getString("renk"));
                c.setBeden(rs.getString("beden"));
                c.setMarka(rs.getString("marka"));
                c.setTur(rs.getString("tur"));
                c.setStoksayisi(rs.getInt("stoksayisi"));
                c.setFiyat(rs.getInt("fiyat"));
                c.setTur_id(rs.getInt("tur_id"));

                cList.add(c);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cList;
    }
    public cocuk find(int import_id) {
        cocuk getKiyafet = new cocuk();
        List<cocuk> cList = new ArrayList();

        try {
            String sql = "select * from cocuk";
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getInt("cocuk_id") == import_id) {
                    cocuk c = new cocuk();
                    c.setKiyafet_id(rs.getInt("cocuk_id"));
                    c.setRenk(rs.getString("renk"));
                    c.setBeden(rs.getString("beden"));
                    c.setMarka(rs.getString("marka"));
                    c.setTur(rs.getString("tur"));
                    c.setStoksayisi(rs.getInt("stoksayisi"));
                    c.setFiyat(rs.getInt("fiyat"));
                    c.setTur_id(rs.getInt("tur_id"));

                    cList.add(c);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        getKiyafet = cList.get(0);

        return getKiyafet;
    }
     public void insert(cocuk cocuk) {

        try {
            String sql = ("insert into cocuk values(DEFAULT,'" + cocuk.getRenk() + "','" + cocuk.getBeden() + "','" + cocuk.getMarka() + "','" + cocuk.getTur() + "'"
                    + "," + cocuk.getStoksayisi() + "," + cocuk.getFiyat() + "," + cocuk.getTur_id() + ")");
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Ekleme İslemi Basarili.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }


    public void delete(String selectedID) {

        try {
            String sql = ("delete  from cocuk where cocuk_id=" + selectedID);
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Silme İslemi Basarili.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }
    public void updateGuncelle(cocuk c ){
         try {
             String sql = ("update kadin set renk='" + c.getRenk() + "',beden='"
                     +c.getBeden()+"',marka='"+c.getMarka()+"',tur='"+c.getTur()+"',stoksayisi="
                     +c.getStoksayisi()+",fiyat=("+c.getFiyat()+"),tur_id="
                             +c.getTur_id()+" where cocuk_id=" + c.getCocuk_id());
             Statement st = this.getConnection().createStatement();
             st.executeUpdate(sql);
         } catch (SQLException ex) {
             Logger.getLogger(cocukdao.class.getName()).log(Level.SEVERE, null, ex);
         }
               
           
       }

    public void update(cocuk kf, cocuk get_Database, int cocuk_id) {

        try {
            if (!kf.getRenk().equals(get_Database.getRenk()) && kf.getRenk() != null) {
                String sql = ("update cocuk set renk='" + kf.getRenk() + "' where cocuk_id=" + cocuk_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme renk başarılı.");
            }

            if (!kf.getBeden().equals(get_Database.getBeden()) && kf.getBeden() != null) {
                String sql = ("update cocuk set beden='" + kf.getBeden() + "' where cocuk_id=" + cocuk_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme beden başarılı.");
            }
            if (!kf.getMarka().equals(get_Database.getMarka()) && kf.getMarka() != null) {
                String sql = ("update cocuk set marka='" + kf.getMarka() + "' where cocuk_id=" + cocuk_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme marka başarılı.");
            }
            if (!kf.getTur().equals(get_Database.getTur()) && kf.getTur() != null) {
                String sql = ("update cocuk set tur='" + kf.getTur() + "' where cocuk_id=" + cocuk_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme tur başarılı.");
            }
            if (kf.getStoksayisi() != get_Database.getStoksayisi()) {
                String sql = ("update cocuk set stoksayisi='" + kf.getStoksayisi() + "' where cocuk_id=" + cocuk_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme Stok Sayısı başarılı.");
            }
            if (kf.getFiyat() != get_Database.getFiyat()) {
                String sql = ("update cocuk set fiyat='" + kf.getFiyat() + "' where cocuk_id=" + cocuk_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme fiyat başarılı.");
            }
            if (kf.getTur_id() != get_Database.getTur_id()) {
                String sql = ("update cocuk set tur_id='" + kf.getTur_id() + "' where cocuk_id=" + cocuk_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme tur_id  başarılı.");
            }
        } catch (SQLException ex) {

            System.out.println("ISLEM BASARISIZ" + ex.getMessage());
        }

    }

    public Connector getConnector() {
        if (this.connector == null) {
            this.connector = Connector.getInstance();
        }
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    public Connection getConnection() {
        if (this.connection == null) {
            this.connection = this.getConnector().connect();
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    
}
