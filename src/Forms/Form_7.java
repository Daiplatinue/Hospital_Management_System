package Forms;

import Database.DBConnection;
import Database.xternal_db;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Form_7 extends javax.swing.JPanel {

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

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGE PENDING ACCOUNTS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 0, 410, -1));

        approve.setText("APPROVE");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });
        add(approve, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 163, 130, 30));

        dp.setText("DISAPPROVE");
        dp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpActionPerformed(evt);
            }
        });
        add(dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 163, 130, 30));

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
        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 410, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel4.setText("PATIENTS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel6.setText("ADMIN");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel7.setText("RECEPTIONIST");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel8.setText("PHARMACIST");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel9.setText("DOCTOR");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel10.setText("ALL");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        ac_pending.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ac_pending);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 1150, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        acceptAccount();
    }//GEN-LAST:event_approveActionPerformed

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setFocusable(false);
    }//GEN-LAST:event_searchMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setFocusable(true);
    }//GEN-LAST:event_searchMouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        mouseExited(evt);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        mouseEntered(evt);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void dpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpActionPerformed
        declineAccount();
    }//GEN-LAST:event_dpActionPerformed

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
                new DBConnection().updateData("UPDATE ac_table SET ac_status = 'ACTIVE' WHERE id = '" + tbl.getValueAt(rowIndex, 0).toString() + "'");
                successMessage("ACCOUNT APPROVED SUCCESSFULLY!!");
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
                TableModel tbl = ac_pending.getModel();
                new DBConnection().updateData("UPDATE ac_table SET ac_status = 'DECLINED' WHERE id = '" + tbl.getValueAt(rowIndex, 0).toString() + "'");
                successMessage("ACCOUNT HAS BEEN DISAPPROVED!");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ac_pending;
    private javax.swing.JButton approve;
    private javax.swing.JButton dp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
