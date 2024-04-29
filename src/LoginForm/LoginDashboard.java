package LoginForm;

import Notification.Notification;
import Regulations.Rules;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ToggleButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;

public class LoginDashboard extends javax.swing.JFrame {

    Color focused = new Color(0, 249, 255);
    Color unfocused = new Color(0, 0, 0);

    public LoginDashboard() {
        initComponents();
        username.setFocusable(false);
        password.setFocusable(false);
        login.setFocusable(false);
        contact.setFocusable(false);
        google.setFocusable(false);
        back.setFocusable(false);
        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        contact = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        fpass = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        google = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 290, 30));

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 290, 32));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/googel.png"))); // NOI18N
        jLabel1.setText("Google");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, -1, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setText("SIGN IN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        back.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 90, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 13)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone#.png"))); // NOI18N
        jLabel3.setText("Contact");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, -1, 30));

        contact.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 290, 30));

        login.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 290, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel5.setText("OR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 270, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 270, 20));

        fpass.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        fpass.setText("FORGOT PASSWORD");
        fpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fpassMouseExited(evt);
            }
        });
        jPanel1.add(fpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 290, 30));

        google.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jPanel1.add(google, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpassMouseEntered
//        fpass.setForeground(focused);
        mouseEntered(evt);
    }//GEN-LAST:event_fpassMouseEntered

    private void fpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpassMouseExited
//        fpass.setForeground(unfocused);
        mouseExited(evt);
    }//GEN-LAST:event_fpassMouseExited

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setFocusable(true);
    }//GEN-LAST:event_passwordMouseClicked

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        password.setFocusable(true);
    }//GEN-LAST:event_passwordFocusGained

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        username.setFocusable(true);
    }//GEN-LAST:event_usernameMouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        username.setFocusable(true);
    }//GEN-LAST:event_usernameFocusGained

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if (loginDB(username.getText(), password.getText())) {
        } else {
        }
    }//GEN-LAST:event_loginActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);
        Notification panel = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Your About To Logged Out");
        panel.showNotification();
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

    private boolean loginDB(String user, String pass) {

        if (user.isEmpty() && pass.isEmpty()) {
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            username.putClientProperty("JComponent.outline", "warning");
            password.putClientProperty("JComponent.outline", "warning");
            Notification panel = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Your About To Logged Out");
            panel.showNotification();
            Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
            JOptionPane.showMessageDialog(null, "PLEASE FILL OUT FIRST!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
            return false;
        } else if (!user.equals("admin") && !pass.equals("admin")) {
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            username.putClientProperty("JComponent.outline", "error");
            password.putClientProperty("JComponent.outline", "error");
            Notification panel = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Your About To Logged Out");
            panel.showNotification();
            Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
            JOptionPane.showMessageDialog(null, "USERNAME OR PASSWORD IS INCORRECT!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
            return false;
        } else {
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            username.putClientProperty("JComponent.outline", "success");
            password.putClientProperty("JComponent.outline", "success");
            Notification panel = new Notification(this, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "Welcome!");
            panel.showNotification();
            Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/sucess.png"));
            JOptionPane.showMessageDialog(null, "WELCOME TO AURORA WELLNESS PAVILION!", "SUCCESS", JOptionPane.WARNING_MESSAGE, customIcon);
            return true;
        }

    }

    public void mouseEntered(MouseEvent me) {
        int x = getWidth() - 30;
        if (new Rectangle(x, 0, 30, 30).contains(me.getPoint())) {
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        } else {
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }

    public void mouseExited(MouseEvent me) {
        int x = getWidth() - 30;
        if (new Rectangle(x, 0, 30, 30).contains(me.getPoint())) {
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        } else {
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton contact;
    private javax.swing.JLabel fpass;
    private javax.swing.JButton google;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
