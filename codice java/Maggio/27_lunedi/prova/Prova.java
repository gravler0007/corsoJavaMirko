import java.util.ArrayList;
import java.util.List;

public class Prova{

    public static void main(String[] args) {
        List<Object> elementi = new ArrayList<>();
        elementi.add("Testo");
        elementi.add(10); // Questo causerà un errore di casting
        elementi.add('A'); // Anche questo

        for (Object elemento : elementi) {
            String testo = String.valueOf(elemento); // Tentativo di cast a String
            System.out.println(testo);
        }
    }
}