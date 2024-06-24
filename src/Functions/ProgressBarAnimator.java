package Functions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public final class ProgressBarAnimator {

    private Timer progressBarTimer;
    private int currentProgress = 0;
    private static final int ANIMATION_STEP = 1;
    private static final int ANIMATION_DELAY = 10;

    private JTextField username, email, password, answer, contact, lastname, firstname;
    private JComboBox<String> type;
    private JProgressBar jProgressBar1;

    public int calculateProgress() {
        final int[] targetProgress = {0};

        JTextField[] fields = {lastname, firstname, username, email, password, answer, contact};
        int[] scores = {5, 5, 5, 10, 5, 7, 7, 5};
        Color[] colors = {Color.RED, Color.GREEN};

        for (int i = 0; i < fields.length; i++) {
            if (!fields[i].getText().equals("")) {
                targetProgress[0] += scores[i];
                fields[i].setBorder(BorderFactory.createLineBorder(colors[1]));
            } else {
                targetProgress[0] -= scores[i];
                fields[i].setBorder(BorderFactory.createLineBorder(colors[0]));
            }
        }

        if (type.getSelectedIndex() != -1) {
            targetProgress[0] += 60;
        }

        if (progressBarTimer != null && progressBarTimer.isRunning()) {
            progressBarTimer.stop();
        }

        progressBarTimer = new Timer(ANIMATION_DELAY, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentProgress < targetProgress[0]) {
                    currentProgress = Math.min(currentProgress + ANIMATION_STEP, targetProgress[0]);
                } else if (currentProgress > targetProgress[0]) {
                    currentProgress = Math.max(currentProgress - ANIMATION_STEP, targetProgress[0]);
                }

                jProgressBar1.setValue(currentProgress);

                if (currentProgress >= 80) {
                    jProgressBar1.setForeground(Color.GREEN);
                } else if (currentProgress >= 50) {
                    jProgressBar1.setForeground(Color.YELLOW);
                } else {
                    jProgressBar1.setForeground(Color.RED);
                }

                if (currentProgress == targetProgress[0]) {
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        progressBarTimer.start();
        return targetProgress[0];
    }

    public void setLastname(JTextField lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(JTextField firstname) {
        this.firstname = firstname;
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public void setEmail(JTextField email) {
        this.email = email;
    }

    public void setPassword(JTextField password) {
        this.password = password;
    }

    public void setAnswer(JTextField answer) {
        this.answer = answer;
    }

    public void setContact(JTextField contact) {
        this.contact = contact;
    }

    public void setType(JComboBox<String> type) {
        this.type = type;
    }

    public void setProgressBar(JProgressBar jProgressBar1) {
        this.jProgressBar1 = jProgressBar1;
    }
}
