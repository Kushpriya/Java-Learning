/*Take a number as input and print the multiplication table for it.
The multiplication table should start from 1 to 10. The output should be on format like this
Suppose user gave 5 as a input:
5 x 1 = 5
5 x 2 = 10
…. (repeat)
5 x 10 = 50
*/
import java.util.Scanner;

public class Multiplication_tableQ_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The multiplication of:" +num);

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
