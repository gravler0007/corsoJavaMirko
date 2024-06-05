import java.util.concurrent.atomic.AtomicInteger;
import java.util.Locale;
import java.util.Random;

public class Tablet extends DispositivoDiBase {

    // https://docs.oracle.com/javase%2F8%2Fdocs%2Fapi%2F%2F/java/util/concurrent/atomic/AtomicInteger.html
    private static AtomicInteger counterId = new AtomicInteger(1);
    private int id;
    private double punti;
    Random random;

    public Tablet(String nome, String password) {
        super(nome, password);
        this.id = counterId.getAndIncrement();
        this.punti = unaCifraSignificativa();

    }

    @Override
    public void avviaApplicazione(String nomeApp) {
        System.out.println("Sto avviando l'appicazione '" + nomeApp + "' su tablet!");
        System.out.println("Creazione dell'utente con Punti: '" + punti + "' e Id: '" + id + "'");
    }

    public double getPunti() {
        return punti;
    }

    public int getId() {
        return id;
    }

    private double unaCifraSignificativa(){
        random = new Random();
        double puntiRandom = random.nextDouble() * 100; // Genera un numero casuale tra 0 e 100
        String puntiToString = String.format(Locale.US,"%.2f", puntiRandom); // Format a una cifra decimale significativa utilizzando "Locale.US" per mantenere il punto come separatore
        double puntiDouble = Double.parseDouble(puntiToString);
        return puntiDouble;
    }
    
}
