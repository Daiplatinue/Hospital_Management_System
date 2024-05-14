package LoginForm;

import AdminForm.*;
import Database.DBConnection;
import Database.xternal_db;
import PatientsForm.PatientDashboard;
import Functions.Hasher;
import Notification.*;
import RegisterForm.*;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.*;

public class LoginDSB extends javax.swing.JPanel {

    public LoginDSB() {
        initComponents();
        exit.setFocusable(false);
        remember.setFocusable(false);

        password.setFocusable(false);
        login.setFocusable(false);
        username.setFocusable(false);
        google.setFocusable(false);
        register.setFocusable(false);

        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        login.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "login");
        login.getActionMap().put("login", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginActionPerformed(e);
            }
        });

        exit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "exit");
        exit.getActionMap().put("exit", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitActionPerformed(e);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
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
        exit = new javax.swing.JButton();
        remember = new javax.swing.JCheckBox();

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

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setText("SIGN IN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameMouseEntered(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 329, 32));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordMouseEntered(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 329, 30));

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
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 329, 30));

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
        jPanel1.add(fpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 270, 20));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel5.setText("OR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 270, 20));

        google.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        google.setText("SIGN IN WITH CONTACT NUMBER");
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
        jPanel1.add(google, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 329, 30));

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
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 329, 30));

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 120, 30));

        remember.setBackground(new java.awt.Color(255, 255, 255));
        remember.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        remember.setText("REMEMBER ME");
        jPanel1.add(remember, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 358, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fpass2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass2MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_fpass2MouseExited

    private void fpass2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass2MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_fpass2MouseEntered

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {

            if (username.getText().isEmpty() && password.getText().isEmpty()) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                username.putClientProperty("JComponent.outline", "warning");
                password.putClientProperty("JComponent.outline", "warning");
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE FILL OUT BOTH USERNAME AND PASSWORD FIELDS!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
            }

            String hashedPass = Hasher.passwordHasher(password.getText());
            if (loginDB(username.getText(), hashedPass)) {

                if (xstatus.equalsIgnoreCase("pending")) {
                    errorMessage("WAIT FOR ADMIN APPROVAL!");
                } else if (xstatus.equalsIgnoreCase("declined")) {
                    errorMessage("YOUR ACCOUNT HAS BEEN DECLINED!");
                } else if (xstatus.equalsIgnoreCase("inactive")) {
                    errorMessage("YOUR ACCOUNT IS IN-ACTIVE!");
                } else if (!xstatus.equalsIgnoreCase("active")) {
                    errorMessage("INVALID TYPE!");
                } else {
                    if (xtype.equalsIgnoreCase("doctor")) { 
                        UIManager.put("OptionPane.background", Color.white);
                        UIManager.put("Panel.background", Color.white);
                        username.putClientProperty("JComponent.outline", "success");
                        password.putClientProperty("JComponent.outline", "success");
                        Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/sucess.png"));
                        JOptionPane.showMessageDialog(null, "WELCOME TO AURORA WELLNESS PAVILION!", "SUCCESS", JOptionPane.WARNING_MESSAGE, customIcon);
                        
                        new PatientDashboard().setVisible(true);
                        dispose();
                        
                    } else if (xtype.equalsIgnoreCase("admin")) {
                        UIManager.put("OptionPane.background", Color.white);
                        UIManager.put("Panel.background", Color.white);
                        username.putClientProperty("JComponent.outline", "success");
                        password.putClientProperty("JComponent.outline", "success");
                        Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/sucess.png"));
                        JOptionPane.showMessageDialog(null, "WELCOME TO AURORA WELLNESS PAVILION!", "SUCCESS", JOptionPane.WARNING_MESSAGE, customIcon);

                        new AdminForm().setVisible(true);
                        dispose();
                    } else {
                        UIManager.put("OptionPane.background", Color.white);
                        UIManager.put("Panel.background", Color.white);
                        username.putClientProperty("JComponent.outline", "error");
                        password.putClientProperty("JComponent.outline", "error");
                        Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                        JOptionPane.showMessageDialog(null, "USERNAME OR PASSWORD IS INCORRECT!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
                    }
                }
            } else {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                username.putClientProperty("JComponent.outline", "error");
                password.putClientProperty("JComponent.outline", "error");
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "ACCOUNT NOT FOUND!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
            }
        } catch (SQLException | NoSuchAlgorithmException er) {
            System.out.println("ERROR: " + er.getMessage());
        }
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
        username.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void googleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googleActionPerformed
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
    }//GEN-LAST:event_registerActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
    }//GEN-LAST:event_passwordFocusGained

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
    }//GEN-LAST:event_usernameFocusGained

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

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

    private static String xstatus, xtype;

    private boolean loginDB(String username, String pass) throws SQLException {
        ResultSet rs = new DBConnection().getData("select * from ac_table where ac_username = '" + username + "' and ac_password = '" + pass + "'");
        if (rs.next()) {
            xstatus = rs.getString("ac_status");
            xtype = rs.getString("ac_type");
            xternal_db xdb = xternal_db.getInstance();
            xdb.setId(rs.getString("ac_id"));
            xdb.setEmail(rs.getString("ac_email"));
            xdb.setUsername(rs.getString("ac_username"));
            xdb.setPassword(rs.getString("ac_password"));
            xdb.setContact(rs.getString("ac_contact"));
            xdb.setType(rs.getString("ac_type"));
            xdb.setStatus(rs.getString("ac_status"));
            xdb.setSq(rs.getString("ac_sq"));
            xdb.setSa(rs.getString("ac_sa"));
            return true;
        } else {
            return false;
        }
    }

    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "ERROR!", JOptionPane.ERROR_MESSAGE);
    }

    private void successMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fpass2;
    private javax.swing.JButton google;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JCheckBox remember;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
