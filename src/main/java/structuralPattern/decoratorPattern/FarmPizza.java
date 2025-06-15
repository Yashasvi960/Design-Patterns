package structuralPattern.decoratorPattern;

public class FarmPizza implements BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
