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
import kiyafetstok.Connector;
import kiyafetstok.kadin;
import kiyafetstok.kiyafet;

/**
 *
 * @author Bedran Özcan
 */
public class kadindao {
     private Connector connector;
    private Connection connection;

  
    public void kiyafet_listele() {

        kadindao kd = new kadindao();
        for (kadin k : kd.findAll()) {
            System.out.println(k.toString());
        }
    }

    public List<kadin> findAll() {
        List<kadin> kList = new ArrayList();

        try {
            String sql = "select * from kadin";
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                kadin k = new kadin();
                k.setKadin_id(rs.getInt("kadin_id"));
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
    public kadin find(int import_id) {
        kadin getKiyafet = new kadin();
        List<kadin> kList = new ArrayList();

        try {
            String sql = "select * from kadin";
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getInt("kadin_id") == import_id) {
                    kadin k = new kadin();
                    k.setKiyafet_id(rs.getInt("kadin_id"));
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
     public void insert(kadin kadin) {

        try {
            String sql = ("insert into kadin values(DEFAULT,'" + kadin.getRenk() + "','" + kadin.getBeden() + "','" + kadin.getMarka() + "','" + kadin.getTur() + "'"
                    + "," + kadin.getStoksayisi() + "," + kadin.getFiyat() + "," + kadin.getTur_id() + ")");
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Ekleme İslemi Basarili.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }


    public void delete(String selectedID) {

        try {
            String sql = ("delete  from kadin where kadin_id=" +selectedID);
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Silme İslemi Basarili.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void update(kiyafet kf, kiyafet get_Database, int kadin_id) {

        try {
            if (!kf.getRenk().equals(get_Database.getRenk()) && kf.getRenk() != null) {
                String sql = ("update kadin set renk='" + kf.getRenk() + "' where kadin_id=" + kadin_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme renk başarılı.");
            }

            if (!kf.getBeden().equals(get_Database.getBeden()) && kf.getBeden() != null) {
                String sql = ("update kadin set beden='" + kf.getBeden() + "' where kadin_id=" + kadin_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme beden başarılı.");
            }
            if (!kf.getMarka().equals(get_Database.getMarka()) && kf.getMarka() != null) {
                String sql = ("update kadin set marka='" + kf.getMarka() + "' where kadin_id=" + kadin_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme marka başarılı.");
            }
            if (!kf.getTur().equals(get_Database.getTur()) && kf.getTur() != null) {
                String sql = ("update kadin set tur='" + kf.getTur() + "' where kadin_id=" + kadin_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme tur başarılı.");
            }
            if (kf.getStoksayisi() != get_Database.getStoksayisi()) {
                String sql = ("update kadin set stoksayisi='" + kf.getStoksayisi() + "' where kadin_id=" + kadin_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme Stok Sayısı başarılı.");
            }
            if (kf.getFiyat() != get_Database.getFiyat()) {
                String sql = ("update kadin set fiyat='" + kf.getFiyat() + "' where kadin_id=" + kadin_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme fiyat başarılı.");
            }
            if (kf.getTur_id() != get_Database.getTur_id()) {
                String sql = ("update kadin set tur_id='" + kf.getTur_id() + "' where kadin_id=" + kadin_id);
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
