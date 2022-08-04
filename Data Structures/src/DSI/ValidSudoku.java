package DSI;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board =
                {{5, 3, '.', '.', 7, '.', '.', '.','.'}
                ,{6, '.', '.', 1, 9, 5 , '.', '.', '.'}
                ,{'.', 9, 8,'.','.','.','.', 6,'.'}
                ,{8, '.', '.', '.',6,'.','.','.',3}
                ,{4,'.','.',8,'.',3,'.','.',1}
                ,{7,'.','.','.',2,'.','.','.',6}
                ,{'.',6,'.','.','.','.',2,8,'.'}
                ,{'.','.','.',4,1,9,'.','.',5}
                ,{'.','.','.','.',8,'.','.',7,9}};

        isValidSudoku(board);
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9 ; i++) {
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                char value = board[i][j];

                if (value != '.' && !rows.add(board[i][j])){
                    return false;
                }

                if (value != '.' && !columns.add(board[i][j])){
                    return false;
                }

                int rowIndex = 3 * (i/3);
                int columnIndex = 3 * (i%3);



            }
        }


        return true;
    }
}
