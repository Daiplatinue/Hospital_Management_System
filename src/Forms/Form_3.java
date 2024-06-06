package Forms;

import Database.*;
import Functions.*;
import Swing.ImageAvatar;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.*;
import jnafilechooser.api.*;
import net.proteanit.sql.*;

public final class Form_3 extends javax.swing.JPanel {

    String path2 = null;
    private final Map<JPanel, Timer> enterTimers;
    private final Map<JPanel, Timer> exitTimers;
    private final int step = 5;
    String destination = "";
    File selectedFile;
    String path;
    String oldpath;

    File coverSelection;
    String pathCover;
    String oldpathCover;
    String coverDestination = "";

    private boolean isVisible = false;

    public Form_3() throws IOException {
        this.enterTimers = new HashMap<>();
        this.exitTimers = new HashMap<>();

        initComponents();
        displayData();
        focusableButtonsSetter();
        form3Handlers();
        acquireData();
        scroll1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(20);

        email.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isValidEmail();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isValidEmail();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        contact.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isContactValid(contact.getText().trim());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isContactValid(contact.getText().trim());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                isContactValid(contact.getText().trim());
            }
        });

        remove.setEnabled(false);
        question.setVisible(false);
        answer.setVisible(false);

        type.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                return renderer;
            }
        });

        status.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                return renderer;
            }
        });

        gender.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                return renderer;
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewAccount = new javax.swing.JPopupMenu();
        Delete_Account = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
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
        jPanel3 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        changeView1 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        picture1 = new Swing.ImageAvatar();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        remove = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        cover = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        answer = new javax.swing.JTextField();
        question = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        emailChecker = new javax.swing.JLabel();
        contactChecker = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        changeView = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ac_db = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inactive = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        active = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        doctor = new javax.swing.JLabel();
        recep = new javax.swing.JLabel();

        Delete_Account.setText("Delete Account");
        Delete_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_AccountActionPerformed(evt);
            }
        });
        ViewAccount.add(Delete_Account);

        Exit.setText("Exit System");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        ViewAccount.add(Exit);

        jMenuItem1.setText("Remove Cover Photo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ViewAccount.add(jMenuItem1);

        setMinimumSize(new java.awt.Dimension(1310, 770));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1340, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1340, 80));

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
        panel4.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        type4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        type4.setForeground(new java.awt.Color(102, 102, 102));
        panel4.add(type4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 260, 20));

        name4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name4.setForeground(new java.awt.Color(70, 133, 255));
        panel4.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        status4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        panel4.add(status4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));
        panel4.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid4.setForeground(new java.awt.Color(102, 102, 102));
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
        panel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        status1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        panel1.add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 250, 20));

        name1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name1.setForeground(new java.awt.Color(70, 133, 255));
        panel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 250, 20));

        type1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        type1.setForeground(new java.awt.Color(102, 102, 102));
        panel1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 140, 20));

        id1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id1.setForeground(new java.awt.Color(0, 87, 255));
        panel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 250, 20));
        panel1.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, 60));

        uid1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid1.setForeground(new java.awt.Color(102, 102, 102));
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
        panel2.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        id2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id2.setForeground(new java.awt.Color(0, 87, 255));
        panel2.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        type2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        type2.setForeground(new java.awt.Color(102, 102, 102));
        panel2.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 200, 20));

        name2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name2.setForeground(new java.awt.Color(70, 133, 255));
        panel2.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        status2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        panel2.add(status2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        uid2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid2.setForeground(new java.awt.Color(102, 102, 102));
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
        panel3.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));
        panel3.add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        type3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        type3.setForeground(new java.awt.Color(102, 102, 102));
        panel3.add(type3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 200, 20));

        name3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name3.setForeground(new java.awt.Color(70, 133, 255));
        panel3.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        status3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        panel3.add(status3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        uid3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid3.setForeground(new java.awt.Color(102, 102, 102));
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
        panel7.add(status7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type7.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type7.setForeground(new java.awt.Color(102, 102, 102));
        panel7.add(type7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 190, 20));

        name7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name7.setForeground(new java.awt.Color(70, 133, 255));
        panel7.add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id7.setForeground(new java.awt.Color(0, 87, 255));
        panel7.add(id7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));
        panel7.add(icon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid7.setForeground(new java.awt.Color(102, 102, 102));
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
        panel6.add(status6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type6.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type6.setForeground(new java.awt.Color(102, 102, 102));
        panel6.add(type6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 190, 20));

        name6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name6.setForeground(new java.awt.Color(70, 133, 255));
        panel6.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id6.setForeground(new java.awt.Color(0, 87, 255));
        panel6.add(id6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));
        panel6.add(icon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid6.setForeground(new java.awt.Color(102, 102, 102));
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
        panel5.add(status5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type5.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type5.setForeground(new java.awt.Color(102, 102, 102));
        panel5.add(type5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 190, 20));

        name5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name5.setForeground(new java.awt.Color(70, 133, 255));
        panel5.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id5.setForeground(new java.awt.Color(0, 87, 255));
        panel5.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));
        panel5.add(icon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid5.setForeground(new java.awt.Color(102, 102, 102));
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
        panel8.add(status8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type8.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type8.setForeground(new java.awt.Color(102, 102, 102));
        panel8.add(type8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 200, 20));

        name8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name8.setForeground(new java.awt.Color(70, 133, 255));
        panel8.add(name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id8.setForeground(new java.awt.Color(0, 87, 255));
        panel8.add(id8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));
        panel8.add(icon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid8.setForeground(new java.awt.Color(102, 102, 102));
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
        panel11.add(status11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type11.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type11.setForeground(new java.awt.Color(102, 102, 102));
        panel11.add(type11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 170, 20));

        name11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name11.setForeground(new java.awt.Color(70, 133, 255));
        panel11.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id11.setForeground(new java.awt.Color(0, 87, 255));
        panel11.add(id11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));
        panel11.add(icon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid11.setForeground(new java.awt.Color(102, 102, 102));
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
        panel10.add(status10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type10.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type10.setForeground(new java.awt.Color(102, 102, 102));
        panel10.add(type10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 170, 20));

        name10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name10.setForeground(new java.awt.Color(70, 133, 255));
        panel10.add(name10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id10.setForeground(new java.awt.Color(0, 87, 255));
        panel10.add(id10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));
        panel10.add(icon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid10.setForeground(new java.awt.Color(102, 102, 102));
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
        panel9.add(status9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type9.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type9.setForeground(new java.awt.Color(102, 102, 102));
        panel9.add(type9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 190, 20));

        name9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name9.setForeground(new java.awt.Color(70, 133, 255));
        panel9.add(name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        id9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id9.setForeground(new java.awt.Color(0, 87, 255));
        panel9.add(id9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));
        panel9.add(icon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        uid9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid9.setForeground(new java.awt.Color(102, 102, 102));
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
        panel12.add(icon12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 160));

        id12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        id12.setForeground(new java.awt.Color(0, 87, 255));
        panel12.add(id12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 260, 20));

        status12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        panel12.add(status12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 20));

        type12.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        type12.setForeground(new java.awt.Color(102, 102, 102));
        panel12.add(type12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 200, 20));

        name12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        name12.setForeground(new java.awt.Color(70, 133, 255));
        panel12.add(name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, 20));

        uid12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        uid12.setForeground(new java.awt.Color(102, 102, 102));
        panel12.add(uid12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 50, 20));

        scrols.add(panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 960, 260, 330));

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

        searchBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });
        scrols.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 260, 30));

        changeView1.setForeground(new java.awt.Color(153, 153, 153));
        changeView1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grid (1).png"))); // NOI18N
        changeView1.setText(" Change Grid");
        changeView1.setBorder(null);
        changeView1.setOpaque(false);
        changeView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeView1ActionPerformed(evt);
            }
        });
        scrols.add(changeView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 140, 30));

        scroll1.setViewportView(scrols);

        pane.addTab("tab3", scroll1);

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture1MouseClicked(evt);
            }
        });
        jPanel4.add(picture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 190));

        username.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 270, 32));

        email.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 270, 32));

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("Remove");
        remove.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(155, 155, 155), 1, true));
        remove.setOpaque(false);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel4.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 180, 30));

        type.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        type.setForeground(new java.awt.Color(153, 153, 153));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        type.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 270, 30));

        status.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        status.setForeground(new java.awt.Color(153, 153, 153));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "ACTIVE", "IN-ACTIVE", "DELETED" }));
        status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 270, 30));

        contact.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contact.setForeground(new java.awt.Color(153, 153, 153));
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        jPanel4.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 270, 32));

        id.setEditable(false);
        id.setForeground(new java.awt.Color(153, 153, 153));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(null);
        id.setOpaque(false);
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
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 90, 32));

        update.setBackground(new java.awt.Color(12, 135, 254));
        update.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Save Changes");
        update.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel4.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 630, 130, 32));

        add2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        add2.setText("Cancel");
        add2.setBorder(null);
        add2.setOpaque(false);
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel4.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 630, 80, 32));

        cover.setOpaque(true);
        cover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                coverMouseEntered(evt);
            }
        });
        jPanel4.add(cover, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1330, 310));

        firstname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        firstname.setForeground(new java.awt.Color(153, 153, 153));
        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        jPanel4.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 270, 32));

        lastname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lastname.setForeground(new java.awt.Color(153, 153, 153));
        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 270, 32));

        gender.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(153, 153, 153));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        gender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, 270, 30));

        answer.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        answer.setForeground(new java.awt.Color(153, 153, 153));
        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 270, 30));

        question.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        question.setForeground(new java.awt.Color(153, 153, 153));
        question.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        question.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel4.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 270, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change Question & Answer");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 270, 30));

        emailChecker.setBackground(new java.awt.Color(255, 255, 255));
        emailChecker.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        emailChecker.setForeground(new java.awt.Color(255, 255, 255));
        emailChecker.setText("STRENGTH");
        jPanel4.add(emailChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 485, 270, -1));

        contactChecker.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        contactChecker.setForeground(new java.awt.Color(255, 255, 255));
        contactChecker.setText("STRENGTH");
        jPanel4.add(contactChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 485, 270, -1));

        jScrollPane2.setViewportView(jPanel4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 730));

        scroll.setViewportView(jPanel1);

        pane.addTab("tab3", scroll);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
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
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 240, 30));

        changeView.setForeground(new java.awt.Color(153, 153, 153));
        changeView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grid (1).png"))); // NOI18N
        changeView.setText(" Change Grid");
        changeView.setBorder(null);
        changeView.setOpaque(false);
        changeView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeViewActionPerformed(evt);
            }
        });
        jPanel2.add(changeView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 100, 30));

        print.setForeground(new java.awt.Color(153, 153, 153));
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/print (1).png"))); // NOI18N
        print.setText(" PRINT");
        print.setBorder(null);
        print.setOpaque(false);
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1055, 20, 70, 30));

        ac_db.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        ac_db.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ac_db);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 1150, 460));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 142, 230));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIEW ALL ACCOUNTS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 400, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("In-active Users");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 85, 180, -1));

        inactive.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        inactive.setText("10");
        jPanel2.add(inactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 85, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Admin Accounts");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Receptionist Accounts");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Doctor Accounts");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 135, 180, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Active Users");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 180, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 20, 120));

        active.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        active.setText("10");
        jPanel2.add(active, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 180, -1));

        admin.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        admin.setText("10");
        jPanel2.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 180, -1));

        doctor.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        doctor.setText("10");
        jPanel2.add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 135, 180, -1));

        recep.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        recep.setText("10");
        jPanel2.add(recep, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 180, -1));

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
        dataRetriever(1, id1, name1, status1, uid1, type1, picture1, cover, pane);
    }//GEN-LAST:event_panel1MouseClicked

    private void changeViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeViewActionPerformed
        pane.setSelectedIndex(0);
    }//GEN-LAST:event_changeViewActionPerformed

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked
        dataRetriever(1, id2, name2, status2, uid2, type2, picture1, cover, pane);
    }//GEN-LAST:event_panel2MouseClicked

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        dataRetriever(1, id3, name3, status3, uid3, type3, picture1, cover, pane);
    }//GEN-LAST:event_panel3MouseClicked

    private void panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseClicked
        dataRetriever(1, id4, name4, status4, uid4, type4, picture1, cover, pane);
    }//GEN-LAST:event_panel4MouseClicked

    private void panel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MouseClicked
        dataRetriever(1, id5, name5, status5, uid5, type5, picture1, cover, pane);
    }//GEN-LAST:event_panel5MouseClicked

    private void panel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6MouseClicked
        dataRetriever(1, id6, name6, status6, uid6, type6, picture1, cover, pane);
    }//GEN-LAST:event_panel6MouseClicked

    private void panel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7MouseClicked
        dataRetriever(1, id7, name7, status7, uid7, type7, picture1, cover, pane);
    }//GEN-LAST:event_panel7MouseClicked

    private void panel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MouseEntered
        animatePanels(new JPanel[]{panel8}, new int[]{500});
    }//GEN-LAST:event_panel8MouseEntered

    private void panel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9MouseClicked
        dataRetriever(1, id9, name9, status9, uid9, type9, picture1, cover, pane);
    }//GEN-LAST:event_panel9MouseClicked

    private void panel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10MouseClicked
        dataRetriever(1, id10, name10, status10, uid10, type10, picture1, cover, pane);
    }//GEN-LAST:event_panel10MouseClicked

    private void panel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MouseEntered
        animatePanels(new JPanel[]{panel11}, new int[]{930});
    }//GEN-LAST:event_panel11MouseEntered

    private void panel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MouseEntered
        animatePanels(new JPanel[]{panel12}, new int[]{930});
    }//GEN-LAST:event_panel12MouseEntered

    private void panel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MouseClicked
        dataRetriever(1, id12, name12, status12, uid12, type12, picture1, cover, pane);
    }//GEN-LAST:event_panel12MouseClicked

    private void panel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MouseClicked
        dataRetriever(1, id11, name11, status11, uid11, type11, picture1, cover, pane);
    }//GEN-LAST:event_panel11MouseClicked

    private void panel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MouseClicked
        dataRetriever(1, id8, name8, status8, uid8, type8, picture1, cover, pane);
    }//GEN-LAST:event_panel8MouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("Total Accounts Registered Reports");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try {
            ac_db.print(JTable.PrintMode.FIT_WIDTH, header, footer);

            Connection cn = new DBConnection().getConnection();

            PreparedStatement tlogs;
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
            String formattedDateTime = currentDateTime.format(formatter);
            String formattedTime = currentDateTime.format(timeFormatter);

            tlogs = cn.prepareStatement("INSERT INTO a_logs (u_id, a_actions, a_date, a_hhmmss) VALUES (?, ?, ?, ?)");

            xternal_db xdb = new xternal_db();
            tlogs.setString(1, xdb.getId());
            tlogs.setString(2, "Printed The Table On Form3, Total Acc = '" + new DBConnection().getData("select count(*) from u_tbl") + "'");
            tlogs.setString(3, formattedDateTime);
            tlogs.setString(4, formattedTime);

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
            String photoPath = (destination != null) ? destination.trim() : "";

            boolean fieldsEmpty = username.getText().trim().isEmpty() || email.getText().trim().isEmpty()
                    || contact.getText().trim().isEmpty() || id.getText().trim().isEmpty()
                    || lastname.getText().trim().isEmpty() || firstname.getText().trim().isEmpty();

            if (fieldsEmpty || photoPath.isEmpty() || coverSelection == null) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE FILL ALL FIELDS AND INSERT AN IMAGE!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);

                if (photoPath.isEmpty()) {
                    System.out.println("IMAGE FILE PATH IS EMPTY!");
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
                try (Connection connection = new DBConnection().getConnection()) {
                    String updateQuery = "UPDATE u_tbl SET u_username = ?, u_email = ?, u_type = ?, u_status = ?, "
                            + "u_contact = ?, u_lastname = ?, u_firstname = ?, u_gender = ?, u_profile = ?, u_cover = ?, u_question = ?, u_answer = ? "
                            + "WHERE u_id = ?";
                    try (PreparedStatement pstmt = connection.prepareStatement(updateQuery)) {
                        pstmt.setString(1, username.getText());
                        pstmt.setString(2, email.getText());
                        pstmt.setString(3, (String) type.getSelectedItem());
                        pstmt.setString(4, (String) status.getSelectedItem());
                        pstmt.setString(5, contact.getText());
                        pstmt.setString(6, lastname.getText());
                        pstmt.setString(7, firstname.getText());
                        pstmt.setString(8, (String) gender.getSelectedItem());
                        pstmt.setString(9, destination);
                        pstmt.setString(10, coverDestination);
                        pstmt.setString(11, question.getText());
                        pstmt.setString(12, answer.getText());
                        pstmt.setString(13, id.getText());

                        pstmt.executeUpdate();
                    }

                    System.out.println(coverSelection);
                    System.out.println(destination);

                    if (destination == null || coverSelection == null) {
                        Checkers.unsuccessfullFieldChecker("PLEASE INSERT AN IMAGE");
                    } else {
                        Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
                        Files.copy(coverSelection.toPath(), new File(coverDestination).toPath(), StandardCopyOption.REPLACE_EXISTING);

                        JOptionPane.showMessageDialog(null, "ACCOUNT SUCCESSFULLY UPDATED!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                        PreparedStatement tlogs;
                        Connection cn = new DBConnection().getConnection();
                        LocalDateTime currentDateTime = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                        String formattedDateTime = currentDateTime.format(formatter);
                        String formattedTime = currentDateTime.format(timeFormatter);

                        tlogs = cn.prepareStatement("INSERT INTO a_logs (u_id, a_actions, a_date, a_hhmmss) VALUES (?, ?, ?, ?)");

                        xternal_db xdb = xternal_db.getInstance();
                        tlogs.setString(1, xdb.getId());
                        tlogs.setString(2, "Updated An Account, Account ID = '" + id.getText() + "'");
                        tlogs.setString(3, formattedDateTime);
                        tlogs.setString(4, formattedTime);
                        tlogs.executeUpdate();

                        pane.setSelectedIndex(0);
                        acquireData();
                    }

                } catch (SQLException | IOException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        } catch (HeadlessException ex) {
            System.out.println("Unexpected Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked

    }//GEN-LAST:event_contactMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained

    }//GEN-LAST:event_contactFocusGained

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        destination = "";
        path = "";
        picture1.setIcon(null);
        oldpath = "";
    }//GEN-LAST:event_removeActionPerformed

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

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained

    }//GEN-LAST:event_idFocusGained

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
        if (evt.isPopupTrigger()) {
            ViewAccount.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jPanel4MouseReleased

    private void Delete_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_AccountActionPerformed
        try {
            String idText = id.getText();
            System.out.println(idText);
            if (idText.isEmpty()) {
                System.out.println("Error ID omg");
                System.out.println(idText);
            } else {
                Connection cn = new DBConnection().getConnection();
                PreparedStatement pst = cn.prepareStatement("UPDATE u_tbl SET u_status = 'DELETED' WHERE u_id = ?");
                pst.setString(1, idText);
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "ACCOUNT STATUS UPDATED TO 'DELETED'!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    PreparedStatement tlogs;
                    LocalDateTime currentDateTime = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                    String formattedDateTime = currentDateTime.format(formatter);
                    String formattedTime = currentDateTime.format(timeFormatter);

                    tlogs = cn.prepareStatement("INSERT INTO a_logs (u_id, a_actions, a_date, a_hhmmss) VALUES (?, ?, ?, ?)");

                    tlogs.setString(1, xternal_db.getInstance().getId());
                    tlogs.setString(2, "Deleted An Account, Account ID = '" + id.getText() + "'");
                    tlogs.setString(3, formattedDateTime);
                    tlogs.setString(4, formattedTime);
                    tlogs.executeUpdate();

                    acquireData();
                    pane.setSelectedIndex(0);

                } else {
                    JOptionPane.showMessageDialog(null, "NO ACCOUNT FOUND WITH ID: " + idText, "WARNING", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_Delete_AccountActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void coverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coverMouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            coverSelection = ch.getSelectedFile();
            pathCover = coverSelection.getAbsolutePath();
            coverDestination = "src/com/imported/cover/images/" + coverSelection.getName();

            if (FileExistenceChecker(pathCover) == 1) {
                Checkers.unsuccessfullFieldChecker("FILE ALREADY EXIST!");
                coverDestination = "";
                pathCover = "";
            } else {
                cover.setIcon(ResizeImageCover(pathCover));
                remove.setEnabled(true);
            }

        } else {
            System.out.println("nabanhaw ng image wama kiti");
        }
    }//GEN-LAST:event_coverMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        pathCover = "";
        oldpathCover = "";
        coverDestination = "";
        cover.setIcon(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        isVisible = !isVisible;

        question.setVisible(isVisible);
        answer.setVisible(isVisible);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        String searchTerm = searchBar.getText().trim().toLowerCase();

        JLabel[] ids = {id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12};
        JLabel[] names = {name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12};
        JLabel[] types = {type1, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12};
        JLabel[] statuses = {status1, status2, status3, status4, status5, status6, status7, status8, status9, status10, status11, status12};
        JLabel[] icons = {icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9, icon10, icon11, icon12};
        JPanel[] panels = {panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12};
        JLabel[] uids = {uid1, uid2, uid3, uid4, uid5, uid6, uid7, uid8, uid9, uid10, uid11, uid12};

        fetch(0, ids, names, types, statuses, uids, icons, panels, searchTerm);
    }//GEN-LAST:event_searchBarKeyReleased

    private void changeView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeView1ActionPerformed
        pane.setSelectedIndex(2);
    }//GEN-LAST:event_changeView1ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel tbl = (DefaultTableModel) ac_db.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tbl);
        ac_db.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(search.getText()));
    }//GEN-LAST:event_searchKeyReleased

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setFocusable(false);
    }//GEN-LAST:event_searchMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setFocusable(true);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked

    }//GEN-LAST:event_searchMouseClicked

    private void picture1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture1MouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            selectedFile = ch.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            destination = "src/com/imported/profile/images/" + selectedFile.getName();

            if (FileExistenceChecker(path) == 1) {
                Checkers.unsuccessfullFieldChecker("FILE ALREADY EXIST!");
                destination = "";
                path = "";
            } else {
                picture1.setIcon(ResizeImage(path));
                remove.setEnabled(true);
            }

        } else {
            System.out.println("nabanhaw ng image wama kiti");
        }
    }//GEN-LAST:event_picture1MouseClicked

    private void coverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coverMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_coverMouseEntered

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(180, 190, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public ImageIcon ResizeImageCover(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(1340, 310, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void displayData() {
        try {
            xternal_db xdb = xternal_db.getInstance();
            ResultSet rs = new DBConnection().getData("select u_id,u_lastname,u_firstname,u_gender,u_type,u_status from u_tbl where u_status in ('active', 'in-active') and u_id != '" + xdb.getId() + "'");
            ac_db.setModel(DbUtils.resultSetToTableModel(rs));

            TableColumn column0, column1, column2, column3, column4, column5;

            column0 = ac_db.getColumnModel().getColumn(0);
            column0.setPreferredWidth(10);

            column1 = ac_db.getColumnModel().getColumn(1);
            column1.setPreferredWidth(20);

            column2 = ac_db.getColumnModel().getColumn(2);
            column2.setPreferredWidth(20);

            column3 = ac_db.getColumnModel().getColumn(3);
            column3.setPreferredWidth(20);

            column4 = ac_db.getColumnModel().getColumn(4);
            column4.setPreferredWidth(20);

            column5 = ac_db.getColumnModel().getColumn(5);
            column5.setPreferredWidth(20);

            ((DefaultTableCellRenderer) ac_db.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(SwingConstants.CENTER);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            ac_db.setDefaultRenderer(Object.class, centerRenderer);

            ResultSet adminCountRS = new DBConnection().getData("select count(*) as admin_count from u_tbl where u_type = 'admin'");
            if (adminCountRS.next()) {
                int adminCount = adminCountRS.getInt("admin_count");
                admin.setText(String.valueOf(adminCount));
            }

            ResultSet activeCountRS = new DBConnection().getData("select count(*) as active_count from u_tbl where u_status = 'active'");
            if (activeCountRS.next()) {
                int activeCount = activeCountRS.getInt("active_count");
                active.setText(String.valueOf(activeCount));
            }

            ResultSet inactiveCountRS = new DBConnection().getData("select count(*) as inactive_count from u_tbl where u_status = 'in-active'");
            if (inactiveCountRS.next()) {
                int inactiveCount = inactiveCountRS.getInt("inactive_count");
                inactive.setText(String.valueOf(inactiveCount));
            }

            ResultSet doctorCountRS = new DBConnection().getData("select count(*) as doctor_count from u_tbl where u_type = 'doctor'");
            if (doctorCountRS.next()) {
                int doctorCount = doctorCountRS.getInt("doctor_count");
                doctor.setText(String.valueOf(doctorCount));
            }

            ResultSet recepCountRS = new DBConnection().getData("select count(*) as recep_count from u_tbl where u_type = 'receptionist'");
            if (recepCountRS.next()) {
                int recepCount = recepCountRS.getInt("recep_count");
                recep.setText(String.valueOf(recepCount));
            }

        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    private void fetch(int index, JLabel[] ids, JLabel[] names, JLabel[] types, JLabel[] statuses, JLabel[] uids, JLabel[] icons, JPanel[] panels, String searchTerm) {
        try {
            TableModel tbl = ac_db.getModel();
            if (tbl.getRowCount() > 0) {
                xternal_db xdb = xternal_db.getInstance();

                String query = "SELECT * FROM u_tbl WHERE u_id != ? AND u_status IN ('active', 'in-active') AND (u_lastname LIKE ? OR u_email LIKE ? OR u_type LIKE ? OR u_status LIKE ?) LIMIT ?, ?";
                DBConnection dbConnection = new DBConnection();
                PreparedStatement ps = dbConnection.getConnection().prepareStatement(query);
                ps.setString(1, xdb.getId());
                ps.setString(2, "%" + searchTerm + "%");
                ps.setString(3, "%" + searchTerm + "%");
                ps.setString(4, "%" + searchTerm + "%");
                ps.setString(5, "%" + searchTerm + "%");
                ps.setInt(6, index);
                ps.setInt(7, Math.min(ids.length, Math.min(names.length, Math.min(types.length, Math.min(statuses.length, Math.min(icons.length, panels.length))))));

                ResultSet rs = ps.executeQuery();
                int i = 0;
                while (rs.next() && i < ids.length) {
                    ids[i].setText(rs.getString("u_lastname"));
                    names[i].setText(rs.getString("u_email"));
                    types[i].setText(rs.getString("u_type"));
                    statuses[i].setText(rs.getString("u_status"));
                    uids[i].setText(rs.getString("u_id"));

                    if (statuses[i].getText().equalsIgnoreCase("active")) {
                        statuses[i].setForeground(new Color(66, 202, 197));
                    } else {
                        statuses[i].setForeground(Color.RED);
                    }

                    String img = rs.getString("u_profile");
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
                    ids[j].setText("");
                    names[j].setText("");
                    types[j].setText("");
                    statuses[j].setText("");
                    uids[j].setText("");
                    icons[j].setIcon(null);
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

        JTextField[] fields = {username, email, contact};
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

        fetch(0, ids, names, types, statuses, uids, icons, panels, "");
        displayData();
        focusableButtonsSetter();
        form3Handlers();
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
        changeView.setFocusable(false);
    }

    public void form3Handlers() {
        String[] placeholders = {
            "SEARCH BAR", "ID", "USERNAME", "EMAIL",
            "CONTACT", "SEARCH BAR"
        };
        JComponent[] components = {
            searchBar, id, username, email, contact, search
        };

        for (int i = 0; i < components.length; i++) {
            components[i].putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, placeholders[i]);
            components[i].putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        }

        update.setFocusable(false);
        remove.setFocusable(false);
        type.setFocusable(false);
        add2.setFocusable(false);
        print.setFocusable(false);
        changeView.setFocusable(false);
    }

    Border activeBorder = BorderFactory.createLineBorder(Color.GREEN, 2);
    Border inactiveBorder = BorderFactory.createLineBorder(Color.RED, 2);

    public void dataRetriever(int index, JLabel userID, JLabel nameLabel, JLabel statusLabel, JLabel idLabel, JLabel typeLabel, ImageAvatar pictureLabel, JLabel coverPictureLabel, JTabbedPane pane) {
        JLabel[] labels = {userID, nameLabel, statusLabel, idLabel, typeLabel};
        if (Arrays.stream(labels).allMatch(label -> !label.getText().isEmpty())) {
            pane.setSelectedIndex(index);
            try {
                ResultSet rs = new DBConnection().getData("select * from u_tbl where u_id = '" + idLabel.getText() + "'");
                if (rs.next()) {
                    id.setText(rs.getString("u_id"));
                    email.setText(rs.getString("u_email"));
                    username.setText(rs.getString("u_username"));
                    contact.setText(rs.getString("u_contact"));
                    type.setSelectedItem(rs.getString("u_type"));
                    status.setSelectedItem(rs.getString("u_status"));
                    lastname.setText(rs.getString("u_lastname"));
                    firstname.setText(rs.getString("u_firstname"));
                    question.setText(rs.getString("u_question"));
                    answer.setText(rs.getString("u_answer"));

                    String img = rs.getString("u_profile");
                    setScaledImagePP(img, pictureLabel, 180, 190);
                    destination = rs.getString("u_profile");
                    path = rs.getString("u_profile");
                    oldpath = rs.getString("u_profile");

                    if (pictureLabel.getIcon() == null) {
                        remove.setEnabled(false);
                    } else {
                        remove.setEnabled(true);
                    }

                    String coverImg = rs.getString("u_cover");
                    setScaledImageCover(coverImg, coverPictureLabel, 1330, 310);
                    pathCover = rs.getString("u_cover");
                    oldpathCover = rs.getString("u_cover");
                    coverDestination = rs.getString("u_cover");

                    selectedFile = new File(img);
                    coverSelection = new File(coverImg);
                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        } else {
            System.out.println("Panel Is Empty!");
        }
    }

    private void setScaledImagePP(String imgPath, ImageAvatar avatar, int width, int height) {
        if (imgPath != null && !imgPath.isEmpty()) {
            ImageIcon imageIcon = new ImageIcon(imgPath);
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            avatar.setIcon(new ImageIcon(scaledImage));
        } else {
            avatar.setIcon(null);
        }
    }

    private void setScaledImageCover(String imgPath, JLabel label, int width, int height) {
        if (imgPath != null && !imgPath.isEmpty()) {
            ImageIcon imageIcon = new ImageIcon(imgPath);
            Image image = imageIcon.getImage();
            Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(scaledImage));
        } else {
            label.setIcon(null);
        }
    }

    public int FileExistenceChecker(String path) {
        File file = new File(path);
        String fileName = file.getName();

        Path filePath = Paths.get("src/All_Images", fileName);
        boolean fileExists = Files.exists(filePath);

        if (fileExists) {
            return 1;
        } else {
            return 0;
        }

    }

    private boolean isValidEmail() {
        String xemailChecker = email.getText().trim();

        if (xemailChecker.isEmpty()) {
            emailChecker.setText("");
            emailChecker.setForeground(Color.WHITE);
            return false;
        }

        boolean isValid = isValidEmails(xemailChecker);

        if (isValid) {
            emailChecker.setText("Email is valid");
            emailChecker.setForeground(Color.GREEN);
            email.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else {
            emailChecker.setText("Only gmail, yahoo, hotmail domains!");
            emailChecker.setForeground(Color.RED);
            email.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        return isValid;
    }

    private boolean isValidEmails(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:gmail\\.com|yahoo\\.com|hotmail\\.com)$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    private boolean isContactValid(String contacts) {
        if (contacts == null || contacts.isEmpty()) {
            contactChecker.setText("");
            contactChecker.setForeground(Color.WHITE);
            return false;
        }

        String digitsOnly = contacts.replaceAll("\\D", "");

        if (digitsOnly.length() != 11) {
            contactChecker.setText("Contact must be exactly 11 digits!");
            contactChecker.setForeground(Color.RED);
            contact.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }

        if (!contacts.startsWith("63") && !contacts.startsWith("09")) {
            contactChecker.setText("Contact must start with '63' or '09'!");
            contactChecker.setForeground(Color.RED);
            contact.setBorder(BorderFactory.createLineBorder(Color.RED));
            return false;
        }

        contactChecker.setText("Contact is valid!");
        contactChecker.setForeground(Color.GREEN);
        contact.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Delete_Account;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JPopupMenu ViewAccount;
    public static javax.swing.JTable ac_db;
    private javax.swing.JLabel active;
    private javax.swing.JButton add2;
    private javax.swing.JLabel admin;
    private javax.swing.JTextField answer;
    private javax.swing.JButton changeView;
    private javax.swing.JButton changeView1;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel contactChecker;
    private javax.swing.JLabel cover;
    private javax.swing.JLabel doctor;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailChecker;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
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
    private javax.swing.JLabel inactive;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
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
    private Swing.ImageAvatar picture1;
    private javax.swing.JButton print;
    private javax.swing.JTextField question;
    private javax.swing.JLabel recep;
    private javax.swing.JButton remove;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JPanel scrols;
    private javax.swing.JTextField search;
    private javax.swing.JTextField searchBar;
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
