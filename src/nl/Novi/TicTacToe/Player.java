package nl.Novi.TicTacToe;

public class Player {
    //velden of attributen om de waarden van de parameters name en token
    //het is binnen java gebruikelijk om attributen private te maken ipv public
    private String name;
    private String token;
    private int score;

    //constructors
    public Player(String name, String token){
        //waarden van de parameters toewijzen aan de velden
        this.name = name;
        this.token = token;
        this.score = 0;
    }

    //methodes of functies (getters/setters om bij een stukje data te komen - dit zijn methodes die de waarde van een veld (private) kunnen uitlezen)
    public int getScore(){
        return score;
    }
    public String getName(){
        return name;
    }
    public String getToken(){
        return token;
    }
    public void setScore(int extraPoints){
        score = score + extraPoints;
    }
}
