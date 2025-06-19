package behavorialPattern.templatePattern;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("validateRequest while PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculateFees while PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("debitAmount while PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("creditAmount while PayToFriend");
    }
}
