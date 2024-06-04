public class Poliziotto extends Agente1 {

    private String nome;
    private String cognome;
    private String matricola;

    Poliziotto(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    @Override
    public void descriviLavoro() {
        // System.out.println("mi chiamo " + nome + " " + cognome + ", la mia matricola
        // è " + matricola + " e sono un detective");
        System.out.println("faccio rispettare l'ordine pubblico");
    }

    public String getCognome() {
        return cognome;
    }

    public void getNome() {
         System.out.println(this.nome);
    }

    // public String getNome() {
    //     return nome;
    // }

    public String getMatricola() {
        return matricola;
    }

    

}
