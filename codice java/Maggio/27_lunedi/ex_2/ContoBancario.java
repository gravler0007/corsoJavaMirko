public class ContoBancario {
    
    private int numeroConto;
    private double saldo;
    private String titolare;

    public ContoBancario(int numeroConto, double saldo, String titolare) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
        this.titolare = titolare;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitolare() {
        return titolare;
    }
     //metodo per depositare
    public void deposita(double importo) {
        saldo += importo;
        System.out.println("Hai depositato: " + importo);
    }

    //metodo per prelevare
    public void preleva(double importo) {
        //controllo sull'importo
        if (importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelevato: " + importo);
        } else {
            System.out.println("Fondi insufficienti.");
        }
    }

    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(123, 10.0, "Mirko Pannacotta");

        // Stampo le informazioni iniziali del conto di Mirko pannacotta
        System.out.println("Informazioni iniziali del conto:\n");
        System.out.println("Numero conto: " + conto.getNumeroConto());
        System.out.println("Saldo: " + conto.getSaldo());
        System.out.println("Titolare: " + conto.getTitolare());

        //deposito di 10 euro
        conto.deposita(10);

        //provo a prelevarne 30 
        conto.preleva(30);

        // provo a prelevarne 5
        conto.preleva(5);

        //saldo finale
        System.out.println("Saldo finale: " + conto.getSaldo());
    }
}
