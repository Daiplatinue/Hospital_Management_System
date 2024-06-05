package LoginForm;

import Database.DBConnection;
import Functions.Checkers;
import Functions.Hasher;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComponent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public final class Password extends javax.swing.JFrame {

    boolean isEyeHidden;

    public Password() {
        initComponents();
        customizeFormFields();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        jButton3.setEnabled(false);

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        question = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        strength = new javax.swing.JLabel();
        oldpass = new javax.swing.JPasswordField();
        confrimPass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass (1).png"))); // NOI18N
        jPanel13.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 452, 40, 25));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 452, 40, 25));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 342, 40, 25));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass (1).png"))); // NOI18N
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 342, 40, 25));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass (1).png"))); // NOI18N
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 382, 40, 25));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 382, 40, 25));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Check");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 90, 30));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 120, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 90, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 25)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FORGOT PASSWORD?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, -1));

        email.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 370, 30));

        answer.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 370, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancel");
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 50, 30));

        question.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        question.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        question.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 370, 30));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 370, 20));

        strength.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        strength.setForeground(new java.awt.Color(255, 255, 255));
        strength.setText("STRENGTH");
        jPanel1.add(strength, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 370, -1));

        oldpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpassActionPerformed(evt);
            }
        });
        jPanel1.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 370, 30));

        confrimPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confrimPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrimPassActionPerformed(evt);
            }
        });
        jPanel1.add(confrimPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 370, 30));

        newpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 370, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            ResultSet rs = new DBConnection().getData("select * from u_tbl where u_email = '" + email.getText().trim() + "'");
            if (rs.next()) {
                question.setText(rs.getString("u_question"));
            } else {
                Checkers.unsuccessfullFieldChecker("NO QUESTION FOUND ON THIS EMAIL!");
            }
        } catch (SQLException er) {
            System.out.println(er.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try (Connection conn = new DBConnection().getConnection()) {
            String xoldpass = Hasher.passwordHasher(oldpass.getText().trim());
            String query = "SELECT * FROM u_tbl WHERE u_password = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, xoldpass);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (!rs.next()) {
                        Checkers.unsuccessfullFieldChecker("OLD PASSWORD DOES NOT MATCH!");
                        return;
                    }
                }
            }

            String xnewpass = Hasher.passwordHasher(newpass.getText().trim());
            if (!newpass.getText().trim().equals(confrimPass.getText().trim())) {
                Checkers.unsuccessfullFieldChecker("PASSWORD DO NOT MATCH!");
                return;
            }
            if (!isStrongPassword(newpass.getText().trim())) {
                Checkers.unsuccessfullFieldChecker("PASSWORD MUST BE STRONG!");
                return;
            }

            String updateQuery = "UPDATE u_tbl SET u_password = ? WHERE u_password = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                pstmt.setString(1, xnewpass);
                pstmt.setString(2, xoldpass);
                pstmt.executeUpdate();
            }

            Checkers.successFieldChecker("PASSWORD SUCCESSFULLY RESET!");
            new LoginDashboard().setVisible(true);
            dispose();

        } catch (SQLException | NoSuchAlgorithmException er) {
            System.out.println(er.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            ResultSet rs = new DBConnection().getData("select * from u_tbl where u_answer = '" + answer.getText().trim() + "'");

            if (rs.next()) {

                jButton3.setEnabled(true);

            } else {
                Checkers.unsuccessfullFieldChecker("SECRET ANSWER NOT FOUND!");
            }

        } catch (SQLException er) {
            System.out.println(er.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void oldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpassActionPerformed

    private void confrimPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrimPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confrimPassActionPerformed

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

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
        if (isEyeHidden) {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png")));
            newpass.setEchoChar('•');
            isEyeHidden = false;
        } else {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye_hide.png")));
            newpass.setEchoChar((char) 0);
            isEyeHidden = true;
        }
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if (isEyeHidden) {
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png")));
            oldpass.setEchoChar('•');
            isEyeHidden = false;
        } else {
            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye_hide.png")));
            oldpass.setEchoChar((char) 0);
            isEyeHidden = true;
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        if (isEyeHidden) {
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png")));
            confrimPass.setEchoChar('•');
            isEyeHidden = false;
        } else {
            jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye_hide.png")));
            confrimPass.setEchoChar((char) 0);
            isEyeHidden = true;
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel14MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password().setVisible(true);
            }
        });
    }

    public void customizeFormFields() {
        String[] placeholders = {
            "USERNAME", "SECRET QUESTION", "SECRET ANSWER", "OLD PASSWORD",
            "NEW PASSWORd", "CONFIRM PASSWORD"
        };
        JComponent[] components = {
            email, question, answer, oldpass, newpass, confrimPass
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
        } else if (!hasUpperCase) {
            strength.setText("Too Weak: Password lacks uppercase characters");
            strength.setForeground(Color.RED);
        } else if (!hasLowerCase) {
            strength.setText("Too Weak: Password lacks lowercase characters");
            strength.setForeground(Color.RED);
        } else if (!hasDigit) {
            strength.setText("Too Weak: Password lacks digits");
            strength.setForeground(Color.RED);
        } else if (!hasSpecialChar) {
            strength.setText("Too Weak: Password lacks special characters");
            strength.setForeground(Color.RED);
        } else if (hasSequentialChars || hasRepeatedChars) {
            strength.setText("Too Weak: Password contains sequential or repeated characters");
            strength.setForeground(Color.RED);
        } else {
            strength.setText("Mid Strength");
            strength.setForeground(Color.YELLOW);
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
    private javax.swing.JTextField answer;
    private javax.swing.JPasswordField confrimPass;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JTextField question;
    private javax.swing.JLabel strength;
    // End of variables declaration//GEN-END:variables
}
