
public class WordSearch {

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        String target = "AEBCEEDSCFS";
        System.out.println(checkIt(board, target) ? "Yes, Board has all the letters" : "No, Board does not have all the letters");

    }

    public static boolean checkIt(char[][] board, String target) {
        StringBuilder strBoard = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                strBoard.append(board[i][j]);
            }
        }
        for (char targetChar : target.toCharArray()) {
            int index = strBoard.indexOf(String.valueOf(targetChar));
            if (index != -1) {
                strBoard.deleteCharAt(index);

            } else {
                return false;
            }
        }

        return true;

    }
}
