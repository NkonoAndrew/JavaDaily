package DSI;

import java.util.Arrays;
import java.util.HashMap;

//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//Explanation: [9,4] is also accepted.
public class Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
       int[] nums1 = {4,9,5};
       int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums2) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int k = 0;
        for (int m : nums1) {
            int count = map.getOrDefault(m, 0);

            if (count > 0){
                nums1[k++] = m;
                map.put(m, count - 1);
            }

        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
