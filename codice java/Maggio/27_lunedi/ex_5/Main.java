public class Main {
    public static void main(String[] args) {

        Agente1 poliziotto = new Poliziotto("Mirko", "Pannacotta", "123");
        Agente1 detective = new Dective("Flavio", "Cottapanna", "678");

        System.out.println("Informazioni del Poliziotto:");
        // System.out.println("Nome: " + poliziotto.getNome());
        // System.out.println("Cognome: " + poliziotto.getCognome());
        // System.out.println("Matricola: " + poliziotto.getMatricola());
        poliziotto.descriviLavoro();
        poliziotto.getNome();

        System.out.println("\nInformazioni del Detective:");
        System.out.println("Nome: " + detective.getNome());
        System.out.println("Cognome: " + detective.getCognome());
        System.out.println("Matricola: " + detective.getMatricola());
        detective.descriviLavoro();

        // poliziotto.descriviLavoro();
        // System.out.println();
        // detective.descriviLavoro();

    }
}
