import javax.swing.*;

public  class AddNumberSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton button = new JButton("Add");
        JLabel label1 = new JLabel("First Number:");
        JLabel label2 = new JLabel("Second Number:");
        JLabel label3 = new JLabel("Result:");



        t1.setBounds(150,10,100,40);
        frame.add(t1);
        t2.setBounds(150,60,100,40);
        frame.add(t2);
        t3.setBounds(150,160,100,40);
        frame.add(t3);

        button.setBounds(50,110,80,40);
        frame.add(button);

        label1.setBounds(5,10,90,40);
        frame.add(label1);
        label2.setBounds(5,60,150,40);
        frame.add(label2);
        label3.setBounds(20,160,90,40);
        frame.add(label3);

        button.addActionListener(e ->
                {

                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    int sum = num1 + num2;
                   // System.out.println("" + sum);
                    t3.setText("" + sum);
                });



        frame.setResizable(false);
        frame.setTitle("Calculator");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);




    }

}
