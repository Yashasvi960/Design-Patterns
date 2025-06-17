package structuralPattern.flyweightPattern;

public class AIRobot implements IRobot{
    String type;
    String val;
    AIRobot(String type, String val) {
        this.type = type;
        this.val = val;
    }
    @Override
    public void view(int x, int y) {
        System.out.println("Val in AIRobot is:" + x + y);
    }
}
