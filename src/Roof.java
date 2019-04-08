import java.awt.*;

public class Roof {
    private int x, y, width, height;

    public Roof(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawRoof(Graphics2D g2) {
        int slope = (height / (width - width / 2)) * 20;
        int[] xVals = {x + width / 2, x + width, x + width - 20, x + width / 2, x + 20, x};
        int[] yVals = {y, y + height, y + height, y + slope, y + height, y + height};
        g2.fillPolygon(xVals, yVals, 6);

//        g2.drawLine(xCenter + width / 2, yCenter, xCenter + width, yCenter + height); //draws right upper
//        g2.drawLine(xCenter + width / 2, yCenter + slope, xCenter + width - 20, yCenter + height); //draws right lower
//        g2.drawLine(xCenter + width - 20, yCenter + height, xCenter + width, yCenter + height); //draws right line
//        g2.drawLine(xCenter + width / 2, yCenter, xCenter, yCenter + height); //draws left upper
//        g2.drawLine(xCenter + width / 2, yCenter + slope, xCenter + 20, yCenter + height); //draws left lower
//        g2.drawLine(xCenter + 20, yCenter + height, xCenter, yCenter + height); //draws left line
    }
}

