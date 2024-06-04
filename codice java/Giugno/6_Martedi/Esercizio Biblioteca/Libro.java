public class Libro {
    // ogni libro deve avere un titolo, il numero di copie disponibili, il numero di
    // copie in prestito
    private String titolo;
    private int copieDisponibili;
    private int copieInPrestito;

    public Libro(String titolo, int copieDisponibili) {
        this.titolo = titolo;
        this.copieDisponibili = copieDisponibili;
        // il this è superfluo, ma lo tengo per scelta stilistica (ogni libro quando
        // viene creato non ha copi in prestito)
        this.copieInPrestito = 0;
    }

    // metodi getter e setter per il libro
    public int getCopieDisponibili() {
        return copieDisponibili;
    }

    public int getCopieInPrestito() {
        return copieInPrestito;
    }

    public String getTitolo() {
        return titolo;
    }

    // funzione per prestare uno specifico libro
    public void presta() {
        // se ho almeno un libro da prestare
        if (copieDisponibili > 0) {
            // diminuisco le copie disponibili e aumento quelle in prestito
            copieDisponibili--;
            copieInPrestito++;
        } else {
            System.out.println("\nNessuna copia presente del libro '" + this.titolo + "' prendere in prestito");
        }
    }

    // funzione per restituire uno specifico libro
    public void restituisci() {
        // se ho una copia in prestito di un determinato libro
        if (copieInPrestito > 0) {
            // diminuisco le copie in prestito e aumento quelle disponibili
            copieDisponibili++;
            copieInPrestito--;
        } else {
            System.out.println("\n Nessuna copia in prestito del libro '" + this.titolo + "' da dover restituire");
        }
    }

}