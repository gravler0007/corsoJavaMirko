public class Tecnico extends Dipendente{
    
    // costruttore
    public Tecnico(double stipendio, String nome) {
        // super(stipendio, nome);
        this.stipendio = stipendio;
        this.nome = nome;
    }

    @Override
    public double calcolaBonus() {
        return stipendio * 0.15;
    }

}
