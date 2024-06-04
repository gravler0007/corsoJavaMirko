import java.util.Scanner;

public class ProvaCicli {
    public static void main(String[] args) {

        int valoreVariabile = 8, counter = 1, iterazioneMax = 15;

        Scanner scanner = new Scanner(System.in);

        if (valoreVariabile < iterazioneMax) {
            while (valoreVariabile < iterazioneMax) {

                if (counter == 1) {
                    // sono entrato per la prima volta, quindi la condizione è già stata soddisfatta
                    // almeno una volta prima di eseguire il ciclo
                    System.out.println("--------------------------------------------------");
                    System.out.println("PRIMO INGRESSO NEL WHILE");
                    System.out.println("la condizione di ingresso è stata soddisfatta");
                    System.out.println(valoreVariabile + " < " + iterazioneMax);
                    System.out.println("--------------------------------------------------");
                }

                System.out.println("\nciclo: " + counter);
                System.out.println("valore variabile: " + valoreVariabile);
                System.out.println("iterazioneMax: " + iterazioneMax);
                System.out.println("Condizione di uscita: " + valoreVariabile + " < " + iterazioneMax);
                System.out.println(
                        valoreVariabile + " < " + iterazioneMax + " ? =======> " + (valoreVariabile < iterazioneMax));

                valoreVariabile++;

                System.out
                        .println("\n********************************************************************************");
                System.out.println("Ho incrementato il valore della variabile, adesso questa vale " + valoreVariabile
                        + " e non più " + (valoreVariabile - 1));
                System.out.println("Adesso eseguo il controllo: '" + valoreVariabile + " < " + iterazioneMax
                        + "' ? =======> " + (valoreVariabile < iterazioneMax));
                System.out.println("********************************************************************************");

                if (!(valoreVariabile < iterazioneMax)) {
                    System.out
                            .println("\n============================================================================");
                    System.out.println("Dopo " + counter + " cicli (ovvero " + counter
                            + " iterazioni, partendo da 1) sono uscito dal ciclo WHILE");
                    System.out.println("============================================================================");
                }

                counter++;

                System.out.println("\nPress Any Key To Continue...");
                scanner.nextLine();
                System.out.print("\033[H\033[2J");
                System.out.flush();

            }

        } else {
            System.out.println(
                    "ZOMPIAMO COMPLETAMENTE IL WHILE PERCHÈ LA CONDIZIONE DI INGRESSO NON È SODDISFATTA A PRIORI");
        }

        counter = 1;

        // il do-while viene eseguito ALMENO una volta
        do {

            if (counter == 1) {
                System.out.println("Anche se la condizione di cilcaggio non è soddisfatta, almeno una volta viene eseguito");
            }

            
            System.out.println("\nciclo: " + counter);
            System.out.println("valore variabile: " + valoreVariabile);
            System.out.println("iterazioneMax: " + iterazioneMax);
            System.out.println("Condizione di uscita: " + valoreVariabile + " < " + iterazioneMax);
            System.out.println(
                    valoreVariabile + " < " + iterazioneMax + " ? =======> " + (valoreVariabile < iterazioneMax));

            valoreVariabile++;

            System.out
                    .println("\n********************************************************************************");
            System.out.println("Ho incrementato il valore della variabile, adesso questa vale " + valoreVariabile
                    + " e non più " + (valoreVariabile - 1));
            System.out.println("Adesso eseguo il controllo: '" + valoreVariabile + " < " + iterazioneMax
                    + "' ? =======> " + (valoreVariabile < iterazioneMax));
            System.out.println("********************************************************************************");

            if (!(valoreVariabile < iterazioneMax)) {
                System.out
                        .println("\n============================================================================");
                System.out.println("Dopo " + counter + " cicli (ovvero " + counter
                        + " iterazioni, partendo da 1) sono uscito dal ciclo DO WHILE");
                System.out.println("============================================================================");
            }

            counter++;

            System.out.println("\nPress Any Key To Continue...");
            scanner.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

        } while (valoreVariabile < iterazioneMax);

        
        scanner.close();
    }
}
