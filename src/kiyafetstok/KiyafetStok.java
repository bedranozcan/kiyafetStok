package kiyafetstok;

import kiyafetstok.DAO.kiyafetdao;

public class KiyafetStok {

    
    public static void main(String[] args) {
        Connector db = new Connector();
        db.connect();
        secim sec = new secim();
        sec.secim();

    }

}
