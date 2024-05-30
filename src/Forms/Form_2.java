package Forms;

import Database.*;
import Functions.*;
import LoginForm.LoginDashboard;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.security.*;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.event.*;

public final class Form_2 extends javax.swing.JPanel {

    String path2 = null;
    boolean isEyeHidden;
    String path;
    String oldPath;
    String destination = "src/MyImages/default.png";
    File selectedFile;

    public Form_2() {
        initComponents();
        actionListeners();
        registerHandlers();

        password.getDocument().addDocumentListener(new DocumentListener() {
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

        email.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isValidEmail();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isValidEmail();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        contact.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isContactValid(contact.getText().trim());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isContactValid(contact.getText().trim());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                isContactValid(contact.getText().trim());
            }
        });

        type.addActionListener(e -> {
            String selectedItem = (String) type.getSelectedItem();
            System.out.println("Selected item: " + selectedItem);

            if ("PATIENT".equals(selectedItem) || "DOCTOR".equals(selectedItem)) {
                username.setVisible(false);
                jPanel4.setVisible(false);
                username.setEnabled(false);
            } else if ("ADMIN".equals(selectedItem)) {
                username.setVisible(true);
                jPanel4.setVisible(true);
                username.setEnabled(true);
            }

            jPanel4.getParent().revalidate();
            jPanel4.getParent().repaint();
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        strength = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        type1 = new javax.swing.JComboBox<>();
        secret = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        emailChecker = new javax.swing.JLabel();
        contactChecker = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelRound1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 382, 40, 25));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pass (1).png"))); // NOI18N
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 382, 40, 25));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone (1).png"))); // NOI18N
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 302, 40, 28));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/answer-alt (1).png"))); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 252, 40, 28));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question (1).png"))); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 28));

        panelRound1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 252, 40, 28));

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
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        panelRound1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 480, 32));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        panelRound1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 480, 30));

        strength.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        strength.setForeground(new java.awt.Color(255, 255, 255));
        strength.setText("STRENGTH");
        panelRound1.add(strength, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 480, -1));

        type.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        type.setForeground(new java.awt.Color(51, 51, 51));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "PATIENT", "DOCTOR" }));
        panelRound1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 232, 30));

        type1.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        type1.setForeground(new java.awt.Color(51, 51, 51));
        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        panelRound1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 240, 30));

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
        panelRound1.add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 230, 32));

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
        panelRound1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 230, 32));

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
        panelRound1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 480, 32));

        create.setBackground(new java.awt.Color(255, 255, 255));
        create.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        create.setForeground(new java.awt.Color(0, 87, 255));
        create.setText("CREATE ACCOUNT");
        create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 255)));
        create.setOpaque(false);
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        panelRound1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 480, 30));

        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRound1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 230, 32));

        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRound1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 230, 32));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SIGN UP");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 480, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("By creating an account, you agree to the Terms of Service. We'll ocassionaly send your account");
        panelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 620, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setText("related emails, including updates on new features and promotions, and important notifications.");
        panelRound1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 640, -1, 30));

        emailChecker.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        emailChecker.setForeground(new java.awt.Color(255, 255, 255));
        emailChecker.setText("STRENGTH");
        panelRound1.add(emailChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 480, -1));

        contactChecker.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        contactChecker.setForeground(new java.awt.Color(255, 255, 255));
        contactChecker.setText("STRENGTH");
        panelRound1.add(contactChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 480, -1));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 570, 680));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SERENITY WELLNESS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 230, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 87, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(" HOSPITAL");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 20, 120, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 1, 45)); // NOI18N
        jLabel18.setText("COMMENCE YOUR DAY");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 1, 45)); // NOI18N
        jLabel19.setText("WITH A");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 1, 45)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(5, 142, 230));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1p (1).png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, -1, -1));

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(2, 116, 249));
        jLabel21.setText("Core Security");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, -1, -1));

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 1, 45)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(5, 142, 230));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/colge (1).png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, -1, -1));

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 1, 45)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(5, 142, 230));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reduce (1).png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 400, -1, -1));

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 45)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(5, 142, 230));
        jLabel24.setText("CLEAN BEGINNING");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 120, -1, -1));

        jLabel27.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(226, 128, 134));
        jLabel27.setText("Soothing Confidence");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel28.setText("ensuring accessible healthcare for all");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel29.setText("leaving a steadfast assurance in the quality of our work");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel31.setText("safeguarding systems from potential threats with unparalleled efficiency");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel32.setText("Affordable Remedies offers quality medications  at low prices,");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel33.setText("Soothing Confidence prevails,  eliminating doubt and ");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, -1, -1));

        jLabel34.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(249, 172, 0));
        jLabel34.setText("Affordable Remedies");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 380, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel35.setText("With our team's meticulous attention to detail,");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel36.setText("Core Security establishes a robust defense framework, ");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 610, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));
    }// </editor-fold>//GEN-END:initComponents

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

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped

    }//GEN-LAST:event_emailKeyTyped

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped

    }//GEN-LAST:event_passwordKeyTyped

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
            String ls = lastname.getText().trim();
            String fn = firstname.getText().trim();
            String user = username.getText().trim();
            String emails = email.getText().trim();
            String hashedPass = Hasher.passwordHasher(this.password.getText());
            String secretQuestion = secret.getText();
            String secretAnswer = answer.getText();
            String status = "Pending";
            String contacts = contact.getText();
            String types = (String) type.getSelectedItem();
            String xgender = (String) type1.getSelectedItem();

            if (ls.isEmpty() || fn.isEmpty() || user.isEmpty() || emails.isEmpty() || hashedPass.isEmpty() || secretQuestion.isEmpty() || secretAnswer.isEmpty() || contacts.isEmpty()) {
                Checkers.emptyFieldChecker("PLEASE FILL ALL THE REQUIRED FIELDS!");
                return;
            } else if (!isStrongPassword(password.getText())) {
                Checkers.unsuccessfullFieldChecker("PASSWORD MUST BE STRONG!");
                return;
            } else if (!isValidEmail()) {
                Checkers.unsuccessfullFieldChecker("EMAIL MUST BE VALID!");
                return;
            }

            Connection cn = new DBConnection().getConnection();
            PreparedStatement pst = cn.prepareStatement("insert into ac_table (ac_username, ac_email, ac_password, ac_sq, ac_sa, "
                    + "ac_type, ac_status, ac_contact, ac_lastname, ac_firstname, ac_gender,ac_images) "
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, user);
            pst.setString(2, emails);
            pst.setString(3, hashedPass);
            pst.setString(4, secretQuestion);
            pst.setString(5, secretAnswer);
            pst.setString(6, types);
            pst.setString(7, status);
            pst.setString(8, contacts);
            pst.setString(9, ls);
            pst.setString(10, fn);
            pst.setString(11, xgender);
            pst.setString(12, destination);
            pst.execute();

            Checkers.successFieldChecker("ACCOUNT HAS BEEN CREATED SUCCESSFULLY!");

            lastname.setText("");
            firstname.setText("");
            username.setText("");
            email.setText("");
            password.setText("");
            secret.setText("");
            answer.setText("");
            contact.setText("");
            lastname.setText("");
            firstname.setText("");
            jProgressBar1.setValue(0);

            JTextField[] components = {lastname, firstname, username, email, password, secret, answer, contact};
            BorderColorManager borderFieldReset = new BorderColorManager(components);
            borderFieldReset.resetBorderColor();

            LoginDashboard.slide.show(0);

        } catch (SQLException | NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_createActionPerformed

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
        type.setFocusable(false);
    }

    private void updateStrengthLabel() {
        String xpassword = password.getText();

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

    private boolean isValidEmails(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    private boolean isValidEmail() {
        String xemailChecker = email.getText().trim();

        if (xemailChecker.isEmpty()) {
            emailChecker.setText("");
            emailChecker.setForeground(Color.WHITE);
            return false;
        }

        boolean isValid = isValidEmails(xemailChecker);

        if (isValid) {
            emailChecker.setText("Email is valid");
            emailChecker.setForeground(Color.GREEN);
        } else {
            emailChecker.setText("Invalid, We only accept gmail, yahoo, hotmail domains!");
            emailChecker.setForeground(Color.RED);
        }

        return isValid;
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

    private boolean isSpecialChar(char ch) {
        String specialChars = "!@#$%^&*()-_+=<>?";
        return specialChars.contains(Character.toString(ch));
    }

    private boolean isContactValid(String contact) {
        if (contact == null || contact.isEmpty()) {
            contactChecker.setText("");
            contactChecker.setForeground(Color.WHITE);
            return false;
        }

        String digitsOnly = contact.replaceAll("\\D", "");

        if (digitsOnly.length() != 11) {
            contactChecker.setText("Contact must be exactly 11 digits!");
            contactChecker.setForeground(Color.RED);
            return false;
        }

        if (!contact.startsWith("63") && !contact.startsWith("09")) {
            contactChecker.setText("Contact must start with '63' or '09'!");
            contactChecker.setForeground(Color.RED);
            return false;
        }

        contactChecker.setText("Contact is valid!");
        contactChecker.setForeground(Color.GREEN);
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel contactChecker;
    private javax.swing.JButton create;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailChecker;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JTextField secret;
    private javax.swing.JLabel strength;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JComboBox<String> type1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
