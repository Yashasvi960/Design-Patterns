package structuralPattern.adapterPattern;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine machine;

    WeightMachineAdapterImpl(WeightMachine machine) {
        this.machine = machine;
    }
    @Override
    public double getWeightInKgs() {
        int weightInPounds = machine.getWeightInPounds();
        return weightInPounds*.45;
    }
}
