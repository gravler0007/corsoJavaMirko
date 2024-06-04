public class Veicolo {

    private String marca;
    private String modello;
    private int anno;


    public Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }


    public int getAnno() {
        return anno;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModello(String modello) {
        this.modello = modello;
    }

    public static void main(String[] args) {

        Auto auto = new Auto("Fiat", "Panda", 2019, 4);
        Moto moto = new Moto("Honda", "BOH", 2021, "Sportivo");

        System.out.println("Informazioni sull'auto:");
        System.out.println(auto.toString());

        System.out.println("\nInformazioni sulla moto:");
        System.out.println(moto);

    }
    

    @Override
    public String toString() {
        return "Veicolo{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", anno=" + anno;
    }

}
