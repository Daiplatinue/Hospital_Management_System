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
        print.setFocusable(false);
        displayData();

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd-HH-mm-ss");
        String formattedDateTime = currentDateTime.format(formatter);
        dataandtime1.setText(formattedDateTime);
        dataandtime2.setText(formattedDateTime);
        dataandtime3.setText(formattedDateTime);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dataandtime1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        logs = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        print1 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dataandtime2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        logs2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        print2 = new javax.swing.JButton();
        print5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dataandtime3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        logs3 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        print3 = new javax.swing.JButton();
        print6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(5, 142, 230));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CURRENT DATE AND TIME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        dataandtime1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        dataandtime1.setForeground(new java.awt.Color(70, 133, 255));
        dataandtime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataandtime1.setText("CURRENT DATE AND TIME");
        jPanel1.add(dataandtime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        logs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        logs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(logs);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 1220, 520));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ALL USER LOGS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, -1, -1));

        print1.setForeground(new java.awt.Color(153, 153, 153));
        print1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nexir (1).png"))); // NOI18N
        print1.setText(" Next");
        print1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        print1.setOpaque(false);
        print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print1ActionPerformed(evt);
            }
        });
        jPanel1.add(print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 80, 30));

        print.setForeground(new java.awt.Color(153, 153, 153));
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print (1).png"))); // NOI18N
        print.setText(" Print");
        print.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        print.setOpaque(false);
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 80, 30));

        jTabbedPane1.addTab("tab1", jPanel1);

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

        logs2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        logs2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(logs2);

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
        jPanel2.add(print2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 80, 30));

        print5.setForeground(new java.awt.Color(153, 153, 153));
        print5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nexir (1).png"))); // NOI18N
        print5.setText(" Next");
        print5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        print5.setOpaque(false);
        print5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print5ActionPerformed(evt);
            }
        });
        jPanel2.add(print5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, 80, 30));

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

        logs3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        logs3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(logs3);

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

        jTabbedPane1.addTab("tab1", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print1ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_print1ActionPerformed

    private void print2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print2ActionPerformed

    private void print3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_print3ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void print5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print5ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_print5ActionPerformed

    private void print6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print6ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_print6ActionPerformed

    private void displayData() {
        try {
            ResultSet rs = new DBConnection().getData("SELECT * FROM ac_logs");
            logs.setModel(DbUtils.resultSetToTableModel(rs));

            TableColumn column;
            column = logs.getColumnModel().getColumn(3);

            column.setPreferredWidth(500);

            ((DefaultTableCellRenderer) logs.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(SwingConstants.CENTER);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            logs.setDefaultRenderer(Object.class, centerRenderer);

        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dataandtime1;
    private javax.swing.JLabel dataandtime2;
    private javax.swing.JLabel dataandtime3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable logs;
    private javax.swing.JTable logs2;
    private javax.swing.JTable logs3;
    private javax.swing.JButton print;
    private javax.swing.JButton print1;
    private javax.swing.JButton print2;
    private javax.swing.JButton print3;
    private javax.swing.JButton print5;
    private javax.swing.JButton print6;
    // End of variables declaration//GEN-END:variables
}
