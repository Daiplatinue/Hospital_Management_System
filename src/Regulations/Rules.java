package Regulations;

import LoginForm.LoginDashboard;
import Notification.Notification;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.ui.FlatLineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Rules extends javax.swing.JFrame {

    public Rules() {
        initComponents();

        jButton1.setFocusable(false);
        jButton2.setFocusable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 180));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 15)); // NOI18N
        jLabel1.setText("WE BELIEVE IN FOSTERING YOUR WELL-BEING THROUGH PERSONALIZED CARE AND UNWAVERING SUPPORT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        jLabel3.setText("PAYMENT INFO FOR BILLING PURPOSES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 25)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hospita.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel5.setText("PLEASE READ AND UNDERSTAND OUR TERMS OF SERVICE AND PRIVACY POLICY");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        jLabel9.setText("FROM UNAUTHORIZED ACCESS, DISCLOSURE, ALTERATION, OR DESTRUCTION.");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 25)); // NOI18N
        jLabel11.setText("AURORA WELLNESS PAVILION");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        jLabel6.setText("USAGE DATA INCLUDING APPOINTMENT BOOKINGS,  AND");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 15)); // NOI18N
        jLabel10.setText("• INFORMATION COLLECTION •");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        jLabel12.setText(" WE COLLECT PERSONAL DETAILS LIKE YOUR NAME, CONTACT INFO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        jLabel14.setText("ACCESS CONTROLS, AND REGULAR SECURITY AUDITS, PROTECTING IT");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 15)); // NOI18N
        jLabel15.setText("•  DATA SECURITY  •");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        jLabel16.setText(" WE ENSURE YOUR INFORMATION IS SECURE THROUGH ENCRYPTION,");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jButton1.setText("DECLINE");
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 120, 30));

        jButton2.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jButton2.setText("ACCEPT");
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 120, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 880, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Notification panel = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Your About To Logged Out");
        panel.showNotification();

        Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/warning.png"));
        JOptionPane.showMessageDialog(null, "THANKS FOR YOUR TIME, GOODBYE!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Notification panel = new Notification(this, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "Welcome!");
        panel.showNotification();

        Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/sucess.png"));
        JOptionPane.showMessageDialog(null, "WELCOME TO AURORA WELLNESS PAVILION!", "SUCCESS", JOptionPane.WARNING_MESSAGE, customIcon);
        new LoginDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        FlatLightLaf.registerCustomDefaultsSource("Style");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Rules().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
