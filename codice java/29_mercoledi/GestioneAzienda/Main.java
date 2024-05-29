// Gestione di un'azienda con classi astratte e interfacce

// Descrizione:
// Immagina di dover progettare un sistema per la gestione dei dipendenti di un'azienda. 
// L'azienda ha diversi tipi di dipendenti, come amministrativi, tecnici e manager. 
// Ogni dipendente ha caratteristiche comuni come nome, stipendio e un metodo per calcolare il bonus annuale. 
// Tuttavia, ogni tipo di dipendente ha un modo diverso di calcolare il proprio bonus.
// L'obiettivo è utilizzare una classe astratta e un'interfaccia per modellare questa situazione.

// Requisiti:

// Classe astratta Dipendente:
//     Deve avere i campi comuni a tutti i dipendenti: nome e stipendio.
//     Deve avere un metodo astratto per calcolare il bonus annuale (calcolaBonus).

// Interfaccia BonusCalcolabile:
//     Deve dichiarare il metodo calcolaBonus.

// Classi concrete:
//     Amministrativo: calcola il bonus come il 10% dello stipendio.
//     Tecnico: calcola il bonus come il 15% dello stipendio.
//     Manager: calcola il bonus come il 20% dello stipendio.

// Obiettivo:
// Descrivi come utilizzeresti una classe astratta e un'interfaccia per progettare questo sistema. 
// Successivamente, implementa il codice Java per realizzare il sistema.

public class Main {

    static double stipendioAmministrativo = 3000, stipendioTecnico = 4250, stipendioManager = 4500;
    public static void main(String[] args) {
        Amministrativo amministrativo = new Amministrativo(stipendioAmministrativo, "Mirko Brutto");
        Tecnico tecnico = new Tecnico(stipendioTecnico, "Spring sarà la morte");
        Manager manager = new Manager(stipendioManager, "Flavio si");

        System.out.println("Il dipendente 'amministrativo' \"" + amministrativo.getNome() + "\" ha un bonus del 10% pari a " + amministrativo.calcolaBonus() + " euro in più, per un totale complessivo dello stipendio pari a " + (stipendioAmministrativo + amministrativo.calcolaBonus()) + " euro");
        System.out.println("Il dipendente 'tecnico' \"" + tecnico.getNome() + "\" ha un bonus del 15% pari a " + tecnico.calcolaBonus() + " euro in più, per un totale complessivo dello stipendio pari a " + (stipendioTecnico + tecnico.calcolaBonus()) + " euro");
        System.out.println("Il dipendente 'manager' \"" + manager.getNome() + "\" ha un bonus del 20% pari a " + manager.calcolaBonus() + " euro in più, per un totale complessivo dello stipendio pari a " + (stipendioManager + manager.calcolaBonus()) + " euro");
    }
}