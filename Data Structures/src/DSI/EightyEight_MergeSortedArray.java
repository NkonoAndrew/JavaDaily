package DSI;

import java.util.Arrays;

//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
public class EightyEight_MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        System.out.println(Arrays.toString(mergeSortedArray(nums1, nums2)));

    }

    public static int[] mergeSortedArray(int[] nums1, int[] nums2){
        int m = 3;
        int n = 3;

        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);

        return nums1;

    }

}
