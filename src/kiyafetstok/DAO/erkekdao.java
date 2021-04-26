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
import kiyafetstok.erkek;

/**
 *
 * @author Bedran Özcan
 */
public class erkekdao {
    private Connector connector;
    private Connection connection;

  
    public void kiyafet_listele() {

        erkekdao edao = new erkekdao();
        for (erkek e : edao.findAll()) {
            System.out.println(e.toString());
        }
    }

    public List<erkek> findAll() {
        List<erkek> eList = new ArrayList();

        try {
            String sql = "select * from erkek";
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                erkek e = new erkek();
                e.setKiyafet_id(rs.getInt("erkek_id"));
                e.setRenk(rs.getString("renk"));
                e.setBeden(rs.getString("beden"));
                e.setMarka(rs.getString("marka"));
                e.setTur(rs.getString("tur"));
                e.setStoksayisi(rs.getInt("stoksayisi"));
                e.setFiyat(rs.getInt("fiyat"));
                e.setTur_id(rs.getInt("tur_id"));

                eList.add(e);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return eList;
    }
    public erkek find(int import_id) {
        erkek getKiyafet = new erkek();
        List<erkek> eList = new ArrayList();

        try {
            String sql = "select * from erkek";
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getInt("erkek_id") == import_id) {
                    erkek e = new erkek();
                    e.setKiyafet_id(rs.getInt("erkek_id"));
                    e.setRenk(rs.getString("renk"));
                    e.setBeden(rs.getString("beden"));
                    e.setMarka(rs.getString("marka"));
                    e.setTur(rs.getString("tur"));
                    e.setStoksayisi(rs.getInt("stoksayisi"));
                    e.setFiyat(rs.getInt("fiyat"));
                    e.setTur_id(rs.getInt("tur_id"));

                    eList.add(e);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        getKiyafet = eList.get(0);

        return getKiyafet;
    }
     public void insert(erkek erkek) {

        try {
            String sql = ("insert into erkek values(DEFAULT,'" + erkek.getRenk() + "','" + erkek.getBeden() + "','" + erkek.getMarka() + "','" + erkek.getTur() + "'"
                    + "," + erkek.getStoksayisi() + "," + erkek.getFiyat() + "," + erkek.getTur_id() + ")");
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Ekleme İslemi Basarili.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }


    public void delete(erkek erkek) {

        try {
            String sql = ("delete  from erkek where erkek_id=" + erkek.getErkek_id());
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Silme İslemi Basarili.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void update(erkek kf, erkek get_Database, int erkek_id) {

        try {
            if (!kf.getRenk().equals(get_Database.getRenk()) && kf.getRenk() != null) {
                String sql = ("update erkek set renk='" + kf.getRenk() + "' where kiyafet_id=" + erkek_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme renk başarılı.");
            }

            if (!kf.getBeden().equals(get_Database.getBeden()) && kf.getBeden() != null) {
                String sql = ("update erkek set beden='" + kf.getBeden() + "' where kiyafet_id=" + erkek_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme beden başarılı.");
            }
            if (!kf.getMarka().equals(get_Database.getMarka()) && kf.getMarka() != null) {
                String sql = ("update erkek set marka='" + kf.getMarka() + "' where kiyafet_id=" + erkek_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme marka başarılı.");
            }
            if (!kf.getTur().equals(get_Database.getTur()) && kf.getTur() != null) {
                String sql = ("update erkek set tur='" + kf.getTur() + "' where kiyafet_id=" + erkek_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme tur başarılı.");
            }
            if (kf.getStoksayisi() != get_Database.getStoksayisi()) {
                String sql = ("update erkek set stoksayisi='" + kf.getStoksayisi() + "' where kiyafet_id=" + erkek_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme Stok Sayısı başarılı.");
            }
            if (kf.getFiyat() != get_Database.getFiyat()) {
                String sql = ("update erkek set fiyat='" + kf.getFiyat() + "' where kiyafet_id=" + erkek_id);
                Statement st = this.getConnection().createStatement();
                st.executeUpdate(sql);
                System.out.println("Güncelleme fiyat başarılı.");
            }
            if (kf.getTur_id() != get_Database.getTur_id()) {
                String sql = ("update erkek set tur_id='" + kf.getTur_id() + "' where kiyafet_id=" + erkek_id);
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
