//Write the java program to  calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci_seriesQ_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to calculate: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + n + " numbers:");
        for (int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
