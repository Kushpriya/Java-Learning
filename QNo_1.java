public class QNo_1 {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        QNo_1 obj = new QNo_1();

        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                obj.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count: " + obj.count);
    }
}
