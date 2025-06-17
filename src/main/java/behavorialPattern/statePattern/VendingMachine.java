package behavorialPattern.statePattern;

public class VendingMachine {
    VendingMachineState machineState;

    public VendingMachineState getVendingMachineState() {
        return machineState;
    }

    public void setMachineState(VendingMachineState machineState) {
        this.machineState = machineState;
    }
}
