import java.util.Scanner;

public class InputDiProva {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dammi il tuo username: ");
        int input = scanner.nextInt();

        System.out.println("Ciao user, ti chiami " + input);

        scanner.close();
    }
}
