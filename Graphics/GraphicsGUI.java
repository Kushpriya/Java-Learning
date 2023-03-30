import javax.swing.*;

public class GraphicsGUI
{
    JFrame frame = new JFrame();
    Box box = new Box();
    GraphicsGUI()
    {
        frame.add(box);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
