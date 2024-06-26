package Forms;

import Database.*;
import Functions.Checkers;
import com.formdev.flatlaf.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.*;
import net.proteanit.sql.*;

public final class Form_8 extends javax.swing.JPanel {

    public Form_8() {
        initComponents();
        displayData();
        EmphasizableButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ac_archive = new javax.swing.JTable();

        jMenuItem2.setText("Recover Account");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ARCHIVES");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 170, -1));

        search.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 620, 30));

        ac_archive.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ac_archive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ac_archiveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ac_archiveMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(ac_archive);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 620, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setFocusable(true);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setFocusable(false);
    }//GEN-LAST:event_searchMouseExited

    private void ac_archiveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ac_archiveMouseReleased
        if (evt.isPopupTrigger()) {
            int xOffset = 10;
            int yOffset = 0;
            jPopupMenu1.show(evt.getComponent(), evt.getX() + xOffset, evt.getY() + yOffset);
        }
    }//GEN-LAST:event_ac_archiveMouseReleased

    private void ac_archiveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ac_archiveMousePressed
        if (evt.isPopupTrigger()) {
            int xOffset = 10;
            int yOffset = 0;
            jPopupMenu1.show(evt.getComponent(), evt.getX() + xOffset, evt.getY() + yOffset);
        }
    }//GEN-LAST:event_ac_archiveMousePressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        recoverAccount();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) ac_archive.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tbl);
        ac_archive.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(search.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayData() {
        try {
            xternal_db xdb = xternal_db.getInstance();
            ResultSet rs = new DBConnection().getData("SELECT u_id AS 'ID',u_lastname AS 'LN',u_firstname AS 'FN',u_gender AS 'GN',u_type AS 'TP',u_status AS 'STS'"
                    + "FROM u_tbl WHERE u_status = 'DELETED' AND u_id != '" + xdb.getId() + "'");
            ac_archive.setModel(DbUtils.resultSetToTableModel(rs));

            ((DefaultTableCellRenderer) ac_archive.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(SwingConstants.CENTER);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            ac_archive.setDefaultRenderer(Object.class, centerRenderer);
        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    private void recoverAccount() {
        int rowIndex = ac_archive.getSelectedRow();
        if (rowIndex < 0) {
            Checkers.unsuccessfullFieldChecker("PLEASE SELECT AN INDEX!");
        } else {
            try {
                TableModel tbl = ac_archive.getModel();

                new DBConnection().updateData("update u_tbl SET u_status = 'ACTIVE' where u_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
                Checkers.successFieldChecker("ACCOUNT RECOVERED SUCCESSFULLY!!");

                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                String formattedDateTime = currentDateTime.format(formatter);
                String formattedTime = currentDateTime.format(timeFormatter);

                new DBConnection().insertData("insert into a_logs (u_id, a_actions, a_date, a_hhmmss) values ('" + xternal_db.getInstance().getId() + "', "
                        + "'Recovered An Account', '" + formattedDateTime + "', '" + formattedTime + "')");

                displayData();
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }

    public void EmphasizableButtons() {
        search.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SEARCH BAR");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ac_archive;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
