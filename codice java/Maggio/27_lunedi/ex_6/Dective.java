class Detective implements Agente {
    private int matricola;
    private String nome;

    public Detective(int matricola, String nome) {
        this.matricola = matricola;
        this.nome = nome;
    }

    @Override
    public void descriviLavoro() {
        System.out.println("Raccolgo le prove.");
    }

    @Override
    public int ottieniMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }
}
