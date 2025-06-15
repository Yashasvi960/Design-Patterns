package structuralPattern.proxyPattern;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("Example.jfg");
        image.display();
        image.display();
    }
}
