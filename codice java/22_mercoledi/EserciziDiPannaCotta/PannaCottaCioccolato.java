import java.util.ArrayList;

public class PannaCottaCioccolato extends PannaCotta {
    
    String cioccolato;


    public PannaCottaCioccolato(String nome, double prezzo, ArrayList<String> ingredienti, String cioccolato) {
        super(nome, prezzo, ingredienti);
        this.cioccolato = cioccolato;
    }
}
