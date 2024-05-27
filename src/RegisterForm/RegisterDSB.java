package RegisterForm;

import Database.*;
import Functions.*;
import LoginForm.*;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.security.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;

public final class RegisterDSB extends javax.swing.JPanel {

    String path2 = null;
    boolean isEyeHidden;

    public RegisterDSB() {
        initComponents();
        actionListeners();
        registerHandlers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        remove = new javax.swing.JButton();
        panelRound1 = new test.PanelRound();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        type1 = new javax.swing.JComboBox<>();
        secret = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        create = new javax.swing.JButton();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, 302, 30));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelRound1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 292, 40, 25));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass (1).png"))); // NOI18N
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 292, 40, 25));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone (1).png"))); // NOI18N
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 252, 40, 28));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/answer-alt (1).png"))); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 212, 40, 28));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question (1).png"))); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 212, 40, 28));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/envelope-plus (1).png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 172, 40, 28));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (1).png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 132, 40, 28));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-last (1).png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 92, 40, 28));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-add (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 92, 40, 28));
        panelRound1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 480, -1));

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
        panelRound1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 480, 32));

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        panelRound1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 480, 32));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRound1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 480, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SIGN UP");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 480, -1));

        type.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        type.setForeground(new java.awt.Color(51, 51, 51));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        panelRound1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 232, 30));

        type1.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        type1.setForeground(new java.awt.Color(51, 51, 51));
        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        panelRound1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 240, 30));

        secret.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secret.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                secretFocusGained(evt);
            }
        });
        secret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secretMouseClicked(evt);
            }
        });
        panelRound1.add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 230, 32));

        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerFocusGained(evt);
            }
        });
        answer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answerMouseClicked(evt);
            }
        });
        panelRound1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 230, 32));

        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactFocusGained(evt);
            }
        });
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMouseClicked(evt);
            }
        });
        panelRound1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 480, 32));

        clear.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 87, 255));
        clear.setText("CLEAR ALL FIELDS");
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 255)));
        clear.setOpaque(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        panelRound1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 480, 30));

        create.setBackground(new java.awt.Color(0, 87, 255));
        create.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("CREATE ACCOUNT");
        create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 255)));
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        panelRound1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 480, 30));

        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRound1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 230, 32));

        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRound1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 230, 32));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 570, 680));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logod (1).png"))); // NOI18N
        jLabel3.setText("SERENITY WELLNESS HOSPITAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 480, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setFocusable(true);
    }//GEN-LAST:event_emailFocusGained

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setFocusable(true);
    }//GEN-LAST:event_emailMouseClicked

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        try {
            if (path2 == null || path2.isEmpty()) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE INSERT AN IMAGE FIRST!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
            } else {

                String user = username.getText();
                String emails = this.email.getText();
                String hashedPass = Hasher.passwordHasher(this.password.getText());
                String secretQuestion = secret.getText();
                String secretAnswer = answer.getText();
                String status = "Pending";
                String contacts = contact.getText();
                String types = (String) type.getSelectedItem();

                Connection cn = new DBConnection().getConnection();
                PreparedStatement pst = cn.prepareStatement("insert into ac_table (ac_username,ac_email,ac_password,ac_sq,ac_sa,ac_type,ac_status,"
                        + "ac_contact,ac_image) values (?,?,?,?,?,?,?,?,?)");

                pst.setString(1, user);
                pst.setString(2, emails);
                pst.setString(3, hashedPass);
                pst.setString(4, secretQuestion);
                pst.setString(5, secretAnswer);
                pst.setString(6, types);
                pst.setString(7, status);
                pst.setString(8, contacts);

                InputStream is = new FileInputStream(new File(path2));
                pst.setBlob(9, is);
                pst.execute();

                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/sucess.png"));
                JOptionPane.showMessageDialog(null, "ACCOUNT CREATED SUCCESSFULLY!", "SUCCESS", JOptionPane.WARNING_MESSAGE, customIcon);

                username.setText("");
                email.setText("");
                password.setText("");
                secret.setText("");
                answer.setText("");
                contact.setText("");
                lastname.setText("");
                firstname.setText("");
//                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png")));
                jProgressBar1.setValue(0);

                JTextField[] components = {lastname, firstname, username, email, password, secret, answer, contact};
                BorderColorManager borderFieldReset = new BorderColorManager(components);
                borderFieldReset.resetBorderColor();

                LoginDashboard.slide.show(0);
            }

        } catch (SQLException | NoSuchAlgorithmException | FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_createActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
//        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
    }//GEN-LAST:event_removeActionPerformed

    private void secretFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secretFocusGained
    }//GEN-LAST:event_secretFocusGained

    private void secretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretMouseClicked
    }//GEN-LAST:event_secretMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
    }//GEN-LAST:event_contactFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
    }//GEN-LAST:event_contactMouseClicked

    private void answerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusGained
    }//GEN-LAST:event_answerFocusGained

    private void answerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerMouseClicked
    }//GEN-LAST:event_answerMouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
    }//GEN-LAST:event_usernameFocusGained

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
    }//GEN-LAST:event_usernameMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        username.setText("");
        email.setText("");
        password.setText("");
        secret.setText("");
        answer.setText("");
        contact.setText("");
        lastname.setText("");
        firstname.setText("");
