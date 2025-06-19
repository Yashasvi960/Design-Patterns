package behavorialPattern.chainOfResponsibilityPattern;

public class MainClass {

    public static Logger setNextChain() {
      Logger infoLogger = new InfoLogger(Logger.INFO);
      Logger debugLogger = new DebugLogger(Logger.DEBUG);
      Logger errorLogger = new ErrorLogger(Logger.ERROR);

      errorLogger.setNextLogger(debugLogger);
      debugLogger.setNextLogger(infoLogger);

      return errorLogger;
    }

    public static void main(String args[]) {
        Logger chain = setNextChain();
        chain.logMessage(Logger.INFO, "Create the message");
        chain.logMessage(Logger.DEBUG, "Create Debug message");
    }
}
