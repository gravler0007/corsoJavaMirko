import java.util.ArrayList;
import java.util.Scanner;

public class Fabbrica {

    //lista di tutte le pannecotte
    private ArrayList<PannaCotta> listaPannaCotta;

    //costruttore, per ogni oggeto fabbrica mi creo una lista che dovrà contenere le diverse panne cotte
    public Fabbrica() {
        this.listaPannaCotta = new ArrayList<>();
    }

    //passo l'oggetto pannacotta da aggiungere all'istanza che ne fa richiesta
    public void aggiungiPannaCotta(PannaCotta pannacotta){
        this.listaPannaCotta.add(pannacotta);
    }

    public void visualizzaPannaCotta() {
        for (PannaCotta pannaCotta : listaPannaCotta) {
            System.out.println("Nome: " + pannaCotta.getNome() + "\tPrezzo: " + pannaCotta.getPrezzo() + "\tingredienti: "
                    + pannaCotta.getIngredienti());
        }
    }
    
    static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void waitInput(Scanner scanner) {
        System.out.print("\n\nPress Any Key To Continue...");
        scanner.nextLine();
    }

    public static void main(String[] args) {

        Fabbrica fabbrica = new Fabbrica();
        int scelta, ingredientiDaAggiungere=0;
        boolean run = true;
        String nomePannaCotta, ingrediente;
        double prezzoPannaCotta;

        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        while (run) {
            System.out.println("Gestione Fabbrica di Panna Cotta");
            System.out.println("1. Aggiungi");
            System.out.println("2. Visualizza");
            System.out.println("0. Esci\n");
            System.out.print("Scegli: ");
            scelta = scannerN.nextInt();

            switch (scelta) {
                case 0:
                    run = false;
                    break;

                case 1:
                    System.out.print("Nome della panna cotta: ");
                    nomePannaCotta = scannerS.nextLine();
                    System.out.print("\nPrezzo della panna cotta: ");
                    prezzoPannaCotta = scannerN.nextDouble();

                    //creo la nuova istanza di pannacotta
                    PannaCotta newPannacotta = new PannaCotta(nomePannaCotta, prezzoPannaCotta, null);

                    System.out.print("\nQuanti ingredienti devi aggiungere?: ");
                    ingredientiDaAggiungere = scannerN.nextInt();

                    for (int i = 1; i <= ingredientiDaAggiungere; i++) {
                        System.out.print("\nAggiungi l'ingrediente numero " + i + ": ");
                        ingrediente = scannerS.nextLine();

                        //aggiungo l'ingrediente all'array list
                        newPannacotta.aggiungiIngredienti(ingrediente);
                    }
                    
                    //aggiungo la pannacotta all'array list
                    fabbrica.aggiungiPannaCotta(newPannacotta);
                    waitInput(scannerS);
                    clearDisplay();
                    break;

                case 2:
                    fabbrica.visualizzaPannaCotta();
                    waitInput(scannerS);
                    clearDisplay();
                    break;
            
                default:
                    System.out.println("Errore, valore non valido");
                    break;
            }
            


        }
        scannerN.close();
        scannerS.close();
    }
    



}
