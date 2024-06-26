package AdminForm;

import Components.*;
import Forms.*;
import LoginForm.*;
import Swing.*;
import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.IOException;
import javax.swing.*;
import net.miginfocom.swing.*;
import org.jdesktop.animation.timing.*;

public class AdminForm extends javax.swing.JFrame {

    private final MigLayout layout;
    private final MainForm main;
    private final MenuLayout menu;
    private final Animator animator;
    private final WindowSnapshots windowSnapshots;

    public AdminForm() {
        initComponents();

        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        layout = new MigLayout("fill", "0[fill]0", "0[fill]0");
        main = new MainForm();
        menu = new MenuLayout();
        windowSnapshots = new WindowSnapshots(AdminForm.this);
        menu.getMenu().initMoving(AdminForm.this);
        main.initMoving(AdminForm.this);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(main);
        JPanel glassPanel = new JPanel(layout);
        glassPanel.setOpaque(false);
        glassPanel.add(menu, "pos -215 0 100% 100%");
        setGlassPane(glassPanel);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float x = (fraction * 215);
                float alpha;
                if (menu.isShow()) {
                    x = -x;
                    alpha = 0.5f - (fraction / 2);
                } else {
                    x -= 215;
                    alpha = fraction / 2;
                }
                layout.setComponentConstraints(menu, "pos " + (int) x + " 0 100% 100%");
                if (alpha < 0) {
                    alpha = 0;
                }
                menu.setAlpha(alpha);
                menu.revalidate();
            }

            @Override
            public void begin() {
                getGlassPane().setVisible(true);
                windowSnapshots.createSnapshot();
                getContentPane().setVisible(false);
            }

            @Override
            public void end() {
                menu.setShow(!menu.isShow());
                if (!menu.isShow()) {
                    menu.setVisible(false);
                }
                windowSnapshots.removeSnapshot();
                getContentPane().setVisible(true);
            }

        };
        animator = new Animator(350, target);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        animator.setResolution(1);
        menu.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (!animator.isRunning()) {
                        if (menu.isShow()) {
                            animator.start();
                        }
                    }
                }
            }
        });
        main.addEventMenu((ActionEvent ae) -> {
            if (!animator.isRunning()) {
                if (!menu.isShow()) {
                    menu.setVisible(true);
                    animator.start();
                }
            }
        });

        menu.getMenu().addEventMenuSelected((int index) -> {
            switch (index) {
                case 0:
                    main.show(new Form_1());
                    break;
                case 1:
                    main.show(new Form_2());
                    break;
                case 2:
                    try {
                        main.show(new Form_3());
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    main.show(new Form_4());
                    break;
                case 4:
                    main.show(new Form_7());
                    break;
                case 5:
                    main.show(new Form_8());
                    break;
                case 6:
                    main.show(new Form_9());
                    break;
                case 7:
                    UIManager.put("OptionPane.background", Color.white);
                    UIManager.put("Panel.background", Color.white);
                    Icon customIcon = new javax.swing.ImageIcon(AdminForm.this.getClass().getResource("/Images/alert.gif"));
                    int option = JOptionPane.showOptionDialog(null, "ARE YOU SURE YOU WANT TO LOGOUT?", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, customIcon, new String[]{"Yes", "No"}, "Yes");
                    if (option == JOptionPane.YES_OPTION) {
                        new LoginDashboard().setVisible(true);
                        dispose();
                    } else {

                    }
                    break;
                default:
                    break;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 800));
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setOpaque(true);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatLightLaf.registerCustomDefaultsSource("Style");
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    public void showForm(JPanel form) {
        this.setContentPane(form);
        this.revalidate();
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane mainPanel;
    // End of variables declaration//GEN-END:variables
}
