package Forms;

import Database.DBConnection;
import Database.xternal_db;
import com.formdev.flatlaf.FlatClientProperties;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jnafilechooser.api.JnaFileChooser;

public class Form_12 extends javax.swing.JPanel {

    String path2 = null;

    public Form_12() {
        initComponents();
        MyInfo();

        clear.setFocusable(false);
        update.setFocusable(false);
        delete.setFocusable(false);
        remove.setFocusable(false);
        type.setFocusable(false);

        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EMAIL");
        answer.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SECRET ANSWER");
        secret.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SECRET QUESTION");
        contact.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "CONTACT");

        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        email.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        answer.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        secret.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        contact.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        answer = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        secret = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        remove = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MY ACCOUNT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 570, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel3.setText("PLEASE DOUBLE CHECK YOUR INFORMATION BEFORE CREATING AN ACCOUNT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

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
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 302, 32));

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
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 302, 32));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 302, 30));

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
        jPanel1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 302, 32));

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
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 302, 32));

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
        jPanel1.add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 302, 32));

        type.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 303, 30));

        status.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "ACTIVE", "IN-ACTIVE", "DELETED" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 303, 30));

        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 302, 32));

        clear.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 302, 30));

        delete.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 302, 30));

        update.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        update.setText("UPDATE ACCOUNT");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 302, 30));

        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2MouseClicked(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg"))); // NOI18N
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 350, 350));

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, 352, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 690));
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

    private void answerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusGained

    }//GEN-LAST:event_answerFocusGained

    private void answerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerMouseClicked

    }//GEN-LAST:event_answerMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained

    }//GEN-LAST:event_contactFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked

    }//GEN-LAST:event_contactMouseClicked

    private void secretFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secretFocusGained

    }//GEN-LAST:event_secretFocusGained

    private void secretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretMouseClicked

    }//GEN-LAST:event_secretMouseClicked

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained

    }//GEN-LAST:event_idFocusGained

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        username.setText("");
        email.setText("");
        password.setText("");
        secret.setText("");
        answer.setText("");
        contact.setText("");
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
        username.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        email.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        password.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        secret.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        answer.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        contact.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            String idText = id.getText().trim();
            if (idText.isEmpty()) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE ENTER ID!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
                return;
            } else {
                Connection cn = new DBConnection().getConnection();
                PreparedStatement pst = cn.prepareStatement("UPDATE ac_table SET ac_status = 'DELETED' WHERE ac_id = ?");
                pst.setString(1, idText);
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "ACCOUNT STATUS UPDATED TO 'DELETED'!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    int choice1 = JOptionPane.showOptionDialog(
                            null,
                            "SOME CHANGES MAY APPLY AFTER RESTARTING!",
                            "WARNING",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new String[]{"RESTART NOW", "RESTART LATER"},
                            "RESTART NOW"
                    );

                    int choice2 = JOptionPane.showOptionDialog(
                            null,
                            "ARE YOU SURE THIS MAY RESULT SOME DATA CONFLICTS!",
                            "WARNING",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new String[]{"YES", "NO"},
                            "YES"
                    );

                    if (choice1 == JOptionPane.YES_OPTION) {

                    } else {

                        if (choice2 == JOptionPane.YES_OPTION) {

                        } else {
                            
                        }

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "NO ACCOUNT FOUND WITH ID: " + idText, "WARNING", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            String user = username.getText().trim();
            String emails = email.getText().trim();
            String secretQuestion = secret.getText().trim();
            String secretAnswer = answer.getText().trim();
            String contacts = contact.getText().trim();
            String types = (String) type.getSelectedItem();
            String stats = (String) status.getSelectedItem();
            String photoPath = path2 != null ? path2.trim() : ""; // Use path2 here
            String idText = id.getText().trim();

            System.out.println("User: [" + user + "]");
            System.out.println("Email: [" + emails + "]");
            System.out.println("Secret Question: [" + secretQuestion + "]");
            System.out.println("Secret Answer: [" + secretAnswer + "]");
            System.out.println("Contact: [" + contacts + "]");
            System.out.println("Photo Path: [" + photoPath + "]");
            System.out.println("ID: [" + idText + "]");

            if (user.isEmpty() || emails.isEmpty() || secretQuestion.isEmpty() || secretAnswer.isEmpty()
                    || contacts.isEmpty() || idText.isEmpty()) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE FILL ALL FIELDS AND INSERT AN IMAGE!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);

                if (photoPath.isEmpty()) {
                    System.out.println("Image file path is empty.");
                } else {
                    File photoFile = new File(photoPath);
                    if (!photoFile.exists() || !photoFile.isFile()) {
                        System.out.println("Image file not found or invalid: " + photoPath);
                        UIManager.put("OptionPane.background", Color.white);
                        UIManager.put("Panel.background", Color.white);
                        JOptionPane.showMessageDialog(null, "IMAGE FILE NOT FOUND OR INVALID!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
                    }
                }
                return;
            } else {
                Connection cn = new DBConnection().getConnection();
                PreparedStatement pst = cn.prepareStatement(
                        "UPDATE ac_table SET ac_username = ?, ac_email = ?, ac_sq = ?, ac_sa = ?, ac_type = ?, ac_status = ?, ac_contact = ? "
                        + (!photoPath.isEmpty() ? ", ac_image = ? " : "")
                        + "WHERE ac_id = ?");

                pst.setString(1, user);
                pst.setString(2, emails);
                pst.setString(3, secretQuestion);
                pst.setString(4, secretAnswer);
                pst.setString(5, types);
                pst.setString(6, stats);
                pst.setString(7, contacts);

                int parameterIndex = 8;
                if (!photoPath.isEmpty()) {
                    InputStream is = new FileInputStream(new File(photoPath));
                    pst.setBlob(parameterIndex++, is);
                }

                pst.setString(parameterIndex, idText);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "ACCOUNT SUCCESSFULLY UPDATED!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                MyInfo();
            }
        } catch (SQLException | FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            File selectedFile = ch.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            icon.setIcon(ResizeImage(path));
            path2 = path;
        } else {
            System.out.println("Image selection cancelled or failed!");
        }
    }//GEN-LAST:event_iconMouseClicked

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked

    }//GEN-LAST:event_panel2MouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
    }//GEN-LAST:event_removeActionPerformed

    private void MyInfo() {
        try {
            xternal_db xdb = xternal_db.getInstance();
            ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + xdb.getId() + "'");
            if (rs.next()) {
                id.setText("" + String.valueOf(rs.getInt("ac_id")));
                email.setText("" + rs.getString("ac_email"));
                username.setText("" + rs.getString("ac_username"));
                password.setText("" + rs.getString("ac_password"));
                secret.setText("" + rs.getString("ac_sq"));
                answer.setText("" + rs.getString("ac_sa"));
                contact.setText("" + rs.getString("ac_contact"));
                type.setSelectedItem("" + rs.getString("ac_type"));
                status.setSelectedItem("" + rs.getString("ac_status"));

                byte[] img = rs.getBytes("ac_image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image im2 = im.getScaledInstance(330, 328, Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(im2);
                icon.setIcon(newImage);

            }
        } catch (SQLException er) {
            System.out.println("ERROR: " + er.getMessage());
        }
    }

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(icon.getHeight(), icon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    public javax.swing.JLabel icon;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton remove;
    private javax.swing.JTextField secret;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
