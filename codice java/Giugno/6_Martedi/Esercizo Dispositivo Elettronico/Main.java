public class Main {
    
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Gino", "password123");
        Tablet tablet = new Tablet("Ciro", "code567");
        Tablet tablet2 = new Tablet("Ciro", "code567");

        smartphone.avviaApplicazione("Whatsapp");
        tablet.avviaApplicazione("Instagram");
        tablet2.avviaApplicazione("YouTube");

        // Creazione dei resoconti digitali
        ResocontoDigitale resocontoSmartphone = new ResocontoDigitale(smartphone.nome, smartphone.password, null, null);
        ResocontoDigitale resocontoTablet = new ResocontoDigitale(tablet.nome, tablet.password, tablet.getPunti(),tablet.getId());

        // Stampa dei resoconti digitali
        resocontoSmartphone.stampaResoconto();
        resocontoTablet.stampaResoconto();
    }
}