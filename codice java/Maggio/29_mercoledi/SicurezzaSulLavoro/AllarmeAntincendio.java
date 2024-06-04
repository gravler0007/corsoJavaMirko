public class AllarmeAntincendio implements DispositivoDiSicurezza{
    
    private boolean stateDevice;

    @Override
    public void startDevice() {
        stateDevice = true;
        System.out.println("Fire alarm turned on.");
    }

    @Override
    public void stopDevice() {
        stateDevice = false;
        System.out.println("Fire alarm turned off");
    }

    @Override
    public void checkDevice() {

        System.out.println("The fire alarm is " + (stateDevice ? "turned on" : "turned off"));
    }

    public void checkPressure() {
        System.out.println("Checking fire alarm sensors...");
    }

}
