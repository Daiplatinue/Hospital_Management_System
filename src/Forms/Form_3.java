package Forms;

import Database.*;
import Functions.*;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.border.*;
import javax.swing.table.*;
import jnafilechooser.api.*;
import net.proteanit.sql.*;

public final class Form_3 extends javax.swing.JPanel {

    String path2 = null;
    private final Map<JPanel, Timer> enterTimers;
    private final Map<JPanel, Timer> exitTimers;
    private final int step = 5;
    String destination = "src/MyImages/default.png";

    public Form_3() throws IOException {
        this.enterTimers = new HashMap<>();
        this.exitTimers = new HashMap<>();

        initComponents();
        displayData();
        focusableButtonsSetter();
        form3Handlers();
        addKeyListener();
        acquireData();
        scroll1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        pane = new javax.swing.JTabbedPane();
        scroll1 = new javax.swing.JScrollPane();
        scrols = new javax.swing.JPanel();
        panel4 = new javax.swing.JPanel();
        id4 = new javax.swing.JLabel();
        type4 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        status4 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        uid4 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        imageAvatar1 = new Swing.ImageAvatar();
        uid1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        uid2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        id3 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        type3 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        status3 = new javax.swing.JLabel();
        uid3 = new javax.swing.JLabel();
        panel7 = new javax.swing.JPanel();
        status7 = new javax.swing.JLabel();
        type7 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();
        icon7 = new javax.swing.JLabel();
        uid7 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        status6 = new javax.swing.JLabel();
        type6 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        icon6 = new javax.swing.JLabel();
        uid6 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        status5 = new javax.swing.JLabel();
        type5 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        icon5 = new javax.swing.JLabel();
        uid5 = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        status8 = new javax.swing.JLabel();
        type8 = new javax.swing.JLabel();
        name8 = new javax.swing.JLabel();
        id8 = new javax.swing.JLabel();
        icon8 = new javax.swing.JLabel();
        uid8 = new javax.swing.JLabel();
        panel11 = new javax.swing.JPanel();
        status11 = new javax.swing.JLabel();
        type11 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        id11 = new javax.swing.JLabel();
        icon11 = new javax.swing.JLabel();
        uid11 = new javax.swing.JLabel();
        panel10 = new javax.swing.JPanel();
        status10 = new javax.swing.JLabel();
        type10 = new javax.swing.JLabel();
        name10 = new javax.swing.JLabel();
        id10 = new javax.swing.JLabel();
        icon10 = new javax.swing.JLabel();
        uid10 = new javax.swing.JLabel();
        panel9 = new javax.swing.JPanel();
        status9 = new javax.swing.JLabel();
        type9 = new javax.swing.JLabel();
        name9 = new javax.swing.JLabel();
        id9 = new javax.swing.JLabel();
        icon9 = new javax.swing.JLabel();
        uid9 = new javax.swing.JLabel();
        panel12 = new javax.swing.JPanel();
        icon12 = new javax.swing.JLabel();
        id12 = new javax.swing.JLabel();
        status12 = new javax.swing.JLabel();
        type12 = new javax.swing.JLabel();
        name12 = new javax.swing.JLabel();
        uid12 = new javax.swing.JLabel();
        printableTable = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        picture1 = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        secret = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cover = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
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

        setMinimumSize(new java.awt.Dimension(1310, 770));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1310, 50));

        scroll1.setBackground(new java.awt.Color(255, 255, 255));
        scroll1.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        scrols.setBackground(new java.awt.Color(255, 255, 255));
        scrols.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel4.setBackground(new java.awt.Color(255, 255, 255));
        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel4MouseExited(evt);
            }
        });
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id4.setForeground(new java.awt.Color(0, 87, 255));
        id4.setText("lastname");
        panel4.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        type4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        type4.setForeground(new java.awt.Color(102, 102, 102));
        type4.setText("Type");
        panel4.add(type4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name4.setForeground(new java.awt.Color(70, 133, 255));
        name4.setText("Email");
        panel4.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        status4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status4.setText("Status");
        panel4.add(status4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        icon4.setText("ICON");
        panel4.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid4.setForeground(new java.awt.Color(102, 102, 102));
        uid4.setText("id");
        panel4.add(uid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, 260, 330));

        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel1MouseExited(evt);
            }
        });
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setText("ICON");
        panel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        status1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status1.setText("Status");
        panel1.add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 250, 20));

        name1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name1.setForeground(new java.awt.Color(70, 133, 255));
        name1.setText("Email");
        panel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 250, 20));

        type1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        type1.setForeground(new java.awt.Color(102, 102, 102));
        type1.setText("type");
        panel1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 140, 20));

        id1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id1.setForeground(new java.awt.Color(0, 87, 255));
        id1.setText("lastname");
        panel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 250, 20));
        panel1.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, 60));

        uid1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid1.setForeground(new java.awt.Color(102, 102, 102));
        uid1.setText("id");
        panel1.add(uid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 260, 330));

        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel2MouseExited(evt);
            }
        });
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon2.setText("ICON");
        panel2.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        id2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id2.setForeground(new java.awt.Color(0, 87, 255));
        id2.setText("lastname");
        panel2.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        type2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        type2.setForeground(new java.awt.Color(102, 102, 102));
        type2.setText("Type");
        panel2.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 200, 20));

        name2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name2.setForeground(new java.awt.Color(70, 133, 255));
        name2.setText("Email");
        panel2.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        status2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status2.setText("Status");
        panel2.add(status2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        uid2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid2.setForeground(new java.awt.Color(102, 102, 102));
        uid2.setText("id");
        panel2.add(uid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 260, 330));

        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel3MouseExited(evt);
            }
        });
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id3.setForeground(new java.awt.Color(0, 87, 255));
        id3.setText("lastname");
        panel3.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        icon3.setText("ICON");
        panel3.add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        type3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        type3.setForeground(new java.awt.Color(102, 102, 102));
        type3.setText("Type");
        panel3.add(type3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name3.setForeground(new java.awt.Color(70, 133, 255));
        name3.setText("Email");
        panel3.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        status3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status3.setText("Status");
        panel3.add(status3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        uid3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid3.setForeground(new java.awt.Color(102, 102, 102));
        uid3.setText("id");
        panel3.add(uid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 260, 330));

        panel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel7MouseExited(evt);
            }
        });
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status7.setText("Status");
        panel7.add(status7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type7.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type7.setForeground(new java.awt.Color(102, 102, 102));
        type7.setText("Type");
        panel7.add(type7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name7.setForeground(new java.awt.Color(70, 133, 255));
        name7.setText("Email");
        panel7.add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id7.setForeground(new java.awt.Color(0, 87, 255));
        id7.setText("lastname");
        panel7.add(id7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        icon7.setText("ICON");
        panel7.add(icon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid7.setForeground(new java.awt.Color(102, 102, 102));
        uid7.setText("id");
        panel7.add(uid7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 260, 330));

        panel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel6MouseExited(evt);
            }
        });
        panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status6.setText("Status");
        panel6.add(status6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type6.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type6.setForeground(new java.awt.Color(102, 102, 102));
        type6.setText("Type");
        panel6.add(type6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name6.setForeground(new java.awt.Color(70, 133, 255));
        name6.setText("Email");
        panel6.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id6.setForeground(new java.awt.Color(0, 87, 255));
        id6.setText("lastname");
        panel6.add(id6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        icon6.setText("ICON");
        panel6.add(icon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid6.setForeground(new java.awt.Color(102, 102, 102));
        uid6.setText("id");
        panel6.add(uid6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 260, 330));

        panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel5MouseExited(evt);
            }
        });
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status5.setText("Status");
        panel5.add(status5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type5.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type5.setForeground(new java.awt.Color(102, 102, 102));
        type5.setText("Type");
        panel5.add(type5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name5.setForeground(new java.awt.Color(70, 133, 255));
        name5.setText("Email");
        panel5.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id5.setForeground(new java.awt.Color(0, 87, 255));
        id5.setText("lastname");
        panel5.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        icon5.setText("ICON");
        panel5.add(icon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid5.setForeground(new java.awt.Color(102, 102, 102));
        uid5.setText("id");
        panel5.add(uid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 260, 330));

        panel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel8MouseExited(evt);
            }
        });
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status8.setText("Status");
        panel8.add(status8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type8.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type8.setForeground(new java.awt.Color(102, 102, 102));
        type8.setText("Type");
        panel8.add(type8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name8.setForeground(new java.awt.Color(70, 133, 255));
        name8.setText("Email");
        panel8.add(name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id8.setForeground(new java.awt.Color(0, 87, 255));
        id8.setText("lastname");
        panel8.add(id8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        icon8.setText("ICON");
        panel8.add(icon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid8.setForeground(new java.awt.Color(102, 102, 102));
        uid8.setText("id");
        panel8.add(uid8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, 260, 330));

        panel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel11MouseExited(evt);
            }
        });
        panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status11.setText("Status");
        panel11.add(status11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type11.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type11.setForeground(new java.awt.Color(102, 102, 102));
        type11.setText("Type");
        panel11.add(type11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name11.setForeground(new java.awt.Color(70, 133, 255));
        name11.setText("Email");
        panel11.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id11.setForeground(new java.awt.Color(0, 87, 255));
        id11.setText("lastname");
        panel11.add(id11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        icon11.setText("ICON");
        panel11.add(icon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid11.setForeground(new java.awt.Color(102, 102, 102));
        uid11.setText("id");
        panel11.add(uid11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 960, 260, 330));

        panel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel10MouseExited(evt);
            }
        });
        panel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status10.setText("Status");
        panel10.add(status10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type10.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type10.setForeground(new java.awt.Color(102, 102, 102));
        type10.setText("Type");
        panel10.add(type10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name10.setForeground(new java.awt.Color(70, 133, 255));
        name10.setText("Email");
        panel10.add(name10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id10.setForeground(new java.awt.Color(0, 87, 255));
        id10.setText("lastname");
        panel10.add(id10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        icon10.setText("ICON");
        panel10.add(icon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid10.setForeground(new java.awt.Color(102, 102, 102));
        uid10.setText("id");
        panel10.add(uid10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 960, 260, 330));

        panel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel9MouseExited(evt);
            }
        });
        panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status9.setText("Status");
        panel9.add(status9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type9.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type9.setForeground(new java.awt.Color(102, 102, 102));
        type9.setText("Type");
        panel9.add(type9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name9.setForeground(new java.awt.Color(70, 133, 255));
        name9.setText("Email");
        panel9.add(name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id9.setForeground(new java.awt.Color(0, 87, 255));
        id9.setText("lastname");
        panel9.add(id9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        icon9.setText("ICON");
        panel9.add(icon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid9.setForeground(new java.awt.Color(102, 102, 102));
        uid9.setText("id");
        panel9.add(uid9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 960, 260, 330));

        panel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel12MouseExited(evt);
            }
        });
        panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon12.setText("ICON");
        panel12.add(icon12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        id12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id12.setForeground(new java.awt.Color(0, 87, 255));
        id12.setText("lastname");
        panel12.add(id12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        status12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status12.setText("Status");
        panel12.add(status12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type12.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type12.setForeground(new java.awt.Color(102, 102, 102));
        type12.setText("Type");
        panel12.add(type12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 200, 20));

        name12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name12.setForeground(new java.awt.Color(70, 133, 255));
        name12.setText("Email");
        panel12.add(name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        uid12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid12.setForeground(new java.awt.Color(102, 102, 102));
        uid12.setText("id");
        panel12.add(uid12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 960, 260, 330));

        printableTable.setText("CHANGE VIEW");
        printableTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printableTableActionPerformed(evt);
            }
        });
        scrols.add(printableTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1160, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        scrols.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1310, 1160, 50));

        scroll1.setViewportView(scrols);

        pane.addTab("tab3", scroll1);

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 2660, 302, 30));

        username.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 660, 32));

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 770, 302, 32));

        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerFocusGained(evt);
            }
        });
        answer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answerMouseClicked(evt);
            }
        });
        jPanel4.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 2510, 302, 32));

        picture1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture1MouseClicked(evt);
            }
        });
        jPanel4.add(picture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 180, 190));

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel4.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 2690, 352, 30));

        secret.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secret.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                secretFocusGained(evt);
            }
        });
        secret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secretMouseClicked(evt);
            }
        });
        jPanel4.add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 2720, 302, 32));

        type.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        jPanel4.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 2770, 303, 30));

        status.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "ACTIVE", "IN-ACTIVE", "DELETED" }));
        jPanel4.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 2820, 303, 30));

        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactFocusGained(evt);
            }
        });
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMouseClicked(evt);
            }
        });
        jPanel4.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 2720, 302, 32));

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
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 2770, 302, 32));

        clear.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel4.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 2820, 302, 30));

        delete.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 2860, 302, 30));

        update.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        update.setText("UPDATE ACCOUNT");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel4.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 2820, 302, 30));

        add2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add2.setText("CANCEL");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel4.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 2860, 300, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 1050, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 310, 90, 30));

        cover.setOpaque(true);
        jPanel4.add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1320, 310));

        firstname.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        firstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        firstname.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstnameFocusGained(evt);
            }
        });
        firstname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstnameMouseClicked(evt);
            }
        });
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel4.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 660, 32));

        lastname.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        lastname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lastname.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastnameFocusGained(evt);
            }
        });
        lastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastnameMouseClicked(evt);
            }
        });
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 660, 32));

        jScrollPane2.setViewportView(jPanel4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 730));

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
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 410, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW ALL ACCOUNTS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 410, -1));

        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
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
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

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
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

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
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

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
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

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
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

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
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, -1));

        ac_db.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ac_db);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 1150, 460));

        pane.addTab("tab3", jPanel2);

        jPanel11.add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1340, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
        dataRetriever(1, id1, name1, status1, uid1, type1, picture1, pane);
    }//GEN-LAST:event_panel1MouseClicked

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

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked
        dataRetriever(1, id2, name2, status2, uid2, type2, picture1, pane);
    }//GEN-LAST:event_panel2MouseClicked

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        dataRetriever(1, id3, name3, status3, uid3, type3, picture1, pane);
    }//GEN-LAST:event_panel3MouseClicked

    private void panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseClicked
        dataRetriever(1, id4, name4, status4, uid4, type4, picture1, pane);
    }//GEN-LAST:event_panel4MouseClicked

    private void panel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MouseClicked
        dataRetriever(1, id5, name5, status5, uid5, type5, picture1, pane);
    }//GEN-LAST:event_panel5MouseClicked

    private void panel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6MouseClicked
        dataRetriever(1, id6, name6, status6, uid6, type6, picture1, pane);
    }//GEN-LAST:event_panel6MouseClicked

    private void panel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7MouseClicked
        dataRetriever(1, id7, name7, status7, uid7, type7, picture1, pane);
    }//GEN-LAST:event_panel7MouseClicked

    private void panel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MouseEntered
        animatePanels(new JPanel[]{panel8}, new int[]{500});
    }//GEN-LAST:event_panel8MouseEntered

    private void panel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9MouseClicked
        dataRetriever(1, id9, name9, status9, uid9, type9, picture1, pane);
    }//GEN-LAST:event_panel9MouseClicked

    private void panel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10MouseClicked
        dataRetriever(1, id10, name10, status10, uid10, type10, picture1, pane);
    }//GEN-LAST:event_panel10MouseClicked

    private void panel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MouseEntered
        animatePanels(new JPanel[]{panel11}, new int[]{930});
    }//GEN-LAST:event_panel11MouseEntered

    private void panel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MouseEntered
        animatePanels(new JPanel[]{panel12}, new int[]{930});
    }//GEN-LAST:event_panel12MouseEntered

    private void panel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MouseClicked
        dataRetriever(1, id12, name12, status12, uid12, type12, picture1, pane);
    }//GEN-LAST:event_panel12MouseClicked

    private void panel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MouseClicked
        dataRetriever(1, id11, name11, status11, uid11, type11, picture1, pane);
    }//GEN-LAST:event_panel11MouseClicked

    private void panel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MouseClicked
        dataRetriever(1, id8, name8, status8, uid8, type8, picture1, pane);
    }//GEN-LAST:event_panel8MouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("Total Accounts Registered Reports");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            ac_db.print(JTable.PrintMode.FIT_WIDTH, header, footer);

            Connection cn = new DBConnection().getConnection();

            xternal_db xdb = xternal_db.getInstance();
            PreparedStatement logs = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                    + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'JUST PRINTED A TABLE ON FORM_3')");
            logs.execute();

        } catch (PrinterException | SQLException er) {
            System.out.println("" + er.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseEntered
        animatePanels(new JPanel[]{panel1}, new int[]{90});
    }//GEN-LAST:event_panel1MouseEntered

    private void panel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseExited
        animatePanels(new JPanel[]{panel1}, new int[]{110});
    }//GEN-LAST:event_panel1MouseExited

    private void panel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseEntered
        animatePanels(new JPanel[]{panel2}, new int[]{90});
    }//GEN-LAST:event_panel2MouseEntered

    private void panel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseExited
        animatePanels(new JPanel[]{panel2}, new int[]{110});
    }//GEN-LAST:event_panel2MouseExited

    private void panel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseEntered
        animatePanels(new JPanel[]{panel3}, new int[]{90});
    }//GEN-LAST:event_panel3MouseEntered

    private void panel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseExited
        animatePanels(new JPanel[]{panel3}, new int[]{110});
    }//GEN-LAST:event_panel3MouseExited

    private void panel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseEntered
        animatePanels(new JPanel[]{panel4}, new int[]{90});
    }//GEN-LAST:event_panel4MouseEntered

    private void panel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseExited
        animatePanels(new JPanel[]{panel4}, new int[]{110});
    }//GEN-LAST:event_panel4MouseExited

    private void panel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MouseEntered
        animatePanels(new JPanel[]{panel5}, new int[]{500});
    }//GEN-LAST:event_panel5MouseEntered

    private void panel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MouseExited
        animatePanels(new JPanel[]{panel5}, new int[]{530});
    }//GEN-LAST:event_panel5MouseExited

    private void panel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6MouseEntered
        animatePanels(new JPanel[]{panel6}, new int[]{500});
    }//GEN-LAST:event_panel6MouseEntered

    private void panel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6MouseExited
        animatePanels(new JPanel[]{panel6}, new int[]{530});
    }//GEN-LAST:event_panel6MouseExited

    private void panel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7MouseEntered
        animatePanels(new JPanel[]{panel7}, new int[]{500});
    }//GEN-LAST:event_panel7MouseEntered

    private void panel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7MouseExited
        animatePanels(new JPanel[]{panel7}, new int[]{530});
    }//GEN-LAST:event_panel7MouseExited

    private void panel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MouseExited
        animatePanels(new JPanel[]{panel8}, new int[]{530});
    }//GEN-LAST:event_panel8MouseExited

    private void panel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9MouseEntered
        animatePanels(new JPanel[]{panel9}, new int[]{930});
    }//GEN-LAST:event_panel9MouseEntered

    private void panel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9MouseExited
        animatePanels(new JPanel[]{panel9}, new int[]{960});
    }//GEN-LAST:event_panel9MouseExited

    private void panel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10MouseEntered
        animatePanels(new JPanel[]{panel10}, new int[]{930});
    }//GEN-LAST:event_panel10MouseEntered

    private void panel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10MouseExited
        animatePanels(new JPanel[]{panel10}, new int[]{960});
    }//GEN-LAST:event_panel10MouseExited

    private void panel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MouseExited
        animatePanels(new JPanel[]{panel11}, new int[]{960});
    }//GEN-LAST:event_panel11MouseExited

    private void panel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MouseExited
        animatePanels(new JPanel[]{panel12}, new int[]{960});
    }//GEN-LAST:event_panel12MouseExited

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        pane.setSelectedIndex(0);
    }//GEN-LAST:event_add2ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            String user = username.getText().trim();
            String emails = email.getText().trim();
            String secretQuestion = secret.getText().trim();
            String secretAnswer = answer.getText().trim();
            String contacts = contact.getText().trim();
            String types = (String) type.getSelectedItem();
            String stats = (String) status.getSelectedItem();
            String photoPath = path2 != null ? path2.trim() : "";
            String idText = id.getText().trim();

            // Debugging
            System.out.println("User: [" + user + "]");
            System.out.println("Email: [" + emails + "]");
            System.out.println("Secret Question: [" + secretQuestion + "]");
            System.out.println("Secret Answer: [" + secretAnswer + "]");
            System.out.println("Contact: [" + contacts + "]");
            System.out.println("Photo Path: [" + photoPath + "]");
            System.out.println("ID: [" + idText + "]");

            if (user.isEmpty() || emails.isEmpty() || secretQuestion.isEmpty() || secretAnswer.isEmpty()
                    || contacts.isEmpty() || idText.isEmpty()) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE FILL ALL FIELDS AND INSERT AN IMAGE!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);

                if (photoPath.isEmpty()) {
                    System.out.println("Image file path is empty.");
                } else {
                    File photoFile = new File(photoPath);
                    if (!photoFile.exists() || !photoFile.isFile()) {
                        System.out.println("Image file not found or invalid: " + photoPath);
                        UIManager.put("OptionPane.background", Color.white);
                        UIManager.put("Panel.background", Color.white);
                        JOptionPane.showMessageDialog(null, "IMAGE FILE NOT FOUND OR INVALID!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
                    }
                }
            } else {
                Connection cn = new DBConnection().getConnection();
                PreparedStatement pst = cn.prepareStatement(
                        "UPDATE ac_table SET ac_username = ?, ac_email = ?, ac_sq = ?, ac_sa = ?, ac_type = ?, ac_status = ?, ac_contact = ? "
                        + (!photoPath.isEmpty() ? ", ac_image = ? " : "")
                        + "WHERE ac_id = ?");

                pst.setString(1, user);
                pst.setString(2, emails);
                pst.setString(3, secretQuestion);
                pst.setString(4, secretAnswer);
                pst.setString(5, types);
                pst.setString(6, stats);
                pst.setString(7, contacts);

                int parameterIndex = 8;
                if (!photoPath.isEmpty()) {
                    InputStream is = new FileInputStream(new File(photoPath));
                    pst.setBlob(parameterIndex++, is);
                }

                pst.setString(parameterIndex, idText);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "ACCOUNT SUCCESSFULLY UPDATED!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                xternal_db xdb = xternal_db.getInstance();
                PreparedStatement logs = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                        + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'JUST UPDATED AN ACCOUNT ID =  " + id.getText() + "')");
                logs.execute();

                pane.setSelectedIndex(0);

                acquireData();

            }
        } catch (SQLException | FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            String idText = id.getText().trim();
            if (idText.isEmpty()) {
                System.out.println("Error ID omg");
            } else {
                Connection cn = new DBConnection().getConnection();
                PreparedStatement pst = cn.prepareStatement("UPDATE ac_table SET ac_status = 'DELETED' WHERE ac_id = ?");
                pst.setString(1, idText);
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "ACCOUNT STATUS UPDATED TO 'DELETED'!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    xternal_db xdb = xternal_db.getInstance();
                    PreparedStatement logs = cn.prepareStatement("INSERT INTO ac_logs (lg_email,lg_username,lg_actions)"
                            + " VALUES ('" + xdb.getEmail() + "', '" + xdb.getUsername() + "', 'JUST DELETED AN ACCOUNT, ID = " + id.getText() + "')");
                    logs.execute();

                    acquireData();
                    pane.setSelectedIndex(0);

                } else {
                    JOptionPane.showMessageDialog(null, "NO ACCOUNT FOUND WITH ID: " + idText, "WARNING", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        username.setText("");
        email.setText("");
        password.setText("");
        secret.setText("");
        answer.setText("");
        contact.setText("");
        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));

        JTextField[] components = {username, email, password, secret, answer, contact};
        BorderColorManager borderReset = new BorderColorManager(components);
        borderReset.resetBorderColor();
    }//GEN-LAST:event_clearActionPerformed

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained

    }//GEN-LAST:event_idFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked

    }//GEN-LAST:event_contactMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained

    }//GEN-LAST:event_contactFocusGained

    private void secretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretMouseClicked

    }//GEN-LAST:event_secretMouseClicked

    private void secretFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secretFocusGained

    }//GEN-LAST:event_secretFocusGained

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
    }//GEN-LAST:event_removeActionPerformed

    private void picture1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture1MouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            File selectedFile = ch.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            picture1.setIcon(ResizeImage(path));
            path2 = path;
        } else {
            System.out.println("nabanhaw ng image wama kiti");
        }
    }//GEN-LAST:event_picture1MouseClicked

    private void answerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerMouseClicked

    }//GEN-LAST:event_answerMouseClicked

    private void answerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusGained

    }//GEN-LAST:event_answerFocusGained

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setFocusable(true);
    }//GEN-LAST:event_emailMouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setFocusable(true);
    }//GEN-LAST:event_emailFocusGained

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked

    }//GEN-LAST:event_usernameMouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained

    }//GEN-LAST:event_usernameFocusGained

    private void firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameFocusGained

    private void firstnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameMouseClicked

    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameFocusGained

    private void lastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameMouseClicked

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture1.getHeight(), picture1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void displayData() {
        try {
            xternal_db xdb = xternal_db.getInstance();
            ResultSet rs = new DBConnection().getData("select ac_id,ac_email,ac_username,ac_contact,ac_type,ac_status from ac_table where ac_status in ('active', 'in-active') and ac_id != '" + xdb.getId() + "'");
            ac_db.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    private void fetch(int index, JLabel[] ids, JLabel[] names, JLabel[] types, JLabel[] statuses, JLabel[] uids, JLabel[] icons, JPanel[] panels) {
        try {
            TableModel tbl = ac_db.getModel();
            if (tbl.getRowCount() > 0) {
                xternal_db xdb = xternal_db.getInstance();

                String query = "SELECT * FROM ac_table WHERE ac_id != ? AND ac_status IN ('active', 'in-active') LIMIT ?, ?";
                DBConnection dbConnection = new DBConnection();
                PreparedStatement ps = dbConnection.getConnection().prepareStatement(query);
                ps.setString(1, xdb.getId());
                ps.setInt(2, index);
                ps.setInt(3, Math.min(ids.length, Math.min(names.length, Math.min(types.length, Math.min(statuses.length, Math.min(icons.length, panels.length))))));

                ResultSet rs = ps.executeQuery();
                int i = 0;
                while (rs.next() && i <= ids.length) {
                    ids[i].setText(rs.getString("ac_lastname"));
                    names[i].setText(rs.getString("ac_email"));
                    types[i].setText(rs.getString("ac_type"));
                    statuses[i].setText(rs.getString("ac_status"));
                    uids[i].setText(rs.getString("ac_id"));

                    if (statuses[i].getText().equalsIgnoreCase("active")) {
                        statuses[i].setForeground(new Color(66, 202, 197));
                    } else {
                        statuses[i].setForeground(Color.RED);
                    }

                    String img = rs.getString("ac_images");

                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(260, 170, Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    icons[i].setIcon(newImage);
                    panels[i].setVisible(true);
                    panels[i].setBorder(new LineBorder(Color.BLACK, 2));
                    i++;
                }

                for (int j = i; j < panels.length; j++) {
                    removePanel(icons[j]);
                    removePanel(ids[j]);
                    removePanel(types[j]);
                    removePanel(names[j]);
                    removePanel(statuses[j]);
                    panels[j].setVisible(false);
                }

            } else {
                System.out.println("Table is empty");
            }
        } catch (SQLException er) {
            System.out.println("ERROR: " + er.getMessage());
        }
    }

    public int progress() {
        int progress = 0;

        JTextField[] fields = {username, email, password, secret, answer, contact};
        int[] scores = {5, 5, 10, 5, 7, 7, 5};
        Color[] colors = {Color.RED, Color.GREEN};

        for (int i = 0; i < fields.length; i++) {
            if (!fields[i].getText().equals("")) {
                progress += scores[i];
                fields[i].setBorder(BorderFactory.createLineBorder(colors[1]));
            } else {
                progress -= scores[i];
                fields[i].setBorder(BorderFactory.createLineBorder(colors[0]));
            }
        }

        if (type.getSelectedIndex() != -1) {
            progress += 60;
        }

        return progress;
    }

    public void acquireData() {
        JLabel[] ids = {id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12};
        JLabel[] names = {name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12};
        JLabel[] types = {type1, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12};
        JLabel[] statuses = {status1, status2, status3, status4, status5, status6, status7, status8, status9, status10, status11, status12};
        JLabel[] icons = {icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9, icon10, icon11, icon12};
        JPanel[] panels = {panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12};
        JLabel[] uids = {uid1, uid2, uid3, uid4, uid5, uid6, uid7, uid8, uid9, uid10, uid11, uid12};
        fetch(0, ids, names, types, statuses, uids, icons, panels);
        displayData();
        focusableButtonsSetter();
        form3Handlers();
        addKeyListener();
    }

    private void removePanel(JLabel panel) {
        if (panel != null) {
            panel.setIcon(null);
            panel.setText(null);
            panel.setVisible(false);
        }
    }

    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }

    public void animatePanels(JPanel[] panels, int[] targetYs) {
        for (int i = 0; i < panels.length; i++) {
            JPanel panel = panels[i];
            int targetY = targetYs[i];

            if (enterTimers.containsKey(panel) && enterTimers.get(panel).isRunning()) {
                enterTimers.get(panel).stop();
            }
            if (exitTimers.containsKey(panel) && exitTimers.get(panel).isRunning()) {
                exitTimers.get(panel).stop();
            }

            Timer timer = new Timer(10, (ActionEvent e) -> {
                int currentY = panel.getY();
                if (currentY < targetY) {
                    panel.setLocation(panel.getX(), Math.min(currentY + step, targetY));
                } else if (currentY > targetY) {
                    panel.setLocation(panel.getX(), Math.max(currentY - step, targetY));
                }

                if (currentY == targetY) {
                    ((Timer) e.getSource()).stop();
                }
            });

            if (targetY == 100) {
                enterTimers.put(panel, timer);
            } else {
                exitTimers.put(panel, timer);
            }

            timer.start();
        }
    }

    public void focusableButtonsSetter() {
        search.setFocusable(false);
        print.setFocusable(false);
        printableTable.setFocusable(false);
        changeView.setFocusable(false);
    }

    public void form3Handlers() {
        String[] placeholders = {
            "ID", "USERNAME", "PASSWORD", "EMAIL",
            "SECRET ANSWER", "SECRET QUESTION", "CONTACT", "SEARCH BAR"
        };
        JComponent[] components = {
            id, username, password, email, answer, secret, contact, search
        };

        for (int i = 0; i < components.length; i++) {
            components[i].putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, placeholders[i]);
            components[i].putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        }

        clear.setFocusable(false);
        update.setFocusable(false);
        remove.setFocusable(false);
        delete.setFocusable(false);
        type.setFocusable(false);
        add2.setFocusable(false);
        printableTable.setFocusable(false);
        print.setFocusable(false);
        changeView.setFocusable(false);
    }

    public void dataRetriever(int index, JLabel userID, JLabel nameLabel, JLabel statusLabel, JLabel idLabel, JLabel typeLabel, JLabel pictureLabel, JTabbedPane pane) {
        JLabel[] labels = {userID, nameLabel, statusLabel, idLabel, typeLabel};
        if (Arrays.stream(labels).allMatch(label -> !label.getText().isEmpty())) {
            pane.setSelectedIndex(index);
            try {
                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + idLabel.getText() + "'");
                if (rs.next()) {
                    id.setText(String.valueOf(rs.getInt("ac_id")));
                    email.setText(rs.getString("ac_email"));
                    username.setText("'" + rs.getString("ac_username") + "'");
                    password.setText(rs.getString("ac_password"));
                    secret.setText(rs.getString("ac_sq"));
                    answer.setText(rs.getString("ac_sa"));
                    contact.setText(rs.getString("ac_contact"));
                    type.setSelectedItem(rs.getString("ac_type"));
                    status.setSelectedItem(rs.getString("ac_status"));
                    lastname.setText(rs.getString("ac_lastname"));
                    firstname.setText(rs.getString("ac_firstname"));

                    String img = rs.getString("ac_images");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(180, 190, Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    pictureLabel.setIcon(newImage);
                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        } else {
            System.out.println("Panel Is Empty!");
        }
    }

    public void addKeyListener() {
        Component[] components = {username, email, password, secret, answer, contact};
        for (Component component : components) {
            component.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    progress();
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    progress();
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    progress();
                }
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable ac_db;
    private javax.swing.JButton add2;
    private javax.swing.JTextField answer;
    private javax.swing.JButton changeView;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel cover;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    public static javax.swing.JLabel icon1;
    public static javax.swing.JLabel icon10;
    public static javax.swing.JLabel icon11;
    public static javax.swing.JLabel icon12;
    public static javax.swing.JLabel icon2;
    public static javax.swing.JLabel icon3;
    public static javax.swing.JLabel icon4;
    public static javax.swing.JLabel icon5;
    public static javax.swing.JLabel icon6;
    public static javax.swing.JLabel icon7;
    public static javax.swing.JLabel icon8;
    public static javax.swing.JLabel icon9;
    private javax.swing.JTextField id;
    public javax.swing.JLabel id1;
    public javax.swing.JLabel id10;
    public javax.swing.JLabel id11;
    public javax.swing.JLabel id12;
    public javax.swing.JLabel id2;
    public javax.swing.JLabel id3;
    public javax.swing.JLabel id4;
    public javax.swing.JLabel id5;
    public javax.swing.JLabel id6;
    public javax.swing.JLabel id7;
    public javax.swing.JLabel id8;
    public javax.swing.JLabel id9;
    private Swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lastname;
    public javax.swing.JLabel name1;
    public javax.swing.JLabel name10;
    public javax.swing.JLabel name11;
    public javax.swing.JLabel name12;
    public javax.swing.JLabel name2;
    public javax.swing.JLabel name3;
    public javax.swing.JLabel name4;
    public javax.swing.JLabel name5;
    public javax.swing.JLabel name6;
    public javax.swing.JLabel name7;
    public javax.swing.JLabel name8;
    public javax.swing.JLabel name9;
    private javax.swing.JTabbedPane pane;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel12;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel picture1;
    private javax.swing.JButton print;
    private javax.swing.JButton printableTable;
    private javax.swing.JButton remove;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JPanel scrols;
    private javax.swing.JTextField search;
    private javax.swing.JTextField secret;
    private javax.swing.JComboBox<String> status;
    public javax.swing.JLabel status1;
    public javax.swing.JLabel status10;
    public javax.swing.JLabel status11;
    public javax.swing.JLabel status12;
    public javax.swing.JLabel status2;
    public javax.swing.JLabel status3;
    public javax.swing.JLabel status4;
    public javax.swing.JLabel status5;
    public javax.swing.JLabel status6;
    public javax.swing.JLabel status7;
    public javax.swing.JLabel status8;
    public javax.swing.JLabel status9;
    private javax.swing.JComboBox<String> type;
    public javax.swing.JLabel type1;
    public javax.swing.JLabel type10;
    public javax.swing.JLabel type11;
    public javax.swing.JLabel type12;
    public javax.swing.JLabel type2;
    public javax.swing.JLabel type3;
    public javax.swing.JLabel type4;
    public javax.swing.JLabel type5;
    public javax.swing.JLabel type6;
    public javax.swing.JLabel type7;
    public javax.swing.JLabel type8;
    public javax.swing.JLabel type9;
    public javax.swing.JLabel uid1;
    public javax.swing.JLabel uid10;
    public javax.swing.JLabel uid11;
    public javax.swing.JLabel uid12;
    public javax.swing.JLabel uid2;
    public javax.swing.JLabel uid3;
    public javax.swing.JLabel uid4;
    public javax.swing.JLabel uid5;
    public javax.swing.JLabel uid6;
    public javax.swing.JLabel uid7;
    public javax.swing.JLabel uid8;
    public javax.swing.JLabel uid9;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
