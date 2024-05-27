public class Main {
    public static void main(String[] args) {
        
        Agente poliziotto = new Poliziotto("Mirko", "Pannacotta", "123");
        Agente detective = new Dective("Flavio", "Cottapanna", "678");

        poliziotto.descriviLavoro();
        System.out.println();
        detective.descriviLavoro();

    }
}
