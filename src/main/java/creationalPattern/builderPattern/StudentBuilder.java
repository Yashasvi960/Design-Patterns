package creationalPattern.builderPattern;

import creationalPattern.prototypePattern.Student;

import java.util.List;

public abstract class StudentBuilder {
  String name;
  int age;
  int rollNumber;
  String fatherName;
  String motherName;
  List<String> Subjects;

  public StudentBuilder setName(String name) {
      this.name = name;
      return this;
  }
  public StudentBuilder setAge(int age) {
      this.age = age;
      return this;
  }

  public StudentBuilder setRollNumber(int rollNumber) {
      this.rollNumber = rollNumber;
      return this;
  }

  public StudentBuilder setFatherName(String fatherName) {
      this.fatherName = fatherName;
      return this;
  }

  public StudentBuilder setMotherName(String motherName) {
      this.motherName = motherName;
      return this;
  }

  abstract public StudentBuilder setSubjects();

  public StudentClass build() {
      return new StudentClass(this);
  }
}
