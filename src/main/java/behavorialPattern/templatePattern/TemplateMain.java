package behavorialPattern.templatePattern;

public class TemplateMain {

    public static void main(String args[]) {
        PaymentFlow flow = new PayToFamily();
        flow.sendMoney();
    }
}
