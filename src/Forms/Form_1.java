package Forms;

import Database.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

public class Form_1 extends javax.swing.JPanel {

    public Form_1() {
        initComponents();
        totalDisplay();
        user_logs();
    }

    private void totalDisplay() {
        try {

            ResultSet allAccCount = new DBConnection().getData("select count(*) as allAccs from u_tbl");
            if (allAccCount.next()) {
                int allAccs = allAccCount.getInt("allAccs");
                tacc.setText(String.valueOf(allAccs));
            }

            ResultSet patientCount = new DBConnection().getData("select count(*) as ptCount "
                    + "from u_tbl where u_type = 'PATIENT' ");
            if (patientCount.next()) {
                int ptCount = patientCount.getInt("ptCount");
                tpatient.setText(String.valueOf(ptCount));
            }

            ResultSet staffCount = new DBConnection().getData("select count(*) as stCount "
                    + "from u_tbl where u_type = 'DOCTOR' ");
            if (staffCount.next()) {
                int stCount = staffCount.getInt("stCount");
                jLabel3.setText(String.valueOf(stCount));
            }

        } catch (SQLException er) {
            System.out.println(er.getMessage());
        }
    }

    private void user_logs() {
        try {

            ResultSet rs = new DBConnection().getData("SELECT a_logs.a_id, "
                    + "u_tbl.u_lastname, u_tbl.u_firstname, a_logs.a_actions,a_logs.a_date, "
                    + "a_logs.a_hhmmss FROM a_logs INNER JOIN u_tbl ON a_logs.u_id=u_tbl.u_id;");
            logs.setModel(DbUtils.resultSetToTableModel(rs));

            TableColumn column1, column2, column3, column4, column5, column6;
            column1 = logs.getColumnModel().getColumn(0);
            column1.setPreferredWidth(10);

            column2 = logs.getColumnModel().getColumn(1);
            column2.setPreferredWidth(50);

            column3 = logs.getColumnModel().getColumn(2);
            column3.setPreferredWidth(50);

            column4 = logs.getColumnModel().getColumn(3);
            column4.setPreferredWidth(200);

            column5 = logs.getColumnModel().getColumn(4);
            column5.setPreferredWidth(25);

            column6 = logs.getColumnModel().getColumn(5);
            column6.setPreferredWidth(25);

            ((DefaultTableCellRenderer) logs.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(SwingConstants.CENTER);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            logs.setDefaultRenderer(Object.class, centerRenderer);

        } catch (SQLException er) {
            System.out.println(er.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        trating = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        tstaff = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tacc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tpatient = new javax.swing.JLabel();
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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trating.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        trating.setForeground(new java.awt.Color(102, 102, 102));
        trating.setText("11/10");
        jPanel5.add(trating, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 60, 180, 60));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tstaff.setBackground(new java.awt.Color(255, 255, 255));
        tstaff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("10");
        tstaff.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel8.add(tstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 180, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tacc.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        tacc.setForeground(new java.awt.Color(102, 102, 102));
        tacc.setText("10");
        jPanel3.add(tacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jPanel8.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 180, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tpatient.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        tpatient.setForeground(new java.awt.Color(102, 102, 102));
        tpatient.setText("10");
        jPanel1.add(tpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jPanel8.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 180, 60));

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable logs;
    private javax.swing.JTable newcomers;
    private javax.swing.JLabel tacc;
    private javax.swing.JLabel tpatient;
    private javax.swing.JLabel trating;
    private javax.swing.JPanel tstaff;
    // End of variables declaration//GEN-END:variables
}
