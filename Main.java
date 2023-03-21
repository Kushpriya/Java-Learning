import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Frame");
        JTextField username = new JTextField("Enter your username");
       username.setBounds(10,10,200,40);
        frame.add(username);

        /*JLabel label = new JLabel("Name:");
        label.setBounds(10,200,100,40);
        frame.add(label);*/

        JTextField password = new JTextField("Enter your password");
        password.setBounds(10,55,200,40);
        frame.add(password);

        JButton button = new JButton("Login");
        button.setBounds(55,140,100,40);
        frame.add(button);

        JButton button1 = new JButton("Forget Password?");
        button1.setBounds(100,100,150,30);
        frame.add(button1);
        button.setBackground(Color.green);

        String[] fruits = {"Apple","Orange","Grapes"};
        JComboBox comboBox = new JComboBox(fruits);
        comboBox.setBounds(250,10,150,40);
        frame.add(comboBox);

        frame.setResizable(false);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}