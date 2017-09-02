/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Lokacija;
import domen.OpstiDomenskiObjekat;
import domen.Region;
import domen.Tim;
import java.awt.Color;
import static java.lang.Character.isLetter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import komunikacija.Komunikacija;
import kontroler.GUIKontroler;
import operacije.Operacija;
import table.model.TeamTable;
import table.model.TimoviTableModel;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;
import transfer.StatusZahteva;

/**
 *
 * @author filip_000
 */
public class UnosTimova extends javax.swing.JDialog {

    private boolean flag;
    private int idTima;
    private Tim tim;
    private static UnosTimova instance;
    private ArrayList<Region> listaR;
    private ArrayList<Lokacija> listaL;
    Double gold = 0.0;

    private UnosTimova() {

    }

    public static UnosTimova getInstance() {
        if (instance == null) {
            instance = new UnosTimova();
        }
        return instance;
    }

    /**
     * Creates new form UnosTimova
     */
    public UnosTimova(java.awt.Frame parent, boolean modal, boolean flag) throws Exception {
        super(parent, modal);
        this.flag = flag;
        listaR = vratiListuR();
        listaL = vratiListuL();
        initComponents();
        srediTextFieldSignedIn();
        popuniKombove();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFieldNazivTima = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFieldTrener = new javax.swing.JTextField();
        txtFieldSponzor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldZaradjenNovac = new javax.swing.JTextField();
        btnSacuvajTim = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtFieldMenadzer = new javax.swing.JTextField();
        comboRegion = new javax.swing.JComboBox<Region>();
        comboLokacija = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jcbCSGO = new javax.swing.JCheckBox();
        jcbDota2 = new javax.swing.JCheckBox();
        jlblNazivTImaPoruka = new javax.swing.JLabel();
        jlblTrenerPoruka = new javax.swing.JLabel();
        jlbMenadzerPoruka = new javax.swing.JLabel();
        jlblSponzorPoruka = new javax.swing.JLabel();
        jlblZaradjenNovacPoruka = new javax.swing.JLabel();
        jlblIgreKojeTimIgraPoruka = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFieldSignedUser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUnosTimova = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("[CSGO] Insert a Team");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Team"));

        jLabel1.setText("Team name:");

        txtFieldNazivTima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldNazivTimaKeyPressed(evt);
            }
        });

        jLabel2.setText("Location:");

        jLabel3.setText("Region:");

        jLabel4.setText("Coach:");

        txtFieldTrener.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldTrenerKeyPressed(evt);
            }
        });

        txtFieldSponzor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldSponzorKeyPressed(evt);
            }
        });

        jLabel5.setText("Sponsor:");

        jLabel6.setText("Earned Money:");

        txtFieldZaradjenNovac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldZaradjenNovacKeyPressed(evt);
            }
        });

        btnSacuvajTim.setText("Save Team");
        btnSacuvajTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajTimActionPerformed(evt);
            }
        });

        jLabel13.setText("Manager:");

        txtFieldMenadzer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldMenadzerKeyPressed(evt);
            }
        });

        comboRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRegionActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Games which team plays:"));

        jcbCSGO.setText("Counter-Strike: Global Offensive");

        jcbDota2.setText("Dota 2");
        jcbDota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDota2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbDota2)
                    .addComponent(jcbCSGO, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbCSGO)
                .addGap(18, 18, 18)
                .addComponent(jcbDota2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jlblNazivTImaPoruka.setForeground(new java.awt.Color(255, 0, 0));

        jlblTrenerPoruka.setForeground(new java.awt.Color(255, 0, 0));

        jlbMenadzerPoruka.setForeground(new java.awt.Color(255, 0, 0));

        jlblSponzorPoruka.setForeground(new java.awt.Color(255, 0, 0));

        jlblZaradjenNovacPoruka.setForeground(new java.awt.Color(255, 0, 0));

        jlblIgreKojeTimIgraPoruka.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldNazivTima, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldMenadzer, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldTrener, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldSponzor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboLokacija, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldZaradjenNovac, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlblSponzorPoruka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jlbMenadzerPoruka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblTrenerPoruka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblNazivTImaPoruka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblZaradjenNovacPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblIgreKojeTimIgraPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSacuvajTim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFieldNazivTima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblNazivTImaPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(txtFieldTrener)
                    .addComponent(jlblTrenerPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbMenadzerPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFieldMenadzer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblSponzorPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFieldSponzor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLokacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFieldZaradjenNovac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jlblZaradjenNovacPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jlblIgreKojeTimIgraPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110)
                .addComponent(btnSacuvajTim)
                .addContainerGap())
        );

        jLabel7.setText("Signed in user:");

        tabelaUnosTimova.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaUnosTimova);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldSignedUser, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(txtFieldSignedUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajTimActionPerformed
        try {
            String naziv = txtFieldNazivTima.getText().trim();
            String trener = txtFieldTrener.getText().trim();
            String menadzer = txtFieldMenadzer.getText().trim();
            String sponzor = txtFieldSponzor.getText().trim();
            Region region = (Region) comboRegion.getSelectedItem();
            Lokacija lokacija = (Lokacija) comboLokacija.getSelectedItem();
            String novac = txtFieldZaradjenNovac.getText().trim();
            Tim tim;

            String igre = "";
            if (jcbCSGO.isSelected()) {
                igre += "CSGO";
            }
            if (jcbDota2.isSelected()) {
                igre += "Dota2";
            }

            if (izvrsiValidaciju(naziv, trener, menadzer, sponzor, region, lokacija, igre, novac) == true) {
                tim = vratiTim(naziv, trener, menadzer, sponzor, region, lokacija, igre, novac);
                KlijentskiZahtev kz = new KlijentskiZahtev();
                kz.setOperacija(Operacija.SACUVAJ);
                kz.setParametar(tim);
                Komunikacija.getInstance().posaljiZahtev(kz);

                ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
                if (so.getStatusZahteva() == StatusZahteva.USPESAN_ZAHTEV) {
                    JOptionPane.showMessageDialog(this, "Team has been successfully saved!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    TeamTable tt = (TeamTable) tabelaUnosTimova.getModel();
                    tt.osvezi();
                    popuniTabelu();
                    int reply = JOptionPane.showConfirmDialog(this, "Do you want to insert new Team? If not, you will be directed to previous menu.", "Info", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        //nista
                    } else {
                        dispose();
                        setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Team has not been saved.", "Error", JOptionPane.ERROR_MESSAGE);
                    invalidate();
                    repaint();
                    validate();
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Failed validation. Check all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                invalidate();
                repaint();
                validate();
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(UnosTimova.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSacuvajTimActionPerformed

    private void jcbDota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDota2ActionPerformed

    private void txtFieldNazivTimaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldNazivTimaKeyPressed
        jlblNazivTImaPoruka.setText("");
    }//GEN-LAST:event_txtFieldNazivTimaKeyPressed

    private void txtFieldTrenerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldTrenerKeyPressed
        jlblTrenerPoruka.setText("");
    }//GEN-LAST:event_txtFieldTrenerKeyPressed

    private void txtFieldMenadzerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldMenadzerKeyPressed
        jlbMenadzerPoruka.setText("");
    }//GEN-LAST:event_txtFieldMenadzerKeyPressed

    private void txtFieldSponzorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldSponzorKeyPressed
        jlblSponzorPoruka.setText("");
    }//GEN-LAST:event_txtFieldSponzorKeyPressed

    private void txtFieldZaradjenNovacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldZaradjenNovacKeyPressed
        jlblZaradjenNovacPoruka.setText("");
    }//GEN-LAST:event_txtFieldZaradjenNovacKeyPressed

    private void comboRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRegionActionPerformed
        Region r = (Region) comboRegion.getSelectedItem();
//        popuniListuLokacija(r);
    }//GEN-LAST:event_comboRegionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacuvajTim;
    private javax.swing.JComboBox comboLokacija;
    private javax.swing.JComboBox<Region> comboRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbCSGO;
    private javax.swing.JCheckBox jcbDota2;
    private javax.swing.JLabel jlbMenadzerPoruka;
    private javax.swing.JLabel jlblIgreKojeTimIgraPoruka;
    private javax.swing.JLabel jlblNazivTImaPoruka;
    private javax.swing.JLabel jlblSponzorPoruka;
    private javax.swing.JLabel jlblTrenerPoruka;
    private javax.swing.JLabel jlblZaradjenNovacPoruka;
    private javax.swing.JTable tabelaUnosTimova;
    private javax.swing.JTextField txtFieldMenadzer;
    private javax.swing.JTextField txtFieldNazivTima;
    private javax.swing.JTextField txtFieldSignedUser;
    private javax.swing.JTextField txtFieldSponzor;
    private javax.swing.JTextField txtFieldTrener;
    private javax.swing.JTextField txtFieldZaradjenNovac;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Region> vratiListuR() throws Exception {
        List<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Region());
        ArrayList<Region> lista = new ArrayList<>();
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            lista.add((Region) opstiDomenskiObjekat);
        }

        return lista;
    }

    private ArrayList<Lokacija> vratiListuL() throws Exception {
        List<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Lokacija());
        ArrayList<Lokacija> lista = new ArrayList<>();
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            lista.add((Lokacija) opstiDomenskiObjekat);
        }
        return lista;
    }

    private boolean izvrsiValidaciju(String naziv, String trener, String menadzer, String sponzor, Region region, Lokacija lokacija, String igre, String novac) throws Exception {
        boolean validnaForma = true;
        ArrayList<Tim> listaTimova = new ArrayList<>();
        ArrayList<OpstiDomenskiObjekat> list = GUIKontroler.getInstance().vratiListu(new Tim());
        for (OpstiDomenskiObjekat opstiDomenskiObjekat : list) {
            listaTimova.add((Tim) opstiDomenskiObjekat);
        }
        if (naziv == null || naziv.isEmpty()) {
            jlblNazivTImaPoruka.setText("Field for team name is empty.");
            jlblNazivTImaPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblNazivTImaPoruka.setText("");
        }

        if (trener == null || trener.isEmpty()) {
            jlblTrenerPoruka.setText("Field for coach is empty.");
            jlblTrenerPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblTrenerPoruka.setText("");
        }

        if (menadzer == null || menadzer.isEmpty()) {
            jlbMenadzerPoruka.setText("Field for manager is empty.");
            jlbMenadzerPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlbMenadzerPoruka.setText("");
        }

        if (sponzor == null || sponzor.isEmpty()) {
            jlblSponzorPoruka.setText("Field for sponsor is empty.");
            jlblSponzorPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblSponzorPoruka.setText("");
        }

        if (novac == null || novac.isEmpty()) {
            jlblZaradjenNovacPoruka.setText("Field for money is empty.");
            jlblZaradjenNovacPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblZaradjenNovacPoruka.setText("");
            for (int i = 0; i < novac.length(); i++) {
                if (!Character.isDigit(novac.charAt(i))) {
                    jlblZaradjenNovacPoruka.setText("Only numbers can be accepted here.");
                    jlblZaradjenNovacPoruka.setForeground(Color.red);
                    validnaForma = false;
                    break;
                }
            }
        }

        if (igre == null || igre.isEmpty()) {
            jlblIgreKojeTimIgraPoruka.setText("At least one option must be checked.");
            jlblIgreKojeTimIgraPoruka.setForeground(Color.red);
            validnaForma = false;
        } else {
            jlblIgreKojeTimIgraPoruka.setText("");
        }

        for (Tim tim : listaTimova) {
            if (tim.getNaziv().equals(naziv)) {
                JOptionPane.showMessageDialog(this, "Team with given name already exist. Please, try another.", "Error", JOptionPane.ERROR_MESSAGE);
                validnaForma = false;
            }
        }

        boolean prosao = true;
        for (int i = 0; i < novac.length(); i++) {
            if (isLetter(novac.charAt(i)) || novac.isEmpty()) {
                validnaForma = false;
                prosao = false;
                break;
            }
        }

        try {
            if (prosao == true) {
                gold = Double.parseDouble(novac);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        if (!validnaForma) {
            JOptionPane.showMessageDialog(this, "You didn't provide info for all fields on the form or you have some input errors.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void srediTextFieldSignedIn() {
        if (txtFieldSignedUser.getText().isEmpty()) {
            txtFieldSignedUser.setText(GUIKontroler.getInstance().postaviUlogovanogKorisnika());
            txtFieldSignedUser.setEditable(false);
        }
    }

    private Tim vratiTim(String naziv, String trener, String menadzer, String sponzor, Region region, Lokacija lokacija, String igre, String novac) {
        return new Tim(idTima, naziv, trener, menadzer, sponzor, igre, gold, region, lokacija);
    }

    private void popuniKombove() {
        comboLokacija.removeAllItems();
        comboRegion.removeAllItems();

        for (Region region : listaR) {
            comboRegion.addItem(region);
        }
        for (Lokacija lokacija : listaL) {
            comboLokacija.addItem(lokacija);
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
            tabelaUnosTimova.setModel(tableModel);
        } catch (Exception ex) {
            Logger.getLogger(UnosTimova.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
