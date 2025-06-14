package creationalPattern.AbstractFactoryPattern.Economy;

import creationalPattern.AbstractFactoryPattern.Car;

public class EconomyCar1 implements Car {
    @Override
    public int getTopSpeed() {
        return 150;
    }
}
