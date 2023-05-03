import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CrissCrossGame extends JFrame {
    private JButton[][] buttons;
    private char currentPlayer;

    public CrissCrossGame() {
        buttons = new JButton[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void initializeBoard() {
        JPanel panel = new JPanel(new GridLayout(3, 3));
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                JButton button = new JButton("-");
                button.setFont(new Font("Arial", Font.PLAIN, 48));
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (((JButton) e.getSource()).getText().equals("-")) {
                            button.setText(Character.toString(currentPlayer));
                            if (checkForWin()) {
                                JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
                                initializeBoard();
                            } else if (isBoardFull()) {
                                JOptionPane.showMessageDialog(null, "It's a tie!");
                                initializeBoard();
                            } else {
                                changePlayer();
                            }
                        }
                    }
                });
                buttons[row][col] = button;
                panel.add(button);
            }
        }
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Criss Cross Game");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getText().equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin() {
        // check rows
        for (int row = 0; row < 3; row++) {
            if (buttons[row][0].getText().equals(currentPlayer) && buttons[row][1].getText().equals(currentPlayer) && buttons[row][2].getText().equals(currentPlayer)) {
                return true;
            }
        }

        // check columns
        for (int col = 0; col < 3; col++) {
            if (buttons[0][col].getText().equals(currentPlayer) && buttons[1][col].getText().equals(currentPlayer) && buttons[2][col].getText().equals(currentPlayer)) {
                return true;
            }
        }

        // check diagonals
        if (buttons[0][0].getText().equals(currentPlayer) && buttons[1][1].getText().equals(currentPlayer) && buttons[2][2].getText().equals(currentPlayer)) {
            return true;
        }
        if (buttons[0][2].getText().equals(currentPlayer) && buttons[1][1].getText().equals(currentPlayer) && buttons[2][0].getText().equals(currentPlayer)) {
            return true;
        }

        return false;
    }

    public void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public static void main(String[] args) {
        new CrissCrossGame();
    }
}
