public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        System.out.println("Is (1, 1) valid? " + isValidMove(1, 1));

        System.out.println("Is (3, 0) valid? " + isValidMove(3, 0));
    }

    static boolean isValidMove(int row, int col) {

        if (row >= 0 && row < 3 && col >= 0 && col < 3) {

            return board[row][col] == '-';
        }

        return false;
    }
}