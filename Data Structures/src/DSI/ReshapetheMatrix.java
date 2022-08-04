package DSI;

import java.util.Arrays;
//Input: mat = [[1,2],[3,4]], r = 1, c = 4
public class ReshapetheMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                       {1,2},
                       {3,4}
         };
        System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));
    }



    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int columns = nums[0].length;

        if ((rows * columns) != (r*c)) return nums;

        int[][] output = new int[r][c];
        int row_num = 0;
        int column_num = 0;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                output[row_num][column_num] = nums[i][j];
                column_num++;

                if (column_num == c){
                    column_num = 0;
                    row_num++;
                }
            }
        }
        return output;
    }
}
