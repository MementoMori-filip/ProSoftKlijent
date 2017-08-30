/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.OpstiDomenskiObjekat;
import domen.Tim;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import kontroler.GUIKontroler;
import table.model.TeamTable;

/**
 *
 * @author ifpr85
 */
public class Team extends javax.swing.JDialog {

    /**
     * Creates new form Team
     */
    public Team(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        srediTextFieldSignedIn();
        popuniTabelu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtFieldSignedUser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTeam = new javax.swing.JTable();
        btnUnosNovogTima = new javax.swing.JButton();
        btnBrisanjeTima = new javax.swing.JButton();
        btnIzmeniTim = new javax.swing.JButton();
        btnNaprednaPretraga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Signed in user:");

        tabelaTeam.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaTeam);

        btnUnosNovogTima.setText("Insert a new Team");
        btnUnosNovogTima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnosNovogTimaActionPerformed(evt);
            }
        });

        btnBrisanjeTima.setText("Delete a selected Team");
        btnBrisanjeTima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeTimaActionPerformed(evt);
            }
        });

        btnIzmeniTim.setText("Change a selected Team");
        btnIzmeniTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniTimActionPerformed(evt);
            }
        });

        btnNaprednaPretraga.setText("Advanced Search");
        btnNaprednaPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaprednaPretragaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldSignedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)
                        .addComponent(btnUnosNovogTima)
                        .addGap(18, 18, 18)
                        .addComponent(btnBrisanjeTima)
                        .addGap(18, 18, 18)
                        .addComponent(btnIzmeniTim)
                        .addGap(18, 18, 18)
                        .addComponent(btnNaprednaPretraga)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(txtFieldSignedUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNaprednaPretraga)
                    .addComponent(btnIzmeniTim)
                    .addComponent(btnBrisanjeTima)
                    .addComponent(btnUnosNovogTima))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnosNovogTimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnosNovogTimaActionPerformed
        try {
            UnosTimova ut = new UnosTimova(new JFrame(), true, true);
            ut.setLocationRelativeTo(null);
            ut.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MasterForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUnosNovogTimaActionPerformed

    private void btnIzmeniTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniTimActionPerformed
        try {
            IzmenaTimova it = new IzmenaTimova(new JFrame(), true);
            it.setLocationRelativeTo(null);
            it.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MasterForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIzmeniTimActionPerformed

    private void btnNaprednaPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaprednaPretragaActionPerformed
        JDialog dialog = new PretrragaTimova(null, true);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnNaprednaPretragaActionPerformed

    private void btnBrisanjeTimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeTimaActionPerformed
        int row = tabelaTeam.getSelectedRow();
        int reply = JOptionPane.showConfirmDialog(this, "Do you really want to delete selected Team?", "Info", JOptionPane.YES_NO_OPTION);
        if (row != -1) {
            if (reply == JOptionPane.YES_OPTION) {
                TeamTable tt = (TeamTable) tabelaTeam.getModel();
                Tim tim = tt.vratiSelektovanTim(row);
                
                BrisanjeTima bt = new BrisanjeTima(null, true);
                bt.proslediTim(tim);
            } else {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnBrisanjeTimaActionPerformed

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
            java.util.logging.Logger.getLogger(Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Team.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Team dialog = new Team(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanjeTima;
    private javax.swing.JButton btnIzmeniTim;
    private javax.swing.JButton btnNaprednaPretraga;
    private javax.swing.JButton btnUnosNovogTima;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaTeam;
    private javax.swing.JTextField txtFieldSignedUser;
    // End of variables declaration//GEN-END:variables

    private void srediTextFieldSignedIn() {
        if (txtFieldSignedUser.getText().isEmpty()) {
            txtFieldSignedUser.setText(GUIKontroler.getInstance().postaviUlogovanogKorisnika());
            txtFieldSignedUser.setEditable(false);
        }
    }

    private void popuniTabelu() {
        ArrayList<Tim> spisakTimova = new ArrayList<>();
        try {
            ArrayList<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Tim());
            for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
                spisakTimova.add((Tim) opstiDomenskiObjekat);
            }
            TeamTable tableModel = new TeamTable(spisakTimova);
            tabelaTeam.setModel(tableModel);
        } catch (Exception ex) {
            Logger.getLogger(UnosTimova.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}