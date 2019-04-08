import java.awt.*;

public class SlantedWindow {
    //Slanted Windows:
    private int x, y, width, height, slope;

    public SlantedWindow(int x, int y, int width, int height, int slope) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.slope = slope;
    }

    public void drawSlantWindow(Graphics2D g2) {
        g2.setColor(new Color(235, 110, 173));
        g2.setStroke(new BasicStroke(4));
        int[] xVals = {x, x + width, x + width, x};
        int[] yVals = {y, y - slope, y - slope + height, y + height};
        g2.drawPolygon(xVals, yVals, 4);

    }

    public void drawBlinds(Graphics2D g2) {
        g2.setColor(Color.black);
        int[] xVals2 = {x, x + width, x + width, x};
        int[] yVals2 = {y + height * 1 / 4, y + height * 1 / 4 - slope, y + height * 1 / 4 - slope + height * 3 / 4, y + height * 1 / 4 + height * 3 / 4};
        g2.fillPolygon(xVals2, yVals2, 4);
        g2.setColor(new Color(255, 215, 0));
        int[] xVals1 = {x, x + width, x + width, x};
        int[] yVals1 = {y, y - slope, y - slope + height * 2 / 5, y + height * 2 / 5};
        g2.fillPolygon(xVals1, yVals1, 4);
    }
}
