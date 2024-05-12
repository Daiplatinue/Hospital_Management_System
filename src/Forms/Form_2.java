package Forms;

import LoginForm.LoginDashboard;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import jnafilechooser.api.JnaFileChooser;

public class Form_2 extends javax.swing.JPanel {

    public Form_2() {
        initComponents();

        firstname.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        lastname.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        middlename.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        email.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        cpassword.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        firstname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "FIRST NAME");
        lastname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "LAST NAME");
        middlename.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "MIDDLE NAME");
        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EMAIL");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        cpassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "CONFIRM PASSWORD");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        cpassword = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        add1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel2.setText("CREATE AN ACCOUNT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel3.setText("PLEASE DOUBLE CHECK YOUR INFORMATION BEFORE CREATING AN ACCOUNT");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        firstname.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 350, 30));

        lastname.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 350, 30));

        username.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 350, 30));

        middlename.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        middlename.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 350, 30));

        cpassword.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        cpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 350, 30));

        email.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 350, 30));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 350, 30));

        jComboBox2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "RECEPTIONIST", "PHARMACIST", "PATIENT", "DOCTER" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 350, 30));

        jComboBox3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 350, 30));

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg"))); // NOI18N
        picture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 350, 350));

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 350, -1));

        add1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        add1.setText("CREATE ACCOUNT");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked

    }//GEN-LAST:event_panelMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
    }//GEN-LAST:event_removeActionPerformed

    private void pictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureMouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
        if (action) {
            File selectedFile = ch.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            picture.setIcon(ResizeImage(path));
        }
    }//GEN-LAST:event_pictureMouseClicked

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);
        Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
        JOptionPane.showMessageDialog(null, "CREATE ACCOUNT?", "WARNING", JOptionPane.YES_NO_OPTION, customIcon);
    }//GEN-LAST:event_add1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Form_2().setVisible(true);
            }
        });
    }

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture.getHeight(), picture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.JTextField cpassword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField middlename;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField password;
    private javax.swing.JLabel picture;
    private javax.swing.JButton remove;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
