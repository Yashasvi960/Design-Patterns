package behavorialPattern.strategyPattern;

public class PaymentContext {

    Payment payment;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void payAmount(int amount) {
        if(payment==null) {
            throw new IllegalArgumentException("Payment strategy was null");
        }
        payment.pay(amount);
    }
}
