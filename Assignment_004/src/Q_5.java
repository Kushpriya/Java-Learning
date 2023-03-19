/*Given a zero-based permutation nums (0-indexed), build an array ans of
the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
*/
import java.util.Arrays;

public class Q_5
{
    public static void main(String[] args)
    {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans)); // [0, 1, 2, 4, 5, 3]
    }

    public static int[] buildArray(int[] nums)
    {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

