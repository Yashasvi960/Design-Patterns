package structuralPattern.compositePattern;

public class CompositeMain {

    public static void main(String args[]) {
        CompositeFile fileSystem = new CompositeFile();
        File file = new File();
        fileSystem.add(file);

        CompositeFile file2 = new CompositeFile();
        fileSystem.add(file2);

        fileSystem.display();

    }
}
