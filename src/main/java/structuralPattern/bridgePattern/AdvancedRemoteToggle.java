package structuralPattern.bridgePattern;

public class AdvancedRemoteToggle extends RemoteControl{

    AdvancedRemoteToggle(Device device){
        super(device);
    }

    @Override
    void togglePower() {
        if(device.isOn()) device.turnOff();
        else device.turnOn();
    }

    void muted(){
        System.out.println("mute the device");
    }

}
