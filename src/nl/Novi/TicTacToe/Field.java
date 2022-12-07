package nl.Novi.TicTacToe;

public class Field {
    //Field klasse voor het bijhouden van de token oftewel het symbool die op een bepaalde plekje op het bord staat.
    //In main.java dient de String array vervangen te worden door een Field array. Dit Field object heeft als voordeel dat de logica erin makkelijk uitgebreid kan worden.
    // Velden of attributen om bij te houden of er ene kruisje of rondje staat:
    private String token;

    //Een boolean om bij te houden of een veld al bezet is of niet:
    private boolean isOccupied;

    // Constructors
    public Field(String token){
        //De waarde van de veld omzetten naar de waarde van ons input.
        this.token = token;
        //Op het moment dat er een nieuw Field object wordt aangemaakt wordt weten we dat hieronder de token nog een keer geupdate kan worden:
        isOccupied = false;
    }

    // Methodes / Functies: setter om de token (met een kruisje of rondje) te updaten.
    public void setToken(String token){
        //Een token kan niet geset worden op het moment dat een veld bezet is:
        if(isOccupied == false){
            //Hier updaten we de waarde van de veld token naar de token die is meegegeven als input naar deze methode.
            this.token = token;
        }
        //Daarna weer de waarde van isOccupied op true zetten.
        isOccupied = true;
    }

    //Een getter aanmaken zodat het van buiten mogelijk is om de waarde van de token uit te lezen.
    public String getToken(){
        return token;
    }
}
