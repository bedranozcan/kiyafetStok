
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kiyafetstok.Connector;
import kiyafetstok.DAO.erkekdao;
import kiyafetstok.erkek;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bedran Özcan
 */
public class crudTest {

    @Before
    public void b() {

        erkek e = new erkek();
        erkekdao edao = new erkekdao();
        e.setRenk("Kirmizi");
        e.setBeden("S");
        e.setMarka("Nike");
        e.setTur("Esofman");
        e.setStoksayisi(15);
        e.setFiyat(100);
        e.setTur_id(5);
        edao.insert(e);
    }

    @Test
    public void kiyafet_listele() {
        erkekdao edao = new erkekdao();
        for (erkek e : edao.findAll()) {
            System.out.println(e.toString());
        }
    }
}

