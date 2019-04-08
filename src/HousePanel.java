import javax.swing.*;
import java.awt.*;

/**
 * Created by Rafael Chaves on 10/2/17.
 */

public class HousePanel extends JPanel {
    int xCenter;
    int yCenter;

    int xBackgroundCenter;
    int yBackgroundCenter;

    public int getyCenter() {
        return yCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }


    public HousePanel(int width, int height) {
        setSize(width, height);
        xCenter = getWidth() / 2;
        yCenter = getHeight() * 3 / 4;

        xBackgroundCenter = getWidth() / 2;
        yBackgroundCenter = getHeight() * 3 / 4;
    }

    public void paintComponent(Graphics g) {
        Background background = new Background(xBackgroundCenter, yBackgroundCenter);
        background.drawBackground(g);

        House house = new House(xCenter, yCenter);
        house.drawHouse(g);

//        Balloon a = new Balloon(xCenter, yCenter);
//        a.drawBalloons(g);
    }
}
