package behavorialPattern.templatePattern;

public class PayToFamily extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("validateRequest while PayToFamily");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculateFees while PayToFamily");
    }

    @Override
    public void debitAmount() {
        System.out.println("debitAmount while PayToFamily");
    }

    @Override
    public void creditAmount() {
        System.out.println("creditAmount while PayToFamily");
    }
}
