package Forms;

import AdminForm.AdminForm;

public class Form_1 extends javax.swing.JPanel {

    public Form_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        card1 = new javaswingdev.card.Card();
        card2 = new javaswingdev.card.Card();
        card3 = new javaswingdev.card.Card();
        card4 = new javaswingdev.card.Card();
        jScrollPane1 = new javax.swing.JScrollPane();
        logs = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        newcomers = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -10, -1, -1));

        card1.setColor1(new java.awt.Color(255, 0, 51));
        card1.setColor2(new java.awt.Color(255, 0, 0));
        card1.setDescription("Rating");
        card1.setIcon(javaswingdev.GoogleMaterialDesignIcon.REPORT_PROBLEM);
        jPanel8.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, -1, -1));

        card2.setColor1(new java.awt.Color(51, 51, 255));
        card2.setColor2(new java.awt.Color(0, 204, 255));
        card2.setDescription("Patients");
        card2.setFont(new java.awt.Font("Tahoma", 1, 151)); // NOI18N
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.FACE);
        jPanel8.add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        card3.setColor1(new java.awt.Color(255, 153, 0));
        card3.setColor2(new java.awt.Color(255, 153, 255));
        card3.setDescription("Accounts Registered");
        card3.setEnabled(false);
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.FINGERPRINT);
        jPanel8.add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 40, -1, -1));

        card4.setColor1(new java.awt.Color(102, 255, 102));
        card4.setColor2(new java.awt.Color(0, 102, 51));
        card4.setDescription("Staff");
        card4.setIcon(javaswingdev.GoogleMaterialDesignIcon.PEOPLE);
        jPanel8.add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        logs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        logs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(logs);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 660, 500));

        newcomers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        newcomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(newcomers);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 500, 500));

        add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-16, 0, 1340, 800));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javaswingdev.card.Card card2;
    private javaswingdev.card.Card card3;
    private javaswingdev.card.Card card4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable logs;
    private javax.swing.JTable newcomers;
    // End of variables declaration//GEN-END:variables
}
