package Components;

import Events.*;
import Models.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
        listMenu1.setFontColor(Color.BLACK);
    }

    public Menu() {
        initComponents();
        listMenu1.setOpaque(false);
        setForeground(Color.BLACK);
        listMenu1.setForeground(Color.BLACK);
        init();
    }

    private void init() {
        listMenu1.addItem(new Model_Menu("1", "Dashboard", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("2", "Create New Account", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("3", "View Accounts", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("4", "View Logs", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("5", "Pending Accounts", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("6", "Archives", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("7", "My Account", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("8", "Logout", Model_Menu.MenuType.MENU));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listMenu1 = new Swing.ListMenu<>();
        profile1 = new Components.Profile();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#25272A"), 0, getHeight(), Color.decode("#25272A"));
        int height = getHeight();
        Path2D.Float f = new Path2D.Float();
        f.moveTo(0, 0);
        f.lineTo(getWidth(), 0);
        f.lineTo(getWidth(), height);
        f.lineTo(0, height);
        f.closePath();

        g2.setPaint(g);
        g2.fill(f);
        g2.setColor(Color.BLACK);
        super.paintChildren(grphcs);
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        profile1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        profile1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.ListMenu<String> listMenu1;
    private Components.Profile profile1;
    // End of variables declaration//GEN-END:variables
}
