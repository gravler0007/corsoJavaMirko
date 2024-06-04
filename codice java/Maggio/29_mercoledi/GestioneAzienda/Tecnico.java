public class Tecnico extends Dipendente{
    
    // costruttore
    public Tecnico(double stipendio, String nome) {
        // super(stipendio, nome);
        this.stipendio = stipendio;
        this.nome = nome;
    }

    // setter
    public String getNome() {
        return nome;
    }

    public double getStipendio() {
        return stipendio;
    }

    @Override
    public double calcolaBonus() {
        return stipendio * 0.15;
    }

}
