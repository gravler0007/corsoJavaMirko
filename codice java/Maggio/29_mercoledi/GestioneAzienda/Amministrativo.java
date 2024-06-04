//eredito dalla classe astratta che ha il metodo overidato dall'interfaccia
public class Amministrativo extends Dipendente {

    //costruttore
    public Amministrativo(double stipendio, String nome) {
        //  super(stipendio, nome);
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
        return stipendio * 0.10;
    }

}
