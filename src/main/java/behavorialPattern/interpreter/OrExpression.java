package behavorialPattern.interpreter;

public class OrExpression implements Expressions{

    Expressions expression1;
    Expressions expression2;

    public OrExpression(Expressions expression1, Expressions expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
    @Override
    public boolean interpret() {
        return expression1.interpret() || expression2.interpret();
    }
}
