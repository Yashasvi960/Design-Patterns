package creationalPattern.AbstractFactoryPattern.Economy;

import creationalPattern.AbstractFactoryPattern.Car;

public class EconomyCar2 implements Car {
    @Override
    public int getTopSpeed() {
        return 200;
    }
}
