import java.util.Arrays;
//Good for items less than 50
//Good to find the correctness and running time of iterative algorithm
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        int key;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            int j = i - 1;

            while ((j >= 0) && array[j] > key){
                array[j + 1] = array[j];
                // j represents already sorted elements and they are compared to the new key.
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
