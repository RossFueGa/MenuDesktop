/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Charo
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        setBounds(500, 70, 400,600);
        this.ojoHide.setVisible(false);
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
        ojoHide = new javax.swing.JLabel();
        ojoshow = new javax.swing.JLabel();
        pssword = new javax.swing.JPasswordField();
        txt_usuario = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(null);
        jPanel1.setMinimumSize(new java.awt.Dimension(366, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ojoHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/hide24.png"))); // NOI18N
        ojoHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ojoHideMousePressed(evt);
            }
        });
        jPanel1.add(ojoHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 274, 30, 20));

        ojoshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/abrir_24dp.png"))); // NOI18N
        ojoshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ojoshowMousePressed(evt);
            }
        });
        jPanel1.add(ojoshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 274, 30, 20));

        pssword.setBackground(new java.awt.Color(23, 77, 142));
        pssword.setForeground(new java.awt.Color(241, 240, 240));
        pssword.setBorder(null);
        pssword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psswordActionPerformed(evt);
            }
        });
        jPanel1.add(pssword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 277, 200, 20));

        txt_usuario.setBackground(new java.awt.Color(23, 77, 142));
        txt_usuario.setForeground(new java.awt.Color(241, 240, 240));
        txt_usuario.setBorder(null);
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 184, 210, 20));

        btn_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aceptarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 180, 40));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 40, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/sesionI.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 366, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aceptarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_btn_aceptarMouseClicked

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void psswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psswordActionPerformed

    private void ojoshowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoshowMousePressed
        // TODO add your handling code here:
        ojoHide.setVisible(true);
        ojoshow.setVisible(false);
        pssword.setEchoChar((char)0);
    }//GEN-LAST:event_ojoshowMousePressed

    private void ojoHideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoHideMousePressed
        // TODO add your handling code here:
        ojoshow.setVisible(true);
        ojoHide.setVisible(false);
        pssword.setEchoChar('*');
    }//GEN-LAST:event_ojoHideMousePressed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ojoHide;
    private javax.swing.JLabel ojoshow;
    private javax.swing.JPasswordField pssword;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
