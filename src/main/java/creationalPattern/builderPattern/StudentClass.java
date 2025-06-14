package creationalPattern.builderPattern;

import creationalPattern.prototypePattern.Student;

import java.util.List;

public class StudentClass {
    String name;
    int age;
    int rollNumber;
    String fatherName;
    String motherName;
    List<String> Subjects;
    public StudentClass(StudentBuilder builder){
       this.name = builder.name;
       this.age = builder.age;
       this.rollNumber = builder.rollNumber;
       this.fatherName = builder.fatherName;
       this.motherName = builder.motherName;
       this.Subjects = builder.Subjects;
    }

    public String toString() {
        return "name"+ this.name+"age"+this.age+"rollNumber"+this.rollNumber+"fatherName"+this.fatherName
                +"motherName"+this.motherName+"subject"+this.Subjects.get(0);
    }

}
