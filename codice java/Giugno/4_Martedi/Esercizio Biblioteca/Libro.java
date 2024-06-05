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
        // viene creato non ha copie in prestito)
        this.copieInPrestito = 0;
    }

    // metodi getter e setter per il libro
    public int getCopieDisponibili() {
        return this.copieDisponibili;
    }

    public int getCopieInPrestito() {
        return this.copieInPrestito;
    }

    public String getTitolo() {
        return this.titolo;
    }

    // funzione per prestare uno specifico libro
    public void presta() {
        // se ho almeno un libro da prestare
        if (this.copieDisponibili > 0) {
            // diminuisco le copie disponibili e aumento quelle in prestito
            this.copieDisponibili--;
            this.copieInPrestito++;
        } else {
            System.out.println("\nNessuna copia presente del libro '" + this.titolo + "' prendere in prestito");
        }
    }

    // funzione per restituire uno specifico libro
    public void restituisci() {
        // se ho una copia in prestito di un determinato libro
        if (this.copieInPrestito > 0) {
            // diminuisco le copie in prestito e aumento quelle disponibili
            this.copieDisponibili++;
            this.copieInPrestito--;
        } else {
            System.out.println("\n Nessuna copia in prestito del libro '" + this.titolo + "' da dover restituire");
        }
    }

}