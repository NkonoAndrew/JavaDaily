public class ConsecutiveOnes {
    public static void main(String[] args) {
        int [] array = {1, 1, 1, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(Ones(array));
    }

    public static int Ones(int[] array){

        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 1)
            //increment the count by 1
                count += 1;
            else {
                //find the current max
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        return maxcount;
    }
}
