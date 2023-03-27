/*given array [4,6,9,2,12,24,-1] ,find the max and min element from it and display the output.*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 6, 9, 2, 12, 24, -1};

        int maxElem = arr[0];
        int minElem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
            if (arr[i] < minElem) {
                minElem = arr[i];
            }
        }

        System.out.println("The maximum element is: " + maxElem);
        System.out.println("The minimum element is: " + minElem);
    }
}
