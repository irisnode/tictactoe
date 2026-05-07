import java.util.Random;

public class TicTacToeToss {
    // Game State Variables
    private String player1Name = "Player 1";
    private String player2Name = "Player 2";
    private String currentPlayer;
    private char p1Symbol;
    private char p2Symbol;

    public void performToss() {
        System.out.println("--- Starting Tic-Tac-Toe Setup ---");
        
        // 1. Random Number Generation
        Random random = new Random();
        int tossResult = random.nextInt(2); // 0 or 1

        // 2. Conditional Logic (FIXED)
        if (tossResult == 0) {
            // Player 1 starts → gets X
            currentPlayer = player1Name;
            p1Symbol = 'X';
            p2Symbol = 'O';
            System.out.println(player1Name + " won the toss!");
        } else {
            // Player 2 starts → gets X
            currentPlayer = player2Name;
            p2Symbol = 'X';
            p1Symbol = 'O';
            System.out.println(player2Name + " won the toss!");
        }

        // 3. Display initial state
        displayGameStartInfo();
    }

    private void displayGameStartInfo() {
        System.out.println("Assignments:");
        System.out.println(player1Name + ": " + p1Symbol);
        System.out.println(player2Name + ": " + p2Symbol);
        System.out.println("First turn: " + currentPlayer);
        System.out.println("----------------------------------\n");
    }

    public static void main(String[] args) {
        TicTacToeToss game = new TicTacToeToss();
        game.performToss();
    }
}