package prototypePattern;

public class PrototypeMain {

    public static void main(String[] args) {
        Student obj = new Student("Yash", 25, 28);
        Student cloneObj = (Student)obj.clone();

    }
}
