public class Main {
    public static void main(String[] args) {
        
        Poliziotto poliziotto = new Poliziotto(1234, "Mirko PannaCotta");
        Detective detective = new Detective(5678, "Flavio CottaPanna");

        System.out.println("Informazioni del Poliziotto:");
        poliziotto.descriviLavoro();
        System.out.println("Matricola: " + poliziotto.ottieniMatricola());
        System.out.println("Nome: " + poliziotto.getNome());

        System.out.println("\nInformazioni del Detective:");
        detective.descriviLavoro();
        System.out.println("Matricola: " + detective.ottieniMatricola());
        System.out.println("Nome: " + detective.getNome());

    }
}
