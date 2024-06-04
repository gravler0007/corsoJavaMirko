public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.aggiungiLibro("Il signore dei fornelli", 15);
        biblioteca.aggiungiLibro("20.000 seghe sotto i mari", 25);
        biblioteca.aggiungiLibro("Mirko vs. pannacotta, i due fregni", 2);

        biblioteca.stampaLibri();

        biblioteca.prestaLibro("Mirko vs. pannacotta, i due fregni");
        biblioteca.prestaLibro("Mirko vs. pannacotta, i due fregni");
        biblioteca.prestaLibro("Mirko vs. pannacotta, i due fregni"); //errore?

        biblioteca.stampaLibri();

        biblioteca.restituisciLibro("Mirko vs. pannacotta, i due fregni");
        biblioteca.restituisciLibro("Mirko vs. pannacotta, i due fregni");
        biblioteca.restituisciLibro("Mirko vs. pannacotta, i due fregni"); //errore?

        biblioteca.stampaLibri();

        biblioteca.eliminaLibro("Il signore dei fornelli");

        biblioteca.stampaLibri();
    }

}