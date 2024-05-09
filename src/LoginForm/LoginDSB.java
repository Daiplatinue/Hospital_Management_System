/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;

import Notification.Notification;
import RegisterForm.RegisterDSB;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Daiplatinue
 */
public class LoginDSB extends javax.swing.JPanel {

    public LoginDSB() {
        initComponents();

        password.setFocusable(false);
        login.setFocusable(false);
        username.setFocusable(false);
        register.setFocusable(false);
        google.setFocusable(false);

        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        password.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, "/images/info.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        fpass1 = new javax.swing.JLabel();
        fpass2 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        google = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setText("SIGN IN");

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameMouseEntered(evt);
            }
        });

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordMouseEntered(evt);
            }
        });

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

        fpass1.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        fpass1.setText("Don't Have An Account?");

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

        register.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        register.setText("REGISTER");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel5.setText("OR");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/g(1).png"))); // NOI18N
        icon.setText("GOOGLE");
        jPanel2.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        google.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        google.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                googleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                googleMouseExited(evt);
            }
        });
        jPanel2.add(google, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 290, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel2))
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fpass2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(fpass1))
                            .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5)
                                .addGap(25, 25, 25)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(fpass2)
                .addGap(31, 31, 31)
                .addComponent(fpass1)
                .addGap(1, 1, 1)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

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

    private void fpass2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass2MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_fpass2MouseEntered

    private void fpass2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass2MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_fpass2MouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        mouseExited(evt);
    }//GEN-LAST:event_loginMouseExited

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        mouseExited(evt);
    }//GEN-LAST:event_registerMouseExited

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        loginDB(username.getText(), password.getText());
    }//GEN-LAST:event_loginActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
    }//GEN-LAST:event_usernameMouseClicked

    private void usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseEntered
        username.setFocusable(true);
    }//GEN-LAST:event_usernameMouseEntered

    private void passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseEntered
        password.setFocusable(true);
    }//GEN-LAST:event_passwordMouseEntered

    private void googleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleMouseEntered
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/g.gif")));
        mouseEntered(evt);
    }//GEN-LAST:event_googleMouseEntered

    private void googleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleMouseExited
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/g(1).png")));
        mouseExited(evt);
    }//GEN-LAST:event_googleMouseExited

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
    private javax.swing.JLabel fpass1;
    private javax.swing.JLabel fpass2;
    private javax.swing.JButton google;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
