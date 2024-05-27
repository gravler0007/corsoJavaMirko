import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        boolean verificato1 = false, verificato2 = false, verificato3 = false;;
        int choice = 0;

        System.out.print("Inserisci una valore tra 1 e 3: ");
        choice = scannerN.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Ha scelto di inserire 1");
                verificato1 = true;
                break;

            case 2:
                System.out.println("Ha scelto di inserire 2");
                verificato2 = true;
                break;

            case 3:
                System.out.println("Ha scelto di inserire 3");
                verificato3 = true;
                break;

            default:
                System.out.print(
                        "ERROE: Ha scelto di inserire un numero fuori dall'intervallo fornito, devi inserire un valore tra 1 e 3: ");
                break;

        }
        
        // if (verificato1) {
        //     System.out.println("Vuoi cambiare il messaggio per il caso selezionato? (s/n)");
        //     String risposta = scannerS.nextLine();
        //     if (risposta.equals("s") || risposta.equals("S")) {
        //         System.out.println("Inserisci il nuovo messaggio:");
        //         
        //     }
        // }

        scannerN.close();
    }
}


// switch (choice) {
// case 1:
// System.out.println("Ha scelto di inserire 1");
// break;

// case 2:
// System.out.println("Ha scelto di inserire 2");
// break;

// case 3:
// System.out.println("Ha scelto di inserire 3");
// break;

// default:
// System.out.println("CI RINUNCIO, FAI COME VUOI, MA IO MI CHIUDO");
// break;
// }