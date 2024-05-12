package Forms;

public class Form_4 extends javax.swing.JPanel {

    public Form_4() {
        initComponents();
        logs.setEditable(false);
        
        print.setFocusable(false);
        clear.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        logs = new javax.swing.JTextArea();
        print = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALL USER LOGS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 120, 30));

        logs.setColumns(20);
        logs.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        logs.setRows(5);
        logs.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(logs);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 1220, 540));

        print.setText("PRINT");
        add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 620, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       logs.setText("");
    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea logs;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
