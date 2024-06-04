import java.util.Scanner;

public class EsercizoCondizioni {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        // System.out.print("Dammi la tua età: ");
        // int eta = scanner.nextInt();
        System.out.print("Dammi un numero compreso tra 1 e 7.\nTi dirò il giorno della settimana corrispondente: ");
        int day = scanner.nextInt();

        // if (eta < 18) {
        //     System.out.println("hai " + eta + " anni, sei minorenne" );
        // }else if (eta >= 18 && eta <= 25){
        //     System.out.println("hai " + eta + " anni, sei maggiorenne" );
        // }else if(eta > 25 && eta <= 65){
        //     System.out.println("hai " + eta + " anni, sei una persona stagionata");
        // } else {
        //     System.out.println("hai " + eta + " anni, sei una persona prossima al decadimento");
        // }

        switch (day) {
            case 1:
                System.out.println("\nÈ Lunedi");
                
                break;

            case 2:
                System.out.println("\nÈ Martedì");

                break;

            case 3:
                System.out.println("\nÈ Mercoledì");

                break;

            case 4:
                System.out.println("\nÈ Giovedì");

                break;

            case 5:
                System.out.println("\nÈ Venerdì");

                break;

            case 6:
                System.out.println("\nÈ Sabato");

                break;

            case 7:
                System.out.println("\nÈ Domenica");

                break;
            
        
            default:
                System.out.println("\nHO DETTO TRA 1 E 7, SCHIFOSO!");

                break;
        }
        scanner.close();
    }
}
