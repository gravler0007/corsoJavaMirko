import java.util.Scanner;
import java.util.ArrayList;

public class EsercizioArrayList {
    public static void main(String[] args) {

        Scanner scannerString = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<String>();
        int choice = 10;

        while (choice != 0) {
            menu();
            choice = scannerNumber.nextInt();
            switch (choice) {

                case 1:
                    addUsers(scannerNumber, scannerString, users);
                    break;

                case 2:
                    printUser(users, scannerString);
                    break;

                case 3:

                    findUser(users, scannerString);
                    break;

                case 4:
                    deleteUser(users, scannerString);
                    break;

                case 0:
                    System.out.println("\n*******");
                    System.out.println("SEE YA");
                    System.out.println("*******\n");
                    
                    
                    break;

                default:
                    System.out.print("Invalid choice");
                    break;

            }
        }

        scannerString.close();
        scannerNumber.close();

    }
    
    static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void waitInput(Scanner scanner) {
        System.out.print("\nPress Any Key To Continue...");
        scanner.nextLine();
    }

    static void menu() {
        System.out.println("Select an option: \n");
        System.out.println("1. add user");
        System.out.println("2. print user");
        System.out.println("3. find user");
        System.out.println("4. delete user");
        System.out.println("0. Quit");

        System.out.print("\nChoise: ");
    }

    static void addUsers(Scanner scannerNumber, Scanner scannerString, ArrayList<String> users) {

        int numberOfUsersToAdd = 0;
        String user;

        System.out.print("\nQuanti utenti devi inserire?: ");
        numberOfUsersToAdd = scannerNumber.nextInt();

        for (int i = 1; i <= numberOfUsersToAdd; i++) {

            System.out.print("\nInserisci l'utente numero " + i + ": ");
            user = scannerString.nextLine();
            users.add(user);
        }

        System.out.println("\nCaricamento completato!");
        waitInput(scannerString);
        clearDisplay();
    }

    static void printUser(ArrayList<String> users, Scanner scannerString) {
        System.out.println("\n" + users);
        waitInput(scannerString);
        clearDisplay();
    }

    static void findUser(ArrayList<String> users, Scanner scannerString) {

        String user;
        // boolean flag = false;

        System.out.print("\nDammi un nome e io lo cercherò nell'arrayList: ");
        user = scannerString.nextLine();

        // for (String element : users) {
        // if (element.equals(user)) {
        // System.out.println("Utente trovato");
        // flag = true;
        // break;
        // }
        // }

        // for (int i = 0; i < users.size(); i++) {
        //     if (users.get(i).equals(user)) {
        //         System.out.println("\nUtente '" + users.get(i) + "' trovato alla posizione " + i + " dell'array");    
        //         flag = false;
        //         break;
        //     }
        // }

        // if (flag) {
        //     System.out.println("\nUtente non trovato");
        // }

        if (users.contains(user)) {
            System.out.println("\nUtente '" + user + "' trovato alla posizione " + users.indexOf(user) + " dell'array");

        } else {
            System.out.println("\nUtente non trovato");
        }

        waitInput(scannerString);
        clearDisplay();
    }

    static void deleteUser(ArrayList<String> users, Scanner scannerString) {

        String user;
        //boolean flag = true;

        System.out.print("\nDammi un nome e io lo eliminerò nell'arrayList: ");
        user = scannerString.nextLine();

        // for (int i = 0; i < users.size(); i++) {
        //     if (users.get(i).equals(user)) {
        //         System.out.println("Utente '" + users.get(i) + "' eliminato dalla posizione " + i + " dell'array");
        //         users.remove(i);
        //         flag = false;
        //         break;
        //     }
        // }

        // if (flag) {
        //     System.out.println("Utente non trovato");
        // }

        
        if (users.contains(user)) {
            System.out.println("\nUtente '" + user + "' eliminato dalla posizione " + users.indexOf(user) + " dell'array");
            users.remove(user);
        } else {
            System.out.println("\nUtente non trovato, eliminazione non possibile!");
        }
        waitInput(scannerString);
        clearDisplay();

    }
}
