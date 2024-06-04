public class Artiglieria extends Soldato implements Specialista{

    public Artiglieria(String nome, String cognome, String grado) {
        this.nome = nome;
        this.cognome = cognome;
        this.grado = grado;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getGrado() {
        return grado;
    }

    @Override
    public void combatti() {
        System.out.println("Il soldato " + getNome() + " " + getCognome()  +" grado '" + getGrado()
                +"' combatte come unità di artiglieria");
    }

    @Override
    public String specializzazione() {
        return "Supporto sulle lunghe distanze ";
    }

    @Override
    public void usaEquipaggiamentoSpeciale() {
        System.out.println("Utilizzo l'equipaggiamente speciale: cannone xA-0");
    }

}
