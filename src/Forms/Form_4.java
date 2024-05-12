package Forms;

public class Form_4 extends javax.swing.JPanel {

    public Form_4() {
        initComponents();
        logs.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        logs = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALL USER LOGS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        jButton1.setText("PRINT");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 620, 120, 30));

        logs.setColumns(20);
        logs.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        logs.setRows(5);
        logs.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(logs);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 1220, 540));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea logs;
    // End of variables declaration//GEN-END:variables
}
