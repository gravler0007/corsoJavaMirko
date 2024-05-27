public class Dective extends Agente1 {

    private String nome;
    private String cognome;
    private String matricola;

    Dective(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    // public void descriviLavoro() {
    //         System.out.println("mi chiamo " + nome + " " + cognome + ", la mia matricola è " + matricola + " e sono un detective");
    // }

    @Override
    public void descriviLavoro() {
        // System.out.println("mi chiamo " + nome + " " + cognome + ", la mia matricola
        // è " + matricola + " e sono un detective");
        System.out.println("Risolvo i misteri");
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricola() {
        return matricola;
    }
}
