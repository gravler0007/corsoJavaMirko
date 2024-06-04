class Poliziotto implements Agente {
    private int matricola;
    private String nome;

    public Poliziotto(int matricola, String nome) {
        this.matricola = matricola;
        this.nome = nome;
    }

    @Override
    public void descriviLavoro() {
        System.out.println("Faccio mantenere l'ordine pubblico ");
    }

    @Override
    public int ottieniMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }
}