package RegisterForm;

import LoginForm.LoginDashboard;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class RegisterDSB extends javax.swing.JPanel {

    public RegisterDSB() {
        initComponents();
        
        create.setEnabled(false);
        
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        middlename.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

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

        contact.addFocusListener(new java.awt.event.FocusAdapter() {
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

        address.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                progress();
            }
        });

        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "USERNAME");
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "PASSWORD");
        email.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EMAIL");
        contact.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "CONTACT");
        cpassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "CONFIRM PASSWORD");
        firstname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "FIRST NAME");
        lastname.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "LAST NAME");
        middlename.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "MIDDLE NAME");
        address.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ADDRESS");

        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        email.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        contact.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        cpassword.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        firstname.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        lastname.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        middlename.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        address.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        back = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        cpassword = new javax.swing.JPasswordField();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        age = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGN UP");

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

        create.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        create.setText("CREATE ACCOUNT");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        type.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PATIENT", "DOCTOR", "ADMIN", "RECEPTIONIST" }));

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

        gender.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        gender.setAlignmentX(1.0F);
        gender.setAlignmentY(1.0F);

        password.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cpassword.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        cpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstnameFocusGained(evt);
            }
        });
        firstname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstnameMouseClicked(evt);
            }
        });

        middlename.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        middlename.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                middlenameFocusGained(evt);
            }
        });
        middlename.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                middlenameMouseClicked(evt);
            }
        });

        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastnameFocusGained(evt);
            }
        });
        lastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastnameMouseClicked(evt);
            }
        });

        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
        });
        address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressMouseClicked(evt);
            }
        });

        age.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNDER 18", "OVER 18" }));
        age.setAlignmentX(1.0F);
        age.setAlignmentY(1.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(318, 318, 318)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(224, 224, 224)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contact)
                                .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(email)
                                .addComponent(username)
                                .addComponent(password)
                                .addComponent(cpassword)
                                .addComponent(address)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
        contact.setFocusable(true);
    }//GEN-LAST:event_contactFocusGained

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
        contact.setFocusable(true);
    }//GEN-LAST:event_contactMouseClicked

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
    }//GEN-LAST:event_createActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

    }//GEN-LAST:event_backActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
    }//GEN-LAST:event_usernameFocusGained

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
    }//GEN-LAST:event_usernameMouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
    }//GEN-LAST:event_emailFocusGained

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
    }//GEN-LAST:event_emailMouseClicked

    private void firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusGained
    }//GEN-LAST:event_firstnameFocusGained

    private void firstnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstnameMouseClicked
    }//GEN-LAST:event_firstnameMouseClicked

    private void middlenameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middlenameFocusGained
    }//GEN-LAST:event_middlenameFocusGained

    private void middlenameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_middlenameMouseClicked
    }//GEN-LAST:event_middlenameMouseClicked

    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
    }//GEN-LAST:event_lastnameFocusGained

    private void lastnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnameMouseClicked
    }//GEN-LAST:event_lastnameMouseClicked

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
    }//GEN-LAST:event_addressFocusGained

    private void addressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressMouseClicked
    }//GEN-LAST:event_addressMouseClicked

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

    public void register() {
        contact.grabFocus();
    }

    public void addEventBackLogin(ActionListener event) {
        back.addActionListener(event);
    }

    public int progress() {
        final int[] currentProgress = {jProgressBar1.getValue()};
        final int targetProgress = calculateProgress();

        Timer timer = new Timer(20, (ActionEvent e) -> {
            SwingUtilities.invokeLater(() -> {
                int increment = currentProgress[0] < targetProgress ? 1 : -1;
                currentProgress[0] += increment;
                jProgressBar1.setValue(currentProgress[0]);

                double percentage = (double) currentProgress[0] / jProgressBar1.getMaximum() * 100;

                Color color = getColorForPercentage(percentage);
                jProgressBar1.setForeground(color);

                if ((increment > 0 && currentProgress[0] >= targetProgress)
                        || (increment < 0 && currentProgress[0] <= targetProgress)) {
                    ((Timer) e.getSource()).stop();
                }
            });
        });

        timer.start();

        return targetProgress;
    }

    private Color getColorForPercentage(double percentage) {
        if (percentage < 50) {
            return Color.RED;
        } else if (percentage < 80) {
            return Color.YELLOW;
        } else {
            return Color.GREEN;
        }
    }

    private int calculateProgress() {
        int progress = 0;
        progress += updateFieldProgress(firstname, 3);
        progress += updateFieldProgress(lastname, 3);
        progress += updateFieldProgress(middlename, 3);
        progress += updateFieldProgress(username, 3);
        progress += updateFieldProgress(email, 3);
        progress += updateFieldProgress(contact, 3);
        progress += updateFieldProgress(password, 5);
        progress += updateFieldProgress(cpassword, 5);
        progress += updateFieldProgress(address, 3);

        if (gender.getSelectedIndex() != -1) {
            progress += 20;
        }

        if (age.getSelectedIndex() != -1) {
            progress += 20;
        }

        if (type.getSelectedIndex() != -1) {
            progress += 20;
        }

        jProgressBar1.setValue(progress);
        return progress;
    }

    private int updateFieldProgress(JTextField field, int increment) {
        int progressChange = field.getText().isEmpty() ? -increment : increment;
        field.setBorder(BorderFactory.createLineBorder(field.getText().isEmpty() ? Color.RED : Color.GREEN));
        return progressChange;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> age;
    private javax.swing.JButton back;
    private javax.swing.JTextField contact;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JButton create;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public final javax.swing.JProgressBar jProgressBar1 = new javax.swing.JProgressBar();
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField middlename;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
