package structuralPattern.bridgePattern;

public class BasicRemoteToggle extends RemoteControl{


    BasicRemoteToggle(Device device) {
        super(device);
    }

    @Override
    void togglePower() {
       if(device.isOn()) {
           device.turnOff();
       } else device.turnOn();
    }
}
