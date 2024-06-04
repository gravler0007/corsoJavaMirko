import java.util.ArrayList;

public class Film {
    private String titolo;
    private int anno;

    // costruttore
    public Film(String titolo, int anno) {
        this.titolo = titolo;
        this.anno = anno;
    }

    public static void main(String[] args) {
        // ma chi me lo fa fare D:

        Film newFilm = new Film("La mia vita ad oggetti (tanti antidepressivi)", 2024);
        Film newFilm2 = new Film("La mia vita ad oggetti (pannacotta is the way)", 2024);

        System.out.println("Titolo:" + newFilm.getTitolo() + " Anno: " + newFilm.getAnno());
        System.out.println("Titolo:" + newFilm2.getTitolo() + " Anno: " + newFilm2.getAnno());

    }

    // GETTER
    public String getTitolo() {
        return titolo;
    }

    public int getAnno() {
        return anno;
    }

    // SETTER
    public void setTitolo(String newTitolo) {
        this.titolo = newTitolo;
    }

    public void setAnno(int newAnno) {
        this.anno = newAnno;
    }

    // _________________________________________________________________________________________________

    public class Utente {
    String id, nome;
    ArrayList<String> film = new ArrayList<String>();

    }
}