//        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png")));
        jProgressBar1.setValue(0);

        JTextField[] components = {lastname, firstname, username, email, password, secret, answer, contact};
        BorderColorManager borderFieldReset = new BorderColorManager(components);
        borderFieldReset.resetBorderColor();
    }//GEN-LAST:event_clearActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if (isEyeHidden) {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png")));
            password.setEchoChar('•');
            isEyeHidden = false;
        } else {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye_hide.png")));
            password.setEchoChar((char) 0);
            isEyeHidden = true;
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        if (isEyeHidden) {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye.png")));
            password.setEchoChar('•');
            isEyeHidden = false;
        } else {
            jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eye_hide.png")));
            password.setEchoChar((char) 0);
            isEyeHidden = true;
        }
    }//GEN-LAST:event_jPanel10MouseClicked

    public static void main(String args[]) {
        FlatLightLaf.registerCustomDefaultsSource("Style");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterDSB().setVisible(true);
            }
        });
    }

//    Validation Hasb't Implemented Yet!, Design Muna   
//    private String xemail, xusername; 
//
//    private boolean duplicateChecker() throws SQLException {
//        ResultSet rs = new DBConnection().getData("select * from ac_table where ac_email = '" + email.getText() + "' or ac_username = '" + username.getText() + "'");
//
//        if (rs.next()) {
//            xemail = rs.getString("ac_email");
//            if (xemail.equals(email.getText())) {
//                JOptionPane.showMessageDialog(this, "EMAIL HAS BEEN USED!", "OH NO!", ERROR_MESSAGE);
//            }
//
//            xusername = rs.getString("ac_username");
//            if (xusername.equals(username.getText())) {
//                JOptionPane.showMessageDialog(this, "USERNAME HAS BEEN USED!", "OH NO!", ERROR_MESSAGE);
//            }
//            return true;
//        } else {
//            return false;
//        }
//    }
//    private boolean validationChecker() {
//        if (username.getText().isEmpty() || password.getText().isEmpty()
//                || cpassword.getText().isEmpty() || email.getText().isEmpty() || contact.getText().isEmpty()) {
//            Checkers.emptyFieldChecker("FILL ALL THE REQUIREMENTS!");
//            return false;
//        } else if (password.getText().length() < 8) {
//            errorMessage("PASSWORD MUST BE AT LEAST 8 CHARACTERS!");
//            return false;
//        } else if (!password.getText().equals(cpassword.getText())) {
//            errorMessage("PASSWORDS DO NOT MATCH!");
//            return false;
//        } else if (!contact.getText().matches("\\d+")) {
//            errorMessage("CONTACT MUST CONTAIN ONLY DIGITS!");
//            return false;
//        } else {
//            return true;
//        }
//    }
    public void register() {
        email.grabFocus();
    }

    public void progress() {
        Timer timer = new Timer(20, new ActionListener() {
            int currentProgress = jProgressBar1.getValue();
            int targetProgress = calculateProgress();
            int step = (targetProgress > currentProgress) ? 1 : -1;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentProgress != targetProgress) {
                    currentProgress += step;
                    jProgressBar1.setValue(currentProgress);
                } else {
                    ((Timer) e.getSource()).stop();
                }
            }
        });
        timer.start();
    }

    public int calculateProgress() {
        int progress = 0;

        JTextField[] fields = {lastname, firstname, username, email, password, secret, answer, contact};
        int[] scores = {5, 5, 5, 10, 5, 7, 7, 5};
        Color[] colors = {Color.RED, Color.GREEN};

        for (int i = 0; i < fields.length; i++) {
            if (!fields[i].getText().equals("")) {
                progress += scores[i];
                fields[i].setBorder(BorderFactory.createLineBorder(colors[1]));
            } else {
                progress -= scores[i];
                fields[i].setBorder(BorderFactory.createLineBorder(colors[0]));
            }
        }

        if (type.getSelectedIndex() != -1) {
            progress += 60;
        }

        jProgressBar1.setValue(progress);

        if (progress >= 80) {
            jProgressBar1.setForeground(Color.GREEN);
        } else if (progress >= 50) {
            jProgressBar1.setForeground(Color.YELLOW);
        } else {
            jProgressBar1.setForeground(Color.RED);
        }

        return progress;
    }

    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }

    public void actionListeners() {
        ProgressBarAnimator animator = new ProgressBarAnimator();
        animator.setLastname(lastname);
        animator.setFirstname(firstname);
        animator.setUsername(username);
        animator.setEmail(email);
        animator.setPassword(password);
        animator.setSecret(secret);
        animator.setAnswer(answer);
        animator.setContact(contact);
        animator.setType(type);
        animator.setProgressBar(jProgressBar1);

        type.addActionListener(e -> animator.calculateProgress());

        DocumentListener documentListener = new SimpleDocumentListener(() -> animator.calculateProgress());
        lastname.getDocument().addDocumentListener(documentListener);
        firstname.getDocument().addDocumentListener(documentListener);
        username.getDocument().addDocumentListener(documentListener);
        email.getDocument().addDocumentListener(documentListener);
        password.getDocument().addDocumentListener(documentListener);
        secret.getDocument().addDocumentListener(documentListener);
        answer.getDocument().addDocumentListener(documentListener);
        contact.getDocument().addDocumentListener(documentListener);
    }

    class SimpleDocumentListener implements DocumentListener {

        private final Runnable callback;

        public SimpleDocumentListener(Runnable callback) {
            this.callback = callback;
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            callback.run();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            callback.run();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            callback.run();
        }

    }

    private boolean isDefaultImage(Icon imageIcon) {
        ImageIcon defaultImageIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png"));
        return imageIcon != null && imageIcon.equals(defaultImageIcon);
    }

    public void registerHandlers() {
        String[] placeholders = {
            "LAST NAME", "FIRST NAME", "USERNAME", "PASSWORD", "EMAIL",
            "SECRET ANSWER", "SECRET QUESTION", "CONTACT"
        };
        JComponent[] components = {
            lastname, firstname, username, password, email, answer, secret, contact
        };

        for (int i = 0; i < components.length; i++) {
            components[i].putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, placeholders[i]);
            components[i].putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        }

        create.setFocusable(false);
        remove.setFocusable(false);
        type.setFocusable(false);
    }

//    public ImageIcon ResizeImage(String imagePath) {
//        ImageIcon MyImage = new ImageIcon(imagePath);
//        Image img = MyImage.getImage();
//        Image newImg = img.getScaledInstance(picture.getHeight(), picture.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon image = new ImageIcon(newImg);
//        return image;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JButton create;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public final javax.swing.JProgressBar jProgressBar1 = new javax.swing.JProgressBar();
    private javax.swing.JTextField lastname;
    private test.PanelRound panelRound1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton remove;
    private javax.swing.JTextField secret;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JComboBox<String> type1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
