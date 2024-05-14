package Forms;

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
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import jnafilechooser.api.JnaFileChooser;

public class Form_2 extends javax.swing.JPanel {

    String path2 = null;

    public Form_2() {
        initComponents();

        create.setFocusable(false);
        remove.setFocusable(false);
        type.setFocusable(false);

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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        cpassword = new javax.swing.JPasswordField();
        secret = new javax.swing.JTextField();
        answer = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 25)); // NOI18N
        jLabel2.setText("CREATE AN ACCOUNT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 15)); // NOI18N
        jLabel3.setText("PLEASE DOUBLE CHECK YOUR INFORMATION BEFORE CREATING AN ACCOUNT");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));
        add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 799, -1));

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
        add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 302, 32));

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
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 302, 32));

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 302, 30));

        cpassword.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        cpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 302, 30));

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
        add(secret, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 302, 32));

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
        add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 302, 32));

        type.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));
        add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 402, 303, 30));

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
        add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 302, 32));

        create.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        create.setText("CREATE ACCOUNT");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 302, 30));

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

        add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 350, 350));

        clear.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        clear.setText("CLEAR ALL FIELDS");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 302, 30));

        remove.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 352, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained

    }//GEN-LAST:event_usernameFocusGained

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked

    }//GEN-LAST:event_usernameMouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setFocusable(true);
    }//GEN-LAST:event_emailFocusGained

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setFocusable(true);
    }//GEN-LAST:event_emailMouseClicked

    private void secretFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secretFocusGained

    }//GEN-LAST:event_secretFocusGained

    private void secretMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretMouseClicked

    }//GEN-LAST:event_secretMouseClicked

    private void answerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusGained

    }//GEN-LAST:event_answerFocusGained

    private void answerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerMouseClicked

    }//GEN-LAST:event_answerMouseClicked

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained

    }//GEN-LAST:event_contactFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked

    }//GEN-LAST:event_contactMouseClicked

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        try {
            String user = username.getText().trim();
            String emails = email.getText().trim();
            String passwordText = password.getText().trim();
            String secretQuestion = secret.getText().trim();
            String secretAnswer = answer.getText().trim();
            String contacts = contact.getText().trim();
            String types = (String) type.getSelectedItem();
            Icon photo = picture.getIcon();

            if (user.isEmpty() || emails.isEmpty() || passwordText.isEmpty() || secretQuestion.isEmpty() || secretAnswer.isEmpty() || contacts.isEmpty() || path2 == null || path2.isEmpty() || photo == null) {
                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/alert.gif"));
                JOptionPane.showMessageDialog(null, "PLEASE FILL ALL FIELDS AND INSERT AN IMAGE!", "WARNING", JOptionPane.WARNING_MESSAGE, customIcon);

            } else {
                String hashedPass = Hasher.passwordHasher(passwordText);
                String status = "Pending";

                Connection cn = new DBConnection().getConnection();
                PreparedStatement pst = cn.prepareStatement("INSERT INTO ac_table (ac_username, ac_email, ac_password, ac_sq, ac_sa, ac_type, ac_status, ac_contact, ac_image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

                pst.setString(1, user);
                pst.setString(2, emails);
                pst.setString(3, hashedPass);
                pst.setString(4, secretQuestion);
                pst.setString(5, secretAnswer);
                pst.setString(6, types);
                pst.setString(7, status);
                pst.setString(8, contacts);

                InputStream is = new FileInputStream(new File(path2));
                pst.setBlob(9, is);
                pst.execute();

                UIManager.put("OptionPane.background", Color.white);
                UIManager.put("Panel.background", Color.white);
                Icon customIcon = new javax.swing.ImageIcon(getClass().getResource("/Images/sucess.png"));
                JOptionPane.showMessageDialog(null, "ACCOUNT CREATED SUCCESSFULLY!", "SUCCESS", JOptionPane.WARNING_MESSAGE, customIcon);

                username.setText("");
                email.setText("");
                password.setText("");
                cpassword.setText("");
                secret.setText("");
                answer.setText("");
                contact.setText("");
                picture.setIcon(null);
                jProgressBar1.setValue(0);
                username.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                email.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                password.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                cpassword.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                secret.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                answer.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
                contact.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

            }
        } catch (SQLException | NoSuchAlgorithmException | FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_createActionPerformed

    private void pictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureMouseClicked
        JnaFileChooser ch = new JnaFileChooser();
        boolean action = ch.showOpenDialog(new NewJFrame());
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

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        username.setText("");
        email.setText("");
        password.setText("");
        cpassword.setText("");
        secret.setText("");
        answer.setText("");
        contact.setText("");
        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
        jProgressBar1.setValue(0);
        username.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        email.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        password.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        cpassword.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        secret.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        answer.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        contact.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
    }//GEN-LAST:event_clearActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iring.jpg")));
    }//GEN-LAST:event_removeActionPerformed

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon MyImage = new ImageIcon(imagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(picture.getHeight(), picture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
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

    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "ERROR!", JOptionPane.ERROR_MESSAGE);
    }

    private void successMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JButton create;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public final javax.swing.JProgressBar jProgressBar1 = new javax.swing.JProgressBar();
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField password;
    public javax.swing.JLabel picture;
    private javax.swing.JButton remove;
    private javax.swing.JTextField secret;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
