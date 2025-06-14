package creationalPattern.AbstractFactoryPattern.Luxury;

import creationalPattern.AbstractFactoryPattern.Car;

public class LuxuryCar2 implements Car {
    @Override
    public int getTopSpeed() {
        return 300;
    }
}
