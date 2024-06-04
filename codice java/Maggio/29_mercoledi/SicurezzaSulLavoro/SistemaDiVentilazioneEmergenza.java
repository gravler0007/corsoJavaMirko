public class SistemaDiVentilazioneEmergenza implements DispositivoDiSicurezza{
    
    private boolean stateDevice;

    @Override
    public void startDevice() {
        stateDevice = true;
        System.out.println("Emergency ventilation system turned on.");
    }

    @Override
    public void stopDevice() {
        stateDevice = false;
        System.out.println("Emergency ventilation system turned off.");
    }

    @Override
    public void checkDevice() {

        System.out.println("The emergency ventilation system is " + (stateDevice ? "turned on" : "turned off"));
    }



    public void checkFilters() {
        System.out.println("Checking emergency ventilation system filters...");
    }
}
