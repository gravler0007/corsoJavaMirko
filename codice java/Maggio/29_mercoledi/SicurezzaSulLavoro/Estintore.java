public class Estintore implements DispositivoDiSicurezza {
    
    private boolean stateDevice;


    @Override
    public void startDevice() {
        stateDevice=true;
        System.out.println("The fire extinguisher has been activated");
    }
    
    @Override
    public void stopDevice() {
        stateDevice = false;
        System.out.println("The fire extinguisher has been deactivated");
    }

    @Override
    public void checkDevice() {

        System.out.println("The fire extinguisher is " + (stateDevice ? "active" : "deactivated"));
    }

    public void checkPressure() {
        System.out.println("Checking fire extinguisher pressure...");
    }

}
