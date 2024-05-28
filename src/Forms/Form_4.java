package Forms;

import Database.*;
import java.awt.print.*;
import java.sql.*;
import java.text.*;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.*;

public class Form_4 extends javax.swing.JPanel {

    public Form_4() {
        initComponents();
        print.setFocusable(false);
        displayData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        logs = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 142, 230));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CURRENT DATE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 650, 120, 30));

        logs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        logs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(logs);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 1220, 520));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 142, 230));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ALL USER LOGS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("Account Logs Overview");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            logs.print(JTable.PrintMode.FIT_WIDTH, header, footer);

            Connection cn = new DBConnection().getConnection();

            xternal_db xdb = xternal_db.getInstance();
            PreparedStatement userActivity = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                    + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'PRINTED TABLE LOGS')");
            userActivity.execute();

        } catch (PrinterException | SQLException er) {
            System.out.println("" + er.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable logs;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
