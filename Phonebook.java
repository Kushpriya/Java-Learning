import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Phonebook extends JFrame implements ActionListener {
    private JTextField nameField, cityField, phoneField;
    private JButton addButton, resetButton, displayButton;
    private ArrayList<Record> records;

    public Phonebook() {
        super("Record Manager");
        records = new ArrayList<>();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("City:"));
        cityField = new JTextField();
        inputPanel.add(cityField);
        inputPanel.add(new JLabel("Phone:"));
        phoneField = new JTextField();
        inputPanel.add(phoneField);

        addButton = new JButton("Add Record");
        addButton.addActionListener(this);
        resetButton = new JButton("Reset Fields");
        resetButton.addActionListener(this);
        displayButton = new JButton("Display Records");
        displayButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(displayButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(inputPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            String city = cityField.getText();
            String phone = phoneField.getText();
            Record record = new Record(name, city, phone);
            records.add(record);
            JOptionPane.showMessageDialog(this, "Record added.");
        } else if (e.getSource() == resetButton) {
            nameField.setText("");
            cityField.setText("");
            phoneField.setText("");
        } else if (e.getSource() == displayButton) {
            StringBuilder sb = new StringBuilder();
            for (Record record : records) {
                sb.append(record.toString());
                sb.append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString());
        }
    }

    public static void main(String[] args) {
        Phonebook recordManager = new Phonebook();
        recordManager.setVisible(true);
    }
}

class Record {
    private String name;
    private String city;
    private String phone;

    public Record(String name, String city, String phone) {
        this.name = name;
        this.city = city;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return name + ", " + city + ", " + phone;
    }
}

