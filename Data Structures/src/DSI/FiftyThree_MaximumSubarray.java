package DSI;
//Given an integer array nums, find the contiguous subarray
//(containing at least one number) which has the largest sum and return its sum.
//A subarray is a contiguous part of an array.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6
public class FiftyThree_MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        System.out.println(Kadane(nums));
    }

    public static int maxSubArray(int[] nums) {

        //Initialize a variable maxSubarray = -infinity to keep track of the best subarray. We need to
        // use negative infinity, not 0, because it is possible that there are only negative numbers in the array.
        int maxSubArray = Integer.MIN_VALUE;

        //Use a for loop that considers each index of the array as a starting point.
        for (int i = 0; i < nums.length ; i++) {

            //For each starting point, create a variable currentSubarray = 0.
            //Then, loop through the array from the starting index, adding each
            // element to currentSubarray. Every time we add an element it represents
            // a possible subarray - so continuously update maxSubarray to contain
            // the maximum out of the currentSubarray and itself.
            int currentSubarray = 0;
            for (int j = i; j < nums.length ; j++) {
                currentSubarray += nums[j];
                maxSubArray = Math.max(maxSubArray, currentSubarray);
            }
        }
        return maxSubArray;
    }

    public static int Kadane(int[] nums){
        // Initialize our variables using the first element.
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];

        //start with second element

        for (int i = 1; i < nums.length ; i++) {
            int num = nums[i];

            // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(currentSubarray, maxSubarray);
        }
        return maxSubarray;
    }
}
