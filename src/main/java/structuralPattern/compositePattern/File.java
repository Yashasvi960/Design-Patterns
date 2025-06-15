package structuralPattern.compositePattern;

public class File implements FileSystem {
    @Override
    public void display() {
        System.out.println("Display file");
    }
}
