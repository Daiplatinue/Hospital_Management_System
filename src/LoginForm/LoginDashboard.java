package LoginForm;

import Functions.SeperatorAnimation;
import RegisterForm.*;
import Regulations.Rules;
import com.formdev.flatlaf.*;
import java.awt.event.*;
import java.awt.geom.*;

public class LoginDashboard extends javax.swing.JFrame {

    public LoginDashboard() {
        initComponents();

//      setOpacity(0.7f);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        LoginDSB login = new LoginDSB();
        RegisterDSB register = new RegisterDSB();
        Main mn = new Main();
        Donation dn = new Donation();
        slide.setAnimate(20);

        slide.init(mn, login, register, dn);

        mn.addEventSignUp((ActionEvent ae) -> {
            slide.show(2);
        });

        mn.addEventSignIn((ActionEvent ae) -> {
            slide.show(1);
        });

        jButton1.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        slide = new Swing.SlidePanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selection = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slide.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jPanel1.add(slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1300, 730));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("Home");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logod (1).png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel22.setText("Sign In");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Sign In");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 23, -1, -1));

        selection.setBackground(new java.awt.Color(0, 87, 255));

        javax.swing.GroupLayout selectionLayout = new javax.swing.GroupLayout(selection);
        selection.setLayout(selectionLayout);
        selectionLayout.setHorizontalGroup(
            selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        selectionLayout.setVerticalGroup(
            selectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(selection, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 60, 5));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setText("Sign Up");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cart-minus (1).png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton1.setOpaque(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 15, 50, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Donate");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

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

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        SeperatorAnimation animation = new SeperatorAnimation();

        if (selection.getX() == 65) {
            animation.animatePanelHorizontally(selection, +490);
        } else {
            animation.animatePanelHorizontally(selection, +490);
        }

        slide.show(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (selection.getX() == 685) {
            System.out.println(selection.getX());
        } else {
            SeperatorAnimation animation = new SeperatorAnimation();
            animation.animatePanelHorizontally(selection, selection.getX() + 195);
            System.out.println(selection.getX());
            slide.show(3);
        }
    }//GEN-LAST:event_jLabel4MouseClicked
    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel selection;
    public static Swing.SlidePanel slide;
    // End of variables declaration//GEN-END:variables
}
