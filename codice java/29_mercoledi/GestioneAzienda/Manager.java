public class Manager extends Dipendente{
    // costruttore
    public Manager(double stipendio, String nome) {
        super(stipendio, nome);
    }

    @Override
    public double calcolaBonus() {
        return stipendio * 0.20;
    }
}
