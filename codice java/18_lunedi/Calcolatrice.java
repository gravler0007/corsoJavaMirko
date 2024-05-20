import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {

        //Dichiarazione variabili e oggetti globali
        Scanner scannerNumber = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        //[0 = addizione, 1 = sottrazione, 2 = max, 3 = min]

        int[] numberOfOperation = { 0, 0, 0, 0 };

        int choice = 10;
        float num1 = 0, num2 = 0;
        float[] number = {0, 0};

        while (choice != 0) {
            menu();
            choice = scannerNumber.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("\nGive me the first number: ");
                    num1 = scannerNumber.nextFloat();
                    System.out.print("Give me the second number: ");
                    num2 = scannerNumber.nextFloat();

                    System.out.println("\nthe sum between " + num1 + " and " + num2 + " is " + addition(num1, num2));
                    numberOfOperation[0]++;

                    waitInput(scannerString);
                    clearDisplay();


                    break;

                case 2:
                    System.out.print("\nGive me the first number: ");
                    num1 = scannerNumber.nextFloat();
                    System.out.print("Give me the second number: ");
                    num2 = scannerNumber.nextFloat();

                    System.out.println("\nthe subtraction between " + num1 + " and " + num2 + " is " + subtraction(num1, num2));
                    numberOfOperation[1]++;

                    waitInput(scannerString);
                    clearDisplay();

                    break;

                case 3:

                    System.out.print("\nGive me the first number: ");
                    num1 = scannerNumber.nextFloat();
                    System.out.print("Give me the second number: ");
                    num2 = scannerNumber.nextFloat();

                    System.out.println("\nthe max between " + num1 + " and " + num2 + " is " + max(num1, num2));
                    numberOfOperation[2]++;

                    waitInput(scannerString);
                    clearDisplay();

                    break;

                case 4:

                    System.out.print("\nGive me the first number: ");
                    num1 = scannerNumber.nextFloat();
                    System.out.print("Give me the second number: ");
                    num2 = scannerNumber.nextFloat();

                    System.out.println("\nthe min between " + num1 + " and " + num2 + " is " + min(num1, num2));
                    numberOfOperation[3]++;

                    waitInput(scannerString);
                    clearDisplay();

                    break;

                case 0:
                    System.out.println("\n*******");
                    System.out.println("SEE YA");
                    System.out.println("*******\n");
                    break;

                default:
                    System.out.print("Invalid choice");
            }
        }
        
        System.out.println("hai effetuato l'operazione di somma " + numberOfOperation[0] + " volte");
        System.out.println("hai effetuato l'operazione di sottrazione " + numberOfOperation[1] + " volte");
        System.out.println("hai trovato il massimo tra due numeri " + numberOfOperation[2] + " volte");
        System.out.println("hai trovato il minimo tra due numeri " + numberOfOperation[3] + " volte\n");

        scannerNumber.close();
        scannerString.close();

    }
    

    static void clearDisplay() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void waitInput(Scanner scanner) {
        System.out.print("\n\nPress Any Key To Continue...");
        scanner.nextLine();
    }

    // Funzione di stampa menù
    static void menu() {
        System.out.println("Select an option: \n");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. maximum between two numbers");
        System.out.println("4. minus between two numbers");
        System.out.println("0. Quit");

        System.out.print("\nChoise: ");
    }


    static float addition(float num1, float num2) {
        return num1 + num2;
    }

    static float subtraction(float num1, float num2) {
        return num1 - num2;
    }

    static float max(float num1, float num2) {
        return Math.max(num1, num2);
    }

    static float min(float num1, float num2) {
        return Math.min(num1, num2);
    }

    static void askNumbers(Scanner scannerNumber, float[] number) {

 
        System.out.print("\nGive me the first number: ");
        number[0] = scannerNumber.nextFloat();
        // System.out.print("Give me the second number: ");
        // num2 = scannerNumber.nextFloat();
    }

}

