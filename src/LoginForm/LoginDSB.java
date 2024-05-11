package LoginForm;

import Notification.Notification;
import RegisterForm.RegisterDSB;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class LoginDSB extends javax.swing.JPanel {

    public LoginDSB() {
        initComponents();

        password.setFocusable(false);
        login.setFocusable(false);
        username.setFocusable(false);
        google.setFocusable(false);
        register.setFocusable(false);

        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        password.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, "/images/info.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        fpass2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        google = new javax.swing.JButton();
        register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/google (1).png"))); // NOI18N
        icon.setText("SIGN IN WITH GOOGLE");
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setText("SIGN IN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 49, -1, -1));

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameMouseEntered(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 93, 329, 32));

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordMouseEntered(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 143, 329, 30));

        login.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        login.setText("LOGIN");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 183, 329, 30));

        fpass2.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        fpass2.setText("FORGOT PASSWORD");
        fpass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fpass2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fpass2MouseExited(evt);
            }
        });
        jPanel1.add(fpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 224, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 359, 270, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel5.setText("OR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 349, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 359, 270, 20));

        google.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        google.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                googleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                googleMouseExited(evt);
            }
        });
        google.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                googleActionPerformed(evt);
            }
        });
        jPanel1.add(google, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 390, 329, 30));

        register.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        register.setText("CREATE AN ACCOUNT");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 293, 329, 30));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(59, 59, 59));
        jLabel1.setText("SIGN IN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fpass2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass2MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_fpass2MouseExited

    private void fpass2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass2MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_fpass2MouseEntered

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

//        if (loginDB(username.getText(), password.getText())) {
//            new AdminDSB().setVisible(true);
//            dispose();
//        }

    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        mouseExited(evt);
    }//GEN-LAST:event_loginMouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_loginMouseEntered

    private void passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseEntered
        password.setFocusable(true);
    }//GEN-LAST:event_passwordMouseEntered

    private void usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseEntered
        username.setFocusable(true);
    }//GEN-LAST:event_usernameMouseEntered

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked

    }//GEN-LAST:event_usernameMouseClicked

    private void googleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_googleActionPerformed

    private void googleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleMouseExited
        mouseExited(evt);
    }//GEN-LAST:event_googleMouseExited

    private void googleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleMouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_googleMouseEntered

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        mouseExited(evt);
    }//GEN-LAST:event_registerMouseExited

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.registerCustomDefaultsSource("Style");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginDSB().setVisible(true);
            }
        });
    }

    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }

    private boolean loginDB(String user, String pass) {

        if (user.isEmpty() || pass.isEmpty()) {
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            username.putClientProperty("JComponent.outline", "warning");
            password.putClientProperty("JComponent.outline", "warning");
            Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
            JOptionPane.showMessageDialog(null, "PLEASE FILL OUT BOTH USERNAME AND PASSWORD FIELDS!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
            return false;
        } else if (!user.equals("admin") || !pass.equals("admin")) {
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            username.putClientProperty("JComponent.outline", "error");
            password.putClientProperty("JComponent.outline", "error");
            Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
            JOptionPane.showMessageDialog(null, "USERNAME OR PASSWORD IS INCORRECT!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
            return false;
        } else {
            UIManager.put("OptionPane.background", Color.white);
            UIManager.put("Panel.background", Color.white);
            username.putClientProperty("JComponent.outline", "success");
            password.putClientProperty("JComponent.outline", "success");
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

    public void login() {
        username.grabFocus();
    }

    public void addEventRegister(ActionListener event) {
        register.addActionListener(event);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fpass2;
    private javax.swing.JButton google;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
