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
import kiyafetstok.kiyafet;

public class kiyafetdao {

    private Connector connector;
    private Connection connection;

    public void insert(kiyafet kiyafet) {

        try {
            String sql = ("insert into kiyafet values('" + kiyafet.getKiyafet_id() + "','" + kiyafet.getRenk() + "','" + kiyafet.getBeden() + "','" + kiyafet.getMarka() + "','" + kiyafet.getTur() + "'"
                    + ",'" + kiyafet.getStoksayisi() + "','" + kiyafet.getFiyat() + "','" + kiyafet.getTur_id() + "'");
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
            System.out.println("Ekleme İslemi Basarili.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

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

    public void update(kiyafet kiyafet, int kiyafet_id, String tur) {

        try {
            String sql = ("update kiyafet set kiyafet_id='" + kiyafet.getKiyafet_id() + "'where tur='" + kiyafet.getTur() + "'");
            Statement st = this.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

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
