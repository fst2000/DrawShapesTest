import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyRectangle extends JPanel
{
    JFrame frame;
    int width;
    int height;

    public MyRectangle(JFrame frame, int width, int height) {
        this.frame = frame;
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect((frame.getWidth() - width) / 2, (frame.getHeight() - height) / 2, width, height);
    }
}
