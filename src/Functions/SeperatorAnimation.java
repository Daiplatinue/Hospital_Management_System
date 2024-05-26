package Functions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class SeperatorAnimation {
    private static final int STEP = 5;
    private final Map<JPanel, Timer> moveTimers = new HashMap<>();

    public void animatePanelHorizontally(JPanel panel, int targetX) {
        if (moveTimers.containsKey(panel) && moveTimers.get(panel).isRunning()) {
            moveTimers.get(panel).stop();
        }

        Timer timer = new Timer(10, (ActionEvent e) -> {
            int currentX = panel.getX();
            if (currentX < targetX) {
                panel.setLocation(Math.min(currentX + STEP, targetX), panel.getY());
            } else if (currentX > targetX) {
                panel.setLocation(Math.max(currentX - STEP, targetX), panel.getY());
            }

            if (currentX == targetX) {
                ((Timer) e.getSource()).stop();
            }
        });

        moveTimers.put(panel, timer);
        timer.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(50, 150, 100, 100);
        panel.setBackground(java.awt.Color.RED);
        frame.add(panel);

        JButton buttonLeft = new JButton("Move Left");
        buttonLeft.setBounds(50, 50, 100, 30);
        buttonLeft.addActionListener(e -> {
            SeperatorAnimation animation = new SeperatorAnimation();
            animation.animatePanelHorizontally(panel, panel.getX() - 50);
        });
        frame.add(buttonLeft);

        JButton buttonRight = new JButton("Move Right");
        buttonRight.setBounds(200, 50, 100, 30);
        buttonRight.addActionListener(e -> {
            SeperatorAnimation animation = new SeperatorAnimation();
            animation.animatePanelHorizontally(panel, panel.getX() + 50);
        });
        frame.add(buttonRight);

        frame.setVisible(true);
    }
}
