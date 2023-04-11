import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TowerOfHanoi extends JFrame {

    private JLabel moveCountText;
    private int moveCount;
    private Tower tower1, tower2, tower3;

    public TowerOfHanoi(int numDisks) {
        moveCount = 0;
        tower1 = new Tower("A", numDisks);
        tower2 = new Tower("B", 0);
        tower3 = new Tower("C", 0);

        setTitle("Tower of Hanoi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel towerPanel = new JPanel(new GridLayout(1, 3));
        towerPanel.add(tower1);
        towerPanel.add(tower2);
        towerPanel.add(tower3);
        contentPane.add(towerPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton solveButton = new JButton("Solve");
        solveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                solve(tower1.getNumDisks(), tower1, tower2, tower3);
                JOptionPane.showMessageDialog(null, "Puzzle solved in " + moveCount + " moves.");
            }
        });
        buttonPanel.add(solveButton);
        moveCountText = new JLabel("0 moves");
        buttonPanel.add(moveCountText);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void solve(int numDisks, Tower source, Tower auxiliary, Tower destination) {
        if (numDisks > 0) {
            solve(numDisks - 1, source, destination, auxiliary);
            move(source, destination);
            solve(numDisks - 1, auxiliary, source, destination);
        }
    }

    private void move(Tower source, Tower destination) {
        Disk disk = source.removeDisk();
        destination.addDisk(disk);
        moveCount++;
        updateMoveCount();
    }

    private void updateMoveCount() {
        moveCountText.setText(moveCount + " moves");
    }

    public static void main(String[] args) {
        int numDisks = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of disks:"));
        new TowerOfHanoi(numDisks);
    }
}

class Tower extends JPanel {

    private String name;
    private int numDisks;
    private Stack<Disk> disks;

    public Tower(String name, int numDisks) {
        this.name = name;
        this.numDisks = numDisks;
        disks = new Stack<Disk>();
        setPreferredSize(new Dimension(120, 300));
    }

    public void addDisk(Disk disk) {
        disks.push(disk);
        numDisks++;
        repaint();
    }

    public Disk removeDisk() {
        if (numDisks == 0) {
            return null;
        } else {
            numDisks--;
            repaint();
            return disks.pop();
        }
    }

    public int getNumDisks() {
        return numDisks;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(20, 270, 80, 10);
        for (int i = 0; i < numDisks; i++) {
            Disk disk = disks.get(i);

            int width = 20 + 10 * disk.getSize();
            int height = 10;
            int x = 60 - width / 2;
            int y = 260 - 10 * i;
            g.setColor(disk.getColor());
            g.fillRect(x, y, width, height);
        }
    }

    public String toString() {
        return name;
    }
}

class Disk {

    private int size;
    private Color color;

    public Disk(int size) {
        this.size = size;
        switch (size) {
            case 1:
                color = Color.RED;
                break;
            case 2:
                color = Color.BLUE;
                break;
            case 3:
                color = Color.GREEN;
                break;
            case 4:
                color = Color.ORANGE;
                break;
            case 5:
                color = Color.MAGENTA;
                break;
            case 6:
                color = Color.CYAN;
                break;
            default:
                color = Color.BLACK;
        }
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }
}

class Stack<E> {

    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public E get(int i) {
        if (i < 0 || i >= 9) {
            throw new IndexOutOfBoundsException("Index out of range: " + i);
        }

        Stack<E> tempStack = new Stack<E>();
        E element = null;

        // Pop elements from original stack onto temp stack until we reach the desired index
        for (int j = 0; j <= i; j++) {
            element = pop();
            tempStack.push(element);
        }

        // Retrieve the element at the desired index
        element = tempStack.pop();

        // Push the popped elements back onto the original stack
        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }

        return element;
    }

}
