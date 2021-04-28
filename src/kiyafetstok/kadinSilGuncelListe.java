/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import static java.lang.String.valueOf;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import kiyafetstok.DAO.kadindao;
import kiyafetstok.kadinKiyafet;

/**
 *
 * @author ali_k
 */
public class kadinSilGuncelListe extends javax.swing.JFrame {

    /**
     * Creates new form ErkekSil
     */
    public void doldur() {
        kadindao kd_dao = new kadindao();
        kd_dao.findAll();
        ArrayList<kadin> kadinlistem = new ArrayList<>();

        kadinlistem = (ArrayList<kadin>) kd_dao.findAll();
        System.out.println(kadinlistem.toString());
        String dizim[][] = new String[kadinlistem.size()][];

        for (int i = 0; i < kadinlistem.size(); i++) {
            dizim[i] = new String[]{
                String.valueOf(kadinlistem.get(i).getKadin_id()),
                valueOf(kadinlistem.get(i).getRenk()),
                valueOf(kadinlistem.get(i).getBeden()),
                valueOf(kadinlistem.get(i).getTur()),
                valueOf(kadinlistem.get(i).getStoksayisi()),
                valueOf(kadinlistem.get(i).getFiyat()),
                valueOf(kadinlistem.get(i).getTur_id())  
                             
        };

    }
    TableModel tabloModeli = new DefaultTableModel(
            dizim,
            new String[]{"kadin_id", "renk", "marka", "beden","stoksayisi","fiyat","tur_id"}
    );

    kadintablo.setModel (tabloModeli);

    System.out.println (kd_dao.findAll



());
        }
    public kadinSilGuncelListe() {
              
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        silbutonu = new javax.swing.JButton();
        listelebutonu = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        guncellebutonu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kadintablo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        silbutonu.setText("Sil");
        silbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silbutonuActionPerformed(evt);
            }
        });

        listelebutonu.setText("Listele");
        listelebutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listelebutonuActionPerformed(evt);
            }
        });

        jButton3.setText("GERİ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        guncellebutonu.setText("Güncelleme");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                    .addComponent(listelebutonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(silbutonu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guncellebutonu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(silbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guncellebutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(listelebutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        kadintablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Renk", "Beden", "Marka", "Tur", "Stoksayisi", "Fiyat", "Tur_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        kadintablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kadintabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kadintablo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listelebutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listelebutonuActionPerformed
            doldur();//doldur();// TODO add your handling code here:
    }//GEN-LAST:event_listelebutonuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        kadinKiyafet yeni = new kadinKiyafet();
        yeni.setVisible(true);
        yeni.child5 = this;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void silbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silbutonuActionPerformed
       String selectedData = null;
        kadintablo.setCellSelectionEnabled(true);
         ListSelectionModel cellSelectionModel = kadintablo.getSelectionModel();
    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      int[] selectedRow = kadintablo.getSelectedRows();
        int[] selectedColumns = kadintablo.getSelectedColumns();
        for (int i = 0; i < selectedRow.length; i++) {
              selectedData = (String) kadintablo.getValueAt(selectedRow[i], 0);
            
        }
         System.out.println("Selected: " + selectedData);
         kadindao kd_kdo = new kadindao();
         kd_kdo.delete(selectedData);
    }//GEN-LAST:event_silbutonuActionPerformed

    private void kadintabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kadintabloMouseClicked
     
    }//GEN-LAST:event_kadintabloMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                



}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kadinSilGuncelListe.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kadinSilGuncelListe.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kadinSilGuncelListe.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kadinSilGuncelListe.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new kadinSilGuncelListe().setVisible(true);
            }
        });
    }
    public kadinKiyafet parent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guncellebutonu;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kadintablo;
    private javax.swing.JButton listelebutonu;
    private javax.swing.JButton silbutonu;
    // End of variables declaration//GEN-END:variables
}