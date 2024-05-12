package LoginForm;

import Notification.*;
import RegisterForm.*;
import Regulations.*;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.logging.*;
import javafx.scene.control.*;
import javax.swing.*;
import javax.swing.plaf.*;

public class LoginDashboard extends javax.swing.JFrame {

    Color focused = new Color(0, 249, 255);
    Color unfocused = new Color(0, 0, 0);

    public LoginDashboard() {
        initComponents();

//        setOpacity(0.7f);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        back.setFocusable(false);

        LoginDSB login = new LoginDSB();
        RegisterDSB register = new RegisterDSB();
        slide.setAnimate(10);
        slide.init(login, register);
        login.addEventRegister(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                slide.show(1);
                register.register();
            }
        });
        register.addEventBackLogin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                slide.show(0);
                login.login();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        slide = new Swing.SlidePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1300, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        back.setText("EXIT");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, 90, 30));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 720, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);
        Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
        JOptionPane.showMessageDialog(null, "THANKS FOR YOUR TIME, GOODBYE!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
        System.exit(0);
    }//GEN-LAST:event_backActionPerformed
    public static void main(String args[]) {
        FlatLightLaf.registerCustomDefaultsSource("Style");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel jPanel1;
    private Swing.SlidePanel slide;
    // End of variables declaration//GEN-END:variables
}
