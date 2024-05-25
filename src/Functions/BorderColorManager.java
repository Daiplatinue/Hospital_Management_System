package Functions;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class BorderColorManager {

    private final JTextField[] components;

    public BorderColorManager(JTextField[] components) {
        this.components = components;
    }

    public void setErrorBorderColor() {
        setBorderColor(Color.RED);
    }

    public void setSuccessBorderColor() {
        setBorderColor(Color.GREEN);
    }

    public void setEmptyBorderColor() {
        setBorderColor(new Color(255, 189, 46));
    }

    public void resetBorderColor() {
        setBorderColor(Color.LIGHT_GRAY);
    }

    private void setBorderColor(Color color) {
        for (JTextField component : components) {
            component.setBorder(BorderFactory.createLineBorder(color));
        }

    }
}
