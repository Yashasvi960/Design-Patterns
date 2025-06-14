package prototypePattern;

public class Student implements PrototypeAbstract{

    public String name;
    private int age;
    public int rollNumber;

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public PrototypeAbstract clone() {
        return new Student(name, age, rollNumber);
    }
}
