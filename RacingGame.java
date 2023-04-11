import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RacingGame extends JPanel implements ActionListener {

    private Timer timer;
    private Car playerCar;
    private Car[] opponentCars;
    private int opponentSpeed;
    private int score;
    private boolean isGameOver;

    public RacingGame() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.WHITE);

        playerCar = new Car(350, 500, Color.RED);
        opponentCars = new Car[] {
                new Car(100, -100, Color.BLUE),
                new Car(300, -400, Color.GREEN),
                new Car(500, -700, Color.YELLOW)
        };
        opponentSpeed = 5;
        score = 0;
        isGameOver = false;

        timer = new Timer(10, this);
        timer.start();

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    playerCar.moveLeft();
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    playerCar.moveRight();
                }
            }
        });
        setFocusable(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (!isGameOver) {
            for (Car car : opponentCars) {
                car.moveDown(opponentSpeed);
                if (car.intersects(playerCar)) {
                    isGameOver = true;
                }
            }
            if (!isGameOver) {
                score++;
                if (score % 50 == 0) {
                    opponentSpeed++;
                }
            }
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        playerCar.draw(g);
        for (Car car : opponentCars) {
            car.draw(g);
        }
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("Score: " + score, 20, 30);
        if (isGameOver) {
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("GAME OVER", 300, 300);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Racing Game");
        RacingGame game = new RacingGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Car {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Car(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.width = 50;
        this.height = 100;
        this.color = color;
    }

    public void moveLeft() {
        if (x > 50) {
            x -= 10;
        }
    }

    public void moveRight() {
        if (x < 700) {
            x += 10;
        }
    }

    public void moveDown(int speed) {
        y += speed;
        if (y > 700) {
            y = -100;
            x = (int)(Math.random() * 600) + 100;
        }
    }

    public boolean intersects(Car other) {
        Rectangle r1 = new Rectangle(x, y, width, height);
        Rectangle r2 = new Rectangle(other.x, other.y, other.width, other.height);
        return r1.intersects(r2);
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

