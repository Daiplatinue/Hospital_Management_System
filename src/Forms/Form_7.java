package Forms;

import Database.*;
import Functions.Checkers;
import Swing.ImageAvatar;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;

public final class Form_7 extends javax.swing.JPanel {

    private boolean isVisible = false;
    String destination = "";
    File selectedFile;
    String path;
    String oldpath;

    File coverSelection;
    String pathCover;
    String oldpathCover;
    String coverDestination = "";

    public Form_7() {
        initComponents();
        displayData();
        Highlightable();

        question.setVisible(false);
        answer.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        approve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ac_pending = new javax.swing.JTable();
        dp1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pending = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        picture1 = new Swing.ImageAvatar();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        cover = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        answer = new javax.swing.JTextField();
        question = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        emailChecker = new javax.swing.JLabel();
        contactChecker = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        add2 = new javax.swing.JButton();

        jMenuItem2.setText("View Account");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu3.add(jMenuItem2);

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1300, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 80, 30));

        search.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        search.setForeground(new java.awt.Color(153, 153, 153));
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 330, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 142, 230));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PENDING ACCOUNTS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 410, -1));

        approve.setForeground(new java.awt.Color(153, 153, 153));
        approve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/approvate (1).png"))); // NOI18N
        approve.setText(" APPROVE");
        approve.setBorder(null);
        approve.setOpaque(false);
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });
        jPanel1.add(approve, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 130, 30));

        ac_pending.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ac_pending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ac_pendingMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ac_pendingMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ac_pending);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 1150, 520));

        dp1.setForeground(new java.awt.Color(153, 153, 153));
        dp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/decline (1).png"))); // NOI18N
        dp1.setText(" DISAPPROVE");
        dp1.setBorder(null);
        dp1.setOpaque(false);
        dp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp1ActionPerformed(evt);
            }
        });
        jPanel1.add(dp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1115, 10, 130, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Pending Accounts");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 180, -1));

        pending.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        pending.setText("10");
        jPanel1.add(pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 180, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 20, 120));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture1MouseClicked(evt);
            }
        });
        jPanel4.add(picture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 190));

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
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 270, 32));

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
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 270, 32));

        type.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        type.setForeground(new java.awt.Color(153, 153, 153));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        type.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 270, 30));

        status.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status.setForeground(new java.awt.Color(153, 153, 153));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "ACTIVE", "IN-ACTIVE", "DELETED" }));
        status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 270, 30));

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
        jPanel4.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 270, 32));

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
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 90, 32));

        cover.setOpaque(true);
        cover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                coverMouseEntered(evt);
            }
        });
        jPanel4.add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1330, 310));

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
        jPanel4.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 270, 32));

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
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 270, 32));

        gender.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(153, 153, 153));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, 270, 30));

        answer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        answer.setForeground(new java.awt.Color(153, 153, 153));
        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 270, 30));

        question.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        question.setForeground(new java.awt.Color(153, 153, 153));
        question.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        question.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 270, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change Question & Answer");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 270, 30));

        emailChecker.setBackground(new java.awt.Color(255, 255, 255));
        emailChecker.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        emailChecker.setForeground(new java.awt.Color(255, 255, 255));
        emailChecker.setText("STRENGTH");
        jPanel4.add(emailChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 485, 270, -1));

        contactChecker.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        contactChecker.setForeground(new java.awt.Color(255, 255, 255));
        contactChecker.setText("STRENGTH");
        jPanel4.add(contactChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 485, 270, -1));

        id1.setEditable(false);
        id1.setForeground(new java.awt.Color(153, 153, 153));
        id1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id1.setBorder(null);
        id1.setOpaque(false);
        id1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                id1FocusGained(evt);
            }
        });
        id1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id1MouseClicked(evt);
            }
        });
        jPanel4.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 90, 32));

        add2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        add2.setText("Back");
        add2.setBorder(null);
        add2.setOpaque(false);
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel4.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 620, 80, 32));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("tab2", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        acceptAccount();
    }//GEN-LAST:event_approveActionPerformed

    private void dp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp1ActionPerformed
        declineAccount();
    }//GEN-LAST:event_dp1ActionPerformed

    Border activeBorder = BorderFactory.createLineBorder(Color.GREEN, 2);
    Border inactiveBorder = BorderFactory.createLineBorder(Color.RED, 2);

    private void ac_pendingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ac_pendingMouseReleased
        if (evt.isPopupTrigger()) {
            int xOffset = 10;
            int yOffset = 0;
            jPopupMenu3.show(evt.getComponent(), evt.getX() + xOffset, evt.getY() + yOffset);
        }
    }//GEN-LAST:event_ac_pendingMouseReleased

    private void ac_pendingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ac_pendingMousePressed
        if (evt.isPopupTrigger()) {
            int xOffset = 10;
            int yOffset = 0;
            jPopupMenu3.show(evt.getComponent(), evt.getX() + xOffset, evt.getY() + yOffset);
        }
    }//GEN-LAST:event_ac_pendingMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void picture1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture1MouseClicked
    }//GEN-LAST:event_picture1MouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained

    }//GEN-LAST:event_usernameFocusGained

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked

    }//GEN-LAST:event_usernameMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setFocusable(true);
    }//GEN-LAST:event_emailFocusGained

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setFocusable(true);
    }//GEN-LAST:event_emailMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained

    }//GEN-LAST:event_contactFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked

    }//GEN-LAST:event_contactMouseClicked

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained

    }//GEN-LAST:event_idFocusGained

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_add2ActionPerformed

    private void coverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coverMouseClicked
    }//GEN-LAST:event_coverMouseClicked

    private void coverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coverMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_coverMouseEntered

    private void firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameFocusGained

    private void firstnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameMouseClicked

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameFocusGained

    private void lastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        isVisible = !isVisible;

        question.setVisible(isVisible);
        answer.setVisible(isVisible);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu3.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel4MouseReleased

    private void id1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id1FocusGained

    }//GEN-LAST:event_id1FocusGained

    private void id1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseClicked

    }//GEN-LAST:event_id1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int rowIndex = ac_pending.getSelectedRow();
        if (rowIndex < 0) {
            Checkers.unsuccessfullFieldChecker("PLEASE SELECT AN INDEX!");
        } else {
            try {
                TableModel tbl = ac_pending.getModel();

                ResultSet rs = new DBConnection().getData("select * from u_tbl where u_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
                if (rs.next()) {
                    id.setText(String.valueOf(rs.getInt("u_id")));
                    email.setText(rs.getString("u_email"));
                    username.setText(rs.getString("u_username"));
                    contact.setText(rs.getString("u_contact"));
                    type.setSelectedItem(rs.getString("u_type"));
                    status.setSelectedItem(rs.getString("u_status"));
                    lastname.setText(rs.getString("u_lastname"));
                    firstname.setText(rs.getString("u_firstname"));
                    question.setText(rs.getString("u_question"));
                    answer.setText(rs.getString("u_answer"));

                    String img = rs.getString("u_profile");
                    setScaledImagePP(img, picture1, 180, 190);
                    destination = rs.getString("u_profile");
                    path = rs.getString("u_profile");
                    oldpath = rs.getString("u_profile");

                    String coverImg = rs.getString("u_cover");
                    setScaledImageCover(coverImg, cover, 1330, 310);
                    pathCover = rs.getString("u_cover");
                    oldpathCover = rs.getString("u_cover");
                    coverDestination = rs.getString("u_cover");

                    selectedFile = new File(img);
                    coverSelection = new File(coverImg);
                    
                    jTabbedPane1.setSelectedIndex(1);
                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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

    private void setScaledImage(String imgPath, JLabel label, int width, int height) {
        if (imgPath != null && !imgPath.isEmpty()) {
            ImageIcon imageIcon = new ImageIcon(imgPath);
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(scaledImage));
        } else {
            label.setIcon(null);
        }
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

    private void displayData() {
        try {
            ResultSet rs = new DBConnection().getData("select u_id,u_lastname,u_firstname,u_gender,u_type,u_status from u_tbl where u_status = 'Pending'");
            ac_pending.setModel(DbUtils.resultSetToTableModel(rs));

            ResultSet pendingCountRS = new DBConnection().getData("select count(*) as pending_count from u_tbl where u_status = 'Pending'");
            if (pendingCountRS.next()) {
                int pendingCount = pendingCountRS.getInt("pending_count");
                pending.setText(String.valueOf(pendingCount));
            }

        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    private void acceptAccount() {
        int rowIndex = ac_pending.getSelectedRow();
        if (rowIndex < 0) {
            Checkers.unsuccessfullFieldChecker("PLEASE SELECT AN INDEX!");
        } else {
            try {
                TableModel tbl = ac_pending.getModel();
                String accountId = tbl.getValueAt(rowIndex, 0).toString();
                String query = "UPDATE u_tbl SET u_status = 'ACTIVE' WHERE u_id = ?";

                Connection cn = new DBConnection().getConnection();
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, accountId);
                ps.executeUpdate();

                Checkers.successFieldChecker("ACCOUNTS HAS BEEN APPROVED SUCCESSFULLY!");

                PreparedStatement tlogs;
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                String formattedDateTime = currentDateTime.format(formatter);
                String formattedTime = currentDateTime.format(timeFormatter);

                tlogs = cn.prepareStatement("INSERT INTO a_logs (u_id, a_actions, a_date, a_hhmmss) VALUES (?, ?, ?, ?)");

                xternal_db xdb = new xternal_db();
                tlogs.setString(1, xdb.getId());
                tlogs.setString(2, "Approved An Account, Account ID = '" + accountId + "'");
                tlogs.setString(3, formattedDateTime);
                tlogs.setString(4, formattedTime);

                displayData();
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }

    private void declineAccount() {
        int rowIndex = ac_pending.getSelectedRow();
        if (rowIndex < 0) {
            Checkers.unsuccessfullFieldChecker("PLEASE SELECT AN INDEX!");
        } else {
            try {

                Connection cn = new DBConnection().getConnection();
                TableModel tbl = ac_pending.getModel();
                String accountId = tbl.getValueAt(rowIndex, 0).toString();
                String query = "UPDATE u_tbl SET u_status = 'DECLINED' WHERE u_id = ?";

                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, accountId);
                ps.executeUpdate();

                Checkers.successFieldChecker("ACCOUNTS HAS BEEN DISAPPROVED!");

                PreparedStatement tlogs;
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                String formattedDateTime = currentDateTime.format(formatter);
                String formattedTime = currentDateTime.format(timeFormatter);

                tlogs = cn.prepareStatement("INSERT INTO a_logs (u_id, a_actions, a_date, a_hhmmss) VALUES (?, ?, ?, ?)");

                xternal_db xdb = new xternal_db();
                tlogs.setString(1, xdb.getId());
                tlogs.setString(2, "Disapproved An Account, Account ID = '" + accountId + "'");
                tlogs.setString(3, formattedDateTime);
                tlogs.setString(4, formattedTime);

                displayData();
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }

    public void Highlightable() {
        approve.setFocusable(false);
        search.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SEARCH BAR");
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
    private javax.swing.JTable ac_pending;
    private javax.swing.JButton add2;
    private javax.swing.JTextField answer;
    private javax.swing.JButton approve;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel contactChecker;
    private javax.swing.JLabel cover;
    private javax.swing.JButton dp1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailChecker;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel pending;
    private Swing.ImageAvatar picture1;
    private javax.swing.JTextField question;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
