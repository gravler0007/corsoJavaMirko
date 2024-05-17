import java.util.HashMap;
import java.util.Scanner;

public class LoginApp {

    static HashMap<String, String> users = new HashMap<String, String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.print("Select an option: ");
            System.out.print("1. Register");
            System.out.print("2. Login");
            System.out.print("3. Quit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    break;
                default:
                    System.out.print("Invalid choice");
            }
        }
        scanner.close();
    }

    static void registerUser(Scanner scanner) {
        System.out.print("Enter your username:");
        String username = scanner.nextLine();
        System.out.print("Enter your password:");
        String password = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.print("User already exists.");
        } else {
            users.put(username, password);
            System.out.print("Registration successful.");
        }
    }

    static void loginUser(Scanner scanner) {
        System.out.print("Enter your username:");
        String username = scanner.nextLine();
        System.out.print("Enter your password:");
        String passwordIn = scanner.nextLine();
        if (!users.containsKey(username)) {
            System.out.print("Invalid username or password.");
        } else {
            System.out.println("\n" + users.get(username));
            if (users.get(username).equals(passwordIn)) {
                System.out.print("Login successful.");
            } else {
                System.out.print("Invalid username or password.");
            }
        }
    }
}