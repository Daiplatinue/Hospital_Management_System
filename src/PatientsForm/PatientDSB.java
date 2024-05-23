package PatientsForm;

import Database.DBConnection;
import Database.xternal_db;
import LoginForm.LoginDashboard;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public final class PatientDSB extends javax.swing.JFrame {
    
    String path2 = null;
    
    public PatientDSB() {
        initComponents();
        displayData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        pane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        meds = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        medsName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        picture1 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        medsName1 = new javax.swing.JLabel();
        stocks = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        price3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        po = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1320, 770));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1320, 770));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIST OF ALL MEDICINE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 130, 1210, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PATIENT FORM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 90, 1190, -1));

        meds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(meds);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 1240, 460));

        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, 30));

        jButton2.setText("PURCHASE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 210, 110, 30));

        pane.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setEditable(false);
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
        });
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 550, 32));

        medsName.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        medsName.setText("₱");
        jPanel2.add(medsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel4.setText("HE WHO HAS HEALTH HAS HOPE, AND HE WHO HAS HOPE HAS EVERYTHING");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/defaultImage.png"))); // NOI18N
        picture1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture1MouseClicked(evt);
            }
        });
        jPanel2.add(picture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 340, 330));

        update.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        update.setText("PURCHASE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, 178, 30));

        add2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add2.setText("CANCEL");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel2.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 380, -1));

        medsName1.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        medsName1.setText("MEDICINE NAME");
        jPanel2.add(medsName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        stocks.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        stocks.setText("STOCKS");
        jPanel2.add(stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 493, -1, -1));

        price1.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        price1.setText("PRICE");
        jPanel2.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        status.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("STATUS");
        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 550, -1));
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 190, 33));

        price3.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        price3.setText("STOCKS:");
        jPanel2.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 493, -1, -1));

        pane.addTab("tab2", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel5.setText("TYPE");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel7.setText("₱");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel8.setText("MEDICINE NAME");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel9.setText("ID");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel10.setText("USERNAME");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel15.setText("RECEIPT#");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel16.setText("RECEIPT DATE");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel17.setText("P.O. #");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel19.setText("RECEIPT#");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel20.setText("RECEIPT DATE");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        po.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        po.setText("  P.O. #");
        jPanel4.add(po, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel23.setText("AURORA WELLNESS PAVILION");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 450, 10));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 450, 10));

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel24.setText("RECEIPT TOTAL");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel25.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel25.setText("PRICE");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel26.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel26.setText("BILL TO");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel27.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel27.setText("QTY");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel28.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel28.setText("QTY");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel29.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel29.setText("AMOUNT");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        jLabel30.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel30.setText("MEDICINE NAME");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel32.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel32.setText("UNIT PRICE");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jLabel33.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel33.setText("AMOUNT");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel34.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel34.setText("UNIT PRICE");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel35.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel35.setText("/");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 200, 10, -1));

        jLabel36.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel36.setText("SUB TOTAL");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel37.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel37.setText("AMOUNT");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        jLabel38.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel38.setText("SALES TAX 10.25%");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 480, -1, 20));

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel22.setText("P.O. #");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel39.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel39.setText("AMOUNT");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 450, 590));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 30)); // NOI18N
        jLabel6.setText("HERE IS YOUR RECEIPT , THANKYOU FOR PURCHASING!");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jButton3.setText("CONFIRM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 450, 30));

        pane.addTab("tab3", jPanel3);

        getContentPane().add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained

    }//GEN-LAST:event_idFocusGained

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void picture1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture1MouseClicked

    }//GEN-LAST:event_picture1MouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String currentDate = now.format(formatter);
        
        xternal_db xdb = xternal_db.getInstance();
        jLabel9.setText(id.getText());
        jLabel10.setText(xdb.getUsername());
        jLabel5.setText(xdb.getType());
        jLabel19.setText(receiptCode(5));
        jLabel20.setText(currentDate);
        jLabel22.setText(receiptCode(4));
        
        LocalDate year = LocalDate.now();
        DateTimeFormatter yearFormat = DateTimeFormatter.ofPattern("yyyy");
        String currentYear = year.format(yearFormat);
        po.setText(currentYear);
        
        jLabel28.setText(String.valueOf(jSpinner1.getValue()));
        jLabel8.setText(medsName1.getText());
        jLabel34.setText(price1.getText());
        
        int price = 0;
        String priceText = jLabel34.getText();
        try {
            price = Integer.parseInt(priceText);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid price value - " + priceText);
        }
        
        int quantity = (Integer) jSpinner1.getValue();
        int totalAmount = price * quantity;
        jLabel39.setText(String.valueOf(totalAmount));
        
        jLabel39.setText(jLabel39.getText());
        jLabel37.setText(jLabel39.getText());
        
        double taxRate = 10.25 / 100;
        double taxAmount = totalAmount * taxRate;
        double totalAmountWithTax = totalAmount + taxAmount;
        jLabel29.setText(String.format("%.2f", totalAmountWithTax));
        
        Double overall = totalAmountWithTax + totalAmount;
        jLabel25.setText(String.format("%.2f", overall));
        pane.setSelectedIndex(2);

    }//GEN-LAST:event_updateActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        pane.setSelectedIndex(0);
    }//GEN-LAST:event_add2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int rowIndex = meds.getSelectedRow();
        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "PLEASE SELECT AN INDEX!");
        } else {
            try {
                TableModel tbl = meds.getModel();
                ResultSet rs = new DBConnection().getData("select * from ac_meds where m_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
                if (rs.next()) {
                    id.setText(String.valueOf(rs.getInt("m_id")));
                    medsName1.setText("" + rs.getString("m_name"));
                    price1.setText("" + rs.getString("m_price"));
                    stocks.setText("" + rs.getString("m_stocks"));
                    status.setText("" + rs.getString("m_status"));
                    
                    byte[] img = rs.getBytes("m_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(340, picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);
                    
                    pane.setSelectedIndex(1);
                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new LoginDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            xternal_db xdb = xternal_db.getInstance();
            
            new DBConnection().insertData("INSERT INTO ac_transactions (t_username, t_medsName, t_price, t_total, t_date, t_receipt, t_po, t_id)"
                    + " VALUES ('" + xdb.getUsername() + "', '" + jLabel8.getText() + "', '" + jLabel34.getText() + "',"
                    + " '" + jLabel25.getText() + "', '" + jLabel20.getText() + "', '" + jLabel19.getText() + "', '" + jLabel22.getText() + "', '" + id.getText() + "')");
            
            JOptionPane.showMessageDialog(null, "ACCOUNT SUCCESSFULLY UPDATED!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            
            new DBConnection().insertData("INSERT INTO ac_logs (lg_email, lg_username, lg_actions)"
                    + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'JUST UPDATED AN ACCOUNT ID = " + id.getText() + "')");
            
            pane.setSelectedIndex(0);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "PLEASE PRESENT YOUR RECEIPT AT THE NEAREST COUNTER!");
            pane.setSelectedIndex(0);
        }

    }//GEN-LAST:event_jButton3ActionPerformed
    
    public static void main(String args[]) {
        FlatLightLaf.registerCustomDefaultsSource("Style");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDSB().setVisible(true);
            }
        });
    }
    
    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture1.getHeight(), picture1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    private String receiptCode(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        
        return sb.toString();
    }
    
    private void displayData() {
        try {
            ResultSet rs = new DBConnection().getData("select * from ac_meds");
            meds.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add2;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable meds;
    private javax.swing.JLabel medsName;
    private javax.swing.JLabel medsName1;
    private javax.swing.JTabbedPane pane;
    public javax.swing.JLabel picture1;
    private javax.swing.JLabel po;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price3;
    private javax.swing.JLabel status;
    private javax.swing.JLabel stocks;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
