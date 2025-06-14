package creationalPattern.builderPattern;

import java.util.*;

public class ElectronicsClass extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> list = new ArrayList<>();
        list.add("Analog Electronics");
        list.add("circuits Analysis");
        list.add("Electromagnetic theory");
        this.Subjects = list;
        return this;
    }
}
