import java.awt.*;

public class Sun {
    int x, y, diameter;

    public Sun(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.diameter = radius;
    }

    public void drawSun(Graphics2D g2) {
        g2.setColor(Color.yellow);
        g2.fillOval(x, y, diameter, diameter);
//        g2.setStroke(new BasicStroke(7));
//        g2.drawLine(x + diameter /2, y + diameter + 20, x + diameter/2, y + diameter/2 - 55);
//        g2.drawLine(x - 20, y + diameter/2, x + diameter + 20, y + diameter/2);
//        g2.drawLine(x - 5, y + diameter + 5, x + diameter + 5, y  - 5);
//        g2.drawLine(x - 5, y - 5, x + diameter + 5, y + diameter + 5);
    }

}
