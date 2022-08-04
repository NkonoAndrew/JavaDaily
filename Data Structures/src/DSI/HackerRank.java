package DSI;
//Given a list of N integers, not necessarily unique,
//find all the elements on the list for which there exists
//exactly one element of the list which is twice the number.

import java.util.Arrays;
import java.util.List;

public class HackerRank {

    public static void twiceTheNumber(List list){
        Integer[] arr = new Integer[list.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < list.size(); i++){
            arr[i] = (Integer) list.get(i);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {

            }
        }

    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        twiceTheNumber(numbers);
    }

}
