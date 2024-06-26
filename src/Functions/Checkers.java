package Functions;

import Database.DBConnection;
import LoginForm.LoginDashboard;
import java.awt.*;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class Checkers {

    private static Icon loadIcon(String path) {
        try {
            URL imgURL = Checkers.class.getResource(path);
            if (imgURL != null) {
                return new ImageIcon(imgURL);
            } else {
                noAccountFieldChecker("PATH NOT FOUND: " + path);
                return null;
            }
        } catch (Exception e) {
            noAccountFieldChecker("ERROR: " + e.getMessage());
            return null;
        }
    }

    public static void emptyFieldChecker(String message) {
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);

        Icon customIcon = loadIcon("/Images/alert.gif");
        if (customIcon == null) {
            JOptionPane.showMessageDialog(null,
                    "ICON NOT FOUND!",
                    "ICON LOADING ERROR!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null,
                message,
                "WARNING",
                JOptionPane.WARNING_MESSAGE,
                customIcon);
    }

    public static void noAccountFieldChecker(String message) {
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);

        Icon customIcon = loadIcon("/Images/alert.gif");
        if (customIcon == null) {
            JOptionPane.showMessageDialog(null,
                    "ICON NOT FOUND!",
                    "ICON LOADING ERROR!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null,
                message,
                "WARNING",
                JOptionPane.WARNING_MESSAGE,
                customIcon);
    }

    public static void unsuccessfullFieldChecker(String message) {
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);

        Icon customIcon = loadIcon("/Images/alert.gif");
        if (customIcon == null) {
            JOptionPane.showMessageDialog(null,
                    "ICON NOT FOUND!",
                    "ICON LOADING ERROR!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null,
                message,
                "WARNING",
                JOptionPane.WARNING_MESSAGE,
                customIcon);
    }

    public static void successFieldChecker(String message) {
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);

        Icon customIcon = loadIcon("/Images/sucess.png");
        if (customIcon == null) {
            JOptionPane.showMessageDialog(null,
                    "ICON NOT FOUND!",
                    "ICON LOADING ERROR!",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null,
                message,
                "WARNING",
                JOptionPane.WARNING_MESSAGE,
                customIcon);
    }

}
