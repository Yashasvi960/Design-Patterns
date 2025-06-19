package behavorialPattern.chainOfResponsibilityPattern;

public class ErrorLogger extends Logger{

    ErrorLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Erro logger:" + message);
    }
}
