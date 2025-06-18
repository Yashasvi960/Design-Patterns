package behavorialPattern.strategyPattern;

public class StrategyMain {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new PaypalPayment());
        context.payAmount(256);
    }
}
