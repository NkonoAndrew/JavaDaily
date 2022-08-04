package DSI;
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
public class Search2DMatrix{
    public static void main(String[] args) {
       int[][] matrix = {
               {1, 3, 5, 7},
               {10, 11, 16, 20},
               {23, 30, 34, 60}
       };

        int[][] matrixII = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        //System.out.println(searchMatrix(matrix, 3));
        System.out.println(binarySearchMatrix(matrixII, 1));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean binarySearchMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = (rows * columns) - 1;

        while (left <= right){
            int midpoint = left + (right - left) / 2;
            int midpoint_value = matrix[midpoint/columns][midpoint%columns];
            if (target == midpoint_value){
                return true;
            }
            else if (target < midpoint_value){
                right = midpoint - 1;
            }
            else if(target > midpoint_value){
                left = midpoint + 1;
            }

        }
        return false;
    }
}
