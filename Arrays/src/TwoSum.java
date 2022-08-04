import java.util.Arrays;

/**
 * Given an array of integers and an integer target,
 * return indices of the two numbers such that they add up to the target
 * nums  = 2,7,11, 15
 * target = 9
 * Output = [0, 1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int [] array, int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
