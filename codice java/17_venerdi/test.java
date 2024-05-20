import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        
        int somma = 0;

        int min = 0, max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci da dove vuoi inizizare a stampare? (MIN = 1  MAX = 50): ");
        min = scanner.nextInt();

        System.out.print("Inserisci da dove vuoi inizizare a stampare? (MIN = 1  MAX = 50): ");
        max = scanner.nextInt();

        for ( int i=min; i <= max; i++) {
            System.out.println(i);
            somma += i;
        }

        System.out.println(somma);
        
        scanner.close();

        
    }
}
