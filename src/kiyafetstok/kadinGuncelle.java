/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiyafetstok;

import static java.lang.String.valueOf;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import kiyafetstok.DAO.kadindao;

/**
 *
 * @author Bedran Özcan
 */
public class kadinGuncelle extends javax.swing.JFrame {

    private int kadin_id;

    public void listele() {
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
                new String[]{"kadin_id", "renk", "marka", "beden", "stoksayisi", "fiyat", "tur_id"}
        );

        kadinguncelletablo.setModel(tabloModeli);

        System.out.println(kd_dao.findAll());
    }

    /**
     * Creates new form kadinguncelle
     */
    public kadinGuncelle() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        kadinguncelletablo = new javax.swing.JTable();
        guncelletusu = new javax.swing.JButton();
        renk = new javax.swing.JLabel();
        marka = new javax.swing.JLabel();
        tur = new javax.swing.JLabel();
        stok = new javax.swing.JLabel();
        beden3 = new javax.swing.JLabel();
        beden4 = new javax.swing.JLabel();
        beden5 = new javax.swing.JLabel();
        textrenk = new javax.swing.JTextField();
        textbeden = new javax.swing.JTextField();
        textmarka = new javax.swing.JTextField();
        texttur = new javax.swing.JTextField();
        textstok = new javax.swing.JTextField();
        textfiyat = new javax.swing.JTextField();
        texttur_id = new javax.swing.JTextField();
        geritusu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        kadinguncelletablo.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "kadin_id", "renk", "beden", "marka", "tur", "stoksayisi", "fiyat", "tur_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kadinguncelletablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kadinguncelletabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kadinguncelletablo);

        guncelletusu.setText("Güncelle");
        guncelletusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelletusuActionPerformed(evt);
            }
        });

        renk.setText("Renk:");

        marka.setText("Marka:");

        tur.setText("Tur:");

        stok.setText("Stok Sayisi");

        beden3.setText("Fiyat:");

        beden4.setText("Beden:");

        beden5.setText("Tur_id:");

        geritusu.setText("Geri");
        geritusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geritusuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(guncelletusu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(renk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beden3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beden4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beden5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(geritusu, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(textfiyat, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(textstok, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texttur, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textmarka, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textbeden, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textrenk, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texttur_id))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(geritusu)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(textrenk)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(textbeden, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(beden4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(marka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textmarka, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(texttur, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textstok, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beden3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(textfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(beden5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texttur_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guncelletusu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void guncelletusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelletusuActionPerformed
        kadin k = new kadin();
        kadindao k_dao = new kadindao();
          k.setRenk(textrenk.getText());
        k.setBeden(textbeden.getText());
        k.setMarka(textmarka.getText());
        k.setTur(texttur.getText());
        int stok = Integer.parseInt(textstok.getText());
        k.setStoksayisi(stok);
        float fiyat = Float.parseFloat(textfiyat.getText());
        k.setFiyat(fiyat);
        int tur_id = Integer.parseInt(texttur_id.getText());
        k.setTur_id(tur_id);
        k.setKadin_id(kadin_id);
        k_dao.updateGuncelle(k);
        listele();

    }//GEN-LAST:event_guncelletusuActionPerformed


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listele();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void geritusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geritusuActionPerformed
        dispose();
        kadinKiyafet yeni = new kadinKiyafet();
        yeni.setVisible(true);
    }//GEN-LAST:event_geritusuActionPerformed

    private void kadinguncelletabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kadinguncelletabloMouseClicked
        kadindao k_dao = new kadindao();
        String selectedData = null;
        kadinguncelletablo.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = kadinguncelletablo.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        int[] selectedRow = kadinguncelletablo.getSelectedRows();
        int[] selectedColumns = kadinguncelletablo.getSelectedColumns();
        for (int i = 0; i < selectedRow.length; i++) {
            selectedData = (String) kadinguncelletablo.getValueAt(selectedRow[i], 0);
        }
        System.out.println("Selected: " + selectedData);
        int get_id = Integer.parseInt(selectedData);
        kadin k = new kadin();
        k = k_dao.find(get_id);
        textrenk.setText(k.getRenk());
        textbeden.setText(k.getBeden());
        textmarka.setText(k.getMarka());
        texttur.setText(k.getTur());
        String stok = "" + k.getStoksayisi();
        textstok.setText(stok);
        String fiyat = "" + k.getFiyat();
        textfiyat.setText(fiyat);
        String tur_id = "" + k.getTur_id();
        texttur_id.setText(tur_id);
        kadin_id = Integer.parseInt(selectedData);
    }//GEN-LAST:event_kadinguncelletabloMouseClicked

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
            java.util.logging.Logger.getLogger(kadinGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kadinGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kadinGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kadinGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kadinGuncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beden3;
    private javax.swing.JLabel beden4;
    private javax.swing.JLabel beden5;
    private javax.swing.JButton geritusu;
    private javax.swing.JButton guncelletusu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kadinguncelletablo;
    private javax.swing.JLabel marka;
    private javax.swing.JLabel renk;
    private javax.swing.JLabel stok;
    private javax.swing.JTextField textbeden;
    private javax.swing.JTextField textfiyat;
    private javax.swing.JTextField textmarka;
    private javax.swing.JTextField textrenk;
    private javax.swing.JTextField textstok;
    private javax.swing.JTextField texttur;
    private javax.swing.JTextField texttur_id;
    private javax.swing.JLabel tur;
    // End of variables declaration//GEN-END:variables
}
