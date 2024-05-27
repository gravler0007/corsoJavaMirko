public class Poliziotto extends Agente {

    Poliziotto(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public void descriviLavoro() {
        System.out.println("mi chiamo " + nome + " " + cognome + ", la mia matricola è " + matricola + " e sono un agente");
    }
}
