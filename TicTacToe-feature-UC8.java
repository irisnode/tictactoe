public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human Turn");
            } else {
                System.out.println("Computer Turn");
            }

            // Placeholder for move logic

            // Placeholder for win/draw checking
            // gameOver = true;

            // Switch turns
            isHumanTurn = !isHumanTurn;

            // Temporary condition to stop infinite loop
            gameOver = true;
        }

        System.out.println("Game Over");
    }
}