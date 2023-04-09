/*Build the counter application using java swing.
It should contain 2 buttons to increase/decrease counters and one Label
to view the current counter number. Initial number must be 1.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QNo_2 extends JFrame {
    private int counter = 1;
    private JLabel counterLabel;

    public QNo_2()
    {

        counterLabel = new JLabel(String.valueOf(counter));
        counterLabel.setFont(new Font("Arial", Font.BOLD, 50));
        counterLabel.setHorizontalAlignment(JLabel.CENTER);

        JButton increaseButton = new JButton("Increase");
        increaseButton.setBounds(100,10,200,50);
        add(increaseButton);
        Font font = new Font("Arial",Font.BOLD,30);
        increaseButton.setFont(font);

        increaseButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                synchronized(this)
                {
                    counter++;
                    counterLabel.setText(String.valueOf(counter));
                }
            }
        });

        JButton decreaseButton = new JButton("Decrease");
        decreaseButton.setBounds(100,250,200,50);
        add(decreaseButton);
        Font font1 = new Font("Arial",Font.BOLD,30);
        decreaseButton.setFont(font1);

        decreaseButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                synchronized(this)
                {
                    if (counter > 1)
                    {
                        counter--;
                        counterLabel.setText(String.valueOf(counter));
                    }
                }
            }
        });

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(counterLabel, BorderLayout.CENTER);

        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new QNo_2();
    }
}
