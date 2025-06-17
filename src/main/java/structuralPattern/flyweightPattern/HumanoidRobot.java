package structuralPattern.flyweightPattern;

public class HumanoidRobot implements IRobot{
    String type;
    String val;
    HumanoidRobot(String type, String val){
        this.type = type;
        this.val = val;
    }
    @Override
    public void view(int x, int y) {
        System.out.println("val in HumanoidRobot is"+x +y);
    }
}
