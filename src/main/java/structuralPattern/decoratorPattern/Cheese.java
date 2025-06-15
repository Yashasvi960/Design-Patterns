package structuralPattern.decoratorPattern;

public class Cheese implements ToppingPizza{

    BasePizza pizza;

    Cheese(BasePizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+10;
    }
}
