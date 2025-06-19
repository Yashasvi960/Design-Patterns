package behavorialPattern.chainOfResponsibilityPattern;

public class DebugLogger extends Logger{
    DebugLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Debug logger: "+ message);
    }
}
