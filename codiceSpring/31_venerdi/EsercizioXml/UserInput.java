import java.util.Scanner;

public class UserInput {

    
    public static User createUser(Scanner ScannerS, Scanner ScannerN) {

        String fName, lName, email;
        int age;

        System.out.print("Inserisci il tuo nome: ");
        fName = ScannerS.nextLine();
        while(fName.isEmpty()){
            System.out.print("Mo ti insulto, inserisci il tuo nome: ");
            fName = ScannerS.nextLine();
        }

        System.out.print("\nInserisci il tuo cognome: ");
        lName = ScannerS.nextLine();
        while (lName.isEmpty()) {
            System.out.print("Mo ti insulto, inserisci il tuo cognome: ");
            lName = ScannerS.nextLine();
        }

        // possibilità di implementare controlli migliori (.trim())
        System.out.print("\nInserisci la tua email: ");
        email = ScannerS.nextLine();
        while (email.isEmpty()) {
            System.out.print("Mo ti insulto, inserisci la tua email: ");
            email = ScannerS.nextLine();
        }


        System.out.print("\nInserisci la tua età: ");
        age = ScannerN.nextInt();
        //possibilità di implementare controlli migliori
        while (age <= 0) {
            System.out.print("Mo ti insulto, inserisci un numero positivo: ");
            age = ScannerN.nextInt();
        }

        User newUser = new User(fName, lName, email, age);

        return newUser;

    }


}
