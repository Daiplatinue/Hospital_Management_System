package FrontdeskForm;

import DoctorForm.*;
import LoginForm.*;
import Functions.SeperatorAnimation;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.Timer;

public final class Appointment extends javax.swing.JPanel {

    private static final int STEP = 5;
    private final Map<JPanel, Timer> moveTimers = new HashMap<>();
    boolean isVisible = false;

    public Appointment() {
        initComponents();

        lastname.setVisible(false);
        firstname.setVisible(false);
        contact.setVisible(false);
        month.setVisible(false);
        hours.setVisible(false);
        min.setVisible(false);
        doctors.setVisible(false);
        pm_am.setVisible(false);
        cancel.setVisible(false);
        add.setVisible(false);
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
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pm_am = new javax.swing.JComboBox<>();
        doctors = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        hours = new javax.swing.JComboBox<>();
        min = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        add = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("5.) Maintain Organized Area");
        jPanel12.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 297, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("3. ) Answer and Direct Phone Calls");
        jPanel12.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 242, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("2. ) Manage Appointment Schedules");
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 215, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("1. ) Greet and Check-In Patients");
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
        jScrollPane1.setViewportView(jTable1);

        jPanel12.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

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
        jLabel7.setText("4.) Process Insurance Information");
        jPanel12.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, -1));
        jPanel12.add(calendarCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, 320));

        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 240, 30));

        lastname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel12.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 240, 30));

        contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel12.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 240, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Change");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 100, 30));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 110, 30));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Remove");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 30));

        pm_am.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PM", "AM" }));
        pm_am.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(pm_am, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 540, 240, 30));

        doctors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOCTORS" }));
        doctors.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(doctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 240, 30));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MONTH" }));
        month.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 240, 30));

        hours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOURS" }));
        hours.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 240, 30));

        min.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIN" }));
        min.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 240, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add Appointment");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 30));

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, 110, 30));

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        isVisible = !isVisible;

        lastname.setVisible(isVisible);
        firstname.setVisible(isVisible);
        contact.setVisible(isVisible);
        month.setVisible(isVisible);
        hours.setVisible(isVisible);
        min.setVisible(isVisible);
        doctors.setVisible(isVisible);
        pm_am.setVisible(isVisible);
        cancel.setVisible(isVisible);
        add.setVisible(isVisible);
    }//GEN-LAST:event_jButton6ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private main.CalendarCustom calendarCustom1;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> doctors;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> hours;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastname;
    private javax.swing.JComboBox<String> min;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> pm_am;
    // End of variables declaration//GEN-END:variables
}
