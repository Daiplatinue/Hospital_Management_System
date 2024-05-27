package Functions;

import java.awt.Color;
import javax.swing.*;

class PasswordLengthChecker {

    public enum Strength {
        LOW, MID, STRONG, EMPTY
    }

    public static Strength checkPasswordStrength(String password) {
        if (password.isEmpty()) {
            return Strength.EMPTY;
        }

        int length = password.length();
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

        if (length >= 8 && hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
            return Strength.STRONG;
        } else if (length >= 6 && (hasUppercase || hasLowercase) && (hasDigit || hasSpecialChar)) {
            return Strength.MID;
        } else {
            return Strength.LOW;
        }
    }

    public static void updateIndicators(JPanel lowPanel, JPanel midPanel, JPanel strongPanel, Strength strength) {
        lowPanel.setVisible(false);
        midPanel.setVisible(false);
        strongPanel.setVisible(false);

        switch (strength) {
            case LOW:
                lowPanel.setVisible(true);
                lowPanel.setBackground(Color.RED);
                break;
            case MID:
                lowPanel.setVisible(true);
                midPanel.setVisible(true);
                lowPanel.setBackground(Color.RED);
                midPanel.setBackground(Color.YELLOW);
                break;
            case STRONG:
                lowPanel.setVisible(true);
                midPanel.setVisible(true);
                strongPanel.setVisible(true);
                lowPanel.setBackground(Color.RED);
                midPanel.setBackground(Color.YELLOW);
                strongPanel.setBackground(Color.GREEN);
                break;
            case EMPTY:
                break;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Strength Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 20, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 20, 165, 25);
        panel.add(passwordField);

        JPanel lowPanel = new JPanel();
        lowPanel.setBounds(100, 50, 165, 10);
        lowPanel.setVisible(false);
        panel.add(lowPanel);

        JPanel midPanel = new JPanel();
        midPanel.setBounds(100, 65, 165, 10);
        midPanel.setVisible(false);
        panel.add(midPanel);

        JPanel strongPanel = new JPanel();
        strongPanel.setBounds(100, 80, 165, 10);
        strongPanel.setVisible(false);
        panel.add(strongPanel);

        passwordField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                updateStrengthIndicator();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                updateStrengthIndicator();
            }

            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                updateStrengthIndicator();
            }

            private void updateStrengthIndicator() {
                String password = new String(passwordField.getPassword());
                Strength strength = checkPasswordStrength(password);
                updateIndicators(lowPanel, midPanel, strongPanel, strength);
            }
        });
    }
}
