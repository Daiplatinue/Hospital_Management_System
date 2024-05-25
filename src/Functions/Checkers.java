package Functions;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Checkers {

    public static void emptyFieldChecker() {
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);

        Icon customIcon = null;
        java.net.URL imgURL = Checkers.class.getResource("/Images/alert.gif");
        if (imgURL != null) {
            customIcon = new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file!");
        }

        JOptionPane.showMessageDialog(null,
                "PLEASE FILL OUT BOTH LASTNAME AND PASSWORD FIELDS!",
                "WARNING",
                JOptionPane.WARNING_MESSAGE,
                customIcon);
    }

    public static void unsuccessfullFieldChecker() {
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);

        Icon customIcon = null;
        java.net.URL imgURL = Checkers.class.getResource("/Images/alert.gif");
        if (imgURL != null) {
            customIcon = new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file!");
        }

        JOptionPane.showMessageDialog(null,
                "LASTNAME OR PASSWORD IS INCORRECT!",
                "WARNING",
                JOptionPane.WARNING_MESSAGE,
                customIcon);
    }

    public static void successFieldChecker() {
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);

        Icon customIcon = null;
        java.net.URL imgURL = Checkers.class.getResource("/Images/sucess.png");
        if (imgURL != null) {
            customIcon = new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file!");
        }

        JOptionPane.showMessageDialog(null,
                "WELCOME TO AURORA WELLNESS PAVILION!",
                "SUCCESS",
                JOptionPane.WARNING_MESSAGE,
                customIcon);
    }

}
