import java.awt.*;

public class House {
    private int x, y;

    public House(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawHouse(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        Balloon a = new Balloon(x, y);
        a.drawBalloons(g);
//Blue wall
        g2.setColor(new Color(153, 204, 255));
        int[] xValsWall1 = {x - 160, x + 40, x + 40, x - 160};
        int[] yValsWall1 = {y - 60, y - 60, y + 40, y + 40};
        g2.fillPolygon(xValsWall1, yValsWall1, 4);
        g2.setColor(new Color(192, 192, 192));
        g2.setStroke(new BasicStroke(1));
        for (int i = 0; i < 4; i++) {
            g2.drawLine(x - 160, y - 60 + 20 * (i + 1), x + 40, y - 60 + 20 * (i + 1));
        }
//Flat Roof:
        g2.setColor(new Color(49, 49, 49));
        int[] xValsRoof = {x - 140, x + 180, x + 200, x + 30, x + 20, x - 180};
        int[] yValsRoof = {y - 140, y - 140, y - 40, y - 40, y - 20, y - 20};
        g2.fillPolygon(xValsRoof, yValsRoof, 6);
//Arcs
        g2.setStroke(new BasicStroke(1));
        g2.setColor(new Color(252, 253, 156));
        g2.fillRect(x + 20, y - 20, 160, 20);
        g2.setColor(new Color(153, 204, 255));
        g2.drawLine(x + 20, y - 20, x + 40, y - 20);
        g2.drawLine(x + 20, y - 20, x + 20, y);
        g2.fillArc(x, y - 40, 40, 40, -90, 90);
        g2.setColor(new Color(11, 193, 255));
        g2.fillArc(x + 160, y - 40, 40, 40, -90, -90);
//Yellow wall
        //Top Right:
        g2.setColor(new Color(255, 255, 153));
        int[] xValsWall2 = {x + 100, x + 160, x + 160, x + 40, x + 40};
        int[] yValsWall2 = {y - 180, y - 60, y, y, y - 60};
        g2.fillPolygon(xValsWall2, yValsWall2, 5);

        //Top Left:
        int[] xValsWall3 = {x - 60, x - 20, x - 20, x - 100, x - 100};
        int[] yValsWall3 = {y - 140, y - 100, y - 40, y - 40, y - 100};
        g2.fillPolygon(xValsWall3, yValsWall3, 5);
        g2.setStroke(new BasicStroke(1));
        g2.setColor(new Color(231, 226, 142));
        for (int i = 0; i < 6; i++) {
            g2.drawLine(x - 98, y - 120 + 15 * i, x - 22, y - 120 + 15 * i);
        }

        //arc design on right yellow wall
        for (int j = 0; j < 18; j++) {


            for (int i = 0; i < 12; i++) {
                g2.setColor(new Color(255, 255, 153));
                g2.fillArc(x + 40 + 10 * i, y - 8 - 10 * j, 10, 10, 0, -180);
                g2.setColor(new Color(231, 226, 142));
                g2.drawArc(x + 40 + 10 * i, y - 8 - 10 * j, 10, 10, 0, -180);
            }
            for (int i = 0; i < 11; i++) {
                g2.setColor(new Color(255, 255, 153));
                g2.fillArc(x + 45 + 10 * i, y - 13 - 10 * j, 10, 10, 0, -180);
                g2.setColor(new Color(231, 226, 142));
                g2.drawArc(x + 45 + 10 * i, y - 13 - 10 * j, 10, 10, 0, -180);
            }
        }
//Cover overlap of circle design
        g2.setStroke(new BasicStroke(1));
        //right
        g2.setColor(new Color(11, 193, 255));
        int[] xValsOverlap1 = {x + 116, x + 161, x + 161, x + 140};
        int[] yValsOverlap1 = {y - 188, y - 188, y - 140, y - 140};
        g2.fillPolygon(xValsOverlap1, yValsOverlap1, 4);
        g2.setColor(new Color(49, 49, 49));
        int[] xValsOverlap2 = {x + 140, x + 161, x + 161};
        int[] yValsOverlap2 = {y - 140, y - 140, y - 90};
        g2.fillPolygon(xValsOverlap2, yValsOverlap2, 3);
        //left
        g2.setColor(new Color(11, 193, 255));
        int[] xValsOverlap3 = {x + 39, x + 84, x + 60, x + 39};
        int[] yValsOverlap3 = {y - 188, y - 188, y - 140, y - 140};
        g2.fillPolygon(xValsOverlap3, yValsOverlap3, 4);
        g2.setColor(new Color(49, 49, 49));
        int[] xValsOverlap4 = {x + 35, x + 61, x + 36};
        int[] yValsOverlap4 = {y - 140, y - 140, y - 90};
        g2.fillPolygon(xValsOverlap4, yValsOverlap4, 3);


//Front hexagonal part
        //top
        g2.setColor(new Color(185, 209, 72));
        g2.fillRect(x + 70, y + 20, 60, 80);
        g2.setStroke(new BasicStroke(4));
        g2.drawRect(x + 70, y + 20, 60, 80);
        g2.setColor(new Color(111, 111, 111));
        g2.setStroke(new BasicStroke(1));
        for (int i = 0; i < 5; i++) {
            g2.drawLine(x + 70, y + 20 + 20 * i, x + 130, y + 20 + 20 * i);

        }
        //bottom
        g2.setColor(new Color(185, 209, 72));
        g2.fillRect(x + 70, y + 108, 60, 50);
        g2.setStroke(new BasicStroke(4));
        g2.drawRect(x + 70, y + 108, 60, 50);
        //right
        g2.setColor(new Color(168, 184, 70));
        g2.setStroke(new BasicStroke(1));
        int[] xValsSlantWallR = {x + 130, x + 160, x + 160, x + 130};
        int[] yValsSlantWallR = {y + 20, y + 20, y + 154, y + 160};
        g2.fillPolygon(xValsSlantWallR, yValsSlantWallR, 4);
        g2.setColor(new Color(111, 111, 111));
        for (int i = 0; i < 5; i++) {
            g2.drawLine(x + 130, y + 20 + 20 * i, x + 160, y + 14 + 20 * i);

        }
        //left
        g2.setColor(new Color(168, 184, 70));
        int[] xValsSlantWallL = {x + 40, x + 70, x + 70, x + 40};
        int[] yValsSlantWallL = {y + 20, y + 20, y + 160, y + 154};
        g2.fillPolygon(xValsSlantWallL, yValsSlantWallL, 4);
        g2.setColor(new Color(111, 111, 111));
        for (int i = 0; i < 5; i++) {
            g2.drawLine(x + 40, y + 14 + 20 * i, x + 70, y + 20 + 20 * i);
        }
        //White lines
        g2.setStroke(new BasicStroke(8));
        g2.setColor(Color.white);
        //top
        g2.drawLine(x + 70, y + 106, x + 130, y + 106);
        g2.drawLine(x + 137, y + 106, x + 157, y + 103);
        g2.drawLine(x + 40, y + 103, x + 70, y + 106);
        //bottom
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(x + 70, y + 130, x + 130, y + 130);
        g2.drawLine(x + 40, y + 127, x + 70, y + 130);
        g2.drawLine(x + 130, y + 130, x + 160, y + 127);
//Left salmon wall
        g2.setStroke(new BasicStroke(1));
        g2.setColor(new Color(255, 180, 152));
        g2.fillRect(x - 150, y + 40, 192, 90);
        g2.setColor(new Color(130, 130, 130));
        for (int i = 1; i < 5; i++) {
            g2.drawLine(x - 150, y + 40 + 20 * i, x + 42, y + 40 + 20 * i);
        }
        g2.setStroke(new BasicStroke(4));
        g2.setColor(Color.white);
        g2.drawLine(x - 160, y + 130, x + 38, y + 130);
//Windows:
        Window topLeft = new Window(x - 75, y - 100, 30, 40);
        topLeft.drawBlinds(g2);
        topLeft.drawWindow(g2);
        topLeft.drawMidline(g2);
        Window topRight = new Window(x + 80, y - 100, 40, 60);
        topRight.drawBlinds(g2);
        topRight.drawWindow(g2);
        topRight.drawMidline(g2);
        Window bottomLeft = new Window(x - 120, y + 60, 40, 40);
        bottomLeft.drawBlinds(g2);
        bottomLeft.drawWindow(g2);
        bottomLeft.drawMidline(g2);
        Window bottomRight = new Window(x + 80, y + 40, 40, 60);
        bottomRight.drawBlinds(g2);
        bottomRight.drawWindow(g2);
        bottomRight.drawMidline(g2);
        g2.setStroke(new BasicStroke(1));
//Slanted Windows:
        SlantedWindow right = new SlantedWindow(x + 137, y + 40, 20, 60, 3);
        right.drawBlinds(g2);
        right.drawSlantWindow(g2);
        SlantedWindow left = new SlantedWindow(x + 43, y + 37, 20, 60, -3);
        left.drawBlinds(g2);
        left.drawSlantWindow(g2);


//Shadows and triangle roofs:
        //Shadow under right roof on right side
        g2.setColor(new Color(138, 189, 240));
        int[] xValsShadow1 = {x + 160, x + 180, x + 160};
        int[] yValsShadow1 = {y - 60, y - 20, y - 10};
        g2.fillPolygon(xValsShadow1, yValsShadow1, 3);
        //part 2: quadrilateral under roof
        g2.setColor(new Color(123, 174, 225));
        int[] xValsShadow2 = {x + 180, x + 200, x + 174, x + 160};
        int[] yValsShadow2 = {y - 20, y - 20, y - 10, y - 10};
        g2.fillPolygon(xValsShadow2, yValsShadow2, 4);

        //Shadow under left roof

        g2.setColor(new Color(138, 189, 240));
        int[] xValsShadow3 = {x + 40, x + 40, x + 26, x + 6, x};
        int[] yValsShadow3 = {y - 60, y - 40, y - 10, y - 10, y - 20};
        g2.fillPolygon(xValsShadow3, yValsShadow3, 5);

        //Triangle Roofs
        g2.setColor(new Color(153, 204, 255));
        Roof rightRoof = new Roof(x, y - 220, 200, 200);
        rightRoof.drawRoof(g2);
        Roof leftRoof = new Roof(x - 120, y - 160, 120, 60);
        leftRoof.drawRoof(g2);

//Trapezoid under right yellow wall
        g2.setColor(new Color(184, 134, 11));
        int[] xValsTrap = {x + 20, x + 180, x + 160, x + 40};
        int[] yValsTrap = {y, y, y + 20, y + 20};
        g2.fillPolygon(xValsTrap, yValsTrap, 4);
//Poles
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(7));
        g2.drawLine(x - 160, y - 16, x - 160, y + 130);
        g2.drawLine(x - 50, y - 16, x - 50, y + 130);
//Foundation
        //left
        g2.setStroke(new BasicStroke(7));
        g2.setColor(new Color(235, 110, 173));
        g2.drawRect(x - 160, y + 136, 198, 16);
        g2.setColor(new Color(74, 34, 0));
        g2.fillRect(x - 160, y + 136, 198, 16);
        //bottom
        g2.fillRect(x + 74, y + 137, 52, 20);
        //left and right
        int[] xValsFoundationL = {x + 44, x + 66, x + 66, x + 44};
        int[] yValsFoundationL = {y + 133, y + 136, y + 156, y + 152};
        g2.fillPolygon(xValsFoundationL, yValsFoundationL, 4);
        int[] xValsFoundationR = {x + 134, x + 156, x + 156, x + 134};
        int[] yValsFoundationR = {y + 136, y + 133, y + 152, y + 156};
        g2.fillPolygon(xValsFoundationR, yValsFoundationR, 4);
        g2.setStroke(new BasicStroke(1));
        g2.setColor(new Color(51, 25, 0));
        for (int i = 0; i < 9; i++) {
            g2.drawLine(x - 160 + 22 * i, y + 151, x - 140 + 22 * i, y + 136);
        }
        for (int i = 0; i < 2; i++) {
            g2.drawLine(x + 44 + 12 * i, y + 151 + 3 * i, x + 54 + 12 * i, y + 135 + 3 * i);
        }
        for (int i = 0; i < 3; i++) {
            g2.drawLine(x + 74 + 17 * i, y + 156, x + 91 + 17 * i, y + 137);
        }
        for (int i = 0; i < 2; i++) {
            g2.drawLine(x + 134 + 12 * i, y + 156 - 3 * i, x + 144 + 12 * i, y + 136 - 3 * i);
        }

//Door
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(8));
        g2.drawLine(x - 25, y + 65, x - 25, y + 125);
        g2.drawLine(x + 15, y + 65, x + 15, y + 125);
        g2.setStroke(new BasicStroke(11));
        g2.setColor(new Color(74, 34, 0));
        g2.fillRect(x - 21, y + 65, 33, 63);
        g2.setColor(Color.white);
        g2.drawLine(x - 25, y + 65, x + 15, y + 65);
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.yellow);
        g2.fillOval(x - 18, y + 95, 6, 6);
