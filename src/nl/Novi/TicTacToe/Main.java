package nl.Novi.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create a board.
        //Board to be replaced by Field after creating Field class separately.
        Field[] board = new Field[9];

        //Integer.toString(i) = parameter  = token

        for(int i = 0; i < 9; i++) {
            board[i] = new Field(Integer.toString(i));
            System.out.println(board[i]);
        }

        printBoard(board);

        Player playerA = new Player("Kruisje", "X");
        Player playerB = new Player("Rondje", "O");

        //Create a Game object:
        Game game = new Game(playerA, playerB);

        //Remove currentPlayer as the logic is in the game object.
        /*Player currentPlayer = playerA;*/
        //As currentPlayer is now often used we need to make a getter in the Game object.

        boolean hasWon = false;

        while(hasWon == false) {
            //Allow player to place a symbol and then display board.
            //From game we can now ask de currentPlayer and its name.
            System.out.println("\n Voer een cijfer van 0 t/m 8 in om op het bord " + game.getCurrentPlayer().getName() + " te zetten");
            Scanner userInput = new Scanner(System.in);
            int selectedField = userInput.nextInt();

            //Update field with the value of the current player by using the setToken method and give as parameters the values of game.getCurrentPlayer()

            String currentPlayerToken = game.getCurrentPlayer().getToken();
            board[selectedField].setToken(currentPlayerToken);

            printBoard(board);

            //Check if player has won.
            hasWon = game.hasPlayerWon(board);

            //Ensure the score of the player is being updated if the player has won:

            if(hasWon){
                game.getCurrentPlayer().setScore(1);
            }
            //Call the game.switchPlayer method to switch from players.
            game.switchPlayer();
        }
        System.out.println("Speler " + playerA.getName() + " heeft een score van " + playerA.getScore());
        System.out.println("Speler " + playerB.getName() + " heeft een score van " + playerB.getScore());
    }

    // Methods:
    //Replace string array by Field array:
    public static void printBoard (Field[] board) {
        for(int i = 0; i < board.length; i++) {
            System.out.print(board[i].getToken()); //Call the getToken method.

            boolean isEndOfRow = (i + 1) % 3 == 0;
            boolean isLastField = i == 8;

            if(isEndOfRow == false) {
                System.out.print(" | ");
            }
            if(isEndOfRow && !isLastField){
                System.out.println("\n ________");
            }
        }
    }
    //SwitchPlayer and hasPlayerWon method not required anymore as two separate classes created for this.
/*    public static Player switchPlayer(Player currentPlayer, Player playerA, Player playerB ){
        if(currentPlayer.getToken() == "X"){
            return playerB;
        }
        else {
            return playerA;
        }
    }
    public static boolean hasPlayerWon(String[] board, String currentPlayer){
        //Horizontal option to win.
        if(board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) {
            return true;
        }
        if(board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) {
            return true;
        }
        if(board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }
        if(board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) {
            return true;
        }
        if(board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) {
            return true;
        }
        if(board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }
        if(board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) {
            return true;
        }
        if(board[6] == currentPlayer && board[4] == currentPlayer && board[2] == currentPlayer) {
            return true;
        }
        return false;
    }*/
}