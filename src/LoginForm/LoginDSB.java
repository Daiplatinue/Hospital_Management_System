package LoginForm;

import AdminForm.*;
import Database.DBConnection;
import Database.xternal_db;
import Functions.Checkers;
import Functions.Hasher;
import Functions.SeperatorAnimation;
import PatientsForm.PatientDSB;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.*;

public final class LoginDSB extends javax.swing.JPanel {

    private boolean isEyeHidden = false;

    public LoginDSB() {
        initComponents();
        focusAndPlaceholderHandlers();
        keyMapping();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        fpass2 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        remember = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        fpass3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 40, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 282, 60, 26));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 242, 60, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/samot.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 241, 30, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setText("SIGN IN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

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
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameKeyTyped(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 330, 32));

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
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 330, 30));

        login.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
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
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 329, 30));

        fpass2.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        fpass2.setText("OR");
        fpass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fpass2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fpass2MouseExited(evt);
            }
        });
        jPanel1.add(fpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 452, -1, -1));

        register.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
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
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 329, 30));

        remember.setBackground(new java.awt.Color(255, 255, 255));
        remember.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        remember.setText("REMEMBER ME");
        jPanel1.add(remember, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 300, 20));

        fpass3.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        fpass3.setText("FORGOT PASSWORD");
        fpass3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fpass3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fpass3MouseExited(evt);
            }
        });
        jPanel1.add(fpass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 300, 20));

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
                username.setBorder(BorderFactory.createLineBorder(new Color(255, 189, 46)));
                password.setBorder(BorderFactory.createLineBorder(new Color(255, 189, 46)));
                Checkers.emptyFieldChecker("PLEASE FILL-UP ALL THE FIELDS!");
                return;
            }

            String hashedPass = Hasher.passwordHasher(password.getText());
            if (loginDB(username.getText(), hashedPass)) {
                switch (xstatus.toLowerCase()) {
                    case "pending":
                        Checkers.unsuccessfullFieldChecker("WAIT FOR ADMIN APPROVAL!");
                        break;
                    case "declined":
                        Checkers.unsuccessfullFieldChecker("YOUR ACCOUNT HAS BEEN DECLINED!");
                        break;
                    case "inactive":
                        Checkers.unsuccessfullFieldChecker("YOUR ACCOUNT IS IN-ACTIVE!");
                        break;
                    case "active":
                        handleUserType(xtype);
                        break;
                    default:
                        Checkers.noAccountFieldChecker("INVALID TYPE!");
                }
            } else {
                setErrorState();
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
    }//GEN-LAST:event_passwordMouseEntered

    private void usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseEntered
    }//GEN-LAST:event_usernameMouseEntered

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        username.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        mouseExited(evt);
    }//GEN-LAST:event_registerMouseExited

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
    }//GEN-LAST:event_registerActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
    }//GEN-LAST:event_usernameFocusGained

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

    private void fpass3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass3MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_fpass3MouseEntered

    private void fpass3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass3MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_fpass3MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (isEyeHidden) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png")));
            password.setEchoChar('•');
            isEyeHidden = false;
        } else {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye_hide.png")));
            password.setEchoChar((char) 0);
            isEyeHidden = true;
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_jLabel1MouseExited

    private void usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyTyped
        String currentText = username.getText();
        if ((currentText + evt.getKeyChar()).length() > 30) {
            evt.consume();
        }
    }//GEN-LAST:event_usernameKeyTyped

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        String currentTextt = password.getText();
        if ((currentTextt + evt.getKeyChar()).length() > 45) {
            evt.consume();
        }
    }//GEN-LAST:event_passwordKeyTyped

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

    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }

    private void mouseEntered(MouseEvent me) {
        int x = getWidth() - 30;
        if (new Rectangle(x, 0, 30, 30).contains(me.getPoint())) {
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        } else {
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }

    private void mouseExited(MouseEvent me) {
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

    private void focusAndPlaceholderHandlers() {
        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "LAST NAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        remember.setFocusable(false);
        login.setFocusable(false);
        register.setFocusable(false);
    }

    private void keyMapping() {
        login.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "login");
        login.getActionMap().put("login", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginActionPerformed(e);
            }
        });
    }

    private void handleUserType(String xtype) {
        if (xtype.equalsIgnoreCase("patient") || xtype.equalsIgnoreCase("admin")) {
            username.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            password.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            Checkers.successFieldChecker("WELCONE TO AURORA WELLNESS PAVILION!");
            if (xtype.equalsIgnoreCase("patient")) {
                new PatientDSB().setVisible(true);
            } else {
                new AdminForm().setVisible(true);
            }
            dispose();
        } else {
            setErrorState();
        }
    }

    private void setErrorState() {
        username.setBorder(BorderFactory.createLineBorder(Color.RED));
        password.setBorder(BorderFactory.createLineBorder(Color.RED));
        Checkers.unsuccessfullFieldChecker("LASTNAME OR PASSWORD IS INCORRECT!");
        username.setText("");
        password.setText("");
        username.requestFocus();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fpass2;
    private javax.swing.JLabel fpass3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JCheckBox remember;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
