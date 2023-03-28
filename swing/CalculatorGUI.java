import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener
{
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();

    JButton button = new JButton("Add");


    void rendor ()
    {
        t1.setBounds(10,10,150,50);
        //t1.setText("Priya");
        //System.out.println(t1.getText());
        frame.add(t1);

        t2.setBounds(10,60,150,50);
        frame.add(t2);

        t3.setBounds(10,110,150,50);
        frame.add(t3);

        button.setBounds(20,180,100,50);
        button.addActionListener(this);
        frame.add(button);

        t4.setBounds(180,250,150,50);
        frame.add(t4);

        //button.setBounds(50,180,100,50);
        //button.addActionListener(this);
        //frame.add(button);


        frame.setResizable(false);
        frame.setTitle("Calculator");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //t1.setText("Result");
        //System.out.println("Result");
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int num3 = Integer.parseInt(t3.getText());

        int sum = num1 + num2 + num3;
        System.out.println("Sum = " + sum);
        t4.setText("" +sum);

    }
}
