package set1;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {

        // 9 x 9 Sudoku
        char[][] sudoku = {{1, 4, 6, 7, 8, 3, 2, 5, 9},
                {7, 4, 6, 7, 8, 3, 2, 5, 9},
                {9, 4, 6, 7, 8, 3, 2, 5, 9},
                {8, 4, 6, 7, 8, 3, 2, 5, 9},
                {3, 4, 6, 7, 8, 3, 2, 5, 9},
                {2, 4, 6, 7, 8, 3, 2, 5, 9},
                {4, 4, 6, 7, 8, 3, 2, 5, 9},
                {6, 4, 6, 7, 8, 3, 2, 5, 9},
                {5, 4, 6, 7, 8, 3, 2, 5, 9}};

        boolean valid = isValidSudoku(sudoku);
        System.out.println(valid);
    }


    private static boolean checkSubCells(char[][] board) {

        int rowStart = 0;
        int colStart = 0;

        boolean valid = true, done = false;

        do {

            Set<Character> set = new HashSet<>();
            for (int i = rowStart; i < rowStart + 3; i++) {
                for (int j = colStart; j < colStart + 3; j++) {
                    char c = board[i][j];
                    if (!set.contains(c)) {
                        if (c != '.')
                            set.add(c);
                    } else {
                        valid = false;
                        break;
                    }
                }
                if (!valid) {
                    break;
                }
            }

            rowStart += 3;

            if (rowStart > 6) {
                rowStart = 0;
                colStart += 3;

                if (colStart > 6) {
                    done = true;
                }
            }
        } while (valid && !done);

        return valid;
    }

    public static boolean isValidSudoku(char[][] board) {

        boolean valid = true;

        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char c = board[i][j];

                if (!set.contains(c)) {
                    if (c != '.')
                        set.add(c);
                } else {
                    valid = false;
                    break;
                }
            }

            set.clear();

            for (int k = 0; k < 9; k++) {
                char c = board[k][i];
                if (!set.contains(c)) {
                    if (c != '.')
                        set.add(c);
                } else {
                    valid = false;
                    break;
                }
            }
        }
        return valid && checkSubCells(board);
    }
}

    /*  [[".",".",".",".","5",".",".","1","."],
        [".","4",".","3",".",".",".",".","."],
        [".",".",".",".",".","3",".",".","1"],
        ["8",".",".",".",".",".",".","2","."],
        [".",".","2",".","7",".",".",".","."],
        [".","1","5",".",".",".",".",".","."],
        [".",".",".",".",".","2",".",".","."],
        [".","2",".","9",".",".",".",".","."],
        [".",".","4",".",".",".",".",".","."]] */