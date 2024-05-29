// Sicurezza sul lavoro

// Descrizione:
// Immagina di essere il responsabile della sicurezza sul lavoro in una grande azienda che opera in diversi settori industriali. 
// Il tuo compito è assicurarti che tutti i dispositivi di sicurezza siano funzionanti e che le procedure di sicurezza siano seguite correttamente. 
// Per questo esercizio, dovrai progettare un sistema software utilizzando il principio dell'astrazione attraverso interfacce in Java per gestire i dispositivi di sicurezza.

// Requisiti:
//     Interfaccia DispositivoDiSicurezza:
//     Deve rappresentare un dispositivo di sicurezza generico.
//     Deve dichiarare i metodi fondamentali che ogni dispositivo di sicurezza deve implementare.

// Tipi di dispositivi di sicurezza:
//     Estintore
//     Allarme antincendio
//     Sistema di ventilazione d'emergenza
//     Kit di pronto soccorso

// Specifiche dell'interfaccia:
//     Ogni dispositivo deve poter essere acceso (attivato) e spento (disattivato).
//     Ogni dispositivo deve avere un metodo per controllare il proprio stato di funzionamento.

// Requisiti aggiuntivi:
//     Oltre ai metodi generici, ogni tipo di dispositivo può avere metodi specifici. Ad esempio, l'estintore può avere un metodo per verificare la pressione, mentre il kit di pronto soccorso può avere un metodo per verificare la scadenza dei medicinali.
//     Gli oggetti di ogni tipo di dispositivo devono essere gestiti in una lista che permetta di iterare attraverso di essi per eseguire controlli periodici.

// Obiettivo:
    // Il tuo obiettivo è descrivere come utilizzeresti le interfacce per progettare questo sistema. Dovrai spiegare:
    // Come definiresti l'interfaccia DispositivoDiSicurezza e quali metodi dichiareresti.
    // Come implementeresti le classi concrete per i diversi tipi di dispositivi di sicurezza.
    // Come gestiresti una collezione di dispositivi di sicurezza e quali operazioni eseguiresti su di essa per assicurarti che tutti i dispositivi siano funzionanti.

import java.util.ArrayList;
import java.util.List;


public class Main {

    List<DispositivoDiSicurezza> devices = new ArrayList<>();

    public void addDevice(DispositivoDiSicurezza device) {
        devices.add(device);
    }

    public void checkAllDeviceStatus() {
        for (DispositivoDiSicurezza device : devices) {
            device.checkDevice();
        }
    }

    public static void main(String[] args) {

        Main managment = new Main();

        Estintore extinguisher = new Estintore();
        AllarmeAntincendio fireAlarm = new AllarmeAntincendio();
        SistemaDiVentilazioneEmergenza ventilationSystem = new SistemaDiVentilazioneEmergenza();
        KitDiProntoSoccorso firstAidKit = new KitDiProntoSoccorso();

        managment.addDevice(firstAidKit);
        managment.addDevice(extinguisher);
        managment.addDevice(fireAlarm);
        managment.addDevice(ventilationSystem);

        System.out.println();

        managment.checkAllDeviceStatus();

        System.out.println();

        extinguisher.startDevice();
        fireAlarm.startDevice();

        System.out.println();

        managment.checkAllDeviceStatus();
        
        
    }

    
}