import java.util.Scanner;

public class DisvisioniInClassi {
    public static void main(String[] args) {

        String nome = "", classe = "" ;
        int eta = 0, anno = 0, sceltaClasse = 0;
        
        //CREO GLI SCANNER
        Scanner scannerS = new Scanner(System.in);

        Scanner scannerN = new Scanner(System.in);

        //NOME
        System.out.print("Come ti enunci?: ");
        nome = scannerS.nextLine();

        //ETà
        System.out.print("Quanto sei vecchio?: ");
        eta = scannerN.nextInt();

        //ANNO SCOLASTICO
        System.out.print("A che anno scolastico sei?(Da 1 a 5): ");
        anno = scannerN.nextInt();

        //CLASSE DI APPARTENENZA
        System.out.print("In che classe ti trovi? (Dalla A alla F): ");
        classe = scannerS.nextLine();

        classe = anno + classe;

        //System.out.println(nome + " " + anno + " " + eta);


        if (nome.equalsIgnoreCase("mirko") && anno == 1 && eta == 28) {
            sceltaClasse = 1;
        }
        
        // se non tichiami mirko E, non sei al primo anno OPPURE hai più di 15 anni
        if (!nome.equalsIgnoreCase("mirko") && (anno > 1 || eta > 15)) {
            sceltaClasse = 2;
        }

        switch (sceltaClasse) {
            case 1:
                System.out.println("Ciao " + nome + ", hai " + eta + " anni, sei al " + anno
                        + " anno e sei nella CLASSE DI RECUPERO " + classe);
                break;

            case 2:
                System.out.println("Non ti chiamo mirko, va già bene così, infatti ti chiami " + nome + ", hai " + eta
                        + " anni, sei al " + anno
                        + " anno e sei nella classe " + classe);

                break;

            case 3:

                break;


            default:
                break;

        }
        scannerN.close();
        scannerS.close();

    }
}
