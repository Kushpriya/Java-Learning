public class TwoThread
{
        public static void main(String[] args)
        {
            // Create the first thread
            Thread thread1 = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    // Code to be executed by thread 1
                    System.out.println("Thread 1 running...");
                }
            });

            // Create the second thread
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    // Code to be executed by thread 2
                    System.out.println("Thread 2 running...");
                }
            });

            // Start both threads
            thread1.start();
            thread2.start();
        }
    }

