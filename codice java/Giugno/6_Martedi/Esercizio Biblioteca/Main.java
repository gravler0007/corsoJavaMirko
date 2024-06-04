import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        boolean cicla = true;
        int scelta, numeroCopie;
        String titolo, restituisci, elimina;

        biblioteca.aggiungiLibro("Biancaneve e i sette cani", 1);
        biblioteca.aggiungiLibro("20.000 seghe sotto i mari", 1);
        biblioteca.aggiungiLibro("Il signore degli agnelli", 1);
        biblioteca.aggiungiLibro("Tetanic", 1);
        biblioteca.aggiungiLibro("The gay after tomorrow", 1);

        while (cicla) {
            menu();

            scelta = scannerN.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il titolo del libro: ");
                    titolo = scannerS.nextLine();
                    System.out.print("Inserisci il numero di copie: ");
                    numeroCopie = scannerN.nextInt();
                    biblioteca.aggiungiLibro(titolo, numeroCopie);
                    waitInput(scannerS);
                    clearDisplay();
                    break;

                case 2:
                    System.out.print("Inserisci il titolo del libro da prendere in prestito: ");
                    titolo = scannerS.nextLine();
                    biblioteca.prestaLibro(titolo);
                    waitInput(scannerS);
                    clearDisplay();
                    break;

                case 3:
                    System.out.print("Inserisci il titolo del libro da restituire: ");
                    restituisci = scannerS.nextLine();
                    biblioteca.restituisciLibro(restituisci);
                    waitInput(scannerS);
                    clearDisplay();
                    break;

                case 4:
                    System.out.print("Inserisci il titolo del libro da eliminare: ");
                    elimina = scannerS.nextLine();
                    biblioteca.eliminaLibro(elimina);
                    waitInput(scannerS);
                    clearDisplay();
                    break;

                case 5:
                    biblioteca.stampaLibri();
                    waitInput(scannerS);
                    clearDisplay();
                    break;
                
                case 0:
                    cicla = false;
                    System.out.println("Addio!");
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
        
        scannerN.close();
        scannerS.close();

    }

    public static void menu() {
        System.out.println("\nScegli un'opzione:\n");
        System.out.println("1. Aggiungi un libro");
        System.out.println("2. Presta un libro");
        System.out.println("3. Restituisci un libro");
        System.out.println("4. Elimina un libro");
        System.out.println("5. Stampa libri");
        System.out.println("0. Esci\n");
        System.out.print("Inserisci la tua scelta: ");
    }

    static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void waitInput(Scanner scanner) {
        System.out.print("\n\nPress Any Key To Continue...");
        scanner.nextLine();
    }

}
