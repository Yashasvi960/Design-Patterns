package behavorialPattern.interpreter;

public class NotExpression implements Expressions{

    Expressions expression;
    public NotExpression(Expressions expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpret() {
        return !expression.interpret();
    }
}
