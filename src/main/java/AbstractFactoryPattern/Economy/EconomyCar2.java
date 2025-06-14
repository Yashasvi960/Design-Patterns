package AbstractFactoryPattern.Economy;

import AbstractFactoryPattern.Car;

public class EconomyCar2 implements Car {
    @Override
    public int getTopSpeed() {
        return 200;
    }
}
