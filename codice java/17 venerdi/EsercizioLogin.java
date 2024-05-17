import java.util.Scanner;

public class EsercizioLogin {
    public static void main(String[] args) {
        //Dichiarazione variabili e oggetti globali
        Scanner scannerNumber = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        String usernameRegistration = "", passwordRegistration = "", usernameLogin = "", passwordLogin = " "; 
        int choice = 0, choice2 = 1;
        boolean flagRegistration = false;
        float number = 0;
        //while ()
        //String temp = "" ultimo nome (non si deve ripetere)
        while (choice != 3) {
            menu();
            choice = scannerNumber.nextInt();
            switch (choice) {
                //non posso usare nessuno storage per salvare i valori, quindi usare le funzioni non è buono adesso
                case 1:
                    // registerUser(scannerString);
                    if (!flagRegistration) {
                        System.out.print("Enter your username:");
                        usernameRegistration = scannerString.nextLine();
                        System.out.print("Enter your password:");
                        passwordRegistration = scannerString.nextLine();

                        System.out.print("Registration successful.");
                        flagRegistration = true;
                    } else {
                        System.out.print("Only oneRegistration this time");
                    }

                    break;
                case 2:
                    //loginUser(scannerString);
                    System.out.print("Enter your username:");
                    usernameLogin = scannerString.nextLine();
                    System.out.print("Enter your password:");
                    passwordLogin = scannerString.nextLine();
                    if (usernameLogin.equals(usernameRegistration) && passwordLogin.equals(passwordRegistration)) {
                        System.out.println("Welcome " + usernameLogin);

                        while (choice2 == 1) {
                            System.out.println("\nInsert a number to calculte the square root of that number: ");
                            number = scannerNumber.nextInt();
                            System.out.println("The square root of " + number + " is " + Math.sqrt(number));
                            System.out.println(
                                    "\n Do you wanna do another ride of calculation?: (1 = YES, other numbers = NO)");
                            choice2 = scannerNumber.nextInt();
                        }
                        

                    } else {
                        System.out.print("Invalid username or password.");
                    }
                    break;
                case 3:
                    System.out.print("ARRIVEDORCI");
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
        System.out.println("\nSelect an option: ");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Quit");

        System.out.print("\nChoise: ");
    }


}
