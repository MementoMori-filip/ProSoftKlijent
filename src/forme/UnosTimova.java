/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Lokacija;
import domen.Region;
import domen.Tim;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontrolor.Kontrolor;

/**
 *
 * @author filip_000
 */
public class UnosTimova extends javax.swing.JDialog {

    private boolean flag;
    private int idTima;

    /**
     * Creates new form UnosTimova
     */
    public UnosTimova(java.awt.Frame parent, boolean modal, boolean flag) throws Exception {
        super(parent, modal);
        this.flag = flag;
        initComponents();
        popuniRegione();
        popuniLokacije();
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
        comboRegion = new javax.swing.JComboBox();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("[CSGO] Unos Timova");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tim"));

        jLabel1.setText("Naziv tima:");

        jLabel2.setText("Lokacija:");

        jLabel3.setText("Region:");

        jLabel4.setText("Trener:");

        jLabel5.setText("Sponzor:");

        jLabel6.setText("Zarađen novac:");

        btnSacuvajTim.setText("Sačuvaj tim");
        btnSacuvajTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajTimActionPerformed(evt);
            }
        });

        jLabel13.setText("Menadžer:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Igre koje tim igra"));

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
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                            .addComponent(txtFieldMenadzer, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlblNazivTImaPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFieldNazivTima, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlblTrenerPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFieldTrener, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                        .addComponent(jlbMenadzerPoruka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlblSponzorPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFieldSponzor)
                                .addComponent(comboRegion, 0, 221, Short.MAX_VALUE)
                                .addComponent(comboLokacija, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFieldZaradjenNovac)
                            .addComponent(jlblZaradjenNovacPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblIgreKojeTimIgraPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnSacuvajTim, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldNazivTima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblNazivTImaPoruka)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldTrener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblTrenerPoruka)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtFieldMenadzer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbMenadzerPoruka)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFieldSponzor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSponzorPoruka)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboLokacija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblIgreKojeTimIgraPoruka))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(txtFieldZaradjenNovac, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblZaradjenNovacPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnSacuvajTim)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajTimActionPerformed
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
            igre += "CSGO" + "";
            if (jcbDota2.isSelected()) {
                igre += "Dota2";
            }
        }

        try {
            tim = kreirajIIzvrsiValidaciju(naziv, trener, menadzer, sponzor, region, lokacija, igre, novac);
            Kontrolor.getInstance().sacuvajTim(tim);
            JOptionPane.showMessageDialog(this, "Tim je uspesno sacuvan", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(UnosTimova.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSacuvajTimActionPerformed

    private void jcbDota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDota2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacuvajTim;
    private javax.swing.JComboBox comboLokacija;
    private javax.swing.JComboBox comboRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jcbCSGO;
    private javax.swing.JCheckBox jcbDota2;
    private javax.swing.JLabel jlbMenadzerPoruka;
    private javax.swing.JLabel jlblIgreKojeTimIgraPoruka;
    private javax.swing.JLabel jlblNazivTImaPoruka;
    private javax.swing.JLabel jlblSponzorPoruka;
    private javax.swing.JLabel jlblTrenerPoruka;
    private javax.swing.JLabel jlblZaradjenNovacPoruka;
    private javax.swing.JTextField txtFieldMenadzer;
    private javax.swing.JTextField txtFieldNazivTima;
    private javax.swing.JTextField txtFieldSponzor;
    private javax.swing.JTextField txtFieldTrener;
    private javax.swing.JTextField txtFieldZaradjenNovac;
    // End of variables declaration//GEN-END:variables

    private void popuniRegione() throws Exception {
        comboRegion.removeAllItems();
        ArrayList<Region> lista = Kontrolor.getInstance().vratiListuRegiona();

        for (Region region : lista) {
            comboRegion.addItem(region);
        }
    }

    private void popuniLokacije() throws Exception {
        comboLokacija.removeAllItems();
        ArrayList<Lokacija> lista = Kontrolor.getInstance().vratiListuLokacija();

        for (Lokacija lokacija : lista) {
            comboLokacija.addItem(lokacija);
        }
    }

    private Tim kreirajIIzvrsiValidaciju(String naziv, String trener, String menadzer, String sponzor, Region region, Lokacija lokacija, String igre, String novac) throws Exception {
        boolean validnaForma = true;
        ArrayList<Tim> listaTimova = Kontrolor.getInstance().vratiListuTimova();

        if (naziv == null || naziv.isEmpty()) {
            jlblNazivTImaPoruka.setText("Nije unet naziv tima");
            jlblNazivTImaPoruka.setForeground(Color.red);
            validnaForma = false;
        }

        if (trener == null || trener.isEmpty()) {
            jlblTrenerPoruka.setText("Niste uneli trenera");
            jlblTrenerPoruka.setForeground(Color.red);
            validnaForma = false;
        }

        if (menadzer == null || menadzer.isEmpty()) {
            jlbMenadzerPoruka.setText("Niste uneli menadzera");
            jlbMenadzerPoruka.setForeground(Color.red);
            validnaForma = false;
        }
        
        if (sponzor == null || sponzor.isEmpty()) {
            jlblSponzorPoruka.setText("Niste uneli sponzora");
            jlblSponzorPoruka.setForeground(Color.red);
            validnaForma = false;
        }
        
        if (novac == null || novac.isEmpty()) {
            jlblZaradjenNovacPoruka.setText("Niste uneli iznos");
            jlblZaradjenNovacPoruka.setForeground(Color.red);
            validnaForma = false;
        }else{
            for (int i = 0; i < novac.length(); i++) {
                if (!Character.isDigit(novac.charAt(i))) {
                    jlblZaradjenNovacPoruka.setText("Morate uneti samo brojeve");
                    jlblZaradjenNovacPoruka.setForeground(Color.red);
                }
            }
        }
        
        if (igre == null || igre.isEmpty()) {
            jlblIgreKojeTimIgraPoruka.setText("Morate cekirati bar jednu opciju");
            jlblIgreKojeTimIgraPoruka.setForeground(Color.red);
            validnaForma = false;
        }
        
        for (Tim tim : listaTimova) {
            if (tim.getNaziv().equals(naziv)) {
                JOptionPane.showMessageDialog(this, "Tim sa datim nazivom vec postoji u bazi", "Error", JOptionPane.ERROR_MESSAGE);
                validnaForma = false;
            }
        }
        
        if (!validnaForma) {
            throw new Exception();
        }
        Double gold = Double.parseDouble(novac);
        
        return new Tim(idTima, naziv, trener, menadzer, sponzor, igre, gold, region, lokacija);
    }
}
