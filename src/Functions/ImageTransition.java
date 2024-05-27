import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class ImageTransition extends JFrame {

    private JLabel imageLabel;
    private Timer timer;
    private int currentIndex = 0;
    private ImageIcon[] images;
    private float alpha = 0.0f;
    private boolean fadeIn = true;

    public ImageTransition() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Image Transition");
        setSize(400, 400);

        // Initialize images
        images = new ImageIcon[]{
                new ImageIcon(getClass().getResource("/LoginSlideshow/h1.png")),
                new ImageIcon(getClass().getResource("/LoginSlideshow/h3.png"))
                // Add more images as needed
        };

        imageLabel = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();

                // Clear the previous image
                g2d.clearRect(0, 0, getWidth(), getHeight());

                // Draw the current image with alpha
                if (images[currentIndex] != null) {
                    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
                    g2d.drawImage(images[currentIndex].getImage(), 0, 0, getWidth(), getHeight(), null);
                }

                g2d.dispose();
            }
        };
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // Set up timer for transition
        timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fadeIn) {
                    alpha += 0.02f;
                    if (alpha >= 1.0f) {
                        alpha = 1.0f;
                        fadeIn = false;
                        currentIndex = (currentIndex + 1) % images.length;
                    }
                } else {
                    alpha -= 0.02f;
                    if (alpha <= 0.0f) {
                        alpha = 0.0f;
                        fadeIn = true;
                    }
                }
                repaint();
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageTransition().setVisible(true);
            }
        });
    }
}
