import java.awt.*;

public class Window {
    private int x, y, width, height;

    public Window(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawWindow(Graphics2D g2) {
        g2.setColor(new Color(235, 110, 173));

        g2.drawRect(x, y, width, height);
    }

    public void drawMidline(Graphics2D g2) {

        g2.setColor(new Color(235, 110, 173));
        g2.drawLine(x, y + height / 2, x + width, y + height / 2);
    }

    public void drawBlinds(Graphics2D g2) {
        g2.setColor(new Color(255, 215, 0));
        g2.fillRect(x, y, width, height * 3 / 4);
        g2.setColor(Color.black);
        g2.fillRect(x, y + height * 3 / 4, width, height * 1 / 4);
    }
}
