package structuralPattern.adapterPattern;

public class AdapterMain {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(weightMachineAdapter.getWeightInKgs());
    }
}
