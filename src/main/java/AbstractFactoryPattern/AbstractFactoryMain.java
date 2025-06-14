package AbstractFactoryPattern;



public class AbstractFactoryMain {

    public static void main(String[] args) {
        AbstractFactoryProducer producer = new AbstractFactoryProducer();
        AbstractInterface abstractInterface = producer.getFactoryInstance("Economy");
        Car carType = abstractInterface.getInstance(2000);
        System.out.println(carType.getTopSpeed());
    }
}
