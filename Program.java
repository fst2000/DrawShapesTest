import java.awt.Color;
import javax.swing.JFrame;

public class Program
{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Rectangle");
        frame.setBackground(Color.BLACK);
        frame.setSize(500, 500);
        MyRectangle p = new MyRectangle(frame,100, 100);
        frame.add(p);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}