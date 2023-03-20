import javax.swing.*;
import java.awt.*;

public class Swing
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        //JFrame frame = new JFrame("Hello World");
        frame.setTitle("Hello World from setTitle");
        frame.setResizable(false); //disable resize
        frame.setSize(400,400);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me!");
        button.setBounds(10,10,100,40);
        frame.add(button);

        frame.setSize(400,400);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);

        JTextField text = new JTextField("");
        text.setBounds(10,60,100,30);
        frame.add(text);

        frame.setVisible(true);//toggle visibility
        
    }
}
