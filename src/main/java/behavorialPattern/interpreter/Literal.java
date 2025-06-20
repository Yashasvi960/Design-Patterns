package behavorialPattern.interpreter;

public class Literal implements Expressions{
    boolean value;

    public Literal(boolean value) {
        this.value = value;
    }
    @Override
    public boolean interpret() {
        return value;
    }
}
