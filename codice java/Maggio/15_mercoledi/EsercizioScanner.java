import java.util.Scanner;

public class EsercizioScanner {
    public static void main(String args[]) {

        int rispostaCalcolo, punteggio = 0;
        String username;

        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        System.out.print("Dammi il tuo username: ");
        username = scannerS.nextLine();

        //PRIMA DOMANDA
        System.out.print("\nQuanto fa 6 + 6?\nRisposta: ");
        rispostaCalcolo = scannerN.nextInt();

        if (rispostaCalcolo == 12) {
            punteggio += 5;
        }

        // SECONDA DOMANDA
        System.out.print("\nQuanto fa 6 * 6?\nRisposta: ");
        rispostaCalcolo = scannerN.nextInt();

        if (rispostaCalcolo == 36) {
            punteggio += 15;
        } else {
            punteggio -= 5;

            if(punteggio < 0)
                punteggio = 0;
        }

        // TERZA DOMANDA
        System.out.print("\nQuanto fa 6 ^ 6?\nRisposta: ");
        rispostaCalcolo = scannerN.nextInt();

        if (rispostaCalcolo == 46656) {
            punteggio += 30;
        } else {
            punteggio -= 5;

            if (punteggio < 0)
                punteggio = 0;
        }

        System.out.print("Utente '" + username + "' hai totalizzato " + punteggio + " punti! ");
        
        if (punteggio == 0)
            System.out.print("Hai ampio margine di miglioramento!");
        else if (punteggio >= 5 && punteggio <= 10)
            System.out.print("Si può sempre migliorare!");
        else if (punteggio >10 && punteggio <= 30)
            System.out.print("NOT BAD!");
        else if (punteggio > 30 && punteggio <= 45)
            System.out.print("YOU'R A MONSTER!");
        else {
            System.out.print("\"YOU'R PURFFECT!\"");
        }

        scannerN.close();
        scannerS.close();
    }
}
