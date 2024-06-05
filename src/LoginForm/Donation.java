package LoginForm;

import Functions.SeperatorAnimation;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public final class Donation extends javax.swing.JPanel {

    private static final int STEP = 5;
    private final Map<JPanel, Timer> moveTimers = new HashMap<>();

    public Donation() {
        initComponents();

        value.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "VALUE IN PHP");
        sender.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SENDER NAME");

        ListCellRenderer<Object> renderer = new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                return label;
            }
        };

        jComboBox1.setRenderer(renderer);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        value = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        panelRound1 = new test.PanelRound();
        panelRound2 = new test.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        mop = new javax.swing.JLabel();
        sender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel1.setText("Mode Of Payment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini (Swaziland)", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia (Macedonia)", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 300, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Paymaya");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 140, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Gcash");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 140, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PayPal");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 140, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Bank Transfer");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 140, 40));

        value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        value.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 300, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 87, 255));
        jLabel6.setText(" Generous Donation");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        jLabel7.setText("We Deeply Appreciate Your ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Every Contribution, No Matter The Size, Can Save Lives. Thank You For Your Support");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Here is the Layout of your Receipt");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jButton5.setText("Donate");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton5.setOpaque(false);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 300, 30));

        panelRound1.setBackground(new java.awt.Color(0, 0, 0));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reciept (1).png"))); // NOI18N
        panelRound2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 22, 50, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel9.setText("Your payment has been successfully done. ");
        panelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 110, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        panelRound2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 298, 20));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel11.setText("₱ 100000000");
        panelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel12.setText("Payment Success!");
        panelRound2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 80, -1, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dl.png"))); // NOI18N
        jLabel14.setText("Get PDF Receipt");
        panelRound2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel15.setText("000085752257");
        panelRound2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel16.setText("Payment Time");
        panelRound2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel17.setText("Payment Method");
        panelRound2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel18.setText("Sender Name");
        panelRound2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel19.setText("Total Payment");
        panelRound2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 170, -1, -1));

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel20.setText("Ref Number");
        panelRound2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel21.setText("25 Feb 2023, 13:22");
        panelRound2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel22.setText("Bank Transfer");
        panelRound2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel23.setText("Anonymous Sender");
        panelRound2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 336, 546));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 340, 550));

        mop.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        mop.setText("GCASH");
        jPanel1.add(mop, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        sender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel1.add(sender, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 300, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel10.setText("Country");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel13.setText("MODE OF PAYMENT");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mop;
    private test.PanelRound panelRound1;
    private test.PanelRound panelRound2;
    private javax.swing.JTextField sender;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
