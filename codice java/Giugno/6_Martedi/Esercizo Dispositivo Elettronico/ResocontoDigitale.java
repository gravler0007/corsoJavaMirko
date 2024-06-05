public class ResocontoDigitale {
    private String nome;
    private String password;
    private Double punti;
    private Integer id;


    public ResocontoDigitale(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    public ResocontoDigitale(String nome, String password, Double punti, Integer id) {
        this.nome = nome;
        this.password = password;
        this.punti = punti;
        this.id = id;
    }

    public void stampaResoconto() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Password: " + this.password);
        if (this.punti != null) {
            System.out.println("Punti: " + this.punti);
        }
        if (this.id != null) {
            System.out.println("Id: " + this.id);
        }
    }
}