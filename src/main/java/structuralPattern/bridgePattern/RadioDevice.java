package structuralPattern.bridgePattern;

public class RadioDevice implements Device{
    public boolean on = false;
    @Override
    public void turnOn() {
       if(on) System.out.println("turning radio on");
    }

    @Override
    public void turnOff() {
        if(!on) System.out.println("turning radio off");
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
