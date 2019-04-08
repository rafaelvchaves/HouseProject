import java.awt.*;

public class Balloon {
    int x, y;

    public Balloon(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawBalloons(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 5; i++) {
            g2.setColor(Color.white);
            g2.drawLine(x + 23, y - 180, x + 3 + 10 * i, y - 240);

        }
        for (int j = 0; j < 7; j++) {

            for (int i = 0; i < 5 + 2 * j; i++) {
                int a = (int) (Math.random() * 6);
                if (a == 0) {
                    g2.setColor(Color.red);
                } else if (a == 1) {
                    g2.setColor(Color.yellow);
                } else if (a == 2) {
                    g2.setColor(Color.orange);
                } else if (a == 3) {
                    g2.setColor(Color.green);
                } else if (a == 4) {
                    g2.setColor(Color.blue);
                } else if (a == 5) {
                    g2.setColor(new Color(238, 130, 238));
                }
                g2.fillOval(x - 7 + 10 * i - 10 * j, y - 265 - 20 * j, 20, 25);
            }
        }
        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 17 - 2 * j; i++) {
                int a = (int) (Math.random() * 6);
                if (a == 0) {
                    g2.setColor(Color.red);
                } else if (a == 1) {
                    g2.setColor(Color.yellow);
                } else if (a == 2) {
                    g2.setColor(Color.orange);
                } else if (a == 3) {
                    g2.setColor(Color.green);
                } else if (a == 4) {
                    g2.setColor(Color.blue);
                } else if (a == 5) {
                    g2.setColor(new Color(238, 130, 238));
                }
                g2.fillOval(x - 67 + 10 * i + 10 * j, y - 405 - 20 * j, 20, 25);
            }
        }
        for (int j = 0; j < 2; j++) {

            for (int i = 0; i < 10 - 2 * j; i++) {
                int a = (int) (Math.random() * 6);
                if (a == 0) {
                    g2.setColor(Color.red);
                } else if (a == 1) {
                    g2.setColor(Color.yellow);
                } else if (a == 2) {
                    g2.setColor(Color.orange);
                } else if (a == 3) {
                    g2.setColor(Color.green);
                } else if (a == 4) {
                    g2.setColor(Color.blue);
                } else if (a == 5) {
                    g2.setColor(new Color(238, 130, 238));
                }
                g2.fillOval(x - 32 + 10 * i + 10 * j, y - 445 - 20 * j, 20, 25);
            }
        }
    }
}