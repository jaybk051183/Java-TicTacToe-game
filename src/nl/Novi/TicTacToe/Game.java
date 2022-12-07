package nl.Novi.TicTacToe;

public class Game {
     //Game klasse houdt bij wie er op dit moment aan het spelen zijn, wie de spelers zijn, of iemand het spel heeft gewonnen.
    // Velden -Bijhouden wie het spel aan het spelen zijn:
    private Player playerA;
    private Player playerB;
    private Player currentPlayer;

    //Constructor - De waarde van speler A en B initialiseren op het moment dat een nieuwe game wordt aangemaakt.
    public Game(Player playerA, Player playerB){
        //De waarde van de velden omzetten naar de waarde van de input:
        this.playerA = playerA;
        this.playerB = playerB;
        //Bepalen wie het spel mag beginnen door de currentplayer te updaten:
        currentPlayer = playerA;
    }
    public Player getCurrentPlayer(){
        return currentPlayer;
    }

    //Methodes die het gedrag bevatten van deze klasse: Wat voor input heeft de switchPlayer nodig hier?
    //De methode heeft toegang tot de velden in de klasse waarin het zelf zit.
    //Omdat de velden bijhouden wie de huidige speler is, kun je een output void gebruiken.
    //Logica ombouwen om te wisselen van speler.
    public void switchPlayer(){
        //Vergelijking van de locatie van currentPlayer in het geheugen van de computer.
        if (currentPlayer == playerA){
            currentPlayer = playerB;
        }
        else{
            currentPlayer = playerA;
        }
    }

    //Methode om te kijken of de speler heeft gewonnen:
    //Methode heeft zelfde logica als hasPlayerWon in Main.jave echter met andere parameters, omdat we in onze Game klasse al toegang hebben tot currentPlayer.
    //Output type is een booelan om de speler wel of niet heeft gewonnen.
    public boolean hasPlayerWon(Field[] board){
        //Token van de speler opslaan in een variabele door de getToken methode aan te roepen van de huidige speler.
        String currentPlayerToken = currentPlayer.getToken();
        //Plak de logica uit main.java om te kijken wanneer een player heeft gewonnen.
        if(board[0].getToken() == currentPlayerToken && board[1].getToken() == currentPlayerToken && board[2].getToken() == currentPlayerToken) {
            return true;
        }
        if(board[3].getToken() == currentPlayerToken && board[4].getToken() == currentPlayerToken && board[5].getToken() == currentPlayerToken) {
            return true;
        }
        if(board[6].getToken() == currentPlayerToken && board[7].getToken() == currentPlayerToken && board[8].getToken() == currentPlayerToken) {
            return true;
        }
        if(board[0].getToken() == currentPlayerToken && board[3].getToken() == currentPlayerToken && board[6].getToken() == currentPlayerToken) {
            return true;
        }
        if(board[1].getToken() == currentPlayerToken && board[4].getToken() == currentPlayerToken && board[7].getToken() == currentPlayerToken) {
            return true;
        }
        if(board[2].getToken() == currentPlayerToken && board[5].getToken() == currentPlayerToken && board[8].getToken() == currentPlayerToken) {
            return true;
        }
        if(board[0].getToken() == currentPlayerToken && board[4].getToken() == currentPlayerToken && board[8].getToken() == currentPlayerToken) {
            return true;
        }
        if(board[6].getToken() ==currentPlayerToken && board[4].getToken() == currentPlayerToken && board[2].getToken() == currentPlayerToken) {
            return true;
    }
        return false;
    }
}

//Code in main klasse aanpassen om gebruik te maken van de game en field klasse.
