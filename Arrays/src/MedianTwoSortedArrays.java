public class MedianTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        int lengthNums1 = nums1.length;
        int lengthNums2 = nums2.length;
        int n = lengthNums1 + lengthNums2;
        int[] nums = new int[lengthNums1 + lengthNums2];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, lengthNums2);
        System.out.println(findMedian(nums, n));

    }
    public static double findMedian(int[] nums, int n){
        double median = 0;
        if (n % 2 != 0){
            median = (double)nums[n/2];
        }
        else {
            double sum = (double) nums[n/2] + (double) nums[n/2 - 1];
            median = sum / 2;
        }
        return median;
    }

}
