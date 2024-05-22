import java.util.ArrayList;
import java.util.Scanner;

public class ProvaProgettiDiGruppo {

    public static void main(String[] args) {

        Scanner scannerS = new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        boolean running = true;
        int choice = 0, numeroDiUtenti = 0, numeroDiDolci = 0;

        Negozio negozio = new Negozio();

       

        while (running) {
            menu();

            choice = scannerN.nextInt();

            switch (choice) {
                case 1:
                    String id, nome;

                    System.out.print("\nQuanti utenti devi inserire?: ");
                    numeroDiUtenti = scannerN.nextInt();

                    for (int i = 1; i <= numeroDiUtenti; i++) {
                        System.out.print("\nInserisci il tuo nome (utente" + i + "): ");
                        nome = scannerS.nextLine();

                        System.out.print("\nInserisci il tuo (id" + i + "): ");
                        id = scannerS.nextLine();

                        Cliente newCliente = new Cliente(id, nome);

                        negozio.aggiungiCliente(newCliente);
                    }

                    

                    for(Cliente cliente : negozio.listaClienti)
                        System.out.println("\nnome: " + cliente.nome + "\tid: " + cliente.id);
                    break;

                case 2:
                    String nomeDolce;
                    double prezzo;

                    System.out.print("\nQuanti dolci devi inserire?: ");
                    numeroDiDolci = scannerN.nextInt();

                    for (int i = 1; i <= numeroDiDolci; i++) {
                        System.out.print("\nInserisci il nome del dolce numero " + i + ": ");
                        nomeDolce = scannerS.nextLine();

                        System.out.print("\nInserisci il tuo prezzo del dolce numero " + i + ": ");
                        prezzo = scannerN.nextDouble();

                        Dolce newDolce = new Dolce(nomeDolce, prezzo);

                        negozio.aggiungiDolce(newDolce);
                    }

                    for (Dolce dolce : negozio.dolciDisponibili)
                        System.out.println("\nnome: " + dolce.nome + "\tprezzo: " + dolce.prezzo);
                    break;

                case 3:
                    //String eliminaDolce;    

                    System.out.print("\nDammi il nome del dolce da eliminare: ");
                    //eliminaDolce = scannerS.nextLine();

                    //negozio.rimuoviDolce(eliminaDolce); //dobbiamo passare un oggetto, ma come facciamo? creiamo un ciclo prima e ce lo salviamo?
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("\n************************");
                    System.out.println("\tOUT");
                    System.out.println("************************\n");
                    running = false;
                    break;

                default:
                    System.out.println("\nGuarda, insersisci un valore valido");
                    waitInput(scannerS);
                    clearDisplay();
                    break;
            }
        }
        scannerS.close();
        scannerN.close();

        //Dolce dolce1 = new Dolce("Muffin", 2.50);

    }
    

    
    
    static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void waitInput(Scanner scanner) {
        System.out.print("\n\nPress Any Key To Continue...");
        scanner.nextLine();
    }

    // Funzione di stampa menù
    static void menu() {
        System.out.println("Select an option: \n");
        System.out.println("1. Aggiungi cliente");
        System.out.println("2. Aggiungi dolce");
        System.out.println("3. Rimuovi dolce");
        System.out.println("4. Gestisci acquisto");
        System.out.println("5. Quit");

        System.out.print("\nChoise: ");
    }




}



class Negozio {
    ArrayList<Dolce> dolciDisponibili;
    ArrayList<Cliente> listaClienti;

    public Negozio() {
        dolciDisponibili = new ArrayList<>();
        listaClienti = new ArrayList<>();
    }

    public void aggiungiDolce(Dolce dolce) {
        dolciDisponibili.add(dolce);
        System.out.println("\nHai aggiunto un " + dolce.nome);
    }
    
    public void rimuoviDolce(Dolce dolce) {

        boolean verifica = dolciDisponibili.contains(dolce); //?

        if (verifica) {
            System.out.println("\nHai eliminato un " + dolce.nome);
            dolciDisponibili.remove(dolce);
        } else {
            System.out.println("\nDolce non trovato");
        }

    }

    public void aggiungiCliente(Cliente cliente) {
        listaClienti.add(cliente);
        System.out.println("\nHai aggiunto il cliente " + cliente.nome);
    }

    public void gestisciAcquisto(String idCliente, Dolce dolce) {
        

        boolean trovatoDolce = false;

        //controllo per vedere se ho trovato il dolce
        trovatoDolce = dolciDisponibili.contains(dolce);
        
        if (trovatoDolce) {
            for (Cliente cliente : listaClienti) {
                if (cliente.id.equals(idCliente)) {
                    //aggiungo il dolce all'arrayList del cliente
                    cliente.acquistaDolce(dolce);;
                    break;
                }
            }
        } else {
            System.out.println("\nDolce non trovato");
        }

    }

}


class Dolce {

    String nome;
    double prezzo;

    public Dolce(String nomeDolce, double prezzoDolce) {
        nome = nomeDolce;
        prezzo = prezzoDolce;
    }

}

class Cliente {
    String id, nome;
    ArrayList<Dolce> listaDolci;

    public Cliente(String idCliente, String nomeCliente) {

        id = idCliente;
        nome = nomeCliente;
        listaDolci = new ArrayList<>();
    }

    //Metodi classe dolce

    public void acquistaDolce(Dolce dolce) {

        listaDolci.add(dolce);
        System.out.println("\nHai acquistato il dolce: " + dolce.nome);
    }
    
    public void elencoAcquisti() {

        System.out.println("\nLista dei dolci acquistati");
        for (Dolce dolcetto : listaDolci) {
            System.out.println("Hai acquistato un " + dolcetto.nome + " al costo di " + dolcetto.prezzo);
        }
            
    }
}