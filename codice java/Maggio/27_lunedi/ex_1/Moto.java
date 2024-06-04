public class Moto extends Veicolo {
    String tipoManubrio;

    public Moto(String marca, String modello, int anno, String tipoManubrio) {
        super(marca, modello, anno);
        this.tipoManubrio = tipoManubrio;
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public String toString() {
        return super.toString().concat(", tipoManubrio='" + tipoManubrio + '\'' + '}');
    }

}
