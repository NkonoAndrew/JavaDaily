package DSI;

import java.util.Arrays;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
public class One_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
            
        }
        return null;
    }
}
