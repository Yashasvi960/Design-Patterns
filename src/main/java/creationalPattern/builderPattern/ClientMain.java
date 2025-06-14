package creationalPattern.builderPattern;

public class ClientMain {

    public static void main(String[] args) {
        DirectorMain directorMain1 = new DirectorMain(new ComputerScience());
        DirectorMain directorMain2 = new DirectorMain(new ElectronicsClass());
        StudentClass student1 = directorMain1.createComputerScienceStudent();
        StudentClass student2 = directorMain2.createElectronicsStudent();
        System.out.println(student1);
        System.out.println(student2);
    }
}
