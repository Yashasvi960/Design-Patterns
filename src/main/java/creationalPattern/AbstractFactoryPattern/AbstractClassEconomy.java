package creationalPattern.AbstractFactoryPattern;

import creationalPattern.AbstractFactoryPattern.Economy.EconomyCar1;
import creationalPattern.AbstractFactoryPattern.Economy.EconomyCar2;

public class AbstractClassEconomy implements AbstractInterface{
    @Override
    public Car getInstance(int price) {
        if(price>1000) {
            return new EconomyCar1();
        } else {
            return new EconomyCar2();
        }
    }
}
