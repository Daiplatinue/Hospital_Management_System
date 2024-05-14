package PatientsForm;

import Database.DBConnection;
import Database.xternal_db;
import Forms.Form_10;
import Forms.Form_11;
import Forms.Form_12;
import LoginForm.LoginDashboard;
import static LoginForm.LoginDashboard.slide;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

public class PatientDashboard extends javax.swing.JFrame {

    public PatientDashboard() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        MyInfo();

        refresh.setFocusable(false);
        exit.setFocusable(false);
        buy.setFocusable(false);

        Form_10 fm10 = new Form_10();
        Form_11 fm11 = new Form_11();
        Form_12 fm12 = new Form_12();

        slide.init(fm10, fm11, fm12);
        slide.setAnimate(20);

        slide.show(0);

        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                slide.show(1);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        slide = new Swing.SlidePanel();
        icon = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel3.setText("A BEACON OF HOLISTIC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 190, 110));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel2.setText("HEALTH AND TRANQUILITY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 0, 210, 110));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel1.add(slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1300, 690));

        icon.setText("ICON");
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMouseClicked(evt);
            }
        });
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 14, 130, 80));

        username.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        username.setText("PATIENTS USERNAME");
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 110));

        exit.setText("LOGOUT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 41, 100, 30));

        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 42, 100, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/asd2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 0, 100, 110));

        buy.setText("BUY MEDICATIONS");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        jPanel1.add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 43, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new LoginDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        slide.show(2);
    }//GEN-LAST:event_iconMouseClicked

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        slide.show(2);
    }//GEN-LAST:event_usernameMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        slide.show(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        MyInfo();
    }//GEN-LAST:event_refreshActionPerformed

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.registerCustomDefaultsSource("Style");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDashboard().setVisible(true);
            }
        });
    }

    private void MyInfo() {
        try {
            xternal_db xdb = xternal_db.getInstance();
            ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + xdb.getId() + "'");
            if (rs.next()) {
                username.setText("" + rs.getString("ac_username"));
                byte[] img = rs.getBytes("ac_image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image im2 = im.getScaledInstance(130, 80, Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(im2);
                icon.setIcon(newImage);

            }
        } catch (SQLException er) {
            System.out.println("ERROR: " + er.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buy;
    private javax.swing.JButton exit;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton refresh;
    private Swing.SlidePanel slide;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
