public class Auto extends Veicolo{
    int numeroPorte;

    public Auto(String marca, String modello, int anno, int numeroPorte) {
        super(marca, modello, anno);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    @Override
    public String toString() {
        return super.toString().concat(", numeroPorte=" + numeroPorte + '}');
    }
}
