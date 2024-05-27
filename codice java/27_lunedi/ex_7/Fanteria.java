public class Fanteria extends Soldato implements Specialista {
    
    public Fanteria(String nome, String cognome, String grado) {
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
        System.out.println("Il soldato " + getNome() + " " + getCognome() + " grado '" + getGrado() + "' combatte come unità di fanteria");
    }

    @Override
    public String specializzazione() {
        return "Combattimento a cavallo";
    }

    @Override
    public void usaEquipaggiamentoSpeciale() {
        System.out.println("Utilizzo l'equipaggiamente speciale: baionetta a pannecotte");
    }

}
