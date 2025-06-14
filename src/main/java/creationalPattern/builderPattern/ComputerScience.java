package creationalPattern.builderPattern;

import java.util.*;

public class ComputerScience extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
       List<String> subject = new ArrayList<>();
       subject.add("Database");
       subject.add("Operating system");
       subject.add("programming language");
       subject.add("data structures");
       this.Subjects = subject;
       return this;
    }
}
