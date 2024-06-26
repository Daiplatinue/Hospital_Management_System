package Forms;

import Database.*;
import DoctorForm.My_Account;
import Functions.Checkers;
import LoginForm.LoginDashboard;
import Swing.ImageAvatar;
import com.formdev.flatlaf.*;
import com.mysql.jdbc.Connection;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import jnafilechooser.api.JnaFileChooser;

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
    private newPass newPassFrame;

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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        update = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        emailChecker = new javax.swing.JLabel();
        contactChecker = new javax.swing.JLabel();
        picture1 = new Swing.ImageAvatar();
        cover = new javax.swing.JLabel();

        jMenuItem1.setText("Disable Account");
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1340, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCTOR", "ADMIN", "RECEPTIONIST" }));
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

        picture1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture1MouseClicked(evt);
            }
        });
        jPanel2.add(picture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 190));

        cover.setBackground(new java.awt.Color(204, 204, 204));
        cover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coverMouseClicked(evt);
            }
        });
        jPanel2.add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(-32, 0, 1320, 330));

        jTabbedPane1.addTab("tab3", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 0, 1370, 760));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if (evt.isPopupTrigger()) {
            int xOffset = 10;
            int yOffset = 0;
            jPopupMenu1.show(evt.getComponent(), evt.getX() + xOffset, evt.getY() + yOffset);
        }
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.isPopupTrigger()) {
            int xOffset = 10;
            int yOffset = 0;
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

    private void picture1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture1MouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            selectedFile = ch.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            destination = "src/profile_db/" + selectedFile.getName();

            if (FileExistenceCheckerProfile(path) == 1) {
                Checkers.unsuccessfullFieldChecker("FILE ALREADY EXIST!");
                destination = "";
                path = "";
            } else {
                picture1.setIcon(ResizeImage(path));
                remove.setEnabled(true);
            }

        } else {
            System.out.println("nabanhaw ng image wama kiti");
        }
    }//GEN-LAST:event_picture1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (newPassFrame == null) {
            newPassFrame = new newPass();
            newPassFrame.setVisible(true);
        } else if (newPassFrame.isVisible()) {
            newPassFrame.toFront();
            newPassFrame.requestFocus();
        } else {
            newPassFrame.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_idMouseClicked

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_idFocusGained

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            String photoPath = (destination != null) ? destination.trim() : "";

            boolean fieldsEmpty = username.getText().trim().isEmpty() || email.getText().trim().isEmpty()
                    || contact.getText().trim().isEmpty() || id.getText().trim().isEmpty()
                    || lastname.getText().trim().isEmpty() || firstname.getText().trim().isEmpty();

            if (fieldsEmpty || photoPath.isEmpty() || coverSelection == null) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE FILL ALL FIELDS AND INSERT AN IMAGE!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);

                if (photoPath.isEmpty()) {
                    System.out.println("IMAGE FILE PATH IS EMPTY!");
                } else {
                    File photoFile = new File(photoPath);
                    if (!photoFile.exists() || !photoFile.isFile()) {
                        System.out.println("Image file not found or invalid: " + photoPath);
                        UIManager.put("OptionPane.background", Color.white);
                        UIManager.put("Panel.background", Color.white);
                        JOptionPane.showMessageDialog(null, "IMAGE FILE NOT FOUND OR INVALID!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
                    }
                }
            } else {
                try (Connection connection = new DBConnection().getConnection()) {
                    String updateQuery = "UPDATE u_tbl SET u_username = ?, u_email = ?, u_type = ?, u_status = ?, "
                            + "u_contact = ?, u_lastname = ?, u_firstname = ?, u_gender = ?, u_profile = ?, u_cover = ?, u_question = ?, u_answer = ? "
                            + "WHERE u_id = ?";
                    try (PreparedStatement pstmt = connection.prepareStatement(updateQuery)) {
                        pstmt.setString(1, username.getText());
                        pstmt.setString(2, email.getText());
                        pstmt.setString(3, (String) type.getSelectedItem());
                        pstmt.setString(4, (String) status.getSelectedItem());
                        pstmt.setString(5, contact.getText());
                        pstmt.setString(6, lastname.getText());
                        pstmt.setString(7, firstname.getText());
                        pstmt.setString(8, (String) gender.getSelectedItem());
                        pstmt.setString(9, destination);
                        pstmt.setString(10, coverDestination);
                        pstmt.setString(11, question.getText());
                        pstmt.setString(12, answer.getText());
                        pstmt.setString(13, id.getText());

                        pstmt.executeUpdate();
                    }

                    System.out.println(coverSelection);
                    System.out.println(destination);

                    if (destination == null || coverSelection == null) {
                        Checkers.unsuccessfullFieldChecker("PLEASE INSERT AN IMAGE");
                    } else {
                        Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
                        Files.copy(coverSelection.toPath(), new File(coverDestination).toPath(), StandardCopyOption.REPLACE_EXISTING);

                        JOptionPane.showMessageDialog(null, "ACCOUNT SUCCESSFULLY UPDATED!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                        PreparedStatement logs;
                        java.sql.Connection cn = new DBConnection().getConnection();
                        LocalDateTime currentDateTime = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                        String formattedDateTime = currentDateTime.format(formatter);
                        String formattedTime = currentDateTime.format(timeFormatter);

                        logs = cn.prepareStatement("INSERT INTO a_logs (u_id, a_actions, a_date, a_hhmmss) VALUES (?, ?, ?, ?)");

                        logs.setString(1, xternal_db.getInstance().getId());
                        logs.setString(2, "'" + xternal_db.getInstance().getLastname() + "', Updated his/her account");
                        logs.setString(3, formattedDateTime);
                        logs.setString(4, formattedTime);
                        logs.executeUpdate();

                        new LoginDashboard().setVisible(true);
                        dispose();
                    }

                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                } catch (IOException ex) {
                    Logger.getLogger(My_Account.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (HeadlessException ex) {
            System.out.println("Unexpected Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        isVisible = !isVisible;

        question.setVisible(isVisible);
        answer.setVisible(isVisible);
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

    private void coverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coverMouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            coverSelection = ch.getSelectedFile();
            pathCover = coverSelection.getAbsolutePath();
            coverDestination = "src/cover_db/" + coverSelection.getName();

            if (FileExistenceCheckerCover(pathCover) == 1) {
                Checkers.unsuccessfullFieldChecker("FILE ALREADY EXIST!");
                coverDestination = "";
                pathCover = "";
            } else {
                cover.setIcon(ResizeImageCover(pathCover));
                remove.setEnabled(true);
            }

        } else {
            System.out.println("nabanhaw ng image wama kiti");
        }
    }//GEN-LAST:event_coverMouseClicked

    private void deleteAccount() {
        try {
            String accountId = id.getText();
            String query = "UPDATE u_tbl SET ac_status = 'DELETED' WHERE ac_id = ?";

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
            ResultSet rs = new DBConnection().getData("select * from u_tbl where u_id = '" + xdb.getId() + "'");
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

    public int FileExistenceCheckerProfile(String path) {
        File file = new File(path);
        String fileName = file.getName();

        Path filePath = Paths.get("src/profile_db", fileName);
        boolean fileExists = Files.exists(filePath);

        if (fileExists) {
            return 1;
        } else {
            return 0;
        }

    }

    public int FileExistenceCheckerCover(String path) {
        File file = new File(path);
        String fileName = file.getName();

        Path filePath = Paths.get("src/cover_db", fileName);
        boolean fileExists = Files.exists(filePath);

        if (fileExists) {
            return 1;
        } else {
            return 0;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel contactChecker;
    private javax.swing.JLabel cover;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailChecker;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastname;
    private Swing.ImageAvatar picture1;
    private javax.swing.JTextField question;
    private javax.swing.JButton remove;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