//Top Fence
        g2.setStroke(new BasicStroke(3));
        g2.setColor(Color.white);
        g2.drawLine(x - 160, y + 37, x + 40, y + 37);
        g2.drawLine(x - 160, y + 55, x + 40, y + 55);
        for (int i = 0; i < 15; i++) {
            g2.drawLine(x - 155 + 13 * i, y + 37, x - 155 + 13 * i, y + 55);
        }
//Bottom Fence
        g2.drawLine(x - 160, y + 106, x - 50, y + 106);
        for (int i = 0; i < 6; i++) {
            g2.drawLine(x - 160 + 18 * i, y + 106, x - 160 + 18 * i, y + 130);
        }
//Stairs
        g2.setStroke(new BasicStroke(6));
        g2.drawLine(x - 45, y + 130, x - 45, y + 160);
        g2.drawLine(x + 33, y + 130, x + 33, y + 161);
        for (int i = 0; i < 3; i++) {
            g2.drawLine(x - 52, y + 130 + 12 * i, x + 38, y + 130 + 12 * i);
        }
//Chimney
        g2.setColor(new Color(78, 57, 40));
        g2.setStroke(new BasicStroke(1));
        g2.fillRect(x + 11, y - 180, 24, 50);
        g2.fillRect(x + 10, y - 180, 26, 8);
        g2.setColor(new Color(165, 158, 152));
        g2.fillRect(x + 11, y - 130, 24, 5);
    }
}