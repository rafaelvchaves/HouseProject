import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HouseMain {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Rafael Chaves");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 1200;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height + 24));

        BackgroundPanel backgroundPanel = new BackgroundPanel(width, height);
        HousePanel housePanel = new HousePanel(width, height);
        housePanel.setFocusable(true);
        housePanel.grabFocus();
        frame.add(housePanel);
        frame.pack();
        frame.setVisible(true);
        animate(housePanel);
    }

    public static void animate(final HousePanel panel) {
        Timer timer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setyCenter(panel.getyCenter() - 1);
                panel.repaint();
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();
    }
}
