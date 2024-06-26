package Forms;

import Database.*;
import static Forms.Form_3.ac_db;
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

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd-HH-mm-ss");
        String formattedDateTime = currentDateTime.format(formatter);
        dataandtime2.setText(formattedDateTime);

//        DefaultTableModel tbl = (DefaultTableModel) ac_archive.getModel();
//        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tbl);
//        ac_archive.setRowSorter(obj);
//        obj.setRowFilter(RowFilter.regexFilter(search.getText()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dataandtime2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        applogs = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        print2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1360, 60));

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
        jPanel2.add(print2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 78, 80, 30));

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
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });
        jPanel2.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 620, 30));

        jTabbedPane1.addTab("tab1", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void print2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print2ActionPerformed
        MessageFormat header = new MessageFormat("Logs Reports");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            applogs.print(JTable.PrintMode.FIT_WIDTH, header, footer);

            Connection cn = new DBConnection().getConnection();

            PreparedStatement tlogs;
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
            String formattedDateTime = currentDateTime.format(formatter);
            String formattedTime = currentDateTime.format(timeFormatter);

            tlogs = cn.prepareStatement("INSERT INTO a_logs (u_id, a_actions, a_date, a_hhmmss) VALUES (?, ?, ?, ?)");

            xternal_db xdb = new xternal_db();
            tlogs.setString(1, xdb.getId());
            tlogs.setString(2, "Printed The Table On Form4");
            tlogs.setString(3, formattedDateTime);
            tlogs.setString(4, formattedTime);

        } catch (PrinterException | SQLException er) {
            System.out.println("" + er.getMessage());
        }
    }//GEN-LAST:event_print2ActionPerformed

    private void search1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_search1MouseEntered

    private void search1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_search1MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) applogs.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tbl);
        applogs.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(search1.getText()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased

    }//GEN-LAST:event_search1KeyReleased

    private void displayAppointments() {
        try {
            ResultSet rs = new DBConnection().getData("SELECT u.u_lastname AS 'Last Name', u.u_firstname AS 'First Name',"
                    + " a_actions AS 'Actions',a_date AS 'Date',a_hhmmss AS 'Time' FROM a_logs a INNER JOIN u_tbl u ON a.u_id = u.u_id "
                    + "WHERE a_actions LIKE '%Appointment added by%'");
            applogs.setModel(DbUtils.resultSetToTableModel(rs));

            TableColumn column1;

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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton print2;
    private javax.swing.JTextField search1;
    // End of variables declaration//GEN-END:variables
}
