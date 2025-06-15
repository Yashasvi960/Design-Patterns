package structuralPattern.compositePattern;

import java.util.*;

public class CompositeFile implements FileSystem{
    List<FileSystem> list = new ArrayList<>();

    void add(FileSystem fs) {
        list.add(fs);
    }

    @Override
    public void display() {
        for(FileSystem fd: list){
            fd.display();
        }
    }
}
