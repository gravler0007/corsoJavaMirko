
import java.util.ArrayList;
import java.util.List;

public class PiattoSpecialeEasyMirko {
    private static final double BASE_PRICE = 1.00;
    private List<String> ingredientiPrivati;
    private List<String> ingredientiPubblici;
    private static final List<String> ingredientiDisponibili;
    private static final List<Double> prezziIngredienti;

    static {
        ingredientiDisponibili = new ArrayList<>();
        prezziIngredienti = new ArrayList<>();

        ingredientiDisponibili.add("Lattuga");
        prezziIngredienti.add(0.50);

        ingredientiDisponibili.add("Pomodoro");
        prezziIngredienti.add(0.75);

        ingredientiDisponibili.add("Formaggio");
        prezziIngredienti.add(1.00);

        ingredientiDisponibili.add("Panino Normale");
        prezziIngredienti.add(0.50);

        ingredientiDisponibili.add("Panino Sesamo");
        prezziIngredienti.add(0.75);

        ingredientiDisponibili.add("Prosciutto");
        prezziIngredienti.add(1.50);

        ingredientiDisponibili.add("Bacon");
        prezziIngredienti.add(1.25);
    }

    public PiattoSpecialeEasyMirko() {
        this.ingredientiPrivati = new ArrayList<>();
        this.ingredientiPubblici = new ArrayList<>();
    }

    public void aggiungiIngredientePrivato(String ingrediente) {
        if (ingredientiDisponibili.contains(ingrediente)) {
            ingredientiPrivati.add(ingrediente);
        } else {
            System.out.println("Ingrediente privato non valido.");
        }
    }

    public void aggiungiIngredientePubblico(String ingrediente) {
        if (ingredientiDisponibili.contains(ingrediente)) {
            ingredientiPubblici.add(ingrediente);
        } else {
            System.out.println("Ingrediente pubblico non valido.");
        }
    }

    public double calcolaPrezzoTotale() {
        double totale = BASE_PRICE;
        for (String ingrediente : ingredientiPrivati) {
            totale += prezziIngredienti.get(ingredientiDisponibili.indexOf(ingrediente));
        }
        for (String ingrediente : ingredientiPubblici) {
            totale += prezziIngredienti.get(ingredientiDisponibili.indexOf(ingrediente));
        }
        return totale;
    }

    public static void stampaIngredientiDisponibili() {
        System.out.println("Ingredienti disponibili:");
        for (int i = 0; i < ingredientiDisponibili.size(); i++) {
            System.out.println(ingredientiDisponibili.get(i) + ": " + prezziIngredienti.get(i) + " euro");
        }
    }
}
