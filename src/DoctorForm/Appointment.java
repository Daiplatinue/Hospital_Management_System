package DoctorForm;

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

    public Appointment() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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
        jLabel7.setText("4.) Collaborate with Medical Team");
        jPanel12.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, -1));
        jPanel12.add(calendarCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, 320));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(52, 168, 83));
        jButton1.setText("Mark as outpatient");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 168, 83), 1, true));
        jPanel12.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 240, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 410, 240, 30));
        jPanel12.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 240, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 240, 30));
        jPanel12.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 240, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel12.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, 500, 190));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Examine");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Mark as inpatient");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel12.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 240, 30));

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
    private main.CalendarCustom calendarCustom1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
