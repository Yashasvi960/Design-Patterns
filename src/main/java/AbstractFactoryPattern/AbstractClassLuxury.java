package AbstractFactoryPattern;

import AbstractFactoryPattern.Luxury.LuxuryCar1;
import AbstractFactoryPattern.Luxury.LuxuryCar2;

public class AbstractClassLuxury implements AbstractInterface{
    @Override
    public Car getInstance(int price) {
        if(price>1000) {
            return new LuxuryCar1();
        } else {
            return new LuxuryCar2();
        }
    }
}
