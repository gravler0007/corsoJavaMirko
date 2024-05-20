import java.util.Scanner;
import java.util.ArrayList;

public class EsercizioArrayList {
    public static void main(String[] args) {

        Scanner scannerString = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<String>();
        String user;
        boolean flag = true, flag2 = true;
        int choice = 10;

        while (choice != 0) {
            menu();
            choice = scannerNumber.nextInt();
            switch (choice) {

                case 1:
                    addUsers(scannerNumber, scannerString, users);
                    System.out.println(users);
                    break;

                case 0:
                    System.out.println("*******\n");
                    System.out.println("\n*******");
                    System.out.println("SEE YA");
                    break;

                default:
                    System.out.print("Invalid choice");
                    break;

            }
        }


        // System.out.print("Dammi un nome e io lo cercherò nell'arrayList: ");
        // user = scannerString.nextLine();

        // // for (String element : users) {
        // //     if (element.equals(user)) {
        // //         System.out.println("Utente trovato");
        // //         flag = true;
        // //         break;
        // //     }
        // // }

        // for (int i = 0; i < users.size(); i++) {
        //     if (users.get(i).equals(user)) {
        //         System.out.println("Utente '" + users.get(i) + "' trovato alla posizione " + i + " dell'array");
        //         flag = false;
        //         break;
        //     }
        // }

        // if (flag) {
        //     System.out.println("Utente non trovato");
        // }

        // System.out.print("Dammi un nome e io lo eliminerò nell'arrayList: ");
        // user = scannerString.nextLine();

        // for (int i = 0; i < users.size(); i++) {
        //     if (users.get(i).equals(user)) {
        //         System.out.println("Utente '" + users.get(i) + "' eliminato dalla posizione " + i + " dell'array");
        //         users.remove(i);
        //         flag2 = false;
        //         break;
        //     }
        // }

        // if (flag2) {
        //     System.out.println("Utente non trovato");
        // }

        // System.out.println(users);

        scannerString.close();
        scannerNumber.close();

    }
    
    static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void waitInput(Scanner scanner) {
        System.out.print("\n\nPress Any Key To Continue...");
        scanner.nextLine();
    }

    static void menu() {
        System.out.println("Select an option: \n");
        System.out.println("1. add user");
        System.out.println("2. print user");
        System.out.println("3. delete user");
        System.out.println("0. Quit");

        System.out.print("\nChoise: ");
    }

    static void addUsers(Scanner scannerString, Scanner scannerNumber, ArrayList<String> users) {

        int numberOfUsersToAdd = 0;
        String user;

        System.out.print("Quanti utenti devi inserire?: ");
        numberOfUsersToAdd = scannerNumber.nextInt();

        for (int i = 1; i <= numberOfUsersToAdd; i++) {

            System.out.print("Inserisci l'utente numero " + i + ": ");
            user = scannerString.nextLine();
            scannerString.nextLine();
            users.add(user);
        }

    }

}
