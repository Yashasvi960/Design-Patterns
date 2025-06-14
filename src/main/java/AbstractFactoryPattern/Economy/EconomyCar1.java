package AbstractFactoryPattern.Economy;

import AbstractFactoryPattern.Car;

public class EconomyCar1 implements Car {
    @Override
    public int getTopSpeed() {
        return 150;
    }
}
