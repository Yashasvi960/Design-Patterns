package structuralPattern.proxyPattern;

public class RealImage implements Image{
    private String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading image"+fileName);
    }

    @Override
    public void display() {
       System.out.println("Displaying image"+ fileName);
    }
}
