import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Date;
import java.sql.Time;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessDesk extends JPanel
{
    JFrame frame;
    int size;
    long startTime = System.currentTimeMillis();
    public ChessDesk(JFrame frame, int size) {
        this.frame = frame;
        this.size = size;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        double passedTime = (double)(System.currentTimeMillis() - startTime);
        int length = 8;
        int width = frame.getWidth();
        int height = frame.getHeight();
        int rectSize = size / length;
        g2d.rotate(passedTime / 1000, width >> 1, height >> 1);
        for(int x = 0; x < length; x++)
        {
            for(int y = 0; y < length; y++)
            {
                if((x + y) % 2 == 0) g2d.setColor(Color.GRAY);
                else g2d.setColor(Color.DARK_GRAY);
                g2d.fillRect(
                    ((width - size) >> 1) + x * rectSize,
                    ((height - size) >> 1) + y * rectSize,
                    rectSize,
                    rectSize);
            }
        }
        frame.repaint();
    }
}
