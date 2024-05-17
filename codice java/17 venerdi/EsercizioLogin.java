import java.util.HashMap;
import java.util.Scanner;

public class EsercizioLogin {

    static HashMap<String, String> users = new HashMap<String, String>();

    public static void main(String[] args) {
        //Dichiarazione variabili e oggetti globali
        Scanner scannerNumber = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        int choice = 0;
        //while ()
        //String temp = "" ultimo nome (non si deve ripetere)
        while (choice != 4) {
            menu();
            choice = scannerNumber.nextInt();
            switch (choice) {
                //non posso usare nessuno storage per salvare i valori, quindi usare le funzioni non è buono adesso
                case 1:
                    registerUser(scannerString);

                    break;
                case 2:
                    if (loginUser(scannerString)) // se il login va a buon fine allora ritorno true ed entro nell'if
                        mathFunction(scannerNumber);           
                    break;

                case 3:
                    printUsers(scannerString);
                    break;

                case 4:
                    System.out.print("SEE YA");
                    break;

                default:
                    System.out.print("Invalid choice");
            }
        }

        scannerNumber.close();
        scannerString.close();

        
    }

    // Funzione di stampa menù
    static void menu() {
        System.out.println("Select an option: \n");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Print user");
        System.out.println("4. Quit");

        System.out.print("\nChoise: ");
    }


    static void registerUser(Scanner scannerString) {

        clearDisplay();

        String username, password;

        System.out.print("Enter your username: ");
        username = scannerString.nextLine();
        System.out.print("Enter your password: ");
        password = scannerString.nextLine();

        if (users.containsKey(username)) {
            System.out.print("\nUser already exists.");
        } else {
            users.put(username, password);
            System.out.print("\nRegistration successful.");
        }

        waitInput(scannerString);
        clearDisplay();

    }

    static boolean loginUser(Scanner scannerString) {

        String usernameLogin, passwordLogin;

        clearDisplay();

        System.out.print("Enter your username: ");
        usernameLogin = scannerString.nextLine();
        System.out.print("Enter your password: ");
        passwordLogin = scannerString.nextLine();

        //controllo se l'utente già esiste attraverso "containsKey"
        if (!users.containsKey(usernameLogin)) {
            System.out.print("\nInvalid username or password.");

            waitInput(scannerString);
            clearDisplay();

            return false;
        } else {
            //prendo il VALORE associato alla chiave "usernameLogin" (quindi la password) e vedo se è uguale alla password che inserisco da tastiera (.equals(passwordLogin))
            //System.out.print(users.get(usernameLogin));
            if (users.get(usernameLogin).equals(passwordLogin)) {
                System.out.print("\nLogin successful.");

                waitInput(scannerString);
                clearDisplay();

                return true;
            } else {
                System.out.print("\nInvalid username or password.");

                waitInput(scannerString);
                clearDisplay();

                return false;
            }
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

    static void mathFunction(Scanner scannerNumber) {
        System.out.print("\nInserisci un numero per calcolare la sua radice: ");
        float number = scannerNumber.nextFloat();
        System.out.println("La radice di " + number + " è " + Math.sqrt(number));
        scannerNumber.nextLine(); // Consume newline

        waitInput(scannerNumber);
        clearDisplay();

    }

    static void printUsers(Scanner scanner) {

        clearDisplay();
        
        //LAMBDA FUNCTION
        users.forEach((username, password) -> {
            System.out.println("chiave: " + username + " -> " + "password: " + password + "\n");
        });

        waitInput(scanner);
        clearDisplay();
    }

}
