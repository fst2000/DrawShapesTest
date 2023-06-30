import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Program
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            JFrame frame = new JFrame("Rectangle");
            frame.setBackground(Color.BLACK);
            frame.setSize(500, 500);
            ChessDesk chess = new ChessDesk(frame);
            frame.add(chess);

            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}