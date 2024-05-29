package Forms;

import Database.*;
import static Forms.Form_3.ac_db;
import Functions.Checkers;
import com.formdev.flatlaf.*;
import java.sql.*;
import javax.swing.RowFilter;
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
        jMenuItem1 = new javax.swing.JMenuItem();
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

        jMenuItem1.setText("Delete Permanently");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBackground(new java.awt.Color(250, 250, 250));
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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 80, 30));

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
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 620, 30));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 620, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setFocusable(true);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setFocusable(false);
    }//GEN-LAST:event_searchMouseExited

    private void ac_archiveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ac_archiveMouseReleased
        if (evt.isPopupTrigger()) {
            // Add an offset to X to make the popup appear to the right of the cursor
            int xOffset = 10; // Adjust this value as needed
            int yOffset = 0;  // Adjust this value as needed
            jPopupMenu1.show(evt.getComponent(), evt.getX() + xOffset, evt.getY() + yOffset);
        }
    }//GEN-LAST:event_ac_archiveMouseReleased

    private void ac_archiveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ac_archiveMousePressed
        if (evt.isPopupTrigger()) {
            // Add an offset to X to make the popup appear to the right of the cursor
            int xOffset = 10; // Adjust this value as needed
            int yOffset = 0;  // Adjust this value as needed
            jPopupMenu1.show(evt.getComponent(), evt.getX() + xOffset, evt.getY() + yOffset);
        }
    }//GEN-LAST:event_ac_archiveMousePressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        recoverAccount();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        deleteAccount();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tbl = (DefaultTableModel) ac_archive.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tbl);
        ac_archive.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(search.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayData() {
        try {
            xternal_db xdb = xternal_db.getInstance();
            ResultSet rs = new DBConnection().getData("SELECT ac_id, ac_email, ac_username, ac_contact, ac_type, ac_status FROM ac_table WHERE ac_status = 'DELETED' AND ac_id != '" + xdb.getId() + "'");
            ac_archive.setModel(DbUtils.resultSetToTableModel(rs));
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
                String accountId = tbl.getValueAt(rowIndex, 0).toString();
                String query = "UPDATE ac_table SET ac_status = 'ACTIVE' WHERE ac_id = ?";

                Connection cn = new DBConnection().getConnection();
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, accountId);
                ps.executeUpdate();

                Checkers.successFieldChecker("ACCOUNT RECOVERED SUCCESSFULLY!!");

                xternal_db xdb = xternal_db.getInstance();
                PreparedStatement logs = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                        + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'RECOVERED AN ACCOUNT, ID = " + accountId + "')");
                logs.execute();

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

    private void deleteAccount() {
        int rowIndex = ac_archive.getSelectedRow();
        if (rowIndex < 0) {
            Checkers.unsuccessfullFieldChecker("PLEASE SELECT AN INDEX!");
        } else {
            try {
                TableModel tbl = ac_archive.getModel();
                String accountId = tbl.getValueAt(rowIndex, 0).toString();
                String query = "UPDATE ac_table SET ac_status = 'PERMANENTLY DELETED' WHERE ac_id = ?";

                Connection cn = new DBConnection().getConnection();
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, accountId);
                ps.executeUpdate();

                Checkers.successFieldChecker("ACCOUNT HAS BEEN PERMANENTLY DELETED SUCCESSFULLY!!");

                xternal_db xdb = xternal_db.getInstance();
                PreparedStatement logs = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                        + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'RECOVERED AN ACCOUNT, ID = " + accountId + "')");
                logs.execute();

                displayData();
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ac_archive;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
