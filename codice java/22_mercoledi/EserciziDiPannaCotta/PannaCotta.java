import java.util.ArrayList;

public class PannaCotta {
    //attributi
    private String nome;
    private double prezzo;
    private ArrayList<String> ingredienti;

    //devo prendere il nome il prezzo e gli ingredienti contenuti nella lista
    PannaCotta(String nome, double prezzo, ArrayList<String> ingredienti) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.ingredienti = new ArrayList<String>();
    }
    
    // metodi
    // getter e setter per il nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // getter e setter per il prezzo

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    //getter e setter per la lista

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(ArrayList<String> ingredienti) {
        this.ingredienti = ingredienti;
    }
    
    //aggiungo un ingrediente alla determinata istanza di panna cotta che ne fa richiesta
    public void aggiungiIngredienti(String ingrediente) {
        this.ingredienti.add(ingrediente);
    }

   



}