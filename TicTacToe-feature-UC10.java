public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeFullBoard();
        System.out.println("Is the game a draw? " + isDraw());
    }

    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static void initializeFullBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 'X'; 
            }
        }
    }
}