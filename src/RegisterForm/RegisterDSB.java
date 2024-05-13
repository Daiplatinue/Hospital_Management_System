package RegisterForm;

import Database.DBConnection;
import Functions.Hasher;
import LoginForm.LoginDashboard;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import jnafilechooser.api.JnaFileChooser;

public class RegisterDSB extends javax.swing.JPanel {

    String path2 = null;

    public RegisterDSB() {
        initComponents();

        username.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        email.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        password.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        cpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        secret.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        answer.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        contact.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EMAIL");
        cpassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "CONFIRM PASSWORD");
        answer.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SECRET ANSWER");
        secret.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "SECRET QUESTION");
        contact.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "CONTACT");

        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        email.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        cpassword.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        answer.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        secret.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        contact.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        back = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        remove = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        secret = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        cpassword = new javax.swing.JPasswordField();
        answer = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGN UP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 300, -1));

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 302, 32));

        create.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        create.setText("CREATE ACCOUNT");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        jPanel1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 302, 30));

        back.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 302, 30));

        type.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 402, 303, 30));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 799, -1));

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 590, 302, 30));

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

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 350, 350));

        secret.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secret.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                secretFocusGained(evt);
            }
        });
        secret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secretMouseClicked(evt);
            }
        });
        jPanel1.add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 302, 32));

        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactFocusGained(evt);
            }
        });
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMouseClicked(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 302, 32));

        cpassword.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        cpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 302, 30));

        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerFocusGained(evt);
            }
        });
        answer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answerMouseClicked(evt);
            }
        });
        jPanel1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 302, 32));

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 302, 32));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 302, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setFocusable(true);
    }//GEN-LAST:event_emailFocusGained

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setFocusable(true);
    }//GEN-LAST:event_emailMouseClicked

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        try {
            if (duplicateChecker()) {
            } else if (!validationChecker()) {
            } else {
                String pass = Hasher.hashPassword(password.getText());
                new DBConnection().insertData("insert into ac_table (ac_username,ac_email,ac_password,ac_sq,ac_sa,ac_type,ac_status,ac_contact) "
                        + "values ('" + username.getText() + "','" + email.getText() + "', '" + pass + "'"
                        + ",'" + secret.getText() + "','" + answer.getText() + "','" + type.getSelectedItem() + "','PENDING','" + contact.getText() + "')");

                JOptionPane.showMessageDialog(this, "REGISTRATION SUCCESSFULL!", "SUCCESS", INFORMATION_MESSAGE);

                new LoginDashboard().setVisible(true);
                dispose();

            }
        } catch (SQLException er) {
            System.out.println("Eror: " + er.getMessage());
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_createActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

    }//GEN-LAST:event_backActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
    }//GEN-LAST:event_removeActionPerformed

    private void pictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureMouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrames());
        if (action) {
            File selectedFile = ch.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            picture.setIcon(ResizeImage(path));
            path2 = path;
        } else {
            System.out.println("Image Already Exist or Does Not Exist!");
        }
    }//GEN-LAST:event_pictureMouseClicked

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked

    }//GEN-LAST:event_panelMouseClicked

    private void secretFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secretFocusGained
    }//GEN-LAST:event_secretFocusGained

    private void secretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretMouseClicked
    }//GEN-LAST:event_secretMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
    }//GEN-LAST:event_contactFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
    }//GEN-LAST:event_contactMouseClicked

    private void answerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusGained
    }//GEN-LAST:event_answerFocusGained

    private void answerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerMouseClicked
    }//GEN-LAST:event_answerMouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
    }//GEN-LAST:event_usernameFocusGained

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
    }//GEN-LAST:event_usernameMouseClicked

    public static void main(String args[]) {
        FlatLightLaf.registerCustomDefaultsSource("Style");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterDSB().setVisible(true);
            }
        });
    }

    private String xemail, xusername;

    private boolean duplicateChecker() throws SQLException {
        ResultSet rs = new DBConnection().getData("select * from ac_table where ac_email = '" + email.getText() + "' or ac_username = '" + username.getText() + "'");

        if (rs.next()) {
            xemail = rs.getString("ac_email");
            if (xemail.equals(email.getText())) {
                JOptionPane.showMessageDialog(this, "EMAIL HAS BEEN USED!", "OH NO!", ERROR_MESSAGE);
            }

            xusername = rs.getString("ac_username");
            if (xusername.equals(username.getText())) {
                JOptionPane.showMessageDialog(this, "USERNAME HAS BEEN USED!", "OH NO!", ERROR_MESSAGE);
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean validationChecker() {
        if (username.getText().isEmpty() || password.getText().isEmpty()
                || cpassword.getText().isEmpty() || email.getText().isEmpty() || contact.getText().isEmpty()) {
            errorMessage("FILL ALL THE REQUIREMENTS!");
            return false;
        } else if (password.getText().length() < 8) {
            errorMessage("PASSWORD MUST BE AT LEAST 8 CHARACTERS!");
            return false;
        } else if (!password.getText().equals(cpassword.getText())) {
            errorMessage("PASSWORDS DO NOT MATCH!");
            return false;
        } else if (!contact.getText().matches("\\d+")) {
            errorMessage("CONTACT MUST CONTAIN ONLY DIGITS!");
            return false;
        } else {
            return true;
        }
    }

    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "ERROR!", JOptionPane.ERROR_MESSAGE);
    }

    private void successMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void register() {
        email.grabFocus();
    }

    public void addEventBackLogin(ActionListener event) {
        back.addActionListener(event);
    }

    public void progress() {
        Timer timer = new Timer(20, new ActionListener() {
            int currentProgress = jProgressBar1.getValue();
            int targetProgress = calculateProgress();
            int step = (targetProgress > currentProgress) ? 1 : -1;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentProgress != targetProgress) {
                    currentProgress += step;
                    jProgressBar1.setValue(currentProgress);
                } else {
                    ((Timer) e.getSource()).stop();
                }
            }
        });
        timer.start();
    }

    public int calculateProgress() {

        int progress = 0;

        if (!username.getText().equals("")) {
            progress += 5;
            username.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (username.getText().equals("")) {
            progress -= 5;
            username.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!email.getText().equals("")) {
            progress += 5;
            email.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (email.getText().equals("")) {
            progress -= 5;
            email.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!password.getText().equals("")) {
            progress += 10;
            password.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (password.getText().equals("")) {
            progress -= 10;
            password.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!cpassword.getText().equals("")) {
            progress += 5;
            cpassword.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (cpassword.getText().equals("")) {
            progress -= 5;
            cpassword.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!secret.getText().equals("")) {
            progress += 7;
            secret.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (secret.getText().equals("")) {
            progress -= 7;
            secret.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!answer.getText().equals("")) {
            progress += 7;
            answer.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (answer.getText().equals("")) {
            progress -= 7;
            answer.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (!contact.getText().equals("")) {
            progress += 5;
            contact.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        } else if (contact.getText().equals("")) {
            progress -= 5;
            contact.setBorder(BorderFactory.createLineBorder(Color.RED));
        }

        if (type.getSelectedIndex() != -1) {
            progress += 60;
        }

        jProgressBar1.setValue(progress);

        if (progress >= 80) {
            jProgressBar1.setForeground(Color.GREEN);
        } else if (progress >= 50) {
            jProgressBar1.setForeground(Color.YELLOW);
        } else {
            jProgressBar1.setForeground(Color.RED);
        }

        return progress;
    }

    public void dispose() {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();
    }

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture.getHeight(), picture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton back;
    private javax.swing.JTextField contact;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JButton create;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public final javax.swing.JProgressBar jProgressBar1 = new javax.swing.JProgressBar();
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel picture;
    private javax.swing.JButton remove;
    private javax.swing.JTextField secret;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
