/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import domen.OpstiDomenskiObjekat;
import domen.Rezultat;
import domen.Tim;
import domen.Turnir;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import kontroler.GUIKontroler;
import table.model.RezultatiTabelModel;
import table.model.TabelaRezultatTim;

/**
 *
 * @author filip_000
 */
public class UnosRezultata extends javax.swing.JDialog {

    /**
     * Creates new form UnosRezultata
     */
    Korisnik korisnik;
    private ArrayList<Tim> listaTim = new ArrayList<>();
    private ArrayList<Turnir> listaTurnir = new ArrayList<>();

    public UnosRezultata(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        popuniKombove();
        srediSignedInUser();
        postaviKorisnika();
        popuniTabelu();
        popuniTabeleTimovaITurnira();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboTeam = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboTurnir = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtRezultat = new javax.swing.JTextField();
        btnSacuvajRezultat = new javax.swing.JButton();
        jlblPorukaRezultat = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRezultat = new javax.swing.JTable();
        btnIzmenaRezultata = new javax.swing.JButton();
        btnSacuvajIzmenjen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSignedUser = new javax.swing.JTextField();
        panelTurnir = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaTurnir = new javax.swing.JTable();
        panelTimovi = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaTeam = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("[CSGO] Entering Results");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Welcome to the page for entering results for Teams on Tournaments. ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null), "Results"));

        jLabel2.setText("Select a team:");

        jLabel3.setText("Select a tournament:");

        jLabel4.setText("Enter result:");

        btnSacuvajRezultat.setText("Save a result");
        btnSacuvajRezultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajRezultatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSacuvajRezultat)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblPorukaRezultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboTurnir, 0, 275, Short.MAX_VALUE)
                    .addComponent(txtRezultat)
                    .addComponent(comboTeam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboTurnir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlblPorukaRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnSacuvajRezultat)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "All results"));

        tabelaRezultat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaRezultat);

        btnIzmenaRezultata.setText("Change a result");
        btnIzmenaRezultata.setEnabled(false);
        btnIzmenaRezultata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmenaRezultataActionPerformed(evt);
            }
        });

        btnSacuvajIzmenjen.setText("Save a changed result");
        btnSacuvajIzmenjen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajIzmenjenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIzmenaRezultata)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSacuvajIzmenjen))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzmenaRezultata)
                    .addComponent(btnSacuvajIzmenjen))
                .addContainerGap())
        );

        jLabel5.setText("Signed in user:");

        panelTurnir.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "All Tournaments"));

        tabelaTurnir.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabelaTurnir);

        javax.swing.GroupLayout panelTurnirLayout = new javax.swing.GroupLayout(panelTurnir);
        panelTurnir.setLayout(panelTurnirLayout);
        panelTurnirLayout.setHorizontalGroup(
            panelTurnirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnirLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelTurnirLayout.setVerticalGroup(
            panelTurnirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTimovi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "All Teams"));

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
        jScrollPane2.setViewportView(tabelaTeam);

        javax.swing.GroupLayout panelTimoviLayout = new javax.swing.GroupLayout(panelTimovi);
        panelTimovi.setLayout(panelTimoviLayout);
        panelTimoviLayout.setHorizontalGroup(
            panelTimoviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimoviLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelTimoviLayout.setVerticalGroup(
            panelTimoviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimoviLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setText("All Teams and all Tournaments available from Database:");

        jLabel7.setText("Section for entering and viewing Results:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtSignedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panelTimovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelTurnir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSignedUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTimovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTurnir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajRezultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajRezultatActionPerformed
        try {
            Tim tim = (Tim) comboTeam.getSelectedItem();
            Turnir turnir = (Turnir) comboTurnir.getSelectedItem();
            String rezultat = txtRezultat.getText();

            Rezultat rez = new Rezultat();
            rez.setTim(tim);
            rez.setTurnir(turnir);
            rez.setRezultat(rezultat);
            rez.setKorisnik(korisnik);

            RezultatiTabelModel rezultatiTabelModel = (RezultatiTabelModel) tabelaRezultat.getModel();
            rezultatiTabelModel.dodajNoviRezultat(rez);
            JOptionPane.showMessageDialog(null, "Uspesno sacuvani rezultati");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSacuvajRezultatActionPerformed

    private void btnIzmenaRezultataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmenaRezultataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzmenaRezultataActionPerformed

    private void btnSacuvajIzmenjenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajIzmenjenActionPerformed
        RezultatiTabelModel rezultatiTabelModel = (RezultatiTabelModel) tabelaRezultat.getModel();
        try {
            GUIKontroler.getInstance().sacuvajListuRezultata(rezultatiTabelModel.getSpisakRezultata());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSacuvajIzmenjenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmenaRezultata;
    private javax.swing.JButton btnSacuvajIzmenjen;
    private javax.swing.JButton btnSacuvajRezultat;
    private javax.swing.JComboBox comboTeam;
    private javax.swing.JComboBox comboTurnir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlblPorukaRezultat;
    private javax.swing.JPanel panelTimovi;
    private javax.swing.JPanel panelTurnir;
    private javax.swing.JTable tabelaRezultat;
    private javax.swing.JTable tabelaTeam;
    private javax.swing.JTable tabelaTurnir;
    private javax.swing.JTextField txtRezultat;
    private javax.swing.JTextField txtSignedUser;
    // End of variables declaration//GEN-END:variables

    private void popuniKombove() throws Exception {
        comboTeam.removeAllItems();
        comboTurnir.removeAllItems();

        ArrayList<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Tim());
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            listaTim.add((Tim) opstiDomenskiObjekat);
        }
        list = GUIKontroler.getInstance().vratiListu(new Turnir());
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            listaTurnir.add((Turnir) opstiDomenskiObjekat);
        }

        for (Tim tim : listaTim) {
            comboTeam.addItem(tim);
        }

        for (Turnir turnir : listaTurnir) {
            comboTurnir.addItem(turnir);
        }
    }

    private void srediSignedInUser() {
        if (txtSignedUser.getText().isEmpty()) {
            txtSignedUser.setText(GUIKontroler.getInstance().postaviUlogovanogKorisnika());
            txtSignedUser.setEditable(false);
        }
    }

    private void postaviKorisnika() {
        korisnik = new Korisnik();
        korisnik.setUsername(GUIKontroler.getInstance().postaviUlogovanogKorisnika());
    }

    private void popuniTabelu() {
        try {
            RezultatiTabelModel model = new RezultatiTabelModel(GUIKontroler.getInstance().vratiListu(new Rezultat()));
            tabelaRezultat.setModel(model);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void popuniTabeleTimovaITurnira() {
        try {
            TabelaRezultatTim trt = new TabelaRezultatTim(GUIKontroler.getInstance().vratiListu(new Tim()));
            tabelaTeam.setModel(trt);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
