package Forms;

import Database.DBConnection;
import Database.xternal_db;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import jnafilechooser.api.JnaFileChooser;
import net.proteanit.sql.DbUtils;

public class Form_7 extends javax.swing.JPanel {

    private String path2 = null;

    public Form_7() {
        initComponents();
        displayData();

        search.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SEARCH BAR");

        dp.setFocusable(false);
        approve.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        approve = new javax.swing.JButton();
        dp = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ac_pending = new javax.swing.JTable();
        dp1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        answer = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        picture1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add3 = new javax.swing.JButton();
        secret = new javax.swing.JTextField();
        type = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE PENDING ACCOUNTS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 0, 410, -1));

        approve.setText("APPROVE");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });
        jPanel1.add(approve, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 163, 130, 30));

        dp.setText("VIEW ACCOUNT");
        dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpActionPerformed(evt);
            }
        });
        jPanel1.add(dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 164, 130, 30));

        search.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 410, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel4.setText("PATIENTS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel6.setText("ADMIN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel7.setText("RECEPTIONIST");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel8.setText("PHARMACIST");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel9.setText("DOCTOR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel10.setText("ALL");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        ac_pending.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ac_pending);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 1150, 520));

        dp1.setText("DISAPPROVE");
        dp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp1ActionPerformed(evt);
            }
        });
        jPanel1.add(dp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 163, 130, 30));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 302, 32));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 302, 30));

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
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 302, 32));

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
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 228, 302, 32));

        status.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statusFocusGained(evt);
            }
        });
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusMouseClicked(evt);
            }
        });
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 302, 32));

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
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 302, 32));

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
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 302, 32));

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg"))); // NOI18N
        picture1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 350, 350));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USER INFO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 100, 860, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel5.setText("ACCESSING OTHERS INFO PROVIDES KEY INSIGHTS TO TAILOR EXPERIENCES AND FOSTER MEANINGFUL CONNECTIONS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        add3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add3.setText("BACK");
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });
        jPanel2.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 50, 100, -1));

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
        jPanel2.add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 302, 32));

        type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        type.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                typeFocusGained(evt);
            }
        });
        type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeMouseClicked(evt);
            }
        });
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 302, 32));

        jTabbedPane1.addTab("tab2", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void answerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusGained

    }//GEN-LAST:event_answerFocusGained

    private void answerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerMouseClicked

    }//GEN-LAST:event_answerMouseClicked

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

    private void statusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statusFocusGained

    }//GEN-LAST:event_statusFocusGained

    private void statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseClicked

    }//GEN-LAST:event_statusMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained

    }//GEN-LAST:event_contactFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked

    }//GEN-LAST:event_contactMouseClicked

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained

    }//GEN-LAST:event_idFocusGained

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void picture1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture1MouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            File selectedFile = ch.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            picture1.setIcon(ResizeImage(path));
            path2 = path;
        } else {
            System.out.println("Image Already Exist or Does Not Exist!");
        }
    }//GEN-LAST:event_picture1MouseClicked

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked

    }//GEN-LAST:event_panelMouseClicked

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_add3ActionPerformed

    private void secretFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secretFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_secretFocusGained

    private void secretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_secretMouseClicked

    private void typeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_typeFocusGained

    private void typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_typeMouseClicked

    private void dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpActionPerformed
        if (jTabbedPane1.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            jTabbedPane1.setSelectedIndex(1);
            try {
                TableModel tbl = ac_pending.getModel();
                int rowIndex = ac_pending.getSelectedRow();
                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setText("" + rs.getString("ac_type"));
                    status.setText("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_dpActionPerformed

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        acceptAccount();
    }//GEN-LAST:event_approveActionPerformed

    private void dp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp1ActionPerformed
        declineAccount();
    }//GEN-LAST:event_dp1ActionPerformed

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
            ResultSet rs = new DBConnection().getData("select ac_id,ac_email,ac_username,ac_type from ac_table where ac_status = 'PENDING'");
            ac_pending.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    private void acceptAccount() {
        int rowIndex = ac_pending.getSelectedRow();
        if (rowIndex < 0) {
            errorMessage("PLEASE SELECT AN INDEX!");
        } else {
            try {
                TableModel tbl = ac_pending.getModel();
                String accountId = tbl.getValueAt(rowIndex, 0).toString();
                String query = "UPDATE ac_table SET ac_status = 'ACTIVE' WHERE ac_id = ?";

                Connection cn = new DBConnection().getConnection();
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, accountId);
                ps.executeUpdate();

                successMessage("ACCOUNT APPROVED SUCCESSFULLY!!");

                xternal_db xdb = xternal_db.getInstance();
                PreparedStatement logs = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                        + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'APPROVED AN ACCOUNT, ID = " + accountId + "')");
                logs.execute();

                displayData();
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }

    private void declineAccount() {
        int rowIndex = ac_pending.getSelectedRow();
        if (rowIndex < 0) {
            errorMessage("PLEASE SELECT AN INDEX!");
        } else {
            try {

                Connection cn = new DBConnection().getConnection();
                TableModel tbl = ac_pending.getModel();
                String accountId = tbl.getValueAt(rowIndex, 0).toString();
                String query = "UPDATE ac_table SET ac_status = 'DECLINED' WHERE ac_id = ?";

                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, accountId);
                ps.executeUpdate();

                successMessage("ACCOUNT APPROVED SUCCESSFULLY!!");

                xternal_db xdb = xternal_db.getInstance();
                PreparedStatement logs = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                        + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'DISAPPROVED AN ACCOUNT, ID = " + accountId + "')");
                logs.execute();

                displayData();
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }

    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "ERROR!", JOptionPane.ERROR_MESSAGE);
    }

    private void successMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);
    }

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture1.getHeight(), picture1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ac_pending;
    private javax.swing.JButton add3;
    private javax.swing.JTextField answer;
    private javax.swing.JButton approve;
    private javax.swing.JTextField contact;
    private javax.swing.JButton dp;
    private javax.swing.JButton dp1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField password;
    public javax.swing.JLabel picture1;
    private javax.swing.JTextField search;
    private javax.swing.JTextField secret;
    private javax.swing.JTextField status;
    private javax.swing.JTextField type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
