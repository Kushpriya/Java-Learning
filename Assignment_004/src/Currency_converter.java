import java.util.Scanner;
public class Currency_converter
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get amount in Nepali Rupees
        System.out.print("Enter Amount in Nepali Rupees: ");
        double nrs = sc.nextDouble();

        // convert to USD
        double usd = nrs / 135.03;

        // display result
        System.out.printf("Equivalent USD: %.2f", usd);
    }
}
