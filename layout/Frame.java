import javax.swing.*;
import java.awt.*;

public class Frame
{
    void render() {
        JFrame frame = new JFrame();

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        frame.setLayout(new BorderLayout());

        p1.setBackground(Color.ORANGE);
        p2.setBackground(Color.BLUE);
        p3.setBackground(Color.GREEN);
        p4.setBackground(Color.YELLOW);
        p5.setBackground(Color.PINK);

        p3.setLayout(new FlowLayout(FlowLayout.LEADING));
        p3.add(new JButton("Click me!"));
       // JButton button = new JButton("Click me!");
        p3.add(new JButton("Click me!"));
        p3.add(new JButton("Click me!"));

        p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
        p2.add(new JButton("Click me!"));
        p2.add(new JButton("Click me!"));


        p5.setLayout(new GridLayout(4,4));
        p5.add(new JButton("Click me!"));



        frame.add(p1, BorderLayout.EAST);
        frame.add(p2, BorderLayout.WEST);
        frame.add(p3, BorderLayout.NORTH);
        frame.add(p4, BorderLayout.SOUTH);
        frame.add(p5, BorderLayout.CENTER);
        //frame.setResizable(false);
        frame.setTitle("Frame");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
