import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        if (!isValidRow(board)) {
            return false;
        }
        if (!isValidColumn(board)) {
            return false;
        }
        if (!isValidSubgrid(board)) {
            return false;
        }
        return true;
    }

    public static boolean isValidRow(char[][] board) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {

                    boolean added = set.add(board[i][j]);
                    if (!added) {
                        return false;
                    }
                }
            }
            set.clear();
        }
        return true;
    }

    public static boolean isValidColumn(char[][] board) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != '.') {

                    boolean added = set.add(board[j][i]);
                    if (!added) {
                        return false;
                    }
                }
            }
            set.clear();
        }
        return true;
    }

    public static boolean isValidSubgrid(char[][] board) {
        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0; j < board[i].length; j = j + 3) {
                Set<Character> set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i + k][j + l] != '.') {

                            boolean added = set.add(board[i + k][j + l]);
                            if (!added) {
                                return false;
                            }
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}   