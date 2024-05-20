import java.util.Scanner;
import java.util.ArrayList;

public class EsercizioArrayList {
    public static void main(String[] args) {

        Scanner scannerString = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<String>();
        String user;
        boolean flag = true, flag2=true;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Inserisci l'utente numero " + i +": ");
            user = scannerString.nextLine();
            users.add(user);
        }

        System.out.println(users);

        System.out.print("Dammi un nome e io lo cercherò nell'arrayList: ");
        user = scannerString.nextLine();

        // for (String element : users) {
        //     if (element.equals(user)) {
        //         System.out.println("Utente trovato");
        //         flag = true;
        //         break;
        //     }
        // }

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(user)) {
                System.out.println("Utente '" + users.get(i) + "' trovato alla posizione " + i + " dell'array");
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Utente non trovato");
        }

        System.out.print("Dammi un nome e io lo eliminerò nell'arrayList: ");
        user = scannerString.nextLine();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(user)) {
                System.out.println("Utente '" + users.get(i) + "' eliminato dalla posizione " + i + " dell'array");
                users.remove(i);
                flag2 = false;
                break;
            }
        }

        if (flag2) {
            System.out.println("Utente non trovato");
        }

        System.out.println(users);

        scannerString.close();
    }
}
