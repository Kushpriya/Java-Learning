public class NumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        Thread t = new Thread(np);
        t.start();
    }
}
