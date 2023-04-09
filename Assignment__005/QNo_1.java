/*Build a multithreaded application that demonstrates the use of synchronization.
 Build whatever you want, that should include the multithreading concept.
 */
public class QNo_1
{
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);

        t.setName("My Thread");
        System.out.println("After Name Change: " + t);

        try {
            for (int n = 0; n <=10; n++)
            {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");
        }
    }
}

