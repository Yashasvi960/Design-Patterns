package behavorialPattern.statePattern;

public interface VendingMachineState {

    void insertCoin(VendingMachine product);

    void dispenseItem(VendingMachine product);
}
