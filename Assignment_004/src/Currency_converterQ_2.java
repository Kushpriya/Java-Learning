/*Make the Currency converter program where Nepali rupees are converted to the USD.
 Take the currency difference as 1 USD = 135.03 for conversation.
 */

import java.util.Scanner;

public class Currency_converterQ_2
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
