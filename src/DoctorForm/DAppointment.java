package DoctorForm;

import Database.*;
import Functions.*;
import java.awt.event.*;
import java.sql.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import javax.swing.table.*;
import net.proteanit.sql.*;

public final class DAppointment extends javax.swing.JPanel {

    private static final int STEP = 5;
    private final Map<JPanel, Timer> moveTimers = new HashMap<>();
    boolean isVisible = false;

    public DAppointment() {
        initComponents();
        displayAppointments();

        lastname.setVisible(false);
        firstname.setVisible(false);
        contact.setVisible(false);
        diagnostic.setVisible(false);
        description.setVisible(false);
        jScrollPane2.setVisible(false);
        jButton1.setVisible(false);
        jButton3.setVisible(false);

        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateButtons();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateButtons();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateButtons();
            }

            private void updateButtons() {
                if (diagnostic.getText().trim().isEmpty() || description.getText().trim().isEmpty()) {
                    jButton1.setEnabled(false);
                    jButton3.setEnabled(false);
                } else {
                    jButton1.setEnabled(true);
                    jButton3.setEnabled(true);
                }
            }

        };

        diagnostic.getDocument().addDocumentListener(documentListener);
        description.getDocument().addDocumentListener(documentListener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        calendarCustom1 = new main.CalendarCustom();
        jButton1 = new javax.swing.JButton();
        contact = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        diagnostic = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("5.) Complete Administrative Tasks");
        jPanel12.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 297, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("3. ) Follow Up on Test Results");
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 242, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("2. ) Conduct Appointments");
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 215, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("1. ) Review Patient Charts");
        jPanel12.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("To - Do List");
        jPanel12.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, -1));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel12.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 670, -1));

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(5, 142, 230));
        jLabel24.setText("Latest Appointments");
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1720, -1, -1));

        jLabel25.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(5, 142, 230));
        jLabel25.setText("Latest Appointments");
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1720, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 142, 230));
        jLabel2.setText("Appointments");
        jPanel12.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("4.) Collaborate with Medical Team");
        jPanel12.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, -1));
        jPanel12.add(calendarCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 20, 560, 320));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(52, 168, 83));
        jButton1.setText("Mark as outpatient");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 168, 83), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 210, 30));

        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel12.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 360, 240, 30));

        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel12.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 240, 30));

        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel12.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 240, 30));

        diagnostic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel12.add(diagnostic, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 410, 240, 30));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        description.setColumns(20);
        description.setRows(5);
        description.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        description.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(description);

        jPanel12.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 500, 210));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 100, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Mark as inpatient");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Examine");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, 30));

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTable1.clearSelection();
        lastname.setVisible(false);
        firstname.setVisible(false);
        contact.setVisible(false);
        diagnostic.setVisible(false);
        jButton1.setVisible(false);
        jButton3.setVisible(false);
        description.setVisible(false);
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rowIndex = jTable1.getSelectedRow();
        if (rowIndex < 0) {
            Checkers.unsuccessfullFieldChecker("PLEASE SELECT AN INDEX!");
        } else {
            try {
                TableModel tbl = jTable1.getModel();
                String accountId = tbl.getValueAt(rowIndex, 0).toString();
                String query = "UPDATE d_appointments SET a_status = 'OUTPATIENT' WHERE a_id = ?";

                Connection cn = new DBConnection().getConnection();
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, accountId);
                ps.executeUpdate();

                new DBConnection().insertData("insert into diagnostics (a_id, d_diagnosis, d_description, d_status) "
                        + "values ('" + accountId + "', '" + diagnostic.getText().trim() + "', '" + description.getText().trim() + "', 'OUTPATIENT')");

                PreparedStatement tlogs;
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                String formattedDateTime = currentDateTime.format(formatter);
                String formattedTime = currentDateTime.format(timeFormatter);

                tlogs = cn.prepareStatement("INSERT INTO a_logs (u_id, a_actions, a_date, a_hhmmss) VALUES (?, ?, ?, ?)");

                xternal_db xdb = new xternal_db();
                tlogs.setString(1, xdb.getId());
                tlogs.setString(2, "Added An Outpatient, Account ID = '" + accountId + "'");
                tlogs.setString(3, formattedDateTime);
                tlogs.setString(4, formattedTime);

                Checkers.successFieldChecker("ACCOUNT:'" + accountId + "' HAS BEEN MARKED AS OUTPATIENT!");

                displayAppointments();

                jTable1.clearSelection();
                lastname.setVisible(false);
                firstname.setVisible(false);
                contact.setVisible(false);
                diagnostic.setVisible(false);
                jButton1.setVisible(false);
                jButton3.setVisible(false);
                description.setVisible(false);
                jScrollPane2.setVisible(false);

                diagnostic.setText("");
                description.setText("");
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int rowIndex = jTable1.getSelectedRow();
        if (rowIndex < 0) {
            Checkers.unsuccessfullFieldChecker("PLEASE SELECT AN INDEX!");
        } else {
            try {
                TableModel tbl = jTable1.getModel();
                String accountId = tbl.getValueAt(rowIndex, 0).toString();
                String query = "UPDATE d_appointments SET a_status = 'INPATIENT' WHERE a_id = ?";

                Connection cn = new DBConnection().getConnection();
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, accountId);
                ps.executeUpdate();

                new DBConnection().insertData("insert into diagnostics (a_id, d_diagnosis, d_description, d_status) "
                        + "values ('" + accountId + "', '" + diagnostic.getText().trim() + "', '" + description.getText().trim() + "', 'INPATIENT')");

                PreparedStatement tlogs;
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                String formattedDateTime = currentDateTime.format(formatter);
                String formattedTime = currentDateTime.format(timeFormatter);

                tlogs = cn.prepareStatement("INSERT INTO a_logs (u_id, a_actions, a_date, a_hhmmss) VALUES (?, ?, ?, ?)");

                xternal_db xdb = new xternal_db();
                tlogs.setString(1, xdb.getId());
                tlogs.setString(2, "Added An Inpatient, Account ID = '" + accountId + "'");
                tlogs.setString(3, formattedDateTime);
                tlogs.setString(4, formattedTime);

                Checkers.successFieldChecker("ACCOUNT:'" + accountId + "' HAS BEEN MARKED AS INPATIENT!");

                displayAppointments();

                jTable1.clearSelection();
                lastname.setVisible(false);
                firstname.setVisible(false);
                contact.setVisible(false);
                diagnostic.setVisible(false);
                jButton1.setVisible(false);
                jButton3.setVisible(false);
                description.setVisible(false);
                jScrollPane2.setVisible(false);

                diagnostic.setText("");
                description.setText("");
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int rowIndex = jTable1.getSelectedRow();
        if (rowIndex < 0) {
            Checkers.unsuccessfullFieldChecker("SELECT AN INDEX FIRST TO EXAMINE!");
        } else {
            lastname.setVisible(true);
            firstname.setVisible(true);
            contact.setVisible(true);
            diagnostic.setVisible(true);
            jButton1.setVisible(true);
            jButton3.setVisible(true);
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
            description.setVisible(true);
            jScrollPane2.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowIndex = jTable1.getSelectedRow();
        if (rowIndex < 0) {
            Checkers.unsuccessfullFieldChecker("SELECT AN INDEX TO EXAMINE!");
        } else {
            try {
                TableModel tbl = jTable1.getModel();
                ResultSet rs = new DBConnection().getData("select * from d_appointments where a_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
                while (rs.next()) {
                    lastname.setText(rs.getString("p_lastname"));
                    firstname.setText(rs.getString("p_firstname"));
                    contact.setText(rs.getString("a_contact"));
                }
            } catch (SQLException er) {
                System.out.println(er.getMessage());
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public void animatePanelHorizontally(JPanel panel, int targetX) {
        if (moveTimers.containsKey(panel) && moveTimers.get(panel).isRunning()) {
            moveTimers.get(panel).stop();
        }

        Timer timer = new Timer(10, (ActionEvent e) -> {
            int currentX = panel.getX();
            if (currentX < targetX) {
                panel.setLocation(Math.min(currentX + STEP, targetX), panel.getY());
            } else if (currentX > targetX) {
                panel.setLocation(Math.max(currentX - STEP, targetX), panel.getY());
            }

            if (currentX == targetX) {
                ((Timer) e.getSource()).stop();
            }
        });

        moveTimers.put(panel, timer);
        timer.start();
    }

    private void displayAppointments() {
        try {
            ResultSet rs = new DBConnection().getData("SELECT d.a_id AS 'ID', d.p_lastname AS 'Last Name',d.p_firstname AS 'First Name', d.a_contact AS 'Contact',"
                    + " d.a_date AS 'Date', d.a_hours AS 'Hours', d.a_mins AS 'Minutes', d.a_time AS 'Time', "
                    + "d.a_status AS 'Status' FROM d_appointments d INNER JOIN u_tbl u ON d.u_id = u.u_id WHERE d.a_status = 'PENDING' AND u.u_id = '" + xternal_db.getInstance().getId() + "'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            TableColumn column1, column2, column3, column4, column5, column6, column7, column8;

            column1 = jTable1.getColumnModel().getColumn(0);
            column1.setPreferredWidth(10);

            column2 = jTable1.getColumnModel().getColumn(1);
            column2.setPreferredWidth(50);

            column3 = jTable1.getColumnModel().getColumn(2);
            column3.setPreferredWidth(50);

            column4 = jTable1.getColumnModel().getColumn(3);
            column4.setPreferredWidth(50);

            column5 = jTable1.getColumnModel().getColumn(4);
            column5.setPreferredWidth(30);

            column6 = jTable1.getColumnModel().getColumn(5);
            column6.setPreferredWidth(20);

            column7 = jTable1.getColumnModel().getColumn(6);
            column7.setPreferredWidth(20);

            column8 = jTable1.getColumnModel().getColumn(7);
            column8.setPreferredWidth(17);

            ((DefaultTableCellRenderer) jTable1.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(SwingConstants.CENTER);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            jTable1
                    .setDefaultRenderer(Object.class,
                            centerRenderer);
        } catch (SQLException er) {
            System.out.println(er.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.CalendarCustom calendarCustom1;
    private javax.swing.JTextField contact;
    private javax.swing.JTextArea description;
    private javax.swing.JTextField diagnostic;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastname;
    // End of variables declaration//GEN-END:variables
}
