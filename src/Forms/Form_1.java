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

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(gaugeChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));
        jPanel9.add(gaugeChart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));
        jPanel9.add(gaugeChart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, -1));
        jPanel9.add(BarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        jPanel9.add(LineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
