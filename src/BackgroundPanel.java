import javax.swing.*;
import java.awt.*;
public class BackgroundPanel extends JPanel {

    int xCenter;
    int yCenter;

    public BackgroundPanel(int width, int height) {
        setSize(width, height);
        xCenter = getWidth() / 2;
        yCenter = getHeight() * 3 / 4;
    }

    public void paintComponent(Graphics g) {
        Background background = new Background(xCenter, yCenter);
        background.drawBackground(g);
    }
}
