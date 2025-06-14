package creationalPattern.builderPattern;

public class DirectorMain {
    StudentBuilder studentBuilder;
    public DirectorMain(StudentBuilder studentBuilder) {
      this.studentBuilder = studentBuilder;
    }

    public StudentClass createStudent() {
        if(studentBuilder instanceof  ElectronicsClass)  {
            return createElectronicsStudent();
        } else {
            return createComputerScienceStudent();
        }
    }

    public StudentClass createElectronicsStudent() {
        return studentBuilder.setName("abc").setAge(3).setRollNumber(5).setFatherName("abc").setMotherName("abc").setSubjects().build();
    }

    public StudentClass createComputerScienceStudent() {
        return studentBuilder.setName("abc").setAge(3).setRollNumber(5).setFatherName("abc").setMotherName("abc").setSubjects().build();
    }
}
