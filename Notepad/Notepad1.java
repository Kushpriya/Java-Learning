import javax.swing.*;

public class Notepad1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("NOTEPAD");
        
        JButton button = new JButton("Click me!!");
        button.setBounds(200,400,100,50);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
