package DoctorForm;

import LoginForm.*;
import Functions.SeperatorAnimation;
import com.formdev.flatlaf.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.geom.*;

public class DoctorMain extends javax.swing.JFrame {

    public DoctorMain() {
        initComponents();

//      setOpacity(0.7f);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        DAppointment app = new DAppointment();
        DoctorsDash mn = new DoctorsDash();
        My_Account ma = new My_Account();
        slide.setAnimate(20);

        slide.init(mn, app, ma);
        slide.show(0);

        mn.addEventAccount((ActionEvent ae) -> {
            slide.show(2);
        });

        mn.addEventMore((ActionEvent ae) -> {
            slide.show(1);
        });

        jButton1.setFocusable(false);
        if (jLabel3.getText().equalsIgnoreCase("sign in")) {
            jButton1.setEnabled(false);
        }
        jLabel9.setForeground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        slide = new Swing.SlidePanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selection = new javax.swing.JPanel();
        appointment = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Home");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logod (1).png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Sign Out");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
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

        jPanel1.add(selection, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 60, 5));

        appointment.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        appointment.setForeground(new java.awt.Color(153, 153, 153));
        appointment.setText("Appointments");
        appointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appointmentMousePressed(evt);
            }
        });
        jPanel1.add(appointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (1).png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 15, 50, 40));

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

    private void appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentMouseClicked
        SeperatorAnimation animation = new SeperatorAnimation();

        animation.animatePanelHorizontally(selection, +650);
        appointment.setForeground(Color.BLACK);
        int newWidth = selection.getWidth() + 100;
        int height = selection.getHeight();
        selection.setSize(newWidth, height);
        System.out.println(selection.getX());

        slide.show(1);
    }//GEN-LAST:event_appointmentMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        SeperatorAnimation animation = new SeperatorAnimation();

        if (selection.getX() == 555) {
            animation.animatePanelHorizontally(selection, +490);
            appointment.setForeground(new Color(153, 153, 153));
            jLabel9.setForeground(Color.BLACK);
            System.out.println(selection.getX());
        } else {
            animation.animatePanelHorizontally(selection, +510);
            appointment.setForeground(new Color(153, 153, 153));
            jLabel9.setForeground(Color.BLACK);
            System.out.println(selection.getX());
        }

        slide.show(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void appointmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentMousePressed
    }//GEN-LAST:event_appointmentMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        slide.show(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        LoginDashboard ld = new LoginDashboard();
        ld.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DoctorMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel appointment;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel selection;
    public static Swing.SlidePanel slide;
    // End of variables declaration//GEN-END:variables
}
