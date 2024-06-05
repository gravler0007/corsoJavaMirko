import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Gino", "password123");
        Tablet tablet = new Tablet("Ciro", "code567");
        Tablet tablet2 = new Tablet("Pino", "code980");

        smartphone.avviaApplicazione("Whatsapp");
        tablet.avviaApplicazione("Instagram");
        tablet2.avviaApplicazione("YouTube");

        // Creazione dei resoconti digitali
        ArrayList<ResocontoDigitale> resoconti = new ArrayList<>();
        resoconti.add(new ResocontoDigitale(smartphone.nome, smartphone.password));
        resoconti.add(new ResocontoDigitale(tablet.nome, tablet.password, tablet.getPunti(), tablet.getId()));
        resoconti.add(new ResocontoDigitale(tablet2.nome, tablet2.password, tablet2.getPunti(), tablet2.getId()));

        // Stampa dei resoconti digitali
        for (ResocontoDigitale resoconto : resoconti) {
            resoconto.stampaResoconto();
        }
    }
}