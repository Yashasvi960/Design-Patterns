package structuralPattern.bridgePattern;

import java.rmi.Remote;

public abstract class RemoteControl {
    Device device;

    RemoteControl(Device device) {
     this.device = device;
    }

    abstract void togglePower();
}
