package Forms;

import Charts.ModelChart;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;

public class Form_1 extends javax.swing.JPanel {

    public Form_1() {
        initComponents();
        init();
        gaugeChart4.setValueWithAnimation(92);
        gaugeChart5.setValueWithAnimation(52);
        gaugeChart6.setValueWithAnimation(78);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        gaugeChart4 = new Charts.GaugeChart();
        gaugeChart5 = new Charts.GaugeChart();
        gaugeChart6 = new Charts.GaugeChart();
        BarChart1 = new Charts.Chart();
        LineChart1 = new Charts.LineChart();
        jLabel29 = new javax.swing.JLabel();
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
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gaugeChart4.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jPanel8.add(gaugeChart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 130));

        gaugeChart5.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jPanel8.add(gaugeChart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 130, 130));

        gaugeChart6.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jPanel8.add(gaugeChart6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 130, 130));
        jPanel8.add(BarChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        jPanel8.add(LineChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        jLabel29.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel29.setText("SEPTEMBER");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel30.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("OVERALL BREAKDOWN");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 1110, -1));

        jLabel31.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 204, 0));
        jLabel31.setText("+ ₱658,225");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel32.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel32.setText("JULY");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel33.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel33.setText("AUGUST");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel34.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel34.setText("JUNE");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel35.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 204, 0));
        jLabel35.setText("+ ₱258,756 ");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel36.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 204, 0));
        jLabel36.setText("+ ₱756,056 ");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel37.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 0, 51));
        jLabel37.setText("-  ₱100,875");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jLabel38.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel38.setText("TOTAL SALES");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        jLabel39.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel39.setText("SEPTEMBER");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        jLabel40.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 0, 51));
        jLabel40.setText("-  ₱175,203 ");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        jLabel41.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 204, 0));
        jLabel41.setText("+ ₱456,358");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        jLabel42.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel42.setText("DECEMBER");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        jLabel43.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel43.setText("MAY");
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel44.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel44.setText("AUGUST");
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jLabel45.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 0, 51));
        jLabel45.setText("-  ₱100,875");
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        jLabel46.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 204, 0));
        jLabel46.setText("+ ₱158,954");
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        jLabel47.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel47.setText("TOTAL INCOME");
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, -1, -1));

        jLabel48.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel48.setText("JULY");
        jPanel8.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, -1, -1));

        jLabel49.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 204, 0));
        jLabel49.setText("+  ₱1,175,203 ");
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, -1, -1));

        jLabel50.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 0, 51));
        jLabel50.setText("-   ₱3,456,358");
        jPanel8.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, -1, -1));

        jLabel51.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 0, 51));
        jLabel51.setText("-   ₱584,875");
        jPanel8.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, -1, -1));

        jLabel52.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 204, 0));
        jLabel52.setText("+  ₱601,071");
        jPanel8.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 130, -1, -1));

        jLabel53.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel53.setText("OCTOBER");
        jPanel8.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, -1, -1));

        jLabel54.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel54.setText("NOVEMBER");
        jPanel8.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, -1, -1));

        jLabel55.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel55.setText("JUNE");
        jPanel8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, -1, -1));

        jLabel56.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel56.setText("TOTAL PROFIT");
        jPanel8.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -10, -1, -1));

        add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1240, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        BarChart1.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        BarChart1.addLegend("Expense", new Color(54, 4, 143), new Color(104, 49, 200));
        BarChart1.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        BarChart1.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        BarChart1.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        BarChart1.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        BarChart1.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        BarChart1.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        BarChart1.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        BarChart1.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        BarChart1.start();
        LineChart1.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        LineChart1.addLegend("Expense", new Color(54, 4, 143), new Color(104, 49, 200));
        LineChart1.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        LineChart1.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        LineChart1.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        LineChart1.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        LineChart1.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        LineChart1.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        LineChart1.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        LineChart1.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        LineChart1.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Charts.Chart BarChart1;
    private Charts.LineChart LineChart1;
    private Charts.GaugeChart gaugeChart4;
    private Charts.GaugeChart gaugeChart5;
    private Charts.GaugeChart gaugeChart6;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
