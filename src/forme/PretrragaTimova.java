/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.OpstiDomenskiObjekat;
import domen.Tim;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import kontroler.GUIKontroler;
import table.model.TimoviTableModel;

/**
 *
 * @author Filip
 */
public class PretrragaTimova extends javax.swing.JDialog {

    /**
     * Creates new form PretrragaTimova
     */
    public PretrragaTimova(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initCustomCompoennts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSearchInput = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtZarNovacOd = new javax.swing.JTextField();
        txtZarNovDo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPretrazi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnManager = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnSponzor = new javax.swing.JButton();
        btnIgre = new javax.swing.JButton();
        btnObrisiFilter = new javax.swing.JButton();
        btnOtkazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("[CSGO] Advanced Search");

        jLabel1.setText("Search:");

        txtSearchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchInputKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Advanced Search\n"));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jLabel2.setText("Earned money:");

        txtZarNovDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZarNovDoActionPerformed(evt);
            }
        });

        jLabel3.setText("From:");

        jLabel4.setText("To:");

        btnPretrazi.setText("Search");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        jLabel5.setText("Search the Teams using other criteria:");

        btnManager.setText("Choose the Managers");
        btnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnSponzor.setText("Choose the Sponsors");
        btnSponzor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSponzorActionPerformed(evt);
            }
        });

        btnIgre.setText("Choose the games");
        btnIgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtZarNovacOd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtZarNovDo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPretrazi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnManager)
                        .addGap(18, 18, 18)
                        .addComponent(btnSponzor)
                        .addGap(18, 18, 18)
                        .addComponent(btnIgre)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZarNovacOd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZarNovDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(btnPretrazi)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManager)
                            .addComponent(btnSponzor)
                            .addComponent(btnIgre))
                        .addGap(19, 19, 19))))
            .addComponent(jSeparator3)
        );

        btnObrisiFilter.setText("Delete Filter");
        btnObrisiFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiFilterActionPerformed(evt);
            }
        });

        btnOtkazi.setText("Close");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchInput))
                    .addComponent(jSeparator2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnObrisiFilter)
                        .addGap(18, 18, 18)
                        .addComponent(btnOtkazi)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObrisiFilter)
                    .addComponent(btnOtkazi))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchInputKeyReleased
        filtirajTable(txtSearchInput.getText().trim());
    }//GEN-LAST:event_txtSearchInputKeyReleased

    private void txtZarNovDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZarNovDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZarNovDoActionPerformed

    private void btnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerActionPerformed
        List<String> manageri;

        try {
            manageri = kontroler.GUIKontroler.getInstance().vratiListuManagera();
        } catch (Exception ex) {
            Logger.getLogger(PretrragaTimova.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        JDialog jd = new NaprednaPretraga(null, true, manageri, this);
        jd.setLocationRelativeTo(null);

        jd.setVisible(true);
    }//GEN-LAST:event_btnManagerActionPerformed

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        if (txtZarNovacOd.getText().isEmpty() || txtZarNovDo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide both criteria (From - to) for search.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            int moneyFrom;
            try {
                moneyFrom = Integer.parseInt(txtZarNovacOd.getText().trim());
            } catch (NumberFormatException exception) {
                moneyFrom = -1;
            }
            int moneyTo;
            try {
                moneyTo = Integer.parseInt(txtZarNovDo.getText().trim());
            } catch (NumberFormatException exception) {
                moneyTo = -1;
            }

            TimoviTableModel tableModel = (TimoviTableModel) jTable1.getModel();
            tableModel.filtirajTabelaPoZaradi(moneyFrom, moneyTo);
        }
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void btnSponzorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSponzorActionPerformed
        List<String> sponzori;

        try {
            sponzori = kontroler.GUIKontroler.getInstance().vratiListuSponzora();
        } catch (Exception e) {
            Logger.getLogger(PretrragaTimova.class.getName()).log(Level.SEVERE, null, e);
            return;
        }

        JDialog jd = new NaprednaPretraga(null, true, sponzori, this);
        jd.setLocationRelativeTo(null);

        jd.setVisible(true);
    }//GEN-LAST:event_btnSponzorActionPerformed

    private void btnIgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgreActionPerformed
        List<String> igre;

        try {
            igre = kontroler.GUIKontroler.getInstance().vratiIgre();
        } catch (Exception e) {
            Logger.getLogger(PretrragaTimova.class.getName()).log(Level.SEVERE, null, e);
            return;
        }

        JDialog jd = new NaprednaPretraga(null, true, igre, this);
        jd.setLocationRelativeTo(null);

        jd.setVisible(true);
    }//GEN-LAST:event_btnIgreActionPerformed

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        int rez = JOptionPane.showConfirmDialog(this, "Are You sure that you want to quit?", "Info", JOptionPane.YES_NO_OPTION);
        if (rez == JOptionPane.YES_OPTION) {
            setVisible(false);
        }
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void btnObrisiFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiFilterActionPerformed
        obrisiFilter();
    }//GEN-LAST:event_btnObrisiFilterActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIgre;
    private javax.swing.JButton btnManager;
    private javax.swing.JButton btnObrisiFilter;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JButton btnSponzor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSearchInput;
    private javax.swing.JTextField txtZarNovDo;
    private javax.swing.JTextField txtZarNovacOd;
    // End of variables declaration//GEN-END:variables

    private void initCustomCompoennts() {
        List<Tim> spisakTimova = new ArrayList<>();
        try {

            List<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Tim());
            for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
                spisakTimova.add((Tim) opstiDomenskiObjekat);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Greska pri vracanju timova iz baze!", "Greska", JOptionPane.ERROR_MESSAGE);
        }

        TimoviTableModel tableModel = new TimoviTableModel(spisakTimova);
        jTable1.setModel(tableModel);
    }

    private void filtirajTable(String hint) {
        TimoviTableModel tableModel = (TimoviTableModel) jTable1.getModel();
        tableModel.filtirajTabela(hint);
    }

    void filtrirajPoNecemu(List<String> filter) {
        TimoviTableModel tableModel = (TimoviTableModel) jTable1.getModel();
        tableModel.filtrirajPoNecemu(filter);
    }

    void obrisiFilter() {
        TimoviTableModel tableModel = (TimoviTableModel) jTable1.getModel();
        tableModel.filtrirajPoNecemu(new ArrayList<>());
    }
}
