package Forms;

import com.raven.chart.ModelChart;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;

public class Form_1 extends javax.swing.JPanel {

    public Form_1() {
        initComponents();
        init();
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        g1.setValueWithAnimation(75);
        g2.setValueWithAnimation(80);
        g3.setValueWithAnimation(85);
        g4.setValueWithAnimation(90);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        g1 = new com.raven.chart.GaugeChart();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        g2 = new com.raven.chart.GaugeChart();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        g3 = new com.raven.chart.GaugeChart();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        g4 = new com.raven.chart.GaugeChart();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LineChart = new com.raven.chart.LineChart();
        jLabel15 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        BarChart = new com.raven.chart.Chart();

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g1.setForeground(new java.awt.Color(255, 255, 255));
        g1.setColor2(new java.awt.Color(153, 255, 255));
        jPanel2.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 110));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TOTAL INCOME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JUNE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("JULY");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 98, 130, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AUGUST");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 130, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("+ ₱358,125.98");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 125, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("- ₱85,568.02");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 98, 130, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("+ ₱128,325.75");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 130, -1));

        jPanel9.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 500, 170));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g2.setForeground(new java.awt.Color(255, 255, 255));
        g2.setColor2(new java.awt.Color(153, 255, 255));
        jPanel3.add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 110));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TOTAL INCOME");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("JUNE");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("JULY");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 98, 130, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("AUGUST");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 130, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 255, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("+ ₱358,125.98");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 125, 130, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("- ₱85,568.02");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 98, 130, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 255, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("+ ₱128,325.75");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 130, -1));

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 500, 170));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g3.setForeground(new java.awt.Color(255, 255, 255));
        g3.setColor2(new java.awt.Color(153, 255, 255));
        jPanel4.add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 110));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("JUNE");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("JULY");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 98, 130, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("AUGUST");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 130, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 255, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("+ ₱358,125.98");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 125, 130, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("- ₱85,568.02");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 98, 130, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 255, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("+ ₱128,325.75");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 130, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("TOTAL INCOME");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, -1));

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 500, 170));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        g4.setForeground(new java.awt.Color(255, 255, 255));
        g4.setColor2(new java.awt.Color(153, 255, 255));
        jPanel5.add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 110));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("TOTAL INCOME");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("JUNE");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("JULY");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 98, 130, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("AUGUST");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 130, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 255, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("+ ₱358,125.98");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 125, 130, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("- ₱85,568.02");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 98, 130, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 255, 102));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("+ ₱128,325.75");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 130, -1));

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 500, 170));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LineChart.setOpaque(true);
        jPanel1.add(LineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 0, 1040, 340));

        jPanel9.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 1030, 340));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DATA REPORTS");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 1030, -1));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("LINE CHART");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 1030, -1));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("BAR CHART");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 890, 1030, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarChart.setOpaque(true);
        jPanel6.add(BarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -8, 1030, 350));

        jPanel9.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 930, 1030, 340));

        scroll.setViewportView(jPanel9);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
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
    private com.raven.chart.Chart BarChart;
    private com.raven.chart.LineChart LineChart;
    private com.raven.chart.GaugeChart g1;
    private com.raven.chart.GaugeChart g2;
    private com.raven.chart.GaugeChart g3;
    private com.raven.chart.GaugeChart g4;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
