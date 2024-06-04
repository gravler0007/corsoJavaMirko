public class Main {
    public static void main(String[] args) {
        
        Fanteria fanteria = new Fanteria("Mirko", "fortissimo", "dio del debug");
        Artiglieria artiglieria = new Artiglieria("Flavio", "scarsissimo", "Dio del bug");

        System.out.println("Informazioni del Fanteria:");
        fanteria.combatti();
        System.out.println("Specializzazione: " + fanteria.specializzazione());
        fanteria.usaEquipaggiamentoSpeciale();

        System.out.println("\nInformazioni dell'Artiglieria:");
        artiglieria.combatti();
        System.out.println("Specializzazione: " + artiglieria.specializzazione());
        artiglieria.usaEquipaggiamentoSpeciale();
    }
}
