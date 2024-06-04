abstract public class Dipendente implements BonusCalcolabile {
    
    //le definisco qui per farle ereditare tramite il costruttore e non dovere sempre definirle in ogni file
    double stipendio;
    String nome;

    //costruttore
    // public Dipendente(double stipendio, String nome) {
    //     this.stipendio = stipendio;
    //     this.nome = nome;
    // }
    
    // //setter
    // public String getNome() {
    //     return nome;
    // }

    // public double getStipendio() {
    //     return stipendio;
    // }


    //metodo astratto per calcolare il bonus (va implementato nelle classi specifiche)
    @Override
    abstract public double calcolaBonus();
}
