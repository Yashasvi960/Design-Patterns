package structuralPattern.decoratorPattern;

public class Mushrooms implements ToppingPizza{
    BasePizza pizza;

    Mushrooms(BasePizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost()+20;
    }
}
