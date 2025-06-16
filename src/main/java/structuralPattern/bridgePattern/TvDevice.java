package structuralPattern.bridgePattern;

public class TvDevice implements Device{
   public boolean on = false;

    @Override
    public void turnOn() {
        if(on) {
            System.out.println("Tv is turned on");
        }

    }

    @Override
    public void turnOff() {
        if(!on) {
            System.out.println("Tv is turned off");
        }
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
