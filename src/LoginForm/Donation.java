package LoginForm;

import Database.DBConnection;
import Functions.Checkers;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.Timer;

public final class Donation extends javax.swing.JPanel {

    private static final int STEP = 5;
    private final Map<JPanel, Timer> moveTimers = new HashMap<>();

    public Donation() {
        initComponents();

        value.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "VALUE");
        sender.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SENDER NAME");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        value = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        mop = new javax.swing.JLabel();
        sender = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(12, 135, 254));
        jLabel5.setText("YOUR DONATION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 97, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("                              CAN PROVIDE...");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 97, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel1.setText("Mode Of Payment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Paymaya");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 140, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Gcash");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 140, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PayPal");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 140, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Bank Transfer");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 140, 40));

        value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 300, 30));

        jButton5.setText("Donate");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 300, 30));

        mop.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        mop.setText("GCASH");
        jPanel1.add(mop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        sender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(sender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 300, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel13.setText("MODE OF PAYMENT");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yawa (1) (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 230));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel2.setText("Mode Of Payment");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 40)); // NOI18N
        jLabel15.setText("₱150,000");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 25, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Could support staff training");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 270, 160));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 1, 40)); // NOI18N
        jLabel18.setText("₱500,000");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 25, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Could build an entire room");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("for our fellow doctors");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 120, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 270, 160));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 1, 40)); // NOI18N
        jLabel21.setText("₱1,200,000");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 25, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Could fund an entire hospital");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 450, 270, 160));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 40)); // NOI18N
        jLabel11.setText("₱26,000");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 25, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("enhance lab equipment");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Would make it possible to");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 270, 270, 160));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 40)); // NOI18N
        jLabel8.setText("₱13,000");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 25, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("equipment");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Could purchase one laboratory");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 90, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 270, 160));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Could buy a set of paracetamol");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 40)); // NOI18N
        jLabel7.setText("₱1,500");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 25, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 270, 160));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 300, 50));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("1,200,000");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 630, 120, 30));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("1,500");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, 120, 30));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("13,000");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, 120, 30));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("26,000");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 630, 120, 30));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setText("150,000");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, 120, 30));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setText("500,000");
        jButton11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 630, 120, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 810));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mop.setText("PAYPAL");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mop.setText("GCASH");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mop.setText("PAYMAYA");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mop.setText("BANK TRANSFER");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {

            new DBConnection().insertData("insert into donations (ds_mop, ds_value, ds_sender, ds_description)"
                    + "values ('" + mop.getText() + "', '" + value.getText().trim() + "', '" + sender.getText().trim() + "',"
                    + "'" + jTextArea1.getText() + "')");

            Checkers.successFieldChecker("THANKYOU FOR YOUR KINDFULL HEART!");

            mop.setText("GCASH");
            value.setText("");
            sender.setText("");
            jTextArea1.setText("");

        } catch (SQLException er) {
            System.out.println(er.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        value.setText("500000");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        value.setText("150000");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        value.setText("1500");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        value.setText("13000");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        value.setText("26000");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        value.setText("1200000");
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mop;
    private javax.swing.JTextField sender;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
