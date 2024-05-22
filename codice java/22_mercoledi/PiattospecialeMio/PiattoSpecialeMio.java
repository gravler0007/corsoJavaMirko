import java.util.Scanner;

public class PiattoSpecialeMio {

    public String pane;
    private String ingr1;
    private String ingr2;


    public PiattoSpecialeMio(String pane){
        this.pane = pane;
    }

    public static void main(String[] args) {

        Scanner scannerS = new Scanner(System.in);
        int scelta = 0, sceltaPane;

        System.out.println("Che pane vuoi?: \n");
        System.out.println("1) normale: ");
        System.out.println("2) sesamo \n");
        System.out.print("scelta:");
        sceltaPane = scannerS.nextInt();

        PiattoSpecialeMio x = scelta(sceltaPane);

        System.out.println("dammi il primo ingrediente privato\n ");
        System.out.println("1) salsiccia ");
        System.out.println("2) hamburgher \n");
        System.out.print("scelta:");

        scelta = scannerS.nextInt();
        x.setIngr1(scelta);
        
        System.out.println("dammi il secondo ingrediente privato\n ");
        System.out.println("1) salsiccia ");
        System.out.println("2) hamburgher \n");
        System.out.print("scelta:");
        scelta = scannerS.nextInt();
        x.setIngr2(scelta);

        scannerS.close();
    }
    
    public static PiattoSpecialeMio scelta (int scelta){
        if (scelta == 1) {
            PiattoSpecialeMio piatto1 = new PiattoSpecialeMio("pane normale");
            return piatto1;
        } else {
            PiattoSpecialeMio piatto1 = new PiattoSpecialeMio("pane di sesamo");
            return piatto1;
        }

    }
    
    public String getIngr1() {
        return ingr1;
    }

    public String getIngr2() {
        return ingr2;
    }

    public void setIngr1(int scelta) {

        switch (scelta) {
            case 1:
                this.ingr1 = "Salsiccia";
                break;

            case 2:
                this.ingr1 = "Hamburgher";
                break;
        
            default:
                this.ingr1 = "Prodotto non in lista";
                break;
        }
               
    }

    public void setIngr2(int scelta) {
        switch (scelta) {
            case 1:
                this.ingr2 = "Salsiccia";
                break;

            case 2:
                this.ingr2 = "Hamburgher";
                break;

            default:
                this.ingr2 = "Prodotto non in lista";
                break;
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

    // Funzione di stampa menù
    static void menu() {
        System.out.println("Select an option: \n");
        System.out.println("1. Salsiccia");
        System.out.println("2. Hamburger");
        System.out.println("0. Quit");

        System.out.print("\nChoise: ");
    }
}
