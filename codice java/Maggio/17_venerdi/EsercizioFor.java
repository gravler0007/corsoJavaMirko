import java.util.Scanner;

public class EsercizioFor {
    public static void main(String[] args) {
        
        Scanner scannerN = new Scanner(System.in);

        int scelta = 0, mesi = 0;
        float StipendioTotale = 0, stipendio = 0, tasso = 0, media = 0, StipendioTotaleConTasse = 0;

        do {
            System.out.print("Quanti mesi devi calcolare?: ");
            mesi = scannerN.nextInt();

            System.out.print("\nFornisci il tasso di interesse: ");
            tasso = scannerN.nextFloat();
            System.out.println();

            for (int i = 1; i <= mesi; i++) {
                System.out.print("Inserisci lo stipendio del mese numero " + i + ": ");
                stipendio = scannerN.nextFloat();

                StipendioTotale += stipendio;
            }

            StipendioTotaleConTasse = StipendioTotale - StipendioTotale * (tasso / 100);

            media = StipendioTotale / mesi;

            System.out.println("\nIn " + mesi + " mesi hai guadagnato complessivamente " + StipendioTotale + "\u20ac");
            System.out.println("\nIn media hai guadagnato " + media + "\u20ac al mese");
            System.out.println("\nApplicando una tassa del " + tasso + "%, il tuo stipendio complessivo è: "
                    + StipendioTotaleConTasse);
            
            System.out.print("\nVuoi fare un altro giro?: (0 = no, altri numeri = si): ");
            scelta = scannerN.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();
            
        } while (scelta !=0);


        scannerN.close();

    }
}
