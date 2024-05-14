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

    public LoginDashboard() {
        initComponents();

//        setOpacity(0.7f);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        LoginDSB login = new LoginDSB();
        RegisterDSB register = new RegisterDSB();
        slide.setAnimate(20);
            
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
        slide = new Swing.SlidePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jPanel1.add(slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
    private javax.swing.JPanel jPanel1;
    public static Swing.SlidePanel slide;
    // End of variables declaration//GEN-END:variables
}
