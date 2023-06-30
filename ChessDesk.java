import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessDesk extends JPanel
{
    JFrame frame;
    public ChessDesk(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        int length = 8;
        int width = frame.getWidth() / length;
        int height = frame.getHeight() / length;

        for(int i = 0; i <= length; i++)
        {
            for(int j = 0; j <= length; j++)
            {
                if((i + j) % 2 == 0) g.setColor(Color.WHITE);
                else g.setColor(Color.BLACK);
                g.fillRect(i * width, j * height, width, height);
            }
        }
    }
}
