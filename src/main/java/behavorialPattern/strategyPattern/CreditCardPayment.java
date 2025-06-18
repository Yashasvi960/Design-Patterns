package behavorialPattern.strategyPattern;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Pay: "+ amount+ " using credit card");
    }
}
