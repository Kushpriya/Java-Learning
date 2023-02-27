import java.util.Random;
import java.util.Scanner;
public class Assignment_003 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPick a number between 1 and 10.");
        System.out.println("You will have 5 turns.");
        int myNumber = getRandomNumber(1,10);
        for(int i = 0;i < 5; i++)
        {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("------------------------------");
            System.out.println("Take a Guess");
            int yourGuess = scan2.nextInt();

            if (yourGuess == myNumber)
            {
                System.out.println("Awesome!!! You guessed  is correct.");
                break;
            }
            else if (yourGuess < myNumber)
            {
                System.out.println( "Your guess is too low!");
                System.out.println("Try again!!!");

            }
            else if (yourGuess > myNumber)
            {
                System.out.println("Your guess is too High!");
                System.out.println("Try again!!!");
            }
            if (i>=4)
            {
                System.out.println("\nOops!!!No turns Left...");
                System.out.println("The number I was thinking of was " + myNumber + "!");

            }
        }
    }

    public static int getRandomNumber(int min ,int max){
        Random random = new Random();
        return random.ints(min,max).findFirst().getAsInt();

    }
}
