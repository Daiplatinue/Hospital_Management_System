package Forms;

import Database.DBConnection;
import Database.xternal_db;
import RegisterForm.RegisterDSB;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import jnafilechooser.api.JnaFileChooser;
import net.proteanit.sql.DbUtils;

public final class Form_3 extends javax.swing.JPanel {

    public Form_3() throws IOException {
        initComponents();
        displayData();
        imageDisplay();

        if (icon1.getText().equals("") || name1.getText().equals("") || type1.getText().equals("") || status1.getText().equals("")) {

        } else {
            panel1.setBackground(Color.LIGHT_GRAY);
        }

        scroll1.getVerticalScrollBar().setUnitIncrement(16);
        search.setFocusable(false);
        print.setFocusable(false);
        printableTable.setFocusable(false);
        changeView.setFocusable(false);

        search.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SEARCH");

        firstname.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        lastname.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        middlename.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        email.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        cpassword.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        firstname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "FIRST NAME");
        lastname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "LAST NAME");
        middlename.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "MIDDLE NAME");
        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EMAIL");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        cpassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "CONFIRM PASSWORD");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        pane = new javax.swing.JTabbedPane();
        scroll1 = new javax.swing.JScrollPane();
        scrols = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        printableTable = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        cpassword = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        add5 = new javax.swing.JButton();
        add7 = new javax.swing.JButton();
        add8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        changeView = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ac_db = new javax.swing.JTable();

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll1.setBackground(new java.awt.Color(255, 255, 255));
        scroll1.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        scrols.setBackground(new java.awt.Color(255, 255, 255));
        scrols.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1MouseClicked(evt);
            }
        });
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setText("asd");
        panel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        status1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status1.setText("asd");
        panel1.add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        name1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("asd");
        panel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));

        type1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type1.setText("asd");
        panel1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        scrols.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 260, 330));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 260, 330));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 260, 330));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 260, 330));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 260, 330));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 260, 330));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 260, 330));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 260, 330));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 790, 260, 330));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, 260, 330));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 790, 260, 330));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        scrols.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 790, 260, 330));

        printableTable.setText("PRINTABLE TABLE");
        printableTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printableTableActionPerformed(evt);
            }
        });
        scrols.add(printableTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 30));

        scroll1.setViewportView(scrols);

        pane.addTab("tab3", scroll1);

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel2.setText("UPDATE USER INFO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel3.setText("PLEASE DOUBLE CHECK YOUR INFORMATION BEFORE CREATING AN ACCOUNT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        firstname.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 350, 30));

        lastname.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 350, 30));

        username.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 350, 30));

        middlename.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        middlename.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 350, 30));

        cpassword.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        cpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 350, 30));

        email.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 350, 30));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 350, 30));

        jComboBox2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "RECEPTIONIST", "PHARMACIST", "PATIENT", "DOCTER" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 350, 30));

        jComboBox3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 350, 30));

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg"))); // NOI18N
        picture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 350, 350));

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 350, -1));

        add2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add2.setText("CANCEL");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel1.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 160, -1));

        add3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add3.setText("UPDATE");
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });
        jPanel1.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 160, -1));

        add5.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add5.setText("DELETE");
        add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5ActionPerformed(evt);
            }
        });
        jPanel1.add(add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 170, -1));

        add7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add7.setText("CLEAR");
        add7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add7ActionPerformed(evt);
            }
        });
        jPanel1.add(add7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 170, -1));

        add8.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add8.setText("UPDATE");
        add8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add8ActionPerformed(evt);
            }
        });
        jPanel1.add(add8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, -1));

        scroll.setViewportView(jPanel1);

        pane.addTab("tab3", scroll);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changeView.setText("CHANGE VIEW");
        changeView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeViewActionPerformed(evt);
            }
        });
        jPanel2.add(changeView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 163, 130, 30));

        search.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 410, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW ALL ACCOUNTS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 0, 410, -1));

        print.setText("PRINT");
        jPanel2.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 163, 130, 30));

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
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel5.setText("ALL");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

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
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 90, -1, -1));

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
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

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
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 90, -1, -1));

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
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        ac_db.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ac_db);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 1150, 460));

        pane.addTab("tab3", jPanel2);

        jPanel11.add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
    }//GEN-LAST:event_removeActionPerformed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked

    }//GEN-LAST:event_panelMouseClicked

    private void pictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureMouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            File selectedFile = ch.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            picture.setIcon(ResizeImage(path));
        }
    }//GEN-LAST:event_pictureMouseClicked

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
        if (icon1.getText().equals("") || name1.getText().equals("") || type1.getText().equals("") || status1.getText().equals("")) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
        }
    }//GEN-LAST:event_panel1MouseClicked

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        pane.setSelectedIndex(0);
    }//GEN-LAST:event_add2ActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed

    }//GEN-LAST:event_add3ActionPerformed

    private void add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add5ActionPerformed
    }//GEN-LAST:event_add5ActionPerformed

    private void add7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add7ActionPerformed
        firstname.setText("");
        lastname.setText("");
        middlename.setText("");
        username.setText("");
        email.setText("");
        password.setText("");
        cpassword.setText("");
    }//GEN-LAST:event_add7ActionPerformed

    private void add8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add8ActionPerformed
    }//GEN-LAST:event_add8ActionPerformed

    private void printableTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printableTableActionPerformed
        pane.setSelectedIndex(2);
    }//GEN-LAST:event_printableTableActionPerformed

    private void changeViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeViewActionPerformed
        pane.setSelectedIndex(0);
    }//GEN-LAST:event_changeViewActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
    }//GEN-LAST:event_searchMouseClicked
    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setFocusable(true);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setFocusable(false);
    }//GEN-LAST:event_searchMouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
    }//GEN-LAST:event_jLabel4MouseExited

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture.getHeight(), picture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void displayData() {
        try {
            xternal_db xdb = xternal_db.getInstance();
            ResultSet rs = new DBConnection().getData("select ac_id,ac_email,ac_username,ac_contact,ac_type,ac_status from ac_table where ac_status in ('active', 'inactive') and ac_id != '" + xdb.getId() + "'");
            ac_db.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    public void imageDisplay() {
        try {
            xternal_db xdb = xternal_db.getInstance();
            Connection cn = new DBConnection().getConnection();
            PreparedStatement pst = cn.prepareStatement("SELECT ac_image FROM ac_table WHERE ac_id != ?");
            pst.setString(1, xdb.getId());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                byte[] img = rs.getBytes("ac_image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image im2 = im.getScaledInstance(260, 170, Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(im2);
                icon1.setIcon(newImage);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(); // Print the exception for debugging purposes
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ac_db;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton add5;
    private javax.swing.JButton add7;
    private javax.swing.JButton add8;
    private javax.swing.JButton changeView;
    private javax.swing.JTextField cpassword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private static javax.swing.JLabel icon1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField middlename;
    private javax.swing.JLabel name1;
    private javax.swing.JTabbedPane pane;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField password;
    private javax.swing.JLabel picture;
    private javax.swing.JButton print;
    private javax.swing.JButton printableTable;
    private javax.swing.JButton remove;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JPanel scrols;
    private javax.swing.JTextField search;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel type1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
