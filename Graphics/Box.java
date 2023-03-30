import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Box extends JPanel implements ActionListener
{
    int boxX = 10;
    int boxY =10;
    Box()
    {
        JButton button = new JButton("Move!!");
        add(button);
    }
    protected  void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(boxX, boxY, 100, 50);

        g.setColor(Color.BLACK);
        g.fillRect(120, 10, 50, 50);
        
        g.setColor(Color.ORANGE);
        g.fillOval(10, 70, 80, 50);
    }
    @Override
        public void  actionPerformed(ActionEvent e)
        {
        System.out.println("click vayo");
        boxX+=10;
        boxY+=10;
        repaint();
    }

}
