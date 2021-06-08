/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok.DAO;

import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import kiyafetstok.Connector;
import kiyafetstok.IFacadeKiyafet;
import kiyafetstok.kiyafet;

public class kiyafetdao  {

    private Connector connector;
    private Connection connection;

  
    public void kiyafet_listele() {

        kiyafetdao kd = new kiyafetdao();
        for (kiyafet k : kd.findAll()) {
            System.out.println(k.toString());
        }
    }

    public List<kiyafet> findAll() {
        List<kiyafet> kList = new ArrayList();

        try {
            String sql = "select * from kiyafet";
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                kiyafet k = new kiyafet();
                k.setKiyafet_id(rs.getInt("kiyafet_id"));
                k.setRenk(rs.getString("renk"));
                k.setBeden(rs.getString("beden"));
                k.setMarka(rs.getString("marka"));
                k.setTur(rs.getString("tur"));
                k.setStoksayisi(rs.getInt("stoksayisi"));
                k.setFiyat(rs.getInt("fiyat"));
                k.setTur_id(rs.getInt("tur_id"));

                kList.add(k);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return kList;
    }
    public kiyafet find(int import_id) {
        kiyafet getKiyafet = new kiyafet();
        List<kiyafet> kList = new ArrayList();

        try {
            String sql = "select * from kiyafet";
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getInt("kiyafet_id") == import_id) {
                    kiyafet k = new kiyafet();
                    k.setKiyafet_id(rs.getInt("kiyafet_id"));
                    k.setRenk(rs.getString("renk"));
                    k.setBeden(rs.getString("beden"));
                    k.setMarka(rs.getString("marka"));
                    k.setTur(rs.getString("tur"));
                    k.setStoksayisi(rs.getInt("stoksayisi"));
                    k.setFiyat(rs.getInt("fiyat"));
                    k.setTur_id(rs.getInt("tur_id"));

                    kList.add(k);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        getKiyafet = kList.get(0);

        return getKiyafet;
    }
     public void insert(kiyafet kiyafet) {

        try {
            String sql = ("insert into kiyafet values(DEFAULT,'" + kiyafet.getRenk() + "','" + kiyafet.getBeden() + "','" + kiyafet.getMarka() + "','" + kiyafet.getTur() + "'"
                    + "," + kiyafet.getStoksayisi() + "," + kiyafet.getFiyat() + "," + kiyafet.getTur_id() + ")");
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Ekleme İslemi Basarili.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }


    public void delete(kiyafet kiyafet) {

        try {
            String sql = ("delete  from kiyafet where kiyafet_id=" + kiyafet.getKiyafet_id());
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Silme İslemi Basarili.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void update(kiyafet kf, kiyafet get_Database, int kiyafet_id) {

        try {
            if (!kf.getRenk().equals(get_Database.getRenk()) && kf.getRenk() != null) {
                String sql = ("update kiyafet set renk='" + kf.getRenk() + "' where kiyafet_id=" + kiyafet_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme renk başarılı.");
            }

            if (!kf.getBeden().equals(get_Database.getBeden()) && kf.getBeden() != null) {
                String sql = ("update kiyafet set beden='" + kf.getBeden() + "' where kiyafet_id=" + kiyafet_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme beden başarılı.");
            }
            if (!kf.getMarka().equals(get_Database.getMarka()) && kf.getMarka() != null) {
                String sql = ("update kiyafet set marka='" + kf.getMarka() + "' where kiyafet_id=" + kiyafet_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme marka başarılı.");
            }
            if (!kf.getTur().equals(get_Database.getTur()) && kf.getTur() != null) {
                String sql = ("update kiyafet set tur='" + kf.getTur() + "' where kiyafet_id=" + kiyafet_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme tur başarılı.");
            }
            if (kf.getStoksayisi() != get_Database.getStoksayisi()) {
                String sql = ("update kiyafet set stoksayisi='" + kf.getStoksayisi() + "' where kiyafet_id=" + kiyafet_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme Stok Sayısı başarılı.");
            }
            if (kf.getFiyat() != get_Database.getFiyat()) {
                String sql = ("update kiyafet set fiyat='" + kf.getFiyat() + "' where kiyafet_id=" + kiyafet_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme fiyat başarılı.");
            }
            if (kf.getTur_id() != get_Database.getTur_id()) {
                String sql = ("update kiyafet set tur_id='" + kf.getTur_id() + "' where kiyafet_id=" + kiyafet_id);
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
