package creationalPattern.AbstractFactoryPattern;

public class AbstractFactoryProducer {
    public AbstractInterface getFactoryInstance(String carType) {
        if(carType.equals("Economic")) {
            return new AbstractClassEconomy();
        } else {
            return new AbstractClassLuxury();
        }
    }
}
