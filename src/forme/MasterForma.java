/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.Clock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import kontroler.GUIKontroler;

/**
 *
 * @author filip_000
 */
public class MasterForma extends javax.swing.JDialog {

    private static MasterForma instance;

    private Korisnik korisnik;
    public static boolean flag = true;

    public static MasterForma getInstance() {
        if (instance == null) {
            instance = new MasterForma(new javax.swing.JFrame(), true);
            postaviFlag();
        }
        return instance;
    }

    private static void postaviFlag() {
        flag = false;
    }

    /**
     * Creates new form MasterForma
     */
    public MasterForma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        srediPoziv();
    }

    private JPanel createBackgroundPanel() {
        return new JPanel() {
            BufferedImage image = null;

            {
                try {
                    image = ImageIO.read(getClass().getResource("mainMenu.jpg"));
                } catch (IOException ex) {
                    Logger.getLogger(TestBackgroundResize.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(500, 500);
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        AdministracijaTimova = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        AdministracijaTurnira = new javax.swing.JMenu();
        UnosTurnira = new javax.swing.JMenuItem();
        PretragaTurnira = new javax.swing.JMenuItem();
        BrisanjeTurnira = new javax.swing.JMenuItem();
        IzmenaTurnira = new javax.swing.JMenuItem();
        tournament = new javax.swing.JMenuItem();
        UnosRezultata = new javax.swing.JMenu();
        Unos = new javax.swing.JMenuItem();
        OAplikaciji = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        LogOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("[CSGO] Main Menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AdministracijaTimova.setText("Team Administration");

        jMenuItem2.setText("Team");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        AdministracijaTimova.add(jMenuItem2);

        menuBar.add(AdministracijaTimova);

        AdministracijaTurnira.setText("Tournament Administration");

        UnosTurnira.setText("Insert a Torunament");
        AdministracijaTurnira.add(UnosTurnira);

        PretragaTurnira.setText("Search of Tournaments");
        AdministracijaTurnira.add(PretragaTurnira);

        BrisanjeTurnira.setText("Deleting of Tournament");
        AdministracijaTurnira.add(BrisanjeTurnira);

        IzmenaTurnira.setText("Changing a Tournament");
        AdministracijaTurnira.add(IzmenaTurnira);

        tournament.setText("Tournamet");
        tournament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tournamentActionPerformed(evt);
            }
        });
        AdministracijaTurnira.add(tournament);

        menuBar.add(AdministracijaTurnira);

        UnosRezultata.setText("Insert of Results");
        UnosRezultata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnosRezultataActionPerformed(evt);
            }
        });

        Unos.setText("Insert ");
        Unos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnosActionPerformed(evt);
            }
        });
        UnosRezultata.add(Unos);

        menuBar.add(UnosRezultata);

        OAplikaciji.setText("About Application");

        jMenuItem1.setText("About an Author and Application");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        OAplikaciji.add(jMenuItem1);

        menuBar.add(OAplikaciji);

        LogOut.setText("Log Out");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        menuBar.add(LogOut);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 966, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UnosRezultataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnosRezultataActionPerformed
        try {
            JDialog dialog = new UnosRezultata(null, true);
            dialog.pack();
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MasterForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UnosRezultataActionPerformed

    private void UnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnosActionPerformed
        try {
            JDialog dialog = new UnosRezultata(null, true);
            dialog.pack();
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MasterForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UnosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            JDialog dialog = new OAplikaciji(null, true);
            dialog.pack();
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MasterForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        int reply = JOptionPane.showConfirmDialog(this, "Do you really want to Log out?", "Info", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
//            korisnik = GUIKontroler.getInstance().getTrenutnoUlogovani();
//            String username = korisnik.getUsername();
            JOptionPane.showMessageDialog(this, "Goodbye.", "Info", JOptionPane.INFORMATION_MESSAGE);
            GUIKontroler.getInstance().ugasiPocetnuFormu();
            try {
                GUIKontroler.getInstance().izbrisiUlogovanogKorisnikaIzListeAktivnihKorisnika(korisnik);
            } catch (Exception ex) {
                Logger.getLogger(MasterForma.class.getName()).log(Level.SEVERE, null, ex);
            }
            //GUIKontroler.getInstance().vratiFormu();
            System.exit(0);
        }
    }//GEN-LAST:event_LogOutActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        int reply = JOptionPane.showConfirmDialog(this, "Do you really want to Log out?", "Info", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            korisnik = GUIKontroler.getInstance().getTrenutnoUlogovani();
            JOptionPane.showMessageDialog(this, "Goodbye.", "Info", JOptionPane.INFORMATION_MESSAGE);
            try {
                GUIKontroler.getInstance().izbrisiUlogovanogKorisnikaIzListeAktivnihKorisnika(korisnik);
            } catch (Exception ex) {
                Logger.getLogger(MasterForma.class.getName()).log(Level.SEVERE, null, ex);
            }
            //GUIKontroler.getInstance().ugasiMasterFormu();
            //GUIKontroler.getInstance().vratiFormu();
            System.exit(0);
        }
    }//GEN-LAST:event_LogOutMouseClicked

    private void tournamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tournamentActionPerformed
    }//GEN-LAST:event_tournamentActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Team t = new Team(null, true);
        t.pack();
        t.setLocationRelativeTo(null);
        t.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MasterForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MasterForma dialog = getInstance();
                dialog.srediPanelSlike();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });

                //dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdministracijaTimova;
    private javax.swing.JMenu AdministracijaTurnira;
    private javax.swing.JMenuItem BrisanjeTurnira;
    private javax.swing.JMenuItem IzmenaTurnira;
    private javax.swing.JMenu LogOut;
    private javax.swing.JMenu OAplikaciji;
    private javax.swing.JMenuItem PretragaTurnira;
    private javax.swing.JMenuItem Unos;
    private javax.swing.JMenu UnosRezultata;
    private javax.swing.JMenuItem UnosTurnira;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem tournament;
    // End of variables declaration//GEN-END:variables

    public void srediPanelSlike() {
        MasterForma frame = getInstance();
        frame.setContentPane(createBackgroundPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = tk.getScreenSize().width;
        int ySize = tk.getScreenSize().height;
        frame.setSize(xSize, ySize);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void srediPoziv() {
        if (flag == true) {
            String korisnikUl = GUIKontroler.getInstance().postaviUlogovanogKorisnika();
            JOptionPane.showMessageDialog(this, "Welcome " + korisnikUl, "Info", JOptionPane.INFORMATION_MESSAGE);
            flag = false;
        }
    }
}
