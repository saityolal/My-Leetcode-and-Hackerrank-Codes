
import java.util.Arrays;

public class SudokuSolver {

    public static void main(String[] args) {
        //* It is guaranteed that the input board has only one solution.
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static boolean solveSudoku(char[][] board) {
        for(int i=0; i< board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == '.'){
                    for(char num='1'; num<='9'; num++){
                        if(isValid(board, i, j, num)){
                            board[i][j] = num;
                            if(solveSudoku(board)){
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int column, char num){
        //? Check row
        for(int r=0; r<board.length; r++){
            if(board[row][r] == num){
                return false;
            }
        }
        //? Check column
        for(int c=0; c<board.length; c++){
            if(board[c][column] == num){
                return false;
            }
        }

        //? Check 3x3 subgrid
        int startRow = row - row % 3;
        int startColumn = column - column % 3;
        for(int r=startRow; r<startRow+3; r++){
            for(int c=startColumn; c<startColumn+3; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
