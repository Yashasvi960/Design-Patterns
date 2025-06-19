package behavorialPattern.chainOfResponsibilityPattern;

public class InfoLogger extends Logger{

    InfoLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Info Logger: "+ message);
    }
}
