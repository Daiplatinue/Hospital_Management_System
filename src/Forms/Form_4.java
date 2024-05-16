package Forms;

import Database.DBConnection;
import Database.xternal_db;
import static Forms.Form_3.ac_db;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

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

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALL USER LOGS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 620, 120, 30));

        logs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(logs);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 1220, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("Account Logs Overview");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            logs.print(JTable.PrintMode.FIT_WIDTH, header, footer);

            Connection cn = new DBConnection().getConnection();

            xternal_db xdb = xternal_db.getInstance();
            PreparedStatement logs = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                    + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'PRINTED TABLE LOGS')");
            logs.execute();

        } catch (PrinterException | SQLException er) {
            System.out.println("" + er.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void displayData() {
        try {
            ResultSet rs = new DBConnection().getData("SELECT * FROM ac_logs");
            logs.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable logs;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
