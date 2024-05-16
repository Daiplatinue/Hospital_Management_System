package Forms;

import Charts.ModelChart;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;

public class Form_1 extends javax.swing.JPanel {

    public Form_1() {
        initComponents();
        init();
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        gaugeChart1.setValueWithAnimation(92);
        gaugeChart2.setValueWithAnimation(52);
        gaugeChart3.setValueWithAnimation(78);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        gaugeChart1 = new Charts.GaugeChart();
        gaugeChart2 = new Charts.GaugeChart();
        gaugeChart3 = new Charts.GaugeChart();
        BarChart = new Charts.Chart();
        LineChart = new Charts.LineChart();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
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
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gaugeChart1.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jPanel9.add(gaugeChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 130, 130));

        gaugeChart2.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jPanel9.add(gaugeChart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 130, 130));

        gaugeChart3.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jPanel9.add(gaugeChart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 130, 130));
        jPanel9.add(BarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        jPanel9.add(LineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel1.setText("SEPTEMBER");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OVERALL BREAKDOWN");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 1110, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("+ ₱658,225");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel4.setText("JULY");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel5.setText("AUGUST");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel6.setText("JUNE");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setText("+ ₱258,756 ");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("+ ₱756,056 ");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("-  ₱100,875");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel10.setText("TOTAL SALES");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel11.setText("SEPTEMBER");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("-  ₱175,203 ");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 0));
        jLabel13.setText("+ ₱456,358");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel14.setText("DECEMBER");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel15.setText("MAY");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel16.setText("AUGUST");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 51));
        jLabel17.setText("-  ₱100,875");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, -1, -1));

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 0));
        jLabel18.setText("+ ₱158,954");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel19.setText("TOTAL INCOME");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 80, -1, -1));

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel20.setText("JULY");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 120, -1, -1));

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 204, 0));
        jLabel21.setText("+  ₱1,175,203 ");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 120, -1, -1));

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 0, 51));
        jLabel22.setText("-   ₱3,456,358");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 140, -1, -1));

        jLabel23.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 0, 51));
        jLabel23.setText("-   ₱584,875");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 160, -1, -1));

        jLabel24.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 204, 0));
        jLabel24.setText("+  ₱601,071");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 180, -1, -1));

        jLabel25.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel25.setText("OCTOBER");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 180, -1, -1));

        jLabel26.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel26.setText("NOVEMBER");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, -1, -1));

        jLabel27.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel27.setText("JUNE");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, -1, -1));

        jLabel28.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel28.setText("TOTAL PROFIT");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        scroll.setViewportView(jPanel9);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        BarChart.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        BarChart.addLegend("Expense", new Color(54, 4, 143), new Color(104, 49, 200));
        BarChart.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        BarChart.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        BarChart.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        BarChart.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        BarChart.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        BarChart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        BarChart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        BarChart.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        BarChart.start();
        LineChart.addLegend("Income", new Color(12, 84, 175), new Color(0, 108, 247));
        LineChart.addLegend("Expense", new Color(54, 4, 143), new Color(104, 49, 200));
        LineChart.addLegend("Profit", new Color(5, 125, 0), new Color(95, 209, 69));
        LineChart.addLegend("Cost", new Color(186, 37, 37), new Color(241, 100, 120));
        LineChart.addData(new ModelChart("January", new double[]{500, 200, 80, 89}));
        LineChart.addData(new ModelChart("February", new double[]{600, 750, 90, 150}));
        LineChart.addData(new ModelChart("March", new double[]{200, 350, 460, 900}));
        LineChart.addData(new ModelChart("April", new double[]{480, 150, 750, 700}));
        LineChart.addData(new ModelChart("May", new double[]{350, 540, 300, 150}));
        LineChart.addData(new ModelChart("June", new double[]{190, 280, 81, 200}));
        LineChart.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Charts.Chart BarChart;
    private Charts.LineChart LineChart;
    private Charts.GaugeChart gaugeChart1;
    private Charts.GaugeChart gaugeChart2;
    private Charts.GaugeChart gaugeChart3;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
