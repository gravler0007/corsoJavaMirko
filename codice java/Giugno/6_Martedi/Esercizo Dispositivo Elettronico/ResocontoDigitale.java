public class ResocontoDigitale {
    private String nome;
    private String password;
    private Double punti;
    private Integer id;

    public ResocontoDigitale(String nome, String password, Double punti, Integer id) {
        this.nome = nome;
        this.password = password;
        this.punti = punti;
        this.id = id;
    }

    public void stampaResoconto() {
        System.out.println("Nome: " + nome);
        System.out.println("Password: " + password);
        if (punti != null) {
            System.out.println("Punti: " + punti);
        }
        if (id != null) {
            System.out.println("Id: " + id);
        }
    }
}