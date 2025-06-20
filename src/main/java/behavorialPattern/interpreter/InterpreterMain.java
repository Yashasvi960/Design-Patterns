package behavorialPattern.interpreter;

public class InterpreterMain {

    public static void main(String args[]) {
        Expressions literal1 = new Literal(true);
        Expressions literal2 = new Literal(false);

        Expressions andExpression = new AndExpression(literal1, literal2);
        System.out.println(andExpression.interpret());

        Expressions orExpression = new OrExpression(literal1, literal2);
        System.out.println(orExpression.interpret());

    }
}
