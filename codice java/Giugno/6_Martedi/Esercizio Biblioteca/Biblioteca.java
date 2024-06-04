import java.util.ArrayList;

public class Biblioteca implements GestioneLibri, VisualizzazioneLibri{

    private ArrayList<Libro> libri;

    // conservo i libri nella lista della biblioteca, ogni lista avrà due elementi, il titolo e il numero di copie
    public Biblioteca() {
        this.libri = new ArrayList<>();
    }

    @Override
    public void prestaLibro(String titolo) {
        for (Libro libro : libri) {
            // se il titolo del libro che sto scansionando è uguale al titolo che sto
            // passando come parametro
            if (libro.getTitolo().equals(titolo)) {
                // presto il libro ed esco
                libro.presta();
                return;
            }
        }
        System.out.println("\nIl libro " + titolo + " non è presente nella biblioteca. Siete pregati di aggiungerlo");
    }

    @Override
    public void restituisciLibro(String titolo) {
        for (Libro libro : libri) {
            // se il titolo del libro che sto scansionando è uguale al titolo che sto
            // passando come parametro
            if (libro.getTitolo().equals(titolo)) {
                // presto il libro ed esco
                libro.restituisci();
                return;
            }
        }
        System.out.println("\nIl libro " + titolo + " non è presente nella biblioteca. Siete pregati di aggiungerlo");
    }

    // aggiungi libro
    @Override
    public void aggiungiLibro(String titolo, int copie) {
        // Aggiungo alla lista il nuvo libro ed il numero di copie;
        libri.add(new Libro(titolo, copie));
    }

    // stampa libri
    @Override
    public void stampaLibri() {
        System.out.println("\n\nLibri presenti in biblioteca: ");
        for (Libro libro : libri) {
            System.out.println(libro.getTitolo() + " - Copie disponibili: " + libro.getCopieDisponibili());
        }
    }

    // funzione per eliminare un libro
    @Override
    public void eliminaLibro(String titolo) {
        for (int i = 0; i < libri.size(); i++) {
            Libro libro = libri.get(i);
            if (libro.getTitolo().equals(titolo)) {
                System.out.println("\nIl libro '" + libro.getTitolo() + "' è stato eliminato dalla libreria ");
                libri.remove(i);
                return;
            }
        }
        System.out.println("\nIl libro " + titolo + " non è presente nella biblioteca. Siete pregati di aggiungerlo");
    }

}
