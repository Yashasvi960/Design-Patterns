package behavorialPattern.strategyPattern;

public class PaypalPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("pay: "+ amount+ " using paypal");
    }
}
