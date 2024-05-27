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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;
import jnafilechooser.api.*;

public final class RegisterDSB extends javax.swing.JPanel {

    String path2 = null;

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
        picture = new javax.swing.JLabel();
        panelRound1 = new test.PanelRound();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cpassword = new javax.swing.JPasswordField();
        type = new javax.swing.JComboBox<>();
        type1 = new javax.swing.JComboBox<>();
        secret = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        create = new javax.swing.JButton();
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

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png"))); // NOI18N
        picture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureMouseClicked(evt);
            }
        });
        jPanel1.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, -1, -1));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRound1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 480, -1));

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
        });
        panelRound1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 230, 32));

        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstnameFocusGained(evt);
            }
        });
        firstname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstnameMouseClicked(evt);
            }
        });
        panelRound1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 230, 32));

        middlename.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        middlename.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRound1.add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 480, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SIGN UP");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 480, -1));

        cpassword.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        cpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRound1.add(cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 205, 230, 30));

        type.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        panelRound1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 232, 30));

        type1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        panelRound1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 205, 232, 30));

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
        panelRound1.add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 250, 230, 32));

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
        panelRound1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 480, 32));

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
        panelRound1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 480, 32));

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

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 570, 680));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logod (1).png"))); // NOI18N
        jLabel3.setText("SERENITY WELLNESS HOSPITAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 480, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusGained
        firstname.setFocusable(true);
    }//GEN-LAST:event_firstnameFocusGained

    private void firstnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstnameMouseClicked
        firstname.setFocusable(true);
    }//GEN-LAST:event_firstnameMouseClicked

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        try {
            if (path2 == null || path2.isEmpty()) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE INSERT AN IMAGE FIRST!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
            } else {

                String user = lastname.getText();
                String emails = this.firstname.getText();
                String hashedPass = Hasher.passwordHasher(this.middlename.getText());
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

                lastname.setText("");
                firstname.setText("");
                middlename.setText("");
                cpassword.setText("");
                secret.setText("");
                answer.setText("");
                contact.setText("");
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));

                lastname.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                firstname.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                middlename.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                cpassword.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                secret.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                answer.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                contact.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

                LoginDashboard.slide.show(0);
            }

        } catch (SQLException | NoSuchAlgorithmException | FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } 
    }//GEN-LAST:event_createActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
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

    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
    }//GEN-LAST:event_lastnameFocusGained

    private void lastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnameMouseClicked
    }//GEN-LAST:event_lastnameMouseClicked

    private void pictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureMouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrames());
        if (action) {
            File selectedFile = ch.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            picture.setIcon(ResizeImage(path));
            path2 = path;
        } else {
            Checkers.unsuccessfullFieldChecker("IMAGE ALREADY EXIST OR DOES NOT EXIST!");
        }
    }//GEN-LAST:event_pictureMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        lastname.setText("");
        firstname.setText("");
        middlename.setText("");
        cpassword.setText("");
        secret.setText("");
        answer.setText("");
        contact.setText("");
        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png")));
        jProgressBar1.setValue(0);

        JTextField[] components = {lastname, firstname, middlename, secret, answer, contact, cpassword};
        BorderColorManager borderFieldReset = new BorderColorManager(components);
        borderFieldReset.resetBorderColor();
    }//GEN-LAST:event_clearActionPerformed

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
        firstname.grabFocus();
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

        JTextField[] fields = {lastname, firstname, middlename, cpassword, secret, answer, contact};
        int[] scores = {5, 5, 10, 5, 7, 7, 5};
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

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture.getHeight(), picture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void actionListeners() {
        ProgressBarAnimator animator = new ProgressBarAnimator();
        animator.setUsername(lastname);
        animator.setEmail(firstname);
        animator.setPassword(middlename);
        animator.setCpassword(cpassword);
        animator.setSecret(secret);
        animator.setAnswer(answer);
        animator.setContact(contact);
        animator.setType(type);
        animator.setProgressBar(jProgressBar1);
        type.addActionListener(e -> animator.calculateProgress());

        DocumentListener documentListener = new RegisterDSB.SimpleDocumentListener(() -> animator.calculateProgress());
        lastname.getDocument().addDocumentListener(documentListener);
        firstname.getDocument().addDocumentListener(documentListener);
        middlename.getDocument().addDocumentListener(documentListener);
        cpassword.getDocument().addDocumentListener(documentListener);
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
            "USERNAME", "PASSWORD", "EMAIL", "CONFIRM PASSWORD",
            "SECRET ANSWER", "SECRET QUESTION", "CONTACT"
        };
        JComponent[] components = {
            lastname, middlename, firstname, cpassword, answer, secret, contact
        };

        for (int i = 0; i < components.length; i++) {
            components[i].putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, placeholders[i]);
            components[i].putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        }

        create.setFocusable(false);
        remove.setFocusable(false);
        type.setFocusable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JButton create;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public final javax.swing.JProgressBar jProgressBar1 = new javax.swing.JProgressBar();
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField middlename;
    private test.PanelRound panelRound1;
    public javax.swing.JLabel picture;
    private javax.swing.JButton remove;
    private javax.swing.JTextField secret;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JComboBox<String> type1;
    // End of variables declaration//GEN-END:variables
}
