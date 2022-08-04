public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(countDigits(nums));
    }

    public static int countDigits(int[] array){
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            String numberString = Integer.toString(array[i]);
            if (numberString.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
