package Forms;

import Database.DBConnection;
import Database.xternal_db;
import Functions.Hasher;
import LoginForm.LoginDashboard;
import RegisterForm.RegisterDSB;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.TableModel;
import jnafilechooser.api.JnaFileChooser;
import net.proteanit.sql.DbUtils;

public final class Form_3 extends javax.swing.JPanel {

    String path2 = null;
    private final int lastDisplayedIndex = 0;

    public Form_3() throws IOException {
        initComponents();
        displayData();

        scroll1.getVerticalScrollBar().setUnitIncrement(16);
        search.setFocusable(false);
        print.setFocusable(false);
        printableTable.setFocusable(false);
        changeView.setFocusable(false);

        Component[] components = {username, email, password, secret, answer, contact};
        JLabel[] ids = {id1, id2, id3, id4, id5, id4, id7, id8, id9, id10, id11, id12};
        JLabel[] names = {name1, name2, name3, name4, name5, name4, name7, name8, name9, name10, name11, name12};
        JLabel[] types = {type1, type2, type3, type4, type5, type4, type7, type8, type9, type10, type11, type12};
        JLabel[] statuses = {status1, status2, status3, status4, status5, status4, status7, status8, status9, status10, status11, status12};
        JLabel[] icons = {icon1, icon2, icon3, icon4, icon5, icon4, icon7, icon8, icon9, icon10, icon11, icon12};
        JPanel[] panels = {panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12};

        fetch(lastDisplayedIndex, ids, names, types, statuses, icons, panels);

        for (Component component : components) {
            component.addFocusListener(new java.awt.event.FocusAdapter() {
                @Override
                public void focusLost(java.awt.event.FocusEvent evt) {
                    progress();
                }
            });
        }

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshBtn();
            }
        });

        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EMAIL");
        answer.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SECRET ANSWER");
        secret.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SECRET QUESTION");
        contact.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "CONTACT");
        search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SEARCH");

        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        email.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        answer.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        secret.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        contact.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        search.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

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
        id1 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        id4 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        type4 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        status4 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        id3 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        type3 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        status3 = new javax.swing.JLabel();
        panel7 = new javax.swing.JPanel();
        status7 = new javax.swing.JLabel();
        type7 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();
        icon7 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        status6 = new javax.swing.JLabel();
        type6 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        icon6 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        status5 = new javax.swing.JLabel();
        type5 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        icon5 = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        status8 = new javax.swing.JLabel();
        type8 = new javax.swing.JLabel();
        name8 = new javax.swing.JLabel();
        id8 = new javax.swing.JLabel();
        icon8 = new javax.swing.JLabel();
        panel11 = new javax.swing.JPanel();
        status11 = new javax.swing.JLabel();
        type11 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        id11 = new javax.swing.JLabel();
        icon11 = new javax.swing.JLabel();
        panel10 = new javax.swing.JPanel();
        status10 = new javax.swing.JLabel();
        type10 = new javax.swing.JLabel();
        name10 = new javax.swing.JLabel();
        id10 = new javax.swing.JLabel();
        icon10 = new javax.swing.JLabel();
        panel9 = new javax.swing.JPanel();
        status9 = new javax.swing.JLabel();
        type9 = new javax.swing.JLabel();
        name9 = new javax.swing.JLabel();
        id9 = new javax.swing.JLabel();
        icon9 = new javax.swing.JLabel();
        panel12 = new javax.swing.JPanel();
        status12 = new javax.swing.JLabel();
        type12 = new javax.swing.JLabel();
        name12 = new javax.swing.JLabel();
        id12 = new javax.swing.JLabel();
        icon12 = new javax.swing.JLabel();
        printableTable = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        secret = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        clear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        picture1 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        remove = new javax.swing.JButton();
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
        panel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        status1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel1.add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        name1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        type1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        id1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));

        scrols.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 260, 330));

        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel4MouseClicked(evt);
            }
        });
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel4.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel4.add(icon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        type4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel4.add(type4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel4.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        status4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel4.add(status4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        scrols.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 260, 330));

        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel2MouseClicked(evt);
            }
        });
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel2.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        id2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel2.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));

        type2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel2.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel2.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        status2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel2.add(status2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        scrols.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 260, 330));

        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
        });
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel3.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel3.add(icon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        type3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel3.add(type3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel3.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        status3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel3.add(status3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        scrols.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 260, 330));

        panel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel7MouseClicked(evt);
            }
        });
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel7.add(status7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        type7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel7.add(type7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel7.add(name7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        id7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel7.add(id7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel7.add(icon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        scrols.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 260, 330));

        panel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel6MouseClicked(evt);
            }
        });
        panel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status6.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel6.add(status6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        type6.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel6.add(type6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name6.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel6.add(name6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        id6.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel6.add(id6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel6.add(icon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        scrols.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 260, 330));

        panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel5MouseClicked(evt);
            }
        });
        panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status5.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel5.add(status5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        type5.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel5.add(type5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name5.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel5.add(name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        id5.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel5.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel5.add(icon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        scrols.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 260, 330));

        panel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel8MouseEntered(evt);
            }
        });
        panel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status8.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel8.add(status8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        type8.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel8.add(type8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name8.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel8.add(name8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        id8.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel8.add(id8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel8.add(icon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        scrols.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 260, 330));

        panel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel11MouseEntered(evt);
            }
        });
        panel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status11.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel11.add(status11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        type11.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel11.add(type11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name11.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel11.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        id11.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel11.add(id11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel11.add(icon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        scrols.add(panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 790, 260, 330));

        panel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel10MouseClicked(evt);
            }
        });
        panel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status10.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel10.add(status10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        type10.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel10.add(type10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name10.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel10.add(name10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        id10.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel10.add(id10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel10.add(icon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        scrols.add(panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, 260, 330));

        panel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel9MouseClicked(evt);
            }
        });
        panel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status9.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel9.add(status9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        type9.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel9.add(type9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name9.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel9.add(name9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        id9.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel9.add(id9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel9.add(icon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        scrols.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 790, 260, 330));

        panel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel12MouseEntered(evt);
            }
        });
        panel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status12.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel12.add(status12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        type12.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel12.add(type12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 20));

        name12.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        name12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel12.add(name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        id12.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        id12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel12.add(id12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));
        panel12.add(icon12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 170));

        scrols.add(panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 790, 260, 330));

        printableTable.setText("PRINTABLE TABLE");
        printableTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printableTableActionPerformed(evt);
            }
        });
        scrols.add(printableTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 30));

        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        scrols.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 130, 30));

        scroll1.setViewportView(scrols);

        pane.addTab("tab3", scroll1);

        scroll.setBackground(new java.awt.Color(255, 255, 255));
        scroll.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel2.setText("UPDATE USER INFO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel3.setText("PLEASE DOUBLE CHECK YOUR INFORMATION BEFORE CREATING AN ACCOUNT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        add2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add2.setText("CANCEL");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel1.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 300, -1));

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 302, 32));

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
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 228, 302, 32));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 302, 30));

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
        jPanel1.add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 302, 32));

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
        jPanel1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 302, 32));

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
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 302, 32));

        status.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING", "ACTIVE", "IN-ACTIVE", "DELETED" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 447, 303, 30));

        clear.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 302, 30));

        update.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        update.setText("UPDATE ACCOUNT");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 302, 30));

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg"))); // NOI18N
        picture1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 350, 350));

        delete.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 302, 30));

        type.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 402, 303, 30));

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
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 302, 32));

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 352, 30));

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

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id1.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel1MouseClicked

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        pane.setSelectedIndex(0);
    }//GEN-LAST:event_add2ActionPerformed

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

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained

    }//GEN-LAST:event_usernameFocusGained

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked

    }//GEN-LAST:event_usernameMouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setFocusable(true);
    }//GEN-LAST:event_emailFocusGained

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setFocusable(true);
    }//GEN-LAST:event_emailMouseClicked

    private void secretFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secretFocusGained

    }//GEN-LAST:event_secretFocusGained

    private void secretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretMouseClicked

    }//GEN-LAST:event_secretMouseClicked

    private void answerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusGained

    }//GEN-LAST:event_answerFocusGained

    private void answerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerMouseClicked

    }//GEN-LAST:event_answerMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained

    }//GEN-LAST:event_contactFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked

    }//GEN-LAST:event_contactMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        username.setText("");
        email.setText("");
        password.setText("");
        secret.setText("");
        answer.setText("");
        contact.setText("");
        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
        username.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        email.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        password.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        secret.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        answer.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        contact.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            String user = username.getText().trim();
            String emails = email.getText().trim();
            String secretQuestion = secret.getText().trim();
            String secretAnswer = answer.getText().trim();
            String contacts = contact.getText().trim();
            String types = (String) type.getSelectedItem();
            String stats = (String) status.getSelectedItem();
            String photoPath = path2 != null ? path2.trim() : ""; // Use path2 here
            String idText = id.getText().trim();

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
                return;
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

                pane.setSelectedIndex(0);
            }
        } catch (SQLException | FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void picture1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture1MouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            File selectedFile = ch.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            picture1.setIcon(ResizeImage(path));
            path2 = path;
        } else {
            System.out.println("Image selection cancelled or failed!");
        }
    }//GEN-LAST:event_picture1MouseClicked

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked

    }//GEN-LAST:event_panelMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            String idText = id.getText().trim();
            if (idText.isEmpty()) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE ENTER ID!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);
                return;
            } else {
                Connection cn = new DBConnection().getConnection();
                PreparedStatement pst = cn.prepareStatement("UPDATE ac_table SET ac_status = 'DELETED' WHERE ac_id = ?");
                pst.setString(1, idText);
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "ACCOUNT STATUS UPDATED TO 'DELETED'!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    int choice1 = JOptionPane.showOptionDialog(
                            null,
                            "SOME CHANGES MAY APPLY AFTER RESTARTING!",
                            "WARNING",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new String[]{"RESTART NOW", "RESTART LATER"},
                            "RESTART NOW"
                    );

                    int choice2 = JOptionPane.showOptionDialog(
                            null,
                            "ARE YOU SURE THIS MAY RESULT SOME DATA CONFLICTS!",
                            "WARNING",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new String[]{"YES", "NO"},
                            "YES"
                    );

                    if (choice1 == JOptionPane.YES_OPTION) {
                        new LoginDashboard().setVisible(true);
                        dispose();
                    } else {

                        if (choice2 == JOptionPane.YES_OPTION) {
                            pane.setSelectedIndex(0);
                        } else {
                            new LoginDashboard().setVisible(true);
                            dispose();
                        }

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "NO ACCOUNT FOUND WITH ID: " + idText, "WARNING", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
    }//GEN-LAST:event_idFocusGained

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
    }//GEN-LAST:event_idMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        picture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
    }//GEN-LAST:event_removeActionPerformed

    private void panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id2.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel2MouseClicked

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id3.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel3MouseClicked

    private void panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id4.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel4MouseClicked

    private void panel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id5.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel5MouseClicked

    private void panel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id7.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel6MouseClicked

    private void panel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id7.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel7MouseClicked

    private void panel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MouseEntered
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id8.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel8MouseEntered

    private void panel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id9.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel9MouseClicked

    private void panel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id10.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel10MouseClicked

    private void panel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MouseEntered
    }//GEN-LAST:event_panel11MouseEntered

    private void panel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MouseEntered
    }//GEN-LAST:event_panel12MouseEntered

    private void panel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel12MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id12.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel12MouseClicked

    private void panel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MouseClicked
        if (pane.getComponentCount() == 0) {
            System.out.println("Panel Is Empty!");
        } else {
            pane.setSelectedIndex(1);
            try {

                ResultSet rs = new DBConnection().getData("select * from ac_table where ac_id = '" + id11.getText() + "'");
                if (rs.next()) {
                    id.setText("" + String.valueOf(rs.getInt("ac_id")));
                    email.setText("" + rs.getString("ac_email"));
                    username.setText("" + rs.getString("ac_username"));
                    password.setText("" + rs.getString("ac_password"));
                    secret.setText("" + rs.getString("ac_sq"));
                    answer.setText("" + rs.getString("ac_sa"));
                    contact.setText("" + rs.getString("ac_contact"));
                    type.setSelectedItem("" + rs.getString("ac_type"));
                    status.setSelectedItem("" + rs.getString("ac_status"));

                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(picture1.getWidth(), picture1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    picture1.setIcon(newImage);

                }
            } catch (SQLException er) {
                System.out.println("ERROR: " + er.getMessage());
            }
        }
    }//GEN-LAST:event_panel11MouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

    }//GEN-LAST:event_refreshActionPerformed

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
            ResultSet rs = new DBConnection().getData("select ac_id,ac_email,ac_username,ac_contact,ac_type,ac_status from ac_table where ac_status in ('active', 'inactive') and ac_id != '" + xdb.getId() + "'");
            ac_db.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            System.err.println("An error occurred while fetching data: " + e.getMessage());
        }
    }

    private void fetch(int index, JLabel[] ids, JLabel[] names, JLabel[] types, JLabel[] statuses, JLabel[] icons, JPanel[] panels) {
        try {
            TableModel tbl = ac_db.getModel();
            if (tbl.getRowCount() > 0) {
                xternal_db xdb = xternal_db.getInstance();

                String query = "SELECT * FROM ac_table WHERE ac_id != ? AND ac_status IN ('active', 'inactive') LIMIT ?, ?";
                DBConnection dbConnection = new DBConnection();
                PreparedStatement ps = dbConnection.getConnection().prepareStatement(query);
                ps.setString(1, xdb.getId());
                ps.setInt(2, index);
                ps.setInt(3, Math.min(ids.length, Math.min(names.length, Math.min(types.length, Math.min(statuses.length, Math.min(icons.length, panels.length))))));

                ResultSet rs = ps.executeQuery();
                int i = 0;
                while (rs.next() && i < ids.length) {
                    ids[i].setText(rs.getString("ac_id"));
                    names[i].setText(rs.getString("ac_username"));
                    types[i].setText(rs.getString("ac_type"));
                    statuses[i].setText(rs.getString("ac_status"));
                    byte[] img = rs.getBytes("ac_image");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image im2 = im.getScaledInstance(260, 170, Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(im2);
                    icons[i].setIcon(newImage);
                    panels[i].setBorder(new LineBorder(Color.BLACK, 2));
                    i++;
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

        if (!username.getText().equals("")) {
            username.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (username.getText().equals("")) {
            username.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!email.getText().equals("")) {
            email.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (email.getText().equals("")) {
            email.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!password.getText().equals("")) {
            password.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (password.getText().equals("")) {
            password.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!secret.getText().equals("")) {
            secret.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (secret.getText().equals("")) {
            secret.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!answer.getText().equals("")) {
            answer.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (answer.getText().equals("")) {
            answer.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!contact.getText().equals("")) {
            contact.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (contact.getText().equals("")) {
            contact.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
        return progress;
    }

    private boolean updateChecker() throws SQLException {
        ResultSet rs = new DBConnection().getData("select * from ac_table where (ac_username = '" + username.getText() + "' or ac_email = '" + email.getText() + "') and ac_id != '" + id.getText() + "'");
        if (rs.next()) {
            String xemail = rs.getString("ac_email");
            if (xemail.equalsIgnoreCase(email.getText())) {
                errorMessage("EMAIL HAS BEEN USED!");
            }
            String xusername = rs.getString("ac_username");
            if (xusername.equalsIgnoreCase(username.getText())) {
                errorMessage("USERNAME HAS BEEN USED!");
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean validationChecker() {
        if (username.getText().isEmpty() || email.getText().isEmpty() || contact.getText().isEmpty()) {
            errorMessage("FILL ALL THE REQUIREMENTS!");
            return false;
        } else if (!contact.getText().matches("\\d+")) {
            errorMessage("CONTACT MUST CONTAIN ONLY DIGITS!");
            return false;
        } else {
            return true;
        }
    }

    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "ERROR!", JOptionPane.ERROR_MESSAGE);
    }

    private void successMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void refreshBtn() {
        JLabel[] ids = {id1, id2, id3, id4, id5, id4, id7, id8, id9, id10, id11, id12};
        JLabel[] names = {name1, name2, name3, name4, name5, name4, name7, name8, name9, name10, name11, name12};
        JLabel[] types = {type1, type2, type3, type4, type5, type4, type7, type8, type9, type10, type11, type12};
        JLabel[] statuses = {status1, status2, status3, status4, status5, status4, status7, status8, status9, status10, status11, status12};
        JLabel[] icons = {icon1, icon2, icon3, icon4, icon5, icon4, icon7, icon8, icon9, icon10, icon11, icon12};
        JPanel[] panels = {panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10, panel11, panel12};
        displayData();
        fetch(lastDisplayedIndex, ids, names, types, statuses, icons, panels);
    }

    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable ac_db;
    private javax.swing.JButton add2;
    private javax.swing.JTextField answer;
    private javax.swing.JButton changeView;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JPanel panel;
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
    public javax.swing.JLabel picture1;
    private javax.swing.JButton print;
    private javax.swing.JButton printableTable;
    private javax.swing.JButton refresh;
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
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
