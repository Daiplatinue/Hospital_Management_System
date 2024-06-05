package Forms;

import Database.*;
import java.awt.print.*;
import java.sql.*;
import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.*;

public final class Form_4 extends javax.swing.JPanel {

    boolean isVisible = false;

    public Form_4() {
        initComponents();
        displayAppointments();
        print2.setFocusable(false);
        print3.setFocusable(false);
        print6.setFocusable(false);
        print4.setFocusable(false);

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd-HH-mm-ss");
        String formattedDateTime = currentDateTime.format(formatter);
        dataandtime2.setText(formattedDateTime);
        dataandtime3.setText(formattedDateTime);

//        DefaultTableModel tbl = (DefaultTableModel) ac_archive.getModel();
//        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tbl);
//        ac_archive.setRowSorter(obj);
//        obj.setRowFilter(RowFilter.regexFilter(search.getText()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dataandtime2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        applogs = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        print2 = new javax.swing.JButton();
        print4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dataandtime3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        patientlogs = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        print3 = new javax.swing.JButton();
        print6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        search2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(5, 142, 230));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CURRENT DATE AND TIME");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        dataandtime2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        dataandtime2.setForeground(new java.awt.Color(70, 133, 255));
        dataandtime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataandtime2.setText("CURRENT DATE AND TIME");
        jPanel2.add(dataandtime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        applogs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        applogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(applogs);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 1220, 520));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ALL APPOINTMENT LOGS");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, -1, -1));

        print2.setForeground(new java.awt.Color(153, 153, 153));
        print2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print (1).png"))); // NOI18N
        print2.setText(" Print");
        print2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        print2.setOpaque(false);
        print2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print2ActionPerformed(evt);
            }
        });
        jPanel2.add(print2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1105, 20, 80, 30));

        print4.setForeground(new java.awt.Color(153, 153, 153));
        print4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nexir (1).png"))); // NOI18N
        print4.setText(" Next");
        print4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        print4.setOpaque(false);
        print4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print4ActionPerformed(evt);
            }
        });
        jPanel2.add(print4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 80, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 80, 30));

        search1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        search1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search1MouseExited(evt);
            }
        });
        jPanel2.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 620, 30));

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(5, 142, 230));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CURRENT DATE AND TIME");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        dataandtime3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        dataandtime3.setForeground(new java.awt.Color(70, 133, 255));
        dataandtime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataandtime3.setText("CURRENT DATE AND TIME");
        jPanel3.add(dataandtime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        patientlogs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        patientlogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(patientlogs);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 1220, 520));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ALL INPATIENT & OUTPATIENT LOGS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        print3.setForeground(new java.awt.Color(153, 153, 153));
        print3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print (1).png"))); // NOI18N
        print3.setText(" Print");
        print3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        print3.setOpaque(false);
        print3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print3ActionPerformed(evt);
            }
        });
        jPanel3.add(print3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 80, 30));

        print6.setForeground(new java.awt.Color(153, 153, 153));
        print6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baksir (1).png"))); // NOI18N
        print6.setText(" Back");
        print6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        print6.setOpaque(false);
        print6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print6ActionPerformed(evt);
            }
        });
        jPanel3.add(print6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 80, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 80, 30));

        search2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        search2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search2MouseExited(evt);
            }
        });
        jPanel3.add(search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 620, 30));

        jTabbedPane1.addTab("tab1", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void print2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print2ActionPerformed

    private void print3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print3ActionPerformed

    private void print6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print6ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_print6ActionPerformed

    private void print4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print4ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_print4ActionPerformed

    private void search1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_search1MouseEntered

    private void search1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_search1MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void search2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_search2MouseEntered

    private void search2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_search2MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void displayAppointments() {
        try {
            ResultSet rs = new DBConnection().getData("SELECT u.u_lastname AS 'Last Name', u.u_firstname AS 'First Name',"
                    + " a_actions AS 'Actions',a_date AS 'Date',a_hhmmss AS 'Time' FROM a_logs a INNER JOIN u_tbl u ON a.u_id = u.u_id "
                    + "WHERE a_actions LIKE '%Appointment added by%'");
            applogs.setModel(DbUtils.resultSetToTableModel(rs));

            TableColumn column1, column2, column3, column4, column5;

            column1 = applogs.getColumnModel().getColumn(2);
            column1.setPreferredWidth(300);

            ((DefaultTableCellRenderer) applogs.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(SwingConstants.CENTER);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            applogs.setDefaultRenderer(Object.class, centerRenderer);

        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable applogs;
    private javax.swing.JLabel dataandtime2;
    private javax.swing.JLabel dataandtime3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable patientlogs;
    private javax.swing.JButton print2;
    private javax.swing.JButton print3;
    private javax.swing.JButton print4;
    private javax.swing.JButton print6;
    private javax.swing.JTextField search1;
    private javax.swing.JTextField search2;
    // End of variables declaration//GEN-END:variables
}
