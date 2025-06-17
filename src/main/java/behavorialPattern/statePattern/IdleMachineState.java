package behavorialPattern.statePattern;

public class IdleMachineState implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachine product) {
        System.out.println("insert the coin please");
        product.setMachineState(new WorkingMachineState());
    }

    @Override
    public void dispenseItem(VendingMachine product) {

    }
}
