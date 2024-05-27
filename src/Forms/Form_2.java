package Forms;

import Database.*;
import Functions.*;
import LoginForm.LoginDashboard;
import RegisterForm.RegisterDSB;
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

public final class Form_2 extends javax.swing.JPanel {

    String path2 = null;

    public Form_2() {
        initComponents();
        form2Handlers();

        // Adding Action Listener Cause Adding Events Will Not Save Me Some Energy
        actionListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        cpassword = new javax.swing.JPasswordField();
        secret = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        picture = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel2.setText("CREATE AN ACCOUNT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel3.setText("PLEASE DOUBLE CHECK YOUR INFORMATION BEFORE CREATING AN ACCOUNT");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));
        add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 799, -1));

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
        add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 302, 32));

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
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 302, 32));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 302, 30));

        cpassword.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        cpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 302, 30));

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
        add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 302, 32));

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
        add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 302, 32));

        type.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 402, 303, 30));

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
        add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 302, 32));

        create.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        create.setText("CREATE ACCOUNT");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 302, 30));

        clear.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        clear.setText("CLEAR ALL FIELDS");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 302, 30));

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 352, 30));

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png"))); // NOI18N
        picture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureMouseClicked(evt);
            }
        });
        add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained

    }//GEN-LAST:event_usernameFocusGained

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked

    }//GEN-LAST:event_usernameMouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setFocusable(true);
    }//GEN-LAST:event_emailFocusGained

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setFocusable(true);
    }//GEN-LAST:event_emailMouseClicked

    private void secretFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secretFocusGained

    }//GEN-LAST:event_secretFocusGained

    private void secretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretMouseClicked

    }//GEN-LAST:event_secretMouseClicked

    private void answerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusGained

    }//GEN-LAST:event_answerFocusGained

    private void answerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerMouseClicked

    }//GEN-LAST:event_answerMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained

    }//GEN-LAST:event_contactFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked

    }//GEN-LAST:event_contactMouseClicked

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
                cpassword.setText("");
                secret.setText("");
                answer.setText("");
                contact.setText("");
                picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));

                username.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                email.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                password.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
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

    private void pictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureMouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
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
        Icon currentImage = picture.getIcon();
        if (isDefaultImage(currentImage)) {
            Checkers.emptyFieldChecker("PLEASE FILL-UP ALL THE FIELDS AND INSERT AN IMAGE!");
        } else {
            username.setText("");
            email.setText("");
            password.setText("");
            cpassword.setText("");
            secret.setText("");
            answer.setText("");
            contact.setText("");
            picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png")));
            jProgressBar1.setValue(0);

            JTextField[] components = {username, email, password, secret, answer, contact, cpassword};
            BorderColorManager clearBorderColor = new BorderColorManager(components);
            clearBorderColor.resetBorderColor();
        }
    }//GEN-LAST:event_clearActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        Icon currentImage = picture.getIcon();
        if (isDefaultImage(currentImage)) {
            Checkers.emptyFieldChecker("PLEASE SELECT AN IMAGE!");
        } else {
            picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png")));
        }
    }//GEN-LAST:event_removeActionPerformed

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture.getHeight(), picture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public int calculateProgress() {
        int progress = 0;

        JTextField[] fields = {username, email, password, cpassword, secret, answer, contact};
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

    /**
     * Daiplatinue
     */
    public void form2Handlers() {
        String[] placeholders = {
            "USERNAME", "PASSWORD", "EMAIL", "CONFIRM PASSWORD",
            "SECRET ANSWER", "SECRET QUESTION", "CONTACT"
        };
        JComponent[] components = {
            username, password, email, cpassword, answer, secret, contact
        };

        for (int i = 0; i < components.length; i++) {
            components[i].putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, placeholders[i]);
            components[i].putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        }

        create.setFocusable(false);
        remove.setFocusable(false);
        type.setFocusable(false);
    }

    public void actionListeners() {
        ProgressBarAnimator animator = new ProgressBarAnimator();
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
        username.getDocument().addDocumentListener(documentListener);
        email.getDocument().addDocumentListener(documentListener);
        password.getDocument().addDocumentListener(documentListener);
        cpassword.getDocument().addDocumentListener(documentListener);
        secret.getDocument().addDocumentListener(documentListener);
        answer.getDocument().addDocumentListener(documentListener);
        contact.getDocument().addDocumentListener(documentListener);
    }

    private boolean isDefaultImage(Icon imageIcon) {
        ImageIcon defaultImageIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png"));
        return imageIcon != null && imageIcon.equals(defaultImageIcon);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JButton create;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public final javax.swing.JProgressBar jProgressBar1 = new javax.swing.JProgressBar();
    private javax.swing.JPasswordField password;
    public javax.swing.JLabel picture;
    private javax.swing.JButton remove;
    private javax.swing.JTextField secret;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
