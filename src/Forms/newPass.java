package Forms;

import Database.DBConnection;
import Database.xternal_db;
import Functions.Checkers;
import Functions.Hasher;
import static Functions.Hasher.passwordHasher;
import LoginForm.LoginDashboard;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public final class newPass extends javax.swing.JFrame {

    boolean isEyeHidden = false;

    public newPass() {
        initComponents();
        passHandlers();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        newpass.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateStrengthLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateStrengthLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateStrengthLabel();
            }
        });

        jButton3.setFocusable(false);
        jButton4.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        newpass = new javax.swing.JPasswordField();
        oldpass = new javax.swing.JPasswordField();
        cpass = new javax.swing.JPasswordField();
        strength = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 112, 30, 25));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 232, 30, 25));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 162, 30, 25));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass (1).png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -210, 10, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(5, 142, 230));
        jButton3.setText("Reset");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 142, 230), 1, true));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("that you don't user elsewhere");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 70, 320, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancel");
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 50, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel3.setText("CHANGE PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 20, 280, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("It is a good idea to user a strong password,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 50, 320, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass (1).png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -262, 20, 290));

        newpass.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        newpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newpassKeyTyped(evt);
            }
        });
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 360, 30));

        oldpass.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        oldpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oldpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                oldpassKeyTyped(evt);
            }
        });
        jPanel1.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 360, 30));

        cpass.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        cpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });
        cpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpassKeyTyped(evt);
            }
        });
        jPanel1.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, 30));

        strength.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        strength.setForeground(new java.awt.Color(255, 255, 255));
        strength.setText("STRENGTH");
        jPanel1.add(strength, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 360, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            xternal_db cons = xternal_db.getInstance();
            ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + cons.getId() + "'");
            if (rs.next()) {
                String oldPass = rs.getString("ac_password");
                String oldHash = Hasher.passwordHasher(oldpass.getText());

                if (oldPass.equals(oldHash)) {

                    if (!isStrongPassword(newpass.getText())) {
                        Checkers.unsuccessfullFieldChecker("PASSWORD MUST BE STRONG!");
                        return;
                    } else if (!cpass.getText().equals(newpass.getText())) {
                        Checkers.unsuccessfullFieldChecker("PASSWORD DO NOT MATCH!");
                        return;
                    } else {
                        String newPass = Hasher.passwordHasher(newpass.getText());
                        new DBConnection().updateData("update ac_table set ac_password = '" + newPass + "' where ac_id = '" + cons.getId() + "'");
                        Checkers.successFieldChecker("PASSWORD HAS BEEN UPDATED!");
                        new LoginDashboard().setVisible(true);
                        dispose();
                    }

                } else {
                    Checkers.unsuccessfullFieldChecker("OLD PASSWORD IS INCORRECT!");
                }
            } else {
                Checkers.noAccountFieldChecker("NO ACCOUNT FOUND!");
            }
        } catch (SQLException | NoSuchAlgorithmException er) {
            System.out.println("Error: " + er.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void newpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newpassKeyTyped

    }//GEN-LAST:event_newpassKeyTyped

    private void oldpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oldpassKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpassKeyTyped

    private void cpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpassKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassKeyTyped

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if (isEyeHidden) {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png")));
            newpass.setEchoChar('•');
            isEyeHidden = false;
        } else {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye_hide.png")));
            newpass.setEchoChar((char) 0);
            isEyeHidden = true;
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked

    }//GEN-LAST:event_jPanel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if (isEyeHidden) {
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png")));
            cpass.setEchoChar('•');
            isEyeHidden = false;
        } else {
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye_hide.png")));
            cpass.setEchoChar((char) 0);
            isEyeHidden = true;
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked

    }//GEN-LAST:event_jPanel11MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if (isEyeHidden) {
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png")));
            oldpass.setEchoChar('•');
            isEyeHidden = false;
        } else {
            jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye_hide.png")));
            oldpass.setEchoChar((char) 0);
            isEyeHidden = true;
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
    }//GEN-LAST:event_jPanel12MouseClicked

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newPass().setVisible(true);
            }
        });
    }

    public void passHandlers() {
        String[] placeholders = {
            "OLD PASSWORD", "NEW PASSWORD", "CONFIRM PASSWORD"
        };
        JComponent[] components = {
            oldpass, newpass, cpass
        };

        for (int i = 0; i < components.length; i++) {
            components[i].putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, placeholders[i]);
        }
    }

    private void updateStrengthLabel() {
        String xpassword = newpass.getText();

        if (xpassword == null || xpassword.isEmpty()) {
            strength.setText("");
            strength.setForeground(Color.WHITE);
            return;
        }

        if (xpassword.length() < 8) {
            strength.setText("Too Weak: Password must be at least 8 characters long");
            strength.setForeground(Color.RED);
            newpass.setBorder(BorderFactory.createLineBorder(Color.RED));
            return;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        boolean hasSequentialChars = false;
        boolean hasRepeatedChars = false;

        char prevChar = '\0';

        for (char ch : xpassword.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (isSpecialChar(ch)) {
                hasSpecialChar = true;
            }

            if (prevChar != '\0' && (prevChar + 1 == ch || prevChar - 1 == ch)) {
                hasSequentialChars = true;
            }

            if (prevChar != '\0' && prevChar == ch) {
                hasRepeatedChars = true;
            }

            prevChar = ch;
        }

        if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar && !hasSequentialChars && !hasRepeatedChars) {
            strength.setText("Strong");
            strength.setForeground(Color.GREEN);
            newpass.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            jButton3.setEnabled(true);
        } else if (!hasUpperCase) {
            strength.setText("Too Weak: Password lacks uppercase characters");
            strength.setForeground(Color.RED);
            newpass.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (!hasLowerCase) {
            strength.setText("Too Weak: Password lacks lowercase characters");
            strength.setForeground(Color.RED);
            newpass.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (!hasDigit) {
            strength.setText("Too Weak: Password lacks digits");
            strength.setForeground(Color.RED);
            newpass.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (!hasSpecialChar) {
            strength.setText("Too Weak: Password lacks special characters");
            strength.setForeground(Color.RED);
            newpass.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else if (hasSequentialChars || hasRepeatedChars) {
            strength.setText("Too Weak: Password contains sequential or repeated characters");
            strength.setForeground(Color.RED);
            newpass.setBorder(BorderFactory.createLineBorder(Color.RED));
        } else {
            strength.setText("Mid Strength");
            strength.setForeground(Color.YELLOW);
            newpass.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
        }
    }

    private boolean isSpecialChar(char ch) {
        String specialChars = "!@#$%^&*()-_+=<>?";
        return specialChars.contains(Character.toString(ch));
    }

    private boolean isStrongPassword(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }

        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        boolean hasSequentialChars = false;
        boolean hasRepeatedChars = false;

        char prevChar = '\0';

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (isSpecialChar(ch)) {
                hasSpecialChar = true;
            }

            if (prevChar != '\0' && (prevChar + 1 == ch || prevChar - 1 == ch)) {
                hasSequentialChars = true;
            }

            if (prevChar != '\0' && prevChar == ch) {
                hasRepeatedChars = true;
            }

            prevChar = ch;
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar && !hasSequentialChars && !hasRepeatedChars;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpass;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JLabel strength;
    // End of variables declaration//GEN-END:variables
}
