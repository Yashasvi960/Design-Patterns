package behavorialPattern.statePattern;

public class WorkingMachineState implements VendingMachineState{
    @Override
    public void insertCoin(VendingMachine product) {

    }

    @Override
    public void dispenseItem(VendingMachine product) {
       System.out.println("Machine is in dispensing state now");
    }
}
