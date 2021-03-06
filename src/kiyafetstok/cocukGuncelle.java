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
import kiyafetstok.DAO.cocukdao;
import kiyafetstok.DAO.erkekdao;

/**
 *
 * @author Bedran Özcan
 */
public class cocukGuncelle extends javax.swing.JFrame {

    public int cocuk_id;

    public void listele() {
        cocukdao cdao = new cocukdao();
        cdao.findAll();
        ArrayList<cocuk> cocuk = new ArrayList<>();

        cocuk = (ArrayList<cocuk>) cdao.findAll();
        System.out.println(cocuk.toString());
        String dizim[][] = new String[cocuk.size()][];

        for (int i = 0; i < cocuk.size(); i++) {
            dizim[i] = new String[]{
                String.valueOf(cocuk.get(i).getCocuk_id()),
                valueOf(cocuk.get(i).getRenk()),
                valueOf(cocuk.get(i).getBeden()),
                valueOf(cocuk.get(i).getTur()),
                valueOf(cocuk.get(i).getStoksayisi()),
                valueOf(cocuk.get(i).getFiyat()),
                valueOf(cocuk.get(i).getTur_id())

            };

        }
        TableModel tabloModeli = new DefaultTableModel(
                dizim,
                new String[]{"cocuk_id", "renk", "marka", "beden", "stoksayisi", "fiyat", "tur_id"}
        );

        cocukguncelletablo.setModel(tabloModeli);

        System.out.println(cdao.findAll());
    }

    /**
     * Creates new form cocukGuncelle
     */
    public cocukGuncelle() {
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
        cocukguncelletablo = new javax.swing.JTable();
        geritusu = new javax.swing.JButton();
        renk = new javax.swing.JLabel();
        marka = new javax.swing.JLabel();
        beden = new javax.swing.JLabel();
        stok = new javax.swing.JLabel();
        tur = new javax.swing.JLabel();
        Fiyat = new javax.swing.JLabel();
        tur_id = new javax.swing.JLabel();
        textrenk = new javax.swing.JTextField();
        textmarka = new javax.swing.JTextField();
        textstok = new javax.swing.JTextField();
        textbeden = new javax.swing.JTextField();
        textfiyat = new javax.swing.JTextField();
        texttur_id = new javax.swing.JTextField();
        texttur = new javax.swing.JTextField();
        guncelletusu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cocukguncelletablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "cocuk_id", "Renk", "Beden", "Marka", "Tur", "Stok Sayisi", "Fiyat", "Tur_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cocukguncelletablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cocukguncelletabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cocukguncelletablo);

        geritusu.setText("Geri");
        geritusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geritusuActionPerformed(evt);
            }
        });

        renk.setText("Renk:");

        marka.setText("Tur:");

        beden.setText("Beden:");

        stok.setText("Stok Sayisi");

        tur.setText("Marka:");

        Fiyat.setText("Fiyat");

        tur_id.setText("Tur_id:");

        guncelletusu.setText("Güncelle");
        guncelletusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelletusuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geritusu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textrenk, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tur_id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfiyat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texttur_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tur, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beden, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textmarka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textbeden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textstok, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texttur, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guncelletusu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geritusu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(renk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textrenk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(beden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textbeden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tur, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textmarka, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(marka, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texttur, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tur_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texttur_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(textstok, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textfiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guncelletusu, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listele();
    }//GEN-LAST:event_formWindowOpened

    private void cocukguncelletabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cocukguncelletabloMouseClicked
        cocukdao cdao = new cocukdao();
        String selectedData = null;
        cocukguncelletablo.setCellSelectionEnabled(true);
        ListSelectionModel cellSelectionModel = cocukguncelletablo.getSelectionModel();
        cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        int[] selectedRow = cocukguncelletablo.getSelectedRows();
        int[] selectedColumns = cocukguncelletablo.getSelectedColumns();
        for (int i = 0; i < selectedRow.length; i++) {
            selectedData = (String) cocukguncelletablo.getValueAt(selectedRow[i], 0);
        }
        System.out.println("Selected: " + selectedData);
        int get_id = Integer.parseInt(selectedData);
        cocuk c = new cocuk();
        c = cdao.find(get_id);
        textrenk.setText(c.getRenk());
        textbeden.setText(c.getBeden());
        textmarka.setText(c.getMarka());
        texttur.setText(c.getTur());
        String stok = "" + c.getStoksayisi();
        textstok.setText(stok);
        String fiyat = "" + c.getFiyat();
        textfiyat.setText(fiyat);
        String tur_id = "" + c.getTur_id();
        texttur_id.setText(tur_id);
        cocuk_id = Integer.parseInt(selectedData);
    }//GEN-LAST:event_cocukguncelletabloMouseClicked

    private void guncelletusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelletusuActionPerformed
        cocuk c = new cocuk();
        cocukdao cdao = new cocukdao();
        c.setRenk(textrenk.getText());
        c.setBeden(textbeden.getText());
        c.setMarka(textmarka.getText());
        c.setTur(texttur.getText());
        int stok2 = Integer.parseInt(textstok.getText());
        c.setStoksayisi(stok2);
        float fiyat = Float.parseFloat(textfiyat.getText());
        c.setFiyat(fiyat);
        int tur_id = Integer.parseInt(texttur_id.getText());
        c.setTur_id(tur_id);
        c.setCocuk_id(cocuk_id);
        cdao.updateGuncelle(c);
        listele();
    }//GEN-LAST:event_guncelletusuActionPerformed

    private void geritusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geritusuActionPerformed
        dispose();
        cocukKiyafet yeni = new cocukKiyafet();
        yeni.setVisible(true);
    }//GEN-LAST:event_geritusuActionPerformed

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
            java.util.logging.Logger.getLogger(cocukGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cocukGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cocukGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cocukGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cocukGuncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fiyat;
    private javax.swing.JLabel beden;
    private javax.swing.JTable cocukguncelletablo;
    private javax.swing.JButton geritusu;
    private javax.swing.JButton guncelletusu;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel tur_id;
    // End of variables declaration//GEN-END:variables
}
