package structuralPattern.decoratorPattern;

public class DecoratorMain {

    public static void main(String[] args) {
       BasePizza pizza = new Mushrooms(new Cheese(new FarmPizza()));
       System.out.println(pizza.cost());
    }
}
