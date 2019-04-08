import java.awt.*;

public class Background {
    private int x, y;

    public Background(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawBackground(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

//sky
        g2.setColor(new Color(11, 193, 255));
        g2.fillRect(0, 0, x * 2, (y * 4 / 3) * 7 / 8);
//grass
        g2.setColor(new Color(128, 200, 77));
        g2.fillRect(0, (y * 4 / 3) * 7 / 8, x * 2, y * 4 / 3);
//Sun
        Sun sun = new Sun(20, 20, 85);
        sun.drawSun(g2);

    }
}




