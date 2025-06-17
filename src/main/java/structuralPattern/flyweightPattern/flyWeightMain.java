package structuralPattern.flyweightPattern;

public class flyWeightMain {

    public static void main(String[] args) {
        IRobot flyweightClass = FlyweightClass.createRobot("Humanoid");
        flyweightClass.view(1,2);
    }
}
