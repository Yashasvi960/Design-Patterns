package structuralPattern.proxyPattern;

public class ProxyImage implements Image{

    RealImage realImage;

    String fileName;

    ProxyImage(String fileName) {
        if(realImage==null) {
            realImage = new RealImage(fileName);
        }

    }
    @Override
    public void display() {
      realImage.display();
    }
}
