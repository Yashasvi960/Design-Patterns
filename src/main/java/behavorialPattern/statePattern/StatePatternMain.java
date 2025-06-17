package behavorialPattern.statePattern;

public class StatePatternMain {

    public static void main(String args[]) {
        VendingMachine machine = new VendingMachine();
        VendingMachineState state = new IdleMachineState();
        state.insertCoin(machine);
        System.out.println(machine.getVendingMachineState());
        VendingMachineState state2 = new WorkingMachineState();
        state2.dispenseItem(machine);

    }
}
