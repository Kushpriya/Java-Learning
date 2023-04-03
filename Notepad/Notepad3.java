import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Notepad3 extends JFrame
{
    JTextArea textArea;
    JScrollPane scrollPane;

    public Notepad3() {
        super("Notepad");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                saveFile();
            }
        });
        add(saveButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void saveFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(textArea.getText());
                writer.close();
                System.out.println("File saved successfully!");

                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null)
                {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {

        new Notepad3();
    }
}
