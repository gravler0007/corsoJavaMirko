public class Smartphone extends DispositivoDiBase {


    public Smartphone(String nome, String password) {
        super(nome, password);
    }

    @Override
    public void avviaApplicazione(String nomeApp) {
        System.out.println("Sto avviando l'appicazione '" + nomeApp + "' su smartphone!");
        login();
    }

    private void login() {
        System.out.println("Accesso effettuato per l'utente: '" + this.nome + "' con password: '" + this.password+"'");
    }
    
}
