
    import javax.swing.*;
import java.awt.*;

class FlowerPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw flower petals
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int petalRadius = 50;

        for (int i = 0; i < 6; i++) {
            int x = (int) (centerX + petalRadius * Math.cos(i * Math.PI / 3));
            int y = (int) (centerY + petalRadius * Math.sin(i * Math.PI / 3));
            g.setColor(Color.RED); // Petal color
            g.fillOval(x - 20, y - 20, 40, 40); // Petal shape
        }

        // Draw flower center
        g.setColor(Color.YELLOW); // Center color
        g.fillOval(centerX - 20, centerY - 20, 40, 40); // Center shape
    }
}

public class FlowerDrawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flower Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowerPanel flowerPanel = new FlowerPanel();
        frame.add(flowerPanel);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

    

