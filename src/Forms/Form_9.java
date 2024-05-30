package Forms;

import Database.*;
import Functions.BorderColorManager;
import Functions.Checkers;
import LoginForm.*;
import Swing.ImageAvatar;
import com.formdev.flatlaf.*;
import com.mysql.jdbc.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import jnafilechooser.api.*;

public final class Form_9 extends javax.swing.JPanel {
    
    String path2 = null;
    String destination = "";
    File selectedFile;
    String path;
    String oldpath;
    
    File coverSelection;
    String pathCover;
    String oldpathCover;
    String coverDestination = "";
    
    private boolean isVisible = false;
    
    private JFrame passwordFrame;
    
    public Form_9() {
        initComponents();
        MyInfo();
        customizeFormFields();
        
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
        
        question.setVisible(false);
        answer.setVisible(false);
        
        ListCellRenderer<Object> renderer = new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                return label;
            }
        };
        
        type.setRenderer(renderer);
        status.setRenderer(renderer);
        gender.setRenderer(renderer);
        
        yawa.getVerticalScrollBar().setUnitIncrement(16);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        yawa = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        picture2 = new Swing.ImageAvatar();
        cover1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        update1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        remove = new javax.swing.JButton();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        question = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        add2 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        emailChecker = new javax.swing.JLabel();
        contactChecker = new javax.swing.JLabel();
        picture1 = new Swing.ImageAvatar();
        cover = new javax.swing.JLabel();
        deletephoto = new javax.swing.JButton();

        jMenuItem1.setText("Delete Account");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBackground(new java.awt.Color(250, 250, 250));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3formMouseReleased(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yawa.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        picture2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture2MouseClicked(evt);
            }
        });
        jPanel4.add(picture2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 190));

        cover1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(cover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32, 0, 1320, 330));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setText("Gender");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Status");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("Lastname");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setText("'Firstname'");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setText("Bio");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        update1.setBackground(new java.awt.Color(12, 135, 254));
        update1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        update1.setForeground(new java.awt.Color(255, 255, 255));
        update1.setText("Edit");
        update1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });
        jPanel4.add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1157, 350, 130, 32));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setText("Description");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel7.setText("Contact#");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setText("Firstname");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel9.setText("Email");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, 1030, 250));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 910, 1220, 30));

        yawa.setViewportView(jPanel4);

        jPanel3.add(yawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 690));

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2formMouseReleased(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("Remove");
        remove.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 155, 155), 1, true));
        remove.setOpaque(false);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 180, 30));

        lastname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lastname.setForeground(new java.awt.Color(153, 153, 153));
        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lastname.setDisabledTextColor(new java.awt.Color(255, 255, 255));
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
        jPanel2.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 270, 32));

        firstname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        firstname.setForeground(new java.awt.Color(153, 153, 153));
        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        firstname.setDisabledTextColor(new java.awt.Color(255, 255, 255));
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
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel2.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 270, 32));

        username.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 270, 32));

        gender.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(153, 153, 153));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, 270, 30));

        contact.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contact.setForeground(new java.awt.Color(153, 153, 153));
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 270, 32));

        email.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 270, 32));

        type.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        type.setForeground(new java.awt.Color(153, 153, 153));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        type.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 270, 30));

        status.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status.setForeground(new java.awt.Color(153, 153, 153));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "ACTIVE", "IN-ACTIVE", "DELETED" }));
        status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 270, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Change Question & Answer");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 270, 30));

        question.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        question.setForeground(new java.awt.Color(153, 153, 153));
        question.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        question.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel2.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 270, 30));

        answer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        answer.setForeground(new java.awt.Color(153, 153, 153));
        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel2.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 270, 30));

        add2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        add2.setText("Cancel");
        add2.setBorder(null);
        add2.setOpaque(false);
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel2.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 630, 80, 32));

        update.setBackground(new java.awt.Color(12, 135, 254));
        update.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Save Changes");
        update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 630, 130, 32));

        id.setEditable(false);
        id.setForeground(new java.awt.Color(153, 153, 153));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(null);
        id.setOpaque(false);
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
        });
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 90, 32));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Change Password");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 270, 30));

        emailChecker.setBackground(new java.awt.Color(255, 255, 255));
        emailChecker.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        emailChecker.setForeground(new java.awt.Color(255, 255, 255));
        emailChecker.setText("STRENGTH");
        jPanel2.add(emailChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 485, 270, -1));

        contactChecker.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        contactChecker.setForeground(new java.awt.Color(255, 255, 255));
        contactChecker.setText("STRENGTH");
        jPanel2.add(contactChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 485, 270, -1));

        picture1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        picture1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture1MouseClicked(evt);
            }
        });
        jPanel2.add(picture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 190));

        cover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32, 0, 1320, 330));

        deletephoto.setBackground(new java.awt.Color(255, 255, 255));
        deletephoto.setText("Delete");
        deletephoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        deletephoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletephotoActionPerformed(evt);
            }
        });
        jPanel2.add(deletephoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 180, 30));

        jTabbedPane1.addTab("tab3", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 0, 1370, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (evt.isPopupTrigger()) {
            // Add an offset to X to make the popup appear to the right of the cursor
            int xOffset = 10; // Adjust this value as needed
            int yOffset = 0;  // Adjust this value as needed
            jPopupMenu1.show(evt.getComponent(), evt.getX() + xOffset, evt.getY() + yOffset);
        }
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.isPopupTrigger()) {
            // Add an offset to X to make the popup appear to the right of the cursor
            int xOffset = 10; // Adjust this value as needed
            int yOffset = 0;  // Adjust this value as needed
            jPopupMenu1.show(evt.getComponent(), evt.getX() + xOffset, evt.getY() + yOffset);
        }
    }//GEN-LAST:event_formMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        deleteAccount();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jPanel2formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2formMouseReleased

    private void jPanel2formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2formMousePressed

    private void deletephotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletephotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletephotoActionPerformed

    private void picture1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_picture1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_idMouseClicked

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_idFocusGained

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_add2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_emailMouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_contactMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_contactFocusGained

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameMouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFocusGained

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void firstnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameMouseClicked

    private void firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameFocusGained

    private void lastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameMouseClicked

    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameFocusGained

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeActionPerformed

    private void jPanel3formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3formMouseReleased

    private void jPanel3formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3formMousePressed

    private void picture2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_picture2MouseClicked

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_update1ActionPerformed
    
    private void deleteAccount() {
        try {
            String accountId = id.getText();
            String query = "UPDATE ac_table SET ac_status = 'DELETED' WHERE ac_id = ?";
            
            java.sql.Connection cn = new DBConnection().getConnection();
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, accountId);
            ps.executeUpdate();
            
            Checkers.successFieldChecker("ACCOUNT HAS BEEN DELETED SUCCESSFULLY!!");
            
            xternal_db xdb = xternal_db.getInstance();
            PreparedStatement logs = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                    + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'RECOVERED AN ACCOUNT, ID = " + accountId + "')");
            logs.execute();
            
        } catch (SQLException er) {
            System.out.println("ERROR: " + er.getMessage());
        }
    }
    
    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture1.getHeight(), picture1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    Border activeBorder = BorderFactory.createLineBorder(Color.GREEN, 2);
    Border inactiveBorder = BorderFactory.createLineBorder(Color.RED, 2);
    
    private void MyInfo() {
        try {
            xternal_db xdb = xternal_db.getInstance();
            ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + xdb.getId() + "'");
            if (rs.next()) {
                id.setText(String.valueOf(rs.getInt("ac_id")));
                email.setText(rs.getString("ac_email"));
                username.setText(rs.getString("ac_username"));
                contact.setText(rs.getString("ac_contact"));
                type.setSelectedItem(rs.getString("ac_type"));
                status.setSelectedItem(rs.getString("ac_status"));
                lastname.setText(rs.getString("ac_lastname"));
                firstname.setText(rs.getString("ac_firstname"));
                question.setText(rs.getString("ac_sq"));
                answer.setText(rs.getString("ac_sa"));
                
                String img = rs.getString("ac_images");
                setScaledImagePP(img, picture1, 180, 190);
                destination = rs.getString("ac_images");
                path = rs.getString("ac_images");
                oldpath = rs.getString("ac_images");
                
                if (picture1.getIcon() == null) {
                    remove.setEnabled(false);
                } else {
                    remove.setEnabled(true);
                }
                
                String coverImg = rs.getString("ac_coverphoto");
                setScaledImageCover(coverImg, cover, 1330, 310);
                pathCover = rs.getString("ac_coverphoto");
                oldpathCover = rs.getString("ac_coverphoto");
                coverDestination = rs.getString("ac_coverphoto");
                
                selectedFile = new File(img);
                coverSelection = new File(coverImg);
            }
        } catch (SQLException er) {
            System.out.println("ERROR: " + er.getMessage());
        }
    }
    
    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }
    
    public void customizeFormFields() {
        String[] placeholders = {
            "ID", "USERNAME", "EMAIL",
            "SECRET ANSWER", "SECRET QUESTION", "CONTACT"
        };
        JComponent[] components = {
            id, username, email, contact
        };
        
        for (int i = 0; i < components.length; i++) {
            components[i].putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, placeholders[i]);
            components[i].putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        }
        
        update.setFocusable(false);
        remove.setFocusable(false);
        type.setFocusable(false);
        add2.setFocusable(false);
    }
    
    public int FileExistenceChecker(String path) {
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/All_Images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
        
    }
    
    private void setScaledImagePP(String imgPath, ImageAvatar avatar, int width, int height) {
        if (imgPath != null && !imgPath.isEmpty()) {
            ImageIcon imageIcon = new ImageIcon(imgPath);
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            avatar.setIcon(new ImageIcon(scaledImage));
        } else {
            avatar.setIcon(null);
        }
    }
    
    private void setScaledImageCover(String imgPath, JLabel label, int width, int height) {
        if (imgPath != null && !imgPath.isEmpty()) {
            ImageIcon imageIcon = new ImageIcon(imgPath);
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(scaledImage));
        } else {
            label.setIcon(null);
        }
    }
    
    public ImageIcon ResizeImageCover(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(1340, 310, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
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
            email.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else {
            emailChecker.setText("Only gmail, yahoo, hotmail domains!");
            emailChecker.setForeground(Color.RED);
            email.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        
        return isValid;
    }
    
    private boolean isValidEmails(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:gmail\\.com|yahoo\\.com|hotmail\\.com)$";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(email);
        
        return matcher.matches();
    }
    
    private boolean isContactValid(String contacts) {
        if (contacts == null || contacts.isEmpty()) {
            contactChecker.setText("");
            contactChecker.setForeground(Color.WHITE);
            return false;
        }
        
        String digitsOnly = contacts.replaceAll("\\D", "");
        
        if (digitsOnly.length() != 11) {
            contactChecker.setText("Contact must be exactly 11 digits!");
            contactChecker.setForeground(Color.RED);
            contact.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        
        if (!contacts.startsWith("63") && !contacts.startsWith("09")) {
            contactChecker.setText("Contact must start with '63' or '09'!");
            contactChecker.setForeground(Color.RED);
            contact.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }
        
        contactChecker.setText("Contact is valid!");
        contactChecker.setForeground(Color.GREEN);
        contact.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add2;
    private javax.swing.JTextField answer;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel contactChecker;
    private javax.swing.JLabel cover;
    private javax.swing.JLabel cover1;
    private javax.swing.JButton deletephoto;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailChecker;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastname;
    private Swing.ImageAvatar picture1;
    private Swing.ImageAvatar picture2;
    private javax.swing.JTextField question;
    private javax.swing.JButton remove;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    private javax.swing.JTextField username;
    private javax.swing.JScrollPane yawa;
    // End of variables declaration//GEN-END:variables
}
