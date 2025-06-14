package creationalPattern.AbstractFactoryPattern.Luxury;

import creationalPattern.AbstractFactoryPattern.Car;

public class LuxuryCar1 implements Car {
    @Override
    public int getTopSpeed() {
        return 250;
    }
}
