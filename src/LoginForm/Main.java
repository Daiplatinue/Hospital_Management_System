package LoginForm;

import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JPanel {

    public Main() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();

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
        signIn.setOpaque(false);
        jPanel2.add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 100, 30));

        signUp.setBackground(new java.awt.Color(0, 87, 255));
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setText("Sign Up ");
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

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setText("SERENITY WELLNESS HOSPITAL");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 151, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel15.setText("TRIUMPHANT MILESTONE");
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
        jLabel23.setText("September 07, 2024");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 1050, -1, -1));

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 1, 35)); // NOI18N
        jLabel24.setText("Current Pinnacle: Exceptional Doctors Making Waves");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 1620, -1, -1));

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
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2210, -1, -1));

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
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 1720, 260, 340));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 1720, 260, 340));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1720, 260, 340));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 1720, 260, 340));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel42.setText("healthier and brighter future for all.");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1500, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel43.setText("© 2024 SWH, ALL RIGHTS RESERVED");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 2190, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pesbok.png"))); // NOI18N
        jLabel44.setText("FACEBOOK");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2120, -1, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yt.png"))); // NOI18N
        jLabel45.setText("YOUTUBE");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2150, -1, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/twitah.png"))); // NOI18N
        jLabel46.setText("TWITTER");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2180, -1, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel47.setText("FOLLOW US ON");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2090, -1, -1));

        jScrollPane1.setViewportView(jPanel2);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://www.youtube.com/user/armandohasudungan/featured").toURI());
        } catch (MalformedURLException er) {
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel45MouseClicked

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed

    }//GEN-LAST:event_signUpActionPerformed

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://www.facebook.com/ChongHuaHospital").toURI());
        } catch (MalformedURLException er) {
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://x.com/").toURI());
        } catch (MalformedURLException er) {
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://www.instagram.com/").toURI());
        } catch (MalformedURLException er) {
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel31MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton signIn;
    private javax.swing.JButton signUp;
    // End of variables declaration//GEN-END:variables
}
