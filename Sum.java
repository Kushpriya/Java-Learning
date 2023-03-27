/* find the sum of element of array using while loop*/

public class Sum
{
    public static void main(String[] args) {
        int[] arr = {4, 6, 9, 2, 12, 24, -1};

        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        System.out.println("The sum of elements in the array is: " + sum);
    }
}
