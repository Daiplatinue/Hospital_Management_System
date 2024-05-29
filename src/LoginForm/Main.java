package LoginForm;

import Functions.SeperatorAnimation;
import static LoginForm.LoginDashboard.jLabel9;
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

public final class Main extends javax.swing.JPanel {

    private static final int STEP = 5;
    private final Map<JPanel, Timer> moveTimers = new HashMap<>();

    public Main() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);

        signIn.addActionListener(e -> {
            SeperatorAnimation animation = new SeperatorAnimation();
            animation.animatePanelHorizontally(LoginDashboard.selection, LoginDashboard.selection.getX() + 132);
            LoginDashboard.jLabel22.setForeground(Color.BLACK);
            LoginDashboard.jLabel9.setForeground(new Color(153, 153, 153));
        });

        signUp.addActionListener(e -> {
            SeperatorAnimation animation = new SeperatorAnimation();
            animation.animatePanelHorizontally(LoginDashboard.selection, LoginDashboard.selection.getX() + 65);
            LoginDashboard.jLabel12.setForeground(Color.BLACK);
            LoginDashboard.jLabel9.setForeground(new Color(153, 153, 153));
        });

        signUp.setFocusable(false);
        signIn.setFocusable(false);
        jButton2.setFocusable(false);
    }

    public void addEventSignUp(ActionListener event) {
        signUp.addActionListener(event);
    }

    public void addEventSignIn(ActionListener event) {
        signIn.addActionListener(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signIn = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(32, 61, 110));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 45)); // NOI18N
        jLabel1.setText("EMBRACING WELLNESS WITH CARE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("ENSURING A TRANSFORMATIVE EXPERIENCE TAILORED TO YOUR UNIQUE NEEDS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 260, -1, 30));

        signIn.setForeground(new java.awt.Color(45, 117, 255));
        signIn.setText("Sign In");
        signIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 117, 255)));
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn.setOpaque(false);
        jPanel2.add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, 30));

        signUp.setBackground(new java.awt.Color(0, 87, 255));
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setText("Sign Up ");
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel2.add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("WHERE EVERY STEP OF YOUR JOURNEY TOWARDS HOLISTIC HEALTH IS NURTURED WITH COMPASSION AND EXPERTISE,");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 235, -1, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check.png"))); // NOI18N
        jLabel5.setText("Advanced Medical Technology");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check.png"))); // NOI18N
        jLabel6.setText("Regulatory Monitoring");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check.png"))); // NOI18N
        jLabel7.setText("Real-Time Updates");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check.png"))); // NOI18N
        jLabel11.setText("User-Friendly Interface");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 480, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/check.png"))); // NOI18N
        jLabel12.setText("Integrated Health Ecosystem");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 480, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 518, 1300, 20));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 1300, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/recover.jpg"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 87, 255));
        jLabel14.setText(" HOSPITAL");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 5460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel15.setText("Triumphant Milestone");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 630, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setText("Over 1,000 Patients Who Defy Odds, Recovering From Pancreatic Cancer, Liver Cancer,");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 690, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setText("Mesothelioma, Stomach Cancer, Metastatic Melanoma, Acute Myeloid Leukemia, Lung Cancer, ");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 720, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel20.setText("Esophageal Cancer, Ovarian Cancer. Celebrated Their Newfound Lease on Life on a Single");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 750, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel21.setText("Remarkable Day, Each Person's Victory Adding to the Collective Spirit of Resilience and Defiance");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 780, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doctah.jpg"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 1160, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel25.setText("Latest Report");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 600, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(70, 133, 255));
        jLabel16.setText("Augost 28, 2024");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel29.setText(" Against the Odds.");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 810, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel26.setText("Latest Report");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1050, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(70, 133, 255));
        jLabel23.setText("September 7, 2024");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 1050, -1, -1));

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(5, 142, 230));
        jLabel24.setText("Current Pinnacle");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 1720, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel27.setText("With the recent addition of over 5000 doctors to our hospital network, we are witnessing a ");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1140, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel28.setText("monumental leap forward in our capacity to serve the community. This influx represents not only ");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1170, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel30.setText("numerical growth but a deepening commitment to excellence in healthcare. The expertise and ");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1200, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ins.png"))); // NOI18N
        jLabel31.setText("INSTAGRAM");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5760, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel32.setText("dedication these doctors bring are a beacon of hope for our fellow citizens, signaling a brighter ");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1230, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel33.setText("future for healthcare in our region. As they join our ranks, we are strengthened by their diverse skills ");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1260, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel34.setText("and experiences, enriching our collective ability to address a wide range of medical needs. Together, ");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1290, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel35.setText("we stand united in our mission to provide compassionate and comprehensive care to every ");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1320, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel36.setText("individual who walks through our doors. Their presence fills us with optimism and determination as ");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1350, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel37.setText("we face the challenges ahead with renewed vigor and resilience. We are honored to welcome each ");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1380, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel38.setText("and every one of these esteemed professionals into our hospital family, knowing that their ");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1410, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel39.setText("contributions will make a profound difference in the lives of those we serve. As our hospital grows, ");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1440, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel40.setText("so too does our capacity to inspire hope and healing within our community, forging a path toward a ");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1470, -1, -1));

        jLabel41.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel41.setText("Breaking Barriers: Over 5000 Doctors Join Our Hospital Network");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 1080, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1880, 260, 340));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 1880, 260, 340));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1880, 260, 340));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 2570, 260, 340));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2570, 260, 340));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 2570, 260, 340));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 2570, 260, 340));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1880, 260, 340));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel42.setText("At Current Pinnacle, we calculate our outstanding doctors by their impressive track record of successful surgeries,");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 1780, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel43.setText("© 2024 SWH, ALL RIGHTS RESERVED");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 5760, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pesbok.png"))); // NOI18N
        jLabel44.setText("FACEBOOK");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5670, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yt.png"))); // NOI18N
        jLabel45.setText("YOUTUBE");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5700, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/twitah.png"))); // NOI18N
        jLabel46.setText("TWITTER");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5730, -1, -1));

        jLabel47.setFont(new java.awt.Font("Yu Gothic", 0, 13)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("YOUR JOURNEY ENDS HERE");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 5090, -1, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel48.setText("ensuring that each one stands out in their field through excellence and dedication");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1810, -1, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel49.setText("healthier and brighter future for all.");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1500, -1, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel53.setText("ensuring a brighter and healthier future for our community");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 2500, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 3160, 400, 350));

        jLabel54.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(5, 142, 230));
        jLabel54.setText("Beacon of Hope");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 2400, -1, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel55.setText("NEW USER");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3155, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(40, 130, 169));
        jLabel56.setText("SPOTLIGHT");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3180, -1, -1));

        jLabel57.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(5, 142, 230));
        jLabel57.setText("Unbroken Bonds");
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 4230, -1, -1));

        jLabel51.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel51.setText(": Exceptional Doctors Making Waves");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 1720, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel58.setText("These contributors have not only saved our hospital but also propelled our medical technology to new heights,");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 2470, -1, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel60.setText("to have you join us. Feel free to explore our platform and engage with other members; your unique ");
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3320, -1, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel61.setText("perspectives are highly encouraged and appreciated. Should you have any questions or need ");
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3350, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel62.setText("assistance, our support team is here to help you every step of the way. Together, let's foster a ");
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3380, -1, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel63.setText("welcoming and collaborative environment where everyone can thrive. Welcome aboard, and we look ");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3410, -1, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel64.setText(" upon which our hospital's success and impact are built, and for being an indispensable part of our healthcare family.");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 4380, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1k.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 4480, 1000, 530));

        jLabel65.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel65.setText(": Acknowledging Our Top Contributors");
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 2400, -1, -1));

        jLabel66.setFont(new java.awt.Font("Yu Gothic", 1, 30)); // NOI18N
        jLabel66.setText("Let Us Welcome Our Newest Doctors!");
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 3660, -1, -1));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel67.setText("Welcome, new users! Your presence adds tremendous value to our community, and we're delighted ");
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3290, -1, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 102, 102));
        jLabel68.setText("possibilities are sown. Farewell to this chapter, but hold steadfast to the belief that the best is yet to come");
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 5190, -1, -1));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel69.setText("and excellence. Your support not only sustains our operations but also enables us to innovate, expand, and reach even greater heights in healthcare delivery. Together,");
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 4320, -1, -1));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel70.setText("we form a united front against illness and adversity, standing as a beacon of hope and healing for all who walk through our doors. Thank you for being the foundation  ");
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 4350, -1, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 5100, 560, 20));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel71.setText("FOLLOW US ON");
        jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5640, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5100, 530, 20));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel72.setText("Each contribution, whether big or small, is a testament to your compassion and belief in our cause, and it empowers us to continue serving our community with dedication ");
        jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 4290, -1, -1));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(102, 102, 102));
        jLabel73.setText("Your journey ends here, marking the culmination of your experiences and adventures. Take a moment to reflect on the paths you've traversed and the lessons you've learned along the way. ");
        jPanel2.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 5130, -1, -1));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(102, 102, 102));
        jLabel74.setText("Though this chapter closes, remember that every ending heralds the dawn of a new beginning. Embrace the unknown with courage and optimism, for it is in the endings that the seeds of future ");
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 5160, -1, -1));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        jLabel75.setText("SERENITY WELLNESS ");
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 5460, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logod.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 5260, -1, -1));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel78.setText("SERENITY WELLNESS HOSPITAL");
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 151, -1, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 3660, 300, 350));

        jLabel76.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel76.setText(": Thank You for Your Everlasting Commitment");
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 4230, -1, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel77.setText("forward to seeing all that you'll accomplish here!");
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3440, -1, -1));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(70, 133, 255));
        jLabel79.setText("October 9, 2024");
        jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 3850, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 87, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 255)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 4020, 100, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("View More");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(false);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 3880, 100, 30));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel59.setText("Hi everyone, don't forget to check out our newly stocked medications; we have a great selection for you.");
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 3710, -1, -1));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel80.setText("We've recently updated our inventory, so be sure to explore the exciting new options available. Make sure");
        jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 3740, -1, -1));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel81.setText(" to take a moment to discover our latest additions for all your health and wellness needs. We're confident");
        jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 3770, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 87, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 87, 255)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 4020, 100, 30));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel82.setText(" you'll find the perfect solution among our newly stocked medications. Stop by today and see what's new!");
        jPanel2.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 3800, -1, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(70, 133, 255));
        jLabel83.setText("AS OF YEAR 2024");
        jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 3222, -1, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(102, 102, 102));
        jLabel84.setText("Released ");
        jPanel2.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 3847, -1, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5790, 1220, 130));

        jScrollPane1.setViewportView(jPanel2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/armandohasudungan/featured").toURI());

        } catch (MalformedURLException er) {
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel45MouseClicked

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed

    }//GEN-LAST:event_signUpActionPerformed

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/ChongHuaHospital").toURI());

        } catch (MalformedURLException er) {
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://x.com/").toURI());

        } catch (MalformedURLException er) {
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://www.instagram.com/").toURI());

        } catch (MalformedURLException er) {
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel31MouseClicked

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
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton signIn;
    private javax.swing.JButton signUp;
    // End of variables declaration//GEN-END:variables
}
