/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Bir nesnenin uygulama süresince bir kez üretilmesini kontrol altında tutar
public class Connector  {


    private static Connector st = null;
  
    Connector(){}

    public static  Connector getInstance(){ //her seferinde nesne oluşturmaya gerek yoktur.
        if(st == null){
             synchronized(Connector.class){ //aynı anda çalışan birden fazla lifin (thread) veya işlemin (process) sıralı olmasını ve birbiri ile iletişim halinde çalışmasını sağlar.
                 if(st==null){
                      st= new Connector();
                 }
             }
            
        }
        return st;
    }
    
    public Connection connect() {
        Connection c= null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance(); 
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kiyafetstok?user=root&password=123");
           
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }

        return c;
    }


}
