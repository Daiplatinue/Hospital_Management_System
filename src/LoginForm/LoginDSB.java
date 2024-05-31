package LoginForm;

import AdminForm.*;
import Database.DBConnection;
import Database.xternal_db;
import Functions.Checkers;
import Functions.Hasher;
import PatientsForm.PatientDSB;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public final class LoginDSB extends javax.swing.JPanel {

    private boolean isEyeHidden = false;
    String destination = "";
    File selectedFile;
    String path;
    String oldPath;
    Integer imgIndex = 0;

    public LoginDSB() {
        initComponents();
        focusAndPlaceholderHandlers();
        keyMapping();
        showImage(imgIndex);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        remember = new javax.swing.JCheckBox();
        fpass3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        images = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass (1).png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 422, 40, 26));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (1).png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 382, 40, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 420, 30, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("JUST SIGN IN TO GET STARTED!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 232, -1, -1));

        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastnameFocusGained(evt);
            }
        });
        lastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastnameMouseEntered(evt);
            }
        });
        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastnameKeyTyped(evt);
            }
        });
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 330, 32));

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
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 330, 30));

        login.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        login.setText("LOGIN");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 329, 30));

        remember.setBackground(new java.awt.Color(255, 255, 255));
        remember.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        remember.setText("REMEMBER ME");
        jPanel1.add(remember, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        fpass3.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        fpass3.setText("FORGOT PASSWORD");
        fpass3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fpass3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fpass3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fpass3MouseExited(evt);
            }
        });
        jPanel1.add(fpass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back (1).png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 510, -1, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/next (1).png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, 50));

        images.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        images.setText("IMAGES");
        jPanel4.add(images, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 580));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 680, 580));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("SIGN IN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 87, 255));
        jLabel8.setText("WELCOME BACK!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 310, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("READY TO DIVE INTO YOUR PERSONALIZED EXPERIENCE? ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

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

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {

            if (lastname.getText().isEmpty() && password.getText().isEmpty()) {
                lastname.setBorder(BorderFactory.createLineBorder(new Color(255, 189, 46)));
                password.setBorder(BorderFactory.createLineBorder(new Color(255, 189, 46)));
                Checkers.emptyFieldChecker("PLEASE FILL-UP ALL THE FIELDS!");
                return;
            }

            String hashedPass = Hasher.passwordHasher(password.getText());
            if (loginDB(lastname.getText(), hashedPass)) {
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
    }//GEN-LAST:event_loginMouseExited

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
    }//GEN-LAST:event_loginMouseEntered

    private void passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseEntered
    }//GEN-LAST:event_passwordMouseEntered

    private void lastnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnameMouseEntered
    }//GEN-LAST:event_lastnameMouseEntered

    private void lastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnameMouseClicked
        lastname.setText("");
    }//GEN-LAST:event_lastnameMouseClicked

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
    }//GEN-LAST:event_lastnameFocusGained

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

    private void fpass3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass3MouseEntered
    }//GEN-LAST:event_fpass3MouseEntered

    private void fpass3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpass3MouseExited
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
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
    }//GEN-LAST:event_jLabel1MouseExited

    private void lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameKeyTyped
        String currentText = lastname.getText();
        if ((currentText + evt.getKeyChar()).length() > 30) {
            evt.consume();
        }
    }//GEN-LAST:event_lastnameKeyTyped

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        String currentTextt = password.getText();
        if ((currentTextt + evt.getKeyChar()).length() > 45) {
            evt.consume();
        }
    }//GEN-LAST:event_passwordKeyTyped

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        imgIndex++;
        if (imgIndex >= getImagesList().size()) {
            imgIndex = getImagesList().size() - 1;
        }
        showImage(imgIndex);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        imgIndex--;
        if (imgIndex < 0) {
            imgIndex = 0;
        }
        showImage(imgIndex);
    }//GEN-LAST:event_jLabel6MouseClicked

    private static String xstatus, xtype;

    private boolean loginDB(String username, String pass) throws SQLException {
        ResultSet rs = new DBConnection().getData("select * from u_tbl where u_lastname = '" + username + "' "
                + "and u_password = '" + pass + "'");
        if (rs.next()) {
            xstatus = rs.getString("u_status");
            xtype = rs.getString("u_type");
            xternal_db xdb = xternal_db.getInstance();
            xdb.setId(rs.getString("u_id"));
            xdb.setEmail(rs.getString("u_email"));
            xdb.setUsername(rs.getString("u_username"));
            xdb.setPassword(rs.getString("u_password"));
            xdb.setContact(rs.getString("u_contact"));
            xdb.setType(rs.getString("u_type"));
            xdb.setStatus(rs.getString("u_status"));
            xdb.setSq(rs.getString("u_question"));
            xdb.setSa(rs.getString("u_answer"));
            return true;
        } else {
            return false;
        }
    }

    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }

    public void login() {
        lastname.grabFocus();
    }

    private void focusAndPlaceholderHandlers() {
        lastname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "LAST NAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        remember.setFocusable(false);
        login.setFocusable(false);
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
            lastname.setBorder(BorderFactory.createLineBorder(Color.GREEN));
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
        lastname.setBorder(BorderFactory.createLineBorder(Color.RED));
        password.setBorder(BorderFactory.createLineBorder(Color.RED));
        Checkers.unsuccessfullFieldChecker("LASTNAME OR PASSWORD IS INCORRECT!");
        lastname.setText("");
        password.setText("");
        lastname.requestFocus();
    }

    public ArrayList<String> getImagesList() {
        ArrayList<String> imgList = new ArrayList<>();

        try (Connection connection = new DBConnection().getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT l_images FROM l_slideshow")) {

            while (resultSet.next()) {
                imgList.add(resultSet.getString("l_images"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return imgList;
    }

    public void showImage(Integer index) {
        Image img = new ImageIcon(getImagesList().get(index)).getImage().getScaledInstance(680, 580, Image.SCALE_SMOOTH);
        images.setIcon(new ImageIcon(img));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fpass3;
    private javax.swing.JLabel images;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox remember;
    // End of variables declaration//GEN-END:variables
}
