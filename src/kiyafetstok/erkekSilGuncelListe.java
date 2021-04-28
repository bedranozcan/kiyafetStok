/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import static java.lang.String.valueOf;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import kiyafetstok.DAO.erkekdao;
import kiyafetstok.DAO.kadindao;

public class erkekSilGuncelListe extends javax.swing.JFrame {

    public void listele() {
        erkekdao edao = new erkekdao();
        edao.findAll();
        ArrayList<erkek> erkeklistesi = new ArrayList<>();

        erkeklistesi = (ArrayList<erkek>) edao.findAll();
        String dizim[][] = new String[erkeklistesi.size()][];

        for (int i = 0; i < erkeklistesi.size(); i++) {
            dizim[i] = new String[]{
                String.valueOf(erkeklistesi.get(i).getErkek_id()),
                valueOf(erkeklistesi.get(i).getRenk()),
                valueOf(erkeklistesi.get(i).getBeden()),
                valueOf(erkeklistesi.get(i).getTur()),
                valueOf(erkeklistesi.get(i).getStoksayisi()),
                valueOf(erkeklistesi.get(i).getFiyat()),
                valueOf(erkeklistesi.get(i).getTur_id())

            };

        }
        TableModel tabloModeli = new DefaultTableModel(
                dizim,
                new String[]{"erkek_id", "renk", "marka", "beden", "stoksayisi", "fiyat", "tur_id"}
        );

        erkektablo.setModel(tabloModeli);

        System.out.println(edao.findAll());
    }

    /**
     * Creates new form ErkekSil
     */
    public erkekSilGuncelListe() {
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
        guncellebutonu = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lsitelebutonu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        erkektablo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        silbutonu.setText("Sil");
        silbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silbutonuActionPerformed(evt);
            }
        });

        guncellebutonu.setText("Güncelle");
        guncellebutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncellebutonuActionPerformed(evt);
            }
        });

        jButton3.setText("GERİ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lsitelebutonu.setText("Listele");
        lsitelebutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsitelebutonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guncellebutonu, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(silbutonu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lsitelebutonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(silbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(guncellebutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lsitelebutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        erkektablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "erkek_id", "Renk", "Beden", "Marka", "Tur", "Stoksayisi", "Fiyat", "Tur_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(erkektablo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        erkekKiyafet yeni = new erkekKiyafet();
        yeni.setVisible(true);
        yeni.child2 = this;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void silbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silbutonuActionPerformed
        String selectedData = null;
        erkektablo.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = erkektablo.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        int[] selectedRow = erkektablo.getSelectedRows();
        int[] selectedColumns = erkektablo.getSelectedColumns();
        for (int i = 0; i < selectedRow.length; i++) {
            selectedData = (String) erkektablo.getValueAt(selectedRow[i], 0);

        }
        System.out.println("Selected: " + selectedData);
        erkekdao edao = new erkekdao();
        edao.delete(selectedData);
    }//GEN-LAST:event_silbutonuActionPerformed

    private void guncellebutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncellebutonuActionPerformed

    }//GEN-LAST:event_guncellebutonuActionPerformed

    private void lsitelebutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsitelebutonuActionPerformed
        listele();
    }//GEN-LAST:event_lsitelebutonuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new erkekSilGuncelListe().setVisible(true);
            }
        });
    }

    public erkekKiyafet parent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable erkektablo;
    private javax.swing.JButton guncellebutonu;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lsitelebutonu;
    private javax.swing.JButton silbutonu;
    // End of variables declaration//GEN-END:variables
}
