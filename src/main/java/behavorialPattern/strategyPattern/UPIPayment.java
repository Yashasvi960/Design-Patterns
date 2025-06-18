package behavorialPattern.strategyPattern;

public class UPIPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("pay: "+amount+ " using UPI");
    }
}
