import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Notepad extends JFrame {
    private JTextField fileNameTextField;
    private JTextArea textArea;
    private JButton saveButton;
    public Notepad() {

        fileNameTextField = new JTextField();
        textArea = new JTextArea();


        JPanel buttonPanel = new JPanel();

        saveButton = new JButton("Save");


        // Instantiate an action listener to listen for button click events
        NotepadButtonListener buttonListener = new NotepadButtonListener();

        // attach our action listener to the buttons
        saveButton.addActionListener(buttonListener);


        buttonPanel.add(saveButton);


        // set the layout of the JFrame
        this.setLayout(new BorderLayout());


        add(fileNameTextField, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // show the frame
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
    }


    private String getFileName() {
        return fileNameTextField.getText();
    }


    private void readFile(String fileName) {
        Scanner inFile = null;

        try {
            // file reader
            inFile = new Scanner(new FileReader(fileName));

            // clear the text area
            textArea.setText("");

            // copy file
            while (inFile.hasNextLine()) {
                textArea.append(inFile.nextLine());
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("File not found");
        } finally {
            if (inFile != null) {
                inFile.close();
            }
        }
    }

    private void writeFile(String fileName) {
        PrintWriter outFile = null;

        try {
            // file writer
            outFile = new PrintWriter(new FileWriter(fileName));

            outFile.print(textArea.getText());

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("File not found");
        } finally {
            if (outFile != null) {
                outFile.close();
            }
        }
    }


    class NotepadButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = (JButton) e.getSource();

            if (sourceButton.equals(saveButton)) {
                System.out.println("Save button pressed");
                writeFile(getFileName());
            } else {
                System.out.println("Unknown button pressed");
            }
        }
    }


    public static void main(String[] args) {
        // Create the notepad instance
        new Notepad();
    }
}