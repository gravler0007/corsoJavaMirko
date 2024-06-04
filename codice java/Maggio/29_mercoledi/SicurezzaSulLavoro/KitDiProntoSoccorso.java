public class KitDiProntoSoccorso implements DispositivoDiSicurezza{

    private boolean stateDevice;
    
    @Override
    public void startDevice() {
        stateDevice = true;
        System.out.println("First aid kit online.");
    }

    @Override
    public void stopDevice() {
        stateDevice = false;
        System.out.println("First aid kit offline");
    }

    @Override
    public void checkDevice() {

        System.out.println("First aid kit is " + (stateDevice ? "online" : "offline"));
    }

    public void checkExpiryDate() {
        System.out.println("Checking first aid kit medicine expiry dates...");
    }

}
